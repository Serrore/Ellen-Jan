package de.FH_Dortmund.PR4;

import org.springframework.stereotype.Service;

@Service
public class SubtractService implements Subtract {

  @Override
  public double subtract(double firstNumber, double secondNumber) {
    return firstNumber -2.0;
    }
}

