package de.FH_Dortmund.PR4;

import org.springframework.stereotype.Service;

@Service
public class DivideService implements Divide {

  @Override
  public double divide(double firstNumber, double secondNumber) {
    return firstNumber / 2.0;
    }
}

