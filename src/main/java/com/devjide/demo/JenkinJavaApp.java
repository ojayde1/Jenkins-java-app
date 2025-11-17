
package com.devjide.demo; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinJavaApp extends SpringBootServletInitializer { // RENAMED: More descriptive class name

    /**
     * Defines a simple GET endpoint to confirm the application is running.
     * Accessible at http://<host>:8080/message
     * @return A congratulatory message string.
     */
    @GetMapping("/message")
    public String displayMessage(){
        // Using the artifactId in the message to confirm which app is running
        return "Congratulations! The 'Jenkin-Java-App' is successfully deployed via CI/CD!";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinJavaApp.class, args); //
    }

}

// package com.devjide.demo;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // <-- NEW IMPORT
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
// @RestController
// // CRITICAL: Extends the initializer to allow WAR deployment to external Tomcat
// public class JenkinJavaApp extends SpringBootServletInitializer { 

//     /**
//      * Defines a simple GET endpoint to confirm the application is running.
//      * Accessible at http://<host>:8080/message
//      * @return A congratulatory message string.
//      */
//     @GetMapping("/message")
//     public String displayMessage(){
//         // Using the artifactId in the message to confirm which app is running
//         return "Congratulations! The 'Jenkin-Java-App' is successfully deployed via CI/CD!";
//     }

//     public static void main(String[] args) {
//         SpringApplication.run(JenkinJavaApp.class, args);
//     }

// }

