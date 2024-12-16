package com.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantBackendApplication.class, args);
        
        // This method is the entry point for the Spring Boot application.
        // The implementation is empty because Spring Boot handles the application startup automatically.
        // If further setup is needed (such as specific configurations), they should be done via application properties or beans.
    }
}
