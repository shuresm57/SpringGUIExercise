package org.example.springguiexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
public class SpringGuiExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGuiExerciseApplication.class, args);
    }

}
