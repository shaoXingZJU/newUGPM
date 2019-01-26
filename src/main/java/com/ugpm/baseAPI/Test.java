package com.ugpm.baseAPI;

import com.ugpm.pojo.Cart;
import com.ugpm.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/9.
 */
@RestController
public class Test {

    @RequestMapping("/testJson")
    public String testJson(){
        return "haha";
    }
    @RequestMapping("/testMap")
    public Map<String,Object> testMap(){
        Map map=new HashMap<>();
        map.put("li",25);
        return map;
    }
    @Autowired
    public CartService cartService;
    @RequestMapping("/testCart")
    public Cart testCart(Integer id){
        return cartService.selectByPrimaryKey(id);
    }

    @RequestMapping("/testInsert")
    public String testInsert(){
        Cart cart=new Cart();
        cart.setId(5);
        cart.setUserId(11911011);
        cart.setProductId(120);
        cartService.insert(cart);
        return "插入成功";
    }

}
