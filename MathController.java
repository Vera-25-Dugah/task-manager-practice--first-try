package com.firstApi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/add/{a}/{b}")
    public Map<String,Integer> add(
            @PathVariable int a,
            @PathVariable int b
    ){
        return Map.of("result", a+b);
    }

    @GetMapping("/multiply/{a}/{b}")
    public Map<String,Integer> multiply(
            @PathVariable int a,
            @PathVariable int b
    ){
        return Map.of("result", a*b);
    }
}
