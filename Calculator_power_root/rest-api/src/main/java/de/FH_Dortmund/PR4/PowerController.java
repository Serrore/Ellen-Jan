package de.FH_Dortmund.PR4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RESTFul controller for power calculation
 * Using @RestController to mark this class as an MVC Spring controller
 * Catching incoming requests and processing them with the business logic
 * Processed data will be sent as a response to the frontend as raw JSON
 * The @RequestMapping annotation provides mapping for web requests onto methods
 * The path /api/power refers to the URL Localhost8080/api/power this way api is handled by power
 */
@RestController
@RequestMapping("/api/power")
public class PowerController {

    // initialize log4j-Logger and attach it to this PowerController
    private static final Logger logger = LogManager.getLogger(PowerController.class);

    // Creating a new instance of power
    private final Power power;

    /**
     * Constructor to attach Power to this PowerController
     * @param power Instance of the Power interface to connect the controller to the business logic
     */
    public PowerController(Power power) {
        this.power = power;
    }

    /*
    Specialized version of @RequestMapping that only handles the HTTP POST request
    consumes and produces also originate from @RequestMapping and define the MediaType accepted and send by the POST request respectively
    A ResponseEntity is the complete HTTP response including header,body and status
    Here represented by a PowerResponseRepresentation handled by power, the body contains the request as @RequestBody
    The result is calculated by power using the power method with parameters coming from the request
    Response is build from the result and returned depending on the ResponseStatus
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PowerResponseRepresentation> power(
            @RequestBody PowerRequestRepresentation request
    ){
        try {
            logger.info("power: " + request.getFirstNumber() + "^2.0");
            var result = power.power(request.getFirstNumber(), request.getSecondNumber());
            logger.info("result: " + result);
            var response = PowerResponseRepresentation.builder()
                    .result(result)
                    .build();
            return ResponseEntity.ok(response);
        } catch ( IllegalArgumentException e) {
            logger.warn((e.getMessage()));
            return ResponseEntity.badRequest().build();
        } catch ( Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
}
