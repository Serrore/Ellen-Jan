import de.FH_Dortmund.PR4.add.ImmutableAddRequestRepresentation;
import de.FH_Dortmund.PR4.divide.DivideService;
import de.FH_Dortmund.PR4.divide.ImmutableDivideRequestRepresentation;
import de.FH_Dortmund.PR4.multiply.ImmutableMultiplicationRequestRepresentation;
import de.FH_Dortmund.PR4.multiply.MultiplicationService;
import de.FH_Dortmund.PR4.power.ImmutablePowerRequestRepresentation;
import de.FH_Dortmund.PR4.power.PowerService;
import de.FH_Dortmund.PR4.root.ImmutableRootRequestRepresentation;
import de.FH_Dortmund.PR4.root.RootService;
import de.FH_Dortmund.PR4.subtract.ImmutableSubtractRequestRepresentation;
import de.FH_Dortmund.PR4.subtract.SubtractService;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import de.FH_Dortmund.PR4.add.AddService;
import jakarta.ws.rs.client.ClientBuilder;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Controller class of this MVC
 * Contains methods to get values from the view
 * and sends them via resteasy to the backend get them handled
 */
public class Controller  {

  // Model
  static Model m;

  // Model-setter
  public void setM(Model m) {
    this.m = m;
  }

  // TextFields from the FXML
  @FXML
  private TextField firstNumber;
  @FXML
  private TextField secondNumber;


  /**
   * Add method connected to the add-button of the view
   * Getting values for the textFields and sends them via resteasy to the backend
   * target URL ist specified as "http://localhost:8081" using AddService as a proxy
   * A respective requestRepresentation is build and send
   * The response is created from the answer on the AddService
   */
  @FXML
  public void add() {
    m.setFirstNumber(Double.parseDouble(this.firstNumber.getText()));
    m.setSecondNumber(5.0);

    var target = (ResteasyWebTarget) ClientBuilder.newClient()
        .target("http://localhost:8081");
    var service = target.proxy(AddService.class);
    var request = ImmutableAddRequestRepresentation.builder()
        .firstNumber(m.getFirstNumber())
        .secondNumber(m.getSecondNumber())
        .build();
    var response = service.add(request);
    var result = response.getResult();

    m.setResult(result);
    firstNumber.setText(String.valueOf(m.getResult()));
  }
  /**
   * Subtract method connected to the add-button of the view
   * Getting values for the textFields and sends them via resteasy to the backend
   * target URL ist specified as "http://localhost:8081" using SubtractService as a proxy
   * A respective requestRepresentation is build and send
   * The response is created from the answer on the SubtractService
   */
  @FXML
  public void subtract() {
    m.setFirstNumber(Double.parseDouble(this.firstNumber.getText()));
    m.setSecondNumber(5.0);

    var target = (ResteasyWebTarget) ClientBuilder.newClient()
            .target("http://localhost:8081");
    var service = target.proxy(SubtractService.class);
    var request = ImmutableSubtractRequestRepresentation.builder()
            .firstNumber(m.getFirstNumber())
            .secondNumber(m.getSecondNumber())
            .build();
    var response = service.subtract(request);
    var result = response.getResult();

    m.setResult(result);
    firstNumber.setText(String.valueOf(m.getResult()));
  }

  /**
   * Divide method connected to the add-button of the view
   * Getting values for the textFields and sends them via resteasy to the backend
   * target URL ist specified as "http://localhost:8082" using DivideService as a proxy
   * A respective requestRepresentation is build and send
   * The response is created from the answer on the DivideService
   */
  @FXML
  public void divide() {
    m.setFirstNumber(Double.parseDouble(this.firstNumber.getText()));
    m.setSecondNumber(5.0);

    var target = (ResteasyWebTarget) ClientBuilder.newClient()
            .target("http://localhost:8082");
    var service = target.proxy(DivideService.class);
    var request = ImmutableDivideRequestRepresentation.builder()
            .firstNumber(m.getFirstNumber())
            .secondNumber(m.getSecondNumber())
            .build();
    var response = service.divide(request);
    var result = response.getResult();

    m.setResult(result);
    firstNumber.setText(String.valueOf(m.getResult()));
  }

  /**
   * Multiply method connected to the add-button of the view
   * Getting values for the textFields and sends them via resteasy to the backend
   * target URL ist specified as "http://localhost:8082" using MultiplicationService as a proxy
   * A respective requestRepresentation is build and send
   * The response is created from the answer on the MultiplicationService
   */
  @FXML
  public void multiply() {
    m.setFirstNumber(Double.parseDouble(this.firstNumber.getText()));
    m.setSecondNumber(5.0);

    var target = (ResteasyWebTarget) ClientBuilder.newClient()
            .target("http://localhost:8082");
    var service = target.proxy(MultiplicationService.class);
    var request = ImmutableMultiplicationRequestRepresentation.builder()
            .firstNumber(m.getFirstNumber())
            .secondNumber(m.getSecondNumber())
            .build();
    var response = service.multiply(request);
    var result = response.getResult();

    m.setResult(result);
    firstNumber.setText(String.valueOf(m.getResult()));
  }

  /**
   * Power method connected to the add-button of the view
   * Getting values for the textFields and sends them via resteasy to the backend
   * target URL ist specified as "http://localhost:8080" using PowerService as a proxy
   * A respective requestRepresentation is build and send
   * The response is created from the answer on the PowerService
   */
  @FXML
  public void power() {
    m.setFirstNumber(Double.parseDouble(this.firstNumber.getText()));
    m.setSecondNumber(5.0);

    var target = (ResteasyWebTarget) ClientBuilder.newClient()
            .target("http://localhost:8080");
    var service = target.proxy(PowerService.class);
    var request = ImmutablePowerRequestRepresentation.builder()
            .firstNumber(m.getFirstNumber())
            .secondNumber(m.getSecondNumber())
            .build();
    var response = service.power(request);
    var result = response.getResult();

    m.setResult(result);
    firstNumber.setText(String.valueOf(m.getResult()));
  }

  /**
   * Root method connected to the add-button of the view
   * Getting values for the textFields and sends them via resteasy to the backend
   * target URL ist specified as "http://localhost:8080" using RootService as a proxy
   * A respective requestRepresentation is build and send
   * The response is created from the answer on the RootService
   */
  @FXML
  public void root() {
    m.setFirstNumber(Double.parseDouble(this.firstNumber.getText()));
    m.setSecondNumber(5.0);

    var target = (ResteasyWebTarget) ClientBuilder.newClient()
            .target("http://localhost:8080");
    var service = target.proxy(RootService.class);
    var request = ImmutableRootRequestRepresentation.builder()
            .firstNumber(m.getFirstNumber())
            .secondNumber(m.getSecondNumber())
            .build();
    var response = service.root(request);
    var result = response.getResult();

    m.setResult(result);
    firstNumber.setText(String.valueOf(m.getResult()));
  }
}
