package de.FH_Dortmund.PR4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/multiply")
public class MultiplyController {

  private static Logger logger = LogManager.getLogger(MultiplyController.class);

  private final Multiply multiply;

  public MultiplyController(Multiply multiply) {
    this.multiply = multiply;
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<MultiplyResponseRepresentation> multiply(
      @RequestBody MultiplyRequestRepresentation request
  )  {
    try {
      logger.info("multiply: " + request.getFirstNumber() + " * 2.0");
      var result = multiply.multiply(request.getFirstNumber(), request.getSecondNumber());
      logger.info("result: " + result);
      var response = MultiplyResponseRepresentation.builder()
          .result(result)
          .build();
      return ResponseEntity.ok(response);
    } catch ( IllegalArgumentException exception) {
      logger.warn(exception.getMessage());
      return ResponseEntity.badRequest().build();
    } catch (Exception exception) {
      logger.error(exception.getMessage());
      return ResponseEntity.internalServerError().build();
    }
  }
}
