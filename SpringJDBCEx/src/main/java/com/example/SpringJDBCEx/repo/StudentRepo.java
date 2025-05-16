package com.example.SpringJDBCEx.repo;

import com.example.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        System.out.println("Added");

        // while working with jdbc if we want to fire the select query we have to use executeQuery and if we want
        // to fire the updation query we have to use executeUpdate
        String sql= "insert into student (rollno, name, marks) values (?,?,?)";

        int rows = jdbc.update(sql, s.getRollNo(),s.getName(),s.getMarks());
        // update function returns an integer value which is the number of rows affected
        System.out.println(rows + " affected");
    }

    public List<Student> findAll() {
        String sql= "select * from student";
        RowMapper<Student> mapper= ( rs, rowNum) -> {
                // maprow is used to return the data one by one from the result set

                Student s= new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            };

        return jdbc.query(sql,mapper); //rowmapper is used to fetch the data one by one from the result set which is generated as the result of the select query

    }
}
