package com.javalearnings.oops;


class Department {
    String name;
    int numFaculty;

    public Department(String name, int numFaculty) {
        this.name = name;
        this.numFaculty = numFaculty;
    }
}


class University {
    String name;
    Department department;

    public University(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("University Name: " + name);
        System.out.println("Department Name: " + department.name);
        System.out.println("Number of Faculty: " + department.numFaculty);
    }

    public static void main(String[] args) {
        Department department = new Department("Biotechnology ", 10);
        University university = new University("VISTAS", department);
        university.display();
    }
}
