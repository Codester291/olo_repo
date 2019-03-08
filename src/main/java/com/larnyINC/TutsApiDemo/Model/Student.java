package com.larnyINC.TutsApiDemo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue
    private long id;

    private String email;
    private String firstName;
    private String lastName;
    private String level;

    public Student() {
    }

    public Student(String email, String firstName, String lastName, String level) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
