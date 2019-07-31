package com.demo.practise.practise2;

/**
 * 产品类
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月31日  19:22:32
 */
public class Product {

    private String number;
    private String name;
    private int quantity;

    public Product() {
    }

    public Product(String number, String name, int quantity) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * 重写的equals方法，通过产品编号判断是否是同一件商品
     * @param obj 被比较的产品对象
     * @return
     */
    @Override
    public boolean equals(Object obj) {

        return this.number.equals(obj);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
