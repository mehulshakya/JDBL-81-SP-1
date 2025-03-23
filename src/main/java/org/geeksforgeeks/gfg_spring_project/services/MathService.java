package org.geeksforgeeks.gfg_spring_project.services;

import org.geeksforgeeks.gfg_spring_project.repository.MathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    private final MathRepository mathRepository;

    @Autowired
    public MathService(MathRepository mathRepository) {
        this.mathRepository = mathRepository;
    }

    public double addTwoNumbers(double a, double b) {
        return a + b;
    }

    public double subtractTwoNumbers(double a, double b) {
        return a - b;
    }

    public double multiplyTwoNumbers(double a, double b) {
        return a * b;
    }

    public double divideTwoNumbers(double a, double b) {
        return a / b;
    }

}