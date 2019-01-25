package com.ugpm.baseAPI;

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

}
