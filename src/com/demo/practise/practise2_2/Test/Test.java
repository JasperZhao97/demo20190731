package com.demo.practise.practise2_2.Test;


import com.demo.practise.practise2_2.pojo.Product;
import com.demo.practise.practise2_2.services.IWareHouseService;
import com.demo.practise.practise2_2.services.impl.WareHouseServiceImpl;

/**
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月01日 10:26:48
 */
public class Test {

    public static void main(String[] args) {
        try {
            IWareHouseService service = new WareHouseServiceImpl();
            service.inStore(new Product("0001", "可口可乐", 4.0,10));
            service.outStore(new Product("0001", null, null, 5));
            //service.outStore(new Product("0002", null, null, 15));
            service.outStore(new Product("0001", null, null, 6));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
