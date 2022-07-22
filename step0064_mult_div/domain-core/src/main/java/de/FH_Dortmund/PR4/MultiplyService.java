package de.FH_Dortmund.PR4;

import org.springframework.stereotype.Service;

@Service
public class MultiplyService implements Multiply {

  @Override
  public double multiply(double firstNumber, double secondNumber) {
    return firstNumber * 2.0;
    }
}

