package com.demo.practise.practise1;

/**
 * 克隆测试类
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月31日  18:41:07
 */
public class CloneTest {

    public static void main(String[] args) {
        try {
            Student student1 = new Student("000001","李四",new StudentCard());
            Student student2 = (Student) student1.clone();
            System.out.println(student1.getStuNum()+""+student1.getName()+""+student1.getStudentCard());
            System.out.println(student2.getStuNum()+""+student2.getName()+""+student2.getStudentCard());
            System.out.println(student1+""+student2);
            System.out.println(student1==student2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
