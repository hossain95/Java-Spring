package com.example.basicproject1.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService
{
    public List<Student> getStudents()
    {
        return List.of(
                new Student(
                        1L,
                        "Mia Hossain",
                        "miahossain8888@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 10),
                        25
                ),
                new Student(
                        2L,
                        "Roma Akter",
                        "romaakter@gmail.com",
                        LocalDate.of(2001, Month.APRIL, 14),
                        24
                )
        );
    }
}
