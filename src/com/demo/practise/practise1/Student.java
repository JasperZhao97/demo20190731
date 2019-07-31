package com.demo.practise.practise1;

/**
 * 学生类
 * 必须有Cloneable的接口，才能克隆
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月31日  18:44:23
 */
public class Student implements Cloneable{

    private String stuNum;
    private String name;
    private StudentCard studentCard;

    public Student() {
    }

    public Student(String stuNum, String name, StudentCard studentCard) {
        this.stuNum = stuNum;
        this.name = name;
        this.studentCard = studentCard;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentCard getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(StudentCard studentCard) {
        this.studentCard = studentCard;
    }

    /**
     * 重写方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
        Student student = (Student) super.clone();
        student.setStudentCard((StudentCard) student.getStudentCard().clone());
        return student;
    }
}
