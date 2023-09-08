package com.dannyspring.dannyspringboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student(
                    "Miriam",
                    "miriam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    23
            );

            Student alex = new Student(
                    "alex",
                    "alex.jamal@gmail.com",
                    LocalDate.of(2002, Month.MAY, 16),
                    21
            );

            repository.saveAll(
                    List.of(
                            miriam, alex
                    )
            );
        };
    }
}
