package com.zzfn;

import org.springframework.web.bind.annotation.*;

/**
 * @author zzfn
 * @date 2020-12-03 10:28 下午
 */
@RestController
public class ProviderController {
    @GetMapping("/person/{name}")
    public String findName(@PathVariable("name") String name){
        return name;
    }
}
