package de.FH_Dortmund.PR4.multiply;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Service interface to create a REST endpoint with jakarta to handle HTTP POST requests
 * The consumed and produced MediaType ist JSON
 * Path is declared on class level and further appended on method level
 */
@Path("/api")
public interface MultiplicationService {

  @POST
  @Path("/multiply")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  MultiplicationResponseRepresentation multiply(MultiplicationRequestRepresentation request);
}

