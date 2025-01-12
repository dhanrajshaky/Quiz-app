package com.shakya.quiz.service;

import com.shakya.quiz.entity.QuizQuestion;
import com.shakya.quiz.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {//this class hold the actual logic of website

@Autowired//injecting interface
QuestionRepo questionRepo;
public  List<QuizQuestion> getAllQuestion(){//throw object of entity class we sturcture question and get question from database
    List<QuizQuestion> questionRepoAll = questionRepo.findAll();//store in questionrepoAll variable
    return questionRepoAll;//return variable when this method call all question return

}

public  QuizQuestion saveQuestion(QuizQuestion question){//this mothod save new question and also update some of them
    QuizQuestion save = questionRepo.save(question);
    return save;
}
}
