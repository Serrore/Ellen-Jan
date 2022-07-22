package de.FH_Dortmund.PR4;

import org.springframework.stereotype.Service;

@Service
public class AddService implements Add {

  @Override
  public double add(double firstNumber, double secondNumber) {
    return firstNumber +2.0;
    }
}

