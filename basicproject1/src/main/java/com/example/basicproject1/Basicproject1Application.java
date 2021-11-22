package com.example.basicproject1;

import com.example.basicproject1.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class Basicproject1Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Basicproject1Application.class, args);
	}
}
