package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student", schema = "library")
public class Student implements Model{

    @Id
    @Column(name = "idstudent")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "\"group\"")
    private int group;

    public Student () {}

    public Student(String name, int group) {
        this.name = name;
        this.group = group;
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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
