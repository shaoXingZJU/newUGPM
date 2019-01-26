package com.ugpm.service;

import com.ugpm.dao.CartMapper;
import com.ugpm.pojo.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 14:19 2019/1/26
 */
@Service
public class CartService {
    @Autowired
    public CartMapper cartMapper;

    public Cart selectByPrimaryKey(Integer id){
        return cartMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int insert(Cart cart){
        int i=cartMapper.insert(cart);
        System.out.println("插入成功");
        int error=1/0;
        return i;
    }

}
