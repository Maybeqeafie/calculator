package ru.maybeqeafie.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculationController {
    @Autowired
    private CalculateSimple calculateSimple;

    @GetMapping(value = "/plus/{firstNumber}/{secondNumber}")
    public int plus(@PathVariable(name = "firstNumber") int firstNumber,@PathVariable(name = "secondNumber") int secondNumber){
        return calculateSimple.plus(firstNumber,secondNumber);
    }
    @GetMapping(value = "/minus/{firstNumber}/{secondNumber}")
    public int minus(@PathVariable(name = "firstNumber") int firstNumber,@PathVariable(name = "secondNumber") int secondNumber){
        return calculateSimple.minus(firstNumber,secondNumber);
    }
    @GetMapping(value = "/multiply/{firstNumber}/{secondNumber}")
    public int multiply(@PathVariable(name = "firstNumber") int firstNumber,@PathVariable(name = "secondNumber") int secondNumber){
        return calculateSimple.multiply(firstNumber,secondNumber);
    }
    @GetMapping(value = "/divide/{firstNumber}/{secondNumber}")
    public double divide(@PathVariable(name = "firstNumber") int firstNumber,@PathVariable(name = "secondNumber") int secondNumber){
        return calculateSimple.divide(firstNumber,secondNumber);
    }
}
