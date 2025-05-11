package org.example;

import jakarta.persistence.*;


// If we want to set another name for the entity
//@Entity(name = "alien_table")
@Entity
@Table(name = "alien_table") // If we want to change the table name

public class Alien {

    @Id
    private int aid;
    @Column(name = "alien_name")
    private String aname;
    @Transient // It is used if we dont want the field to be stored in the database
    private String tech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
