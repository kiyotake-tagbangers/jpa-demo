package com.kiyotagbangers.databasedemo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
// don't need
// @Table(name = "person")
@NamedQuery(name = "find_all_person" , query = "select p from Person p")
public class Person {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String location;
    private Date birthDate;

    // need no argument constructor
    public Person() {
    }

    public Person(int id, String name, String location, Date birthdate) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthdate;
    }

    public Person(String name, String location, Date birthdate) {
        super();
        this.name = name;
        this.location = location;
        this.birthDate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthDate = birthdate;
    }

    @Override
    public String toString() {
        return
                "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthdate=" + birthDate +
                '}';
//        String.format("\nPerson [id=%s, name=%s, location=%s, birthDate=%s]", id, name, location, birthdate);
    }
}
