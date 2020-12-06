package com.zzfn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzfn
 * @date 2020-12-04 12:53 上午
 */
@RestController
public class TeatController {

    @GetMapping("/test")
    public String helloWorld(){
        return "哈哈哈哈";
    }
    @GetMapping("/say")
    public String say(){
        return "cccc";
    }
}
