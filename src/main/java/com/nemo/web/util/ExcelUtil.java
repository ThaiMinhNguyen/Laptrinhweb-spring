//package com.nemo.web.util;
//
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import com.nemo.web.exam.Question;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class ExcelUtil {
//
//    public static List<Question> readQuestionsFromExcel(InputStream inputStream) throws IOException {
//        List<Question> questions = new ArrayList<>();
//
//        Workbook workbook = new XSSFWorkbook(inputStream);
//        Sheet sheet = workbook.getSheetAt(0);
//
//        Iterator<Row> rowIterator = sheet.iterator();
//        while (rowIterator.hasNext()) {
//            Row row = rowIterator.next();
//
//            Cell questionCell = row.getCell(0);
//            Cell answerCell = row.getCell(1);
//
//            String questionText = questionCell.getStringCellValue();
//            String correctAnswer = answerCell.getStringCellValue();
//
//            Question question = new Question();
//            question.setQuestionText(questionText);
//            question.setCorrectAnswer(correctAnswer);
//
//            questions.add(question);
//        }
//
//        workbook.close();
//
//        return questions;
//    }
//}
