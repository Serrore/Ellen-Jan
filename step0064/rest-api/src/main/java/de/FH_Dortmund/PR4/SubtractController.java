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
@RequestMapping("/api/subtract")
public class SubtractController {

  private static Logger logger = LogManager.getLogger(SubtractController.class);

  private final Subtract subtract;

  public SubtractController(Subtract subtract) {
    this.subtract = subtract;
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<SubtractResponseRepresentation> subtract(
      @RequestBody SubtractRequestRepresentation request
  )  {
    try {
      logger.info("add: " + request.getFirstNumber() + "+2.0");
      var result = subtract.subtract(request.getFirstNumber(), request.getSecondNumber());
      logger.info("result: " + result);
      var response = SubtractResponseRepresentation.builder()
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
