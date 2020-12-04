package com.zzfn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zzfn
 * @date 2020-12-04 12:53 上午
 */
@RestController
@RequestMapping("/hello")
public class TeatController {
    private final RestTemplate restTemplate;
    @Autowired
    public TeatController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/world")
    public String helloWorld(String s){
        System.out.println("传入的值为：{}"+s);
        return "服务值"+s;
    }
    @GetMapping("/ok")
    public String helloOk(){
        String result = restTemplate.getForEntity("http://eureka-user/test", String.class).getBody();
        System.out.println("传入的值为：{}"+result);
        return "传入的值为："+result;
    }
}
