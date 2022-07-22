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
@RequestMapping("/api/divide")
public class DivideController {

  private static Logger logger = LogManager.getLogger(DivideController.class);

  private final Divide divide;

  public DivideController(Divide divide) {
    this.divide = divide;
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<DivideResponseRepresentation> divide(
      @RequestBody DivideRequestRepresentation request
  )  {
    try {
      logger.info("divide: " + request.getFirstNumber() + " / 2.0");
      var result = divide.divide(request.getFirstNumber(), request.getSecondNumber());
      logger.info("result: " + result);
      var response = DivideResponseRepresentation.builder()
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
