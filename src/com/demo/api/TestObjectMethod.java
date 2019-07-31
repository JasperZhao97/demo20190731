package com.demo.api;

/**
 * 了解object
 */
class Student {

    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "";
    }
}
/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月31日  13:58:53
 */
public class TestObjectMethod {

    public static void main(String[] args) {
        Student student1 = new Student("李三",20,"女");
        Student student2 = new Student("李三",20,"女");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));
//        System.out.println(student.hashCode());
    }
}
