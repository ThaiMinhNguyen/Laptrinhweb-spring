package com.nemo.web.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    @Autowired
    private ExamRepository examRepository;

    @GetMapping
    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }

    @PostMapping
    public Exam createExam(@RequestBody Exam exam) {
        return examRepository.save(exam);
    }

    @PutMapping("/{id}")
    public Exam updateExam(@PathVariable Long id, @RequestBody Exam exam) {
        exam.setId(id);
        return examRepository.save(exam);
    }

    @DeleteMapping("/{id}")
    public void deleteExam(@PathVariable Long id) {
        examRepository.deleteById(id);
    }
}

