package com.demo.practise.practise2;

;

/**
 * 仓库类
 *
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月31日  18:41:47
 */
public class StoreHouse {

    /*private Product[] setArray;

    public StoreHouse() {
    }

    public StoreHouse(Product[] setArray) {
        this.setArray = setArray;
    }

    public Product[] getSetArray() {
        return setArray;
    }*/

    /**
     * 不允许重新设定库存商品类别总数
     * @param setArray
     */
    /*public void setSetArray(Product[] setArray) {
        this.setArray = setArray;
    }*/

    /**
     * 初始化数组的方法
     */
    /*public  Product[] setArray(int i) {
        Product[] products = new Product[i];
        return products;
    }*/

    /**
     * 入库
     *
     * @param number
     * @param name
     * @param quantity
     */
    public void input(Product[] products, String number, String name, int quantity) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].equals(number)) {
                System.out.println(products[i].equals(number));
                products[i].setQuantity(products[i].getQuantity() + quantity);
                System.out.println("商品添加成功" + products[i].getNumber() + products[i].getName() + products[i].getQuantity());
                System.out.println(products[i].getQuantity());
                break;
            } else if (products[i] == null) {
                products[i] = new Product();
                products[i].setNumber(number);
                products[i].setName(name);
                products[i].setQuantity(quantity);
                System.out.println("新商品添加成功" + products[i].getNumber() + products[i].getName() + products[i].getQuantity());
                break;
            } else if (products[i] != null && i == products.length - 1) {
                System.out.println("商品类型已满，不能添加新的商品");
            }
        }
    }

    /**
     * 出库
     *
     * @param number
     * @param name
     * @param quantity
     */
    public void out(Product[] products, String number, String name, int quantity) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                System.out.println("出库的产品不存在");
                break;
            } else if (products[i] != null && products[i].equals(number)) {
                if (products[i].getQuantity() < quantity) {
                    System.out.println("出库产品数量不足，无法出库");
                } else {
                    products[i].setQuantity(products[i].getQuantity() - quantity);
                    System.out.println("正常出库");
                }
                break;
            } else if (products[i]!=null&&!products[i].equals(number)&&i==products.length-1)
                System.out.println("出库的产品不存在");
        }
    }
}
