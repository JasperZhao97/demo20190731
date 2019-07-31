package com.demo.practise.practise2;

/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月31日  19:39:18
 */
public class Test {

    public static void main(String[] args) {
        StoreHouse storeHouse = new StoreHouse();
        Product[] products =  new Product[10000];
        storeHouse.input(products,"001","牛奶",20);
        storeHouse.input(products,"002","西瓜",10);
        System.out.println("-------------------------------------------");
        storeHouse.out(products,"003","毛巾",4);
        storeHouse.out(products,"001","牛奶",21);
        storeHouse.out(products,"004","矿泉水",20);
        System.out.println("-------------------------------------------");
        storeHouse.input(products,"003","毛巾",20);
    }
}
