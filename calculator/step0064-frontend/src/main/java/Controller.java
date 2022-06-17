import java.net.URL;
import java.util.ResourceBundle;

import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import de.conciso.client.calculator.CalculatorService;
import de.conciso.client.calculator.ImmutableCalculatorRequestRepresentation;
import jakarta.ws.rs.client.ClientBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

  static Model m; // eine niht statische Model Variable ist "null" innerhalb der @FXML Routinen

  //    Controller(Model model) {  // nicht möglich, da FXML keine Controller mit Parameter zulässt
  //        m = model;
  //    }
  public void setM(Model m) {
    this.m = m;
  }   // Setter-Methode um den Model-Verweis zu setzen

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    operatorBox.getItems().addAll('+', '-', '*', '/', 'b');
    operatorBox.getSelectionModel().select(0);  // '+'  show at startup
  }

  @FXML
  private TextField firstNumber;
  @FXML
  private TextField secondNumber;
  @FXML
  private TextField resultNumber;
  @FXML
  private ComboBox operatorBox;


  @FXML
  public void calculate() {
    m.setFirstNumber(Double.parseDouble(this.firstNumber.getText()));
    m.setSecondNumber(5.0);
    m.setCurrentOperator((char) operatorBox.getValue());

    var target = (ResteasyWebTarget) ClientBuilder.newClient()
        .target("http://localhost:8080");
    var service = target.proxy(CalculatorService.class);
    var request = ImmutableCalculatorRequestRepresentation.builder()
        .firstNumber(m.getFirstNumber())
        .secondNumber(m.getSecondNumber())
        .operator(m.getCurrentOperator())
        .build();
    var response = service.calculate(request);
    var result = response.getResult();

    m.setResult(result);
    firstNumber.setText(String.valueOf(m.getResult()));
  }
}
