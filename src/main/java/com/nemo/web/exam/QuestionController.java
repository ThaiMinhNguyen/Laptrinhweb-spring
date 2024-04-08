//package com.nemo.web.exam;
//
//import com.nemo.web.exception.ResourceNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/exams/{examId}/questions")
//public class QuestionController {
//        @Autowired
//        private final ExamRepository examRepository;
//
//    public QuestionController(ExamRepository examRepository) {
//        this.examRepository = examRepository;
//    }
//
////    @PostMapping
////    public ResponseEntity<Question> addQuestionToExam(@PathVariable Long examId, @RequestBody Question question) {
////        Exam exam = examRepository.findById(examId)
////                .orElseThrow(() -> new ResourceNotFoundException("Exam not found with id: " + examId));
////
////        exam.getQuestions().add(question);
////        Exam updatedExam = examRepository.save(exam);
////
////        return ResponseEntity.ok(question);
////    }
//
////    @PutMapping("/{questionId}")
////    public ResponseEntity<Question> updateQuestionInExam(
////            @PathVariable Long examId,
////            @PathVariable Long questionId,
////            @RequestBody Question updatedQuestion
////    ) {
////        Exam exam = examRepository.findById(examId)
////                .orElseThrow(() -> new ResourceNotFoundException("Exam not found with id: " + examId));
////
////        Question question = exam.getQuestions().stream()
////                .filter(q -> q.getId().equals(questionId))
////                .findFirst()
////                .orElseThrow(() -> new ResourceNotFoundException("Question not found with id: " + questionId));
////
////        // Update the question properties
////        question.setQuestionText(updatedQuestion.getQuestionText());
////        question.setOptions(updatedQuestion.getOptions());
////        question.setCorrectAnswer(updatedQuestion.getCorrectAnswer());
////
////        examRepository.save(exam);
////
////        return ResponseEntity.ok(question);
////    }
////
////    @DeleteMapping("/{questionId}")
////    public ResponseEntity<Void> deleteQuestionFromExam(
////            @PathVariable Long examId,
////            @PathVariable Long questionId
////    ) {
////        Exam exam = examRepository.findById(examId)
////                .orElseThrow(() -> new ResourceNotFoundException("Exam not found with id: " + examId));
////
////        Question question = exam.getQuestions().stream()
////                .filter(q -> q.getId().equals(questionId))
////                .findFirst()
////                .orElseThrow(() -> new ResourceNotFoundException("Question not found with id: " + questionId));
////
////        exam.getQuestions().remove(question);
////        examRepository.save(exam);
////
////        return ResponseEntity.noContent().build();
////    }
//}
