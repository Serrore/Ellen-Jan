package de.FH_Dortmund.PR4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class marked by @SpringBootApplication for Spring
 * The standard port is 8080 if not specified elsewhere
 * Specifications found under resources/application.yml
 */
@SpringBootApplication
public class StarterApplication {

    /**
     * main method running this class via SpringApplication with set args
     * @param args command-line arguments
     */
    public static void main(String[] args){
        SpringApplication.run(StarterApplication.class, args);}
}
