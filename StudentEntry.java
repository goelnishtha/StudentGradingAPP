package com.example.StydentGradeGenerator.Controllers;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class StudentGradeApp {

    @PostMapping("/studentEntry")
    public String studentEntry(@RequestBody Map<String, String> data){
        String name = data.get("Name");
        String rollNumber = data.get("RollNumber");
        String dob = data.get("DateOfBirth");
        String gender = data.get("Gender");
        String admissionNo = data.get("AdmissionNumber");
        String department = data.get("Department");
        String bloodGroup = data.get("BloodGroup");
        String address = data.get("Address");
        String pinCode = data.get("PinCode");
        return "Student details recorded successfully!";
    }

    @PostMapping("/findResult")
    public String findResult(@RequestBody Map<String, Object> data){
        String rollNumber = (String) data.get("RollNumber");
        Map<String, String> marks = (Map<String, String>) data.get("Marks");

        int totalMarks = 0;
        int maxMarks = 0;
        for (String subject : marks.keySet()) {
            String[] score = marks.get(subject).split("/");
            totalMarks += Integer.parseInt(score[0]);
            maxMarks += Integer.parseInt(score[1]);
        }

        double percentage = ((double) totalMarks / maxMarks) * 100;
        String grade;
        if (percentage >= 90) grade = "S";
        else if (percentage >= 85) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 75) grade = "B+";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 65) grade = "C+";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 55) grade = "D+";
        else if (percentage >= 50) grade = "D";
        else grade = "F";

        return grade.equals("F") ? "Failed" : "Passed with grade: " + grade;
    }
}

