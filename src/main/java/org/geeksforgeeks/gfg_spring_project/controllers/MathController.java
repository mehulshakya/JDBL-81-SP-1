package org.geeksforgeeks.gfg_spring_project.controllers;

import org.geeksforgeeks.gfg_spring_project.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private final MathService mathService;

    @Autowired
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/math")
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
    public double doMath(@RequestParam double a, @RequestParam double b, @RequestParam char operator) {
        double result;
        switch (operator) {
            case 'p' -> result = this.mathService.addTwoNumbers(a, b);
            case '-' -> result = this.mathService.subtractTwoNumbers(a, b);
            case '*' -> result = this.mathService.multiplyTwoNumbers(a, b);
            case '/' -> result = this.mathService.divideTwoNumbers(a, b);
            default -> result = Double.MIN_VALUE;
        }
        return result;
    }

// @RequestBody @RequestParam @PathVariable
// @RequestHeader
}

// https://www.some-website.com/some-path?a=Shantanu&b=Shubham&c=Bengaluru%40Karnataka

// Write a new request that does the following:
// on /temperature, it takes 2 arguments on request param:
// 1. value (a double)
// 2. unit (a character) (either C or F)
// 3. If unit = C, then convert value to F and return and vice versa
