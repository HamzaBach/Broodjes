package com.example.Broodjes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    private final StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudenten(){
        return studentService.getStudenten();
    }

    @GetMapping(path = "{studentId}")
    public Double getSchuld(@PathVariable("studentId") Long studentId){
        return studentService.schuld(studentId);
    }

}
