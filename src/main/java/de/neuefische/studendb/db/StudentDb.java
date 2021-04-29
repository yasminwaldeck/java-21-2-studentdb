package de.neuefische.studendb.db;

import de.neuefische.studendb.model.Student;

import java.util.ArrayList;
import java.util.Objects;

public class StudentDb {

    //private Student[] students;
    private ArrayList<Student> studentList = new ArrayList<>();

    public StudentDb(ArrayList<Student> students) {
        this.studentList = students;
    }

    public StudentDb(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            this.studentList.add(students[i]);
        }
    }

    public ArrayList<Student> list() {
        return studentList;
    }

    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < studentList.size(); i++) {
            result += studentList.get(i) + "\n";
        }
        return result;
    }

    public Student randomStudent() {
        int index = (int) Math.floor(Math.random() * studentList.size());
        return studentList.get(index);
    }

    public void add(Student student) {
        studentList.add(student);
    }

    public void remove(Student student) {
        studentList.remove(student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDb studentDb = (StudentDb) o;
        return Objects.equals(studentList, studentDb.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentList);
    }
}
