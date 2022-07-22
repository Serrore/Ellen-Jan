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
 * RESTFul controller for root calculation
 * Using @RestController to mark this class as an MVC Spring controller
 * Catching incoming requests and processing them with the business logic
 * Processed data will be sent as a response to the frontend as raw JSON
 * The @RequestMapping annotation provides mapping for web requests onto methods
 * The path /api/root refers to the URL Localhost8080/api/root this way api is handled by power
 */
@RestController
@RequestMapping("api/root")
public class RootController {

    // Initialize log4j-Logger and attach it to this RootController
    private static final Logger logger = LogManager.getLogger(RootController.class);

    // Creating a new instance of root
    private final Root root;

    /**
     * Constructor to attach Root to this RootController
     * @param root Instance of the Root interface to connect the controller to the business logic
     */
    public RootController(Root root) {
        this.root = root;
    }

    /*
    Specialized version of @RequestMapping that only handles the HTTP POST request
    consumes and produces also originate from @RequestMapping and define the MediaType accepted and send by the POST request respectively
    A ResponseEntity is the complete HTTP response including header,body and status
    Here represented by a RootResponseRepresentation handled by root, the body contains the request as @RequestBody
    The result is calculated by root using the root method with parameters coming from the request
    Response is build from the result and returned depending on the ResponseStatus
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RootResponseRepresentation> root(
            @RequestBody RootRequestRepresentation request
    ) {
        try {
            logger.info("root: " + request.getFirstNumber() + "sqrt");
            var result = root.root(request.getFirstNumber(), request.getSecondNumber());
            logger.info("result: " + result);
            var response = RootResponseRepresentation.builder()
                    .result(result)
                    .build();
            return ResponseEntity.ok(response);
        } catch ( IllegalArgumentException e) {
            logger.warn(e.getMessage());
            return ResponseEntity.badRequest().build();
        } catch ( Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
}
