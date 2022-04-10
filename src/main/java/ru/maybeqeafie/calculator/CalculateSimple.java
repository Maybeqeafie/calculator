package ru.maybeqeafie.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculateSimple {

    public int plus(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public double divide(int x, int y) {
        if (x == 0) return 0;
        if (y == 0) return 0;
        return (double) x / y;
    }

    public int multiply(int x, int y){
        return x * y;
    }
}
