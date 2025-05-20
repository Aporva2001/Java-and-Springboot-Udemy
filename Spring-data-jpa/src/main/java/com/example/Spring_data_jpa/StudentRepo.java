package com.example.Spring_data_jpa;

import com.example.Spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    // If we want this method to fire a query to search for name, we have to use
    // In jpql we use class names and property names instead of table names and column names in sql

//    @Query("select s from Student s where s.name = ?1")
    // This ? will be replaced by actual name
    List<Student> findByName(String name);
    // The line above will work even without writing the query because jpql has certain builtin methods for the same
    // but we have to start the method name with findBy...
    List<Student> findByMarksGreaterThan(int marks);

}
