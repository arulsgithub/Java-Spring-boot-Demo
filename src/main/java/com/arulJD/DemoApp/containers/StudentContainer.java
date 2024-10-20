package com.arulJD.DemoApp.containers;

import com.arulJD.DemoApp.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentContainer {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Arul","Murugan");
    }

    @GetMapping("/studentList")
    public List<Student> studentList(){

        List<Student> list = new ArrayList<>();
        list.add(new Student("Arul","Murugan"));
        list.add(new Student("Amritha","Raja"));
        list.add(new Student("Killi","Valavan"));
        list.add(new Student("Kanishka","S"));
        list.add(new Student("Alaa","Adnan"));

        return list;
    }
}
