package com.javatechie.k8s;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootK8sDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}

package com.devjide.demo; //to match the pom.xml group ID

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Basic integration test for the Spring Boot application context.
 * This test ensures that the application loads successfully.
 */
@SpringBootTest
class JenkinJavaAppTests { // Corrected class name

    @Test
    void contextLoads() {
        // Simple test to ensure the Spring application context starts without errors.
    }

}