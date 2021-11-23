package com.example.basicproject1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args ->
        {
            Student miahossain =  new Student(
                    "Mia Hossain",
                    "miahossain8888@gmail.com",
                    LocalDate.of(2000, JANUARY, 10)
            );
            Student romaakter = new Student(
                    "Roma Akter",
                    "romaakter@gmail.com",
                    LocalDate.of(2001, APRIL, 14)
            );
            Student sabina = new Student(
                    "Sabina Akter",
                    "sabinaakter@gmail.com",
                    LocalDate.of(2005, APRIL, 14)
            );

            repository.saveAll(
                    List.of(miahossain, romaakter, sabina)
            );
        };
    }
}
