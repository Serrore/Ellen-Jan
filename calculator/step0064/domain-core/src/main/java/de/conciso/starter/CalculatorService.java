package de.conciso.starter;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Calculator {

  @Override
  public double calculate(double firstNumber, double secondNumber, Operator operator) {

        return firstNumber + 2.0;

  }
}
