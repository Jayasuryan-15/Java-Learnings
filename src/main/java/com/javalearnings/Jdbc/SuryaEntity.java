package com.javalearnings.Jdbc;

public class SuryaEntity {

    private int id;
    private String name;

    private int age;
    private String department;

    public SuryaEntity(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "SuryaEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
