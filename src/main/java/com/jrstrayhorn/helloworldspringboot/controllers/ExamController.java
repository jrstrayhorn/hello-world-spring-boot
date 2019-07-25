package com.jrstrayhorn.helloworldspringboot.controllers;

import com.jrstrayhorn.helloworldspringboot.model.Exam;
import com.jrstrayhorn.helloworldspringboot.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ExamController {

    @Autowired
    private ExamRepository examRepository;

    @GetMapping("/exams")
    public Page<Exam> getExams(Pageable pageable) {
        return examRepository.findAll(pageable);
    }

    @PostMapping("/exams")
    public Exam createExam(@Valid @RequestBody Exam exam) {
        return examRepository.save(exam);
    }
}
