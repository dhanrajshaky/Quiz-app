package com.shakya.quiz.controller;

import com.shakya.quiz.dto.LoginRequest;
import com.shakya.quiz.entity.QuizQuestion;
import com.shakya.quiz.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    QuestionService questionService;

    //hardcoded credentials for now
    private final String USERNAME ="user";
    private final String PASSWORD ="password";

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {//requisted go to loginrequist class and
        if (USERNAME.equals(loginRequest.getUsername())&& PASSWORD.equals(loginRequest.getPassword()))//if username and password is same has in data than permission to login
        {
            return "login successfull";
        }else{//if not equal to username and password than no permission to login
            return "invalid username or password";
        }
    }

    @GetMapping("/questions")//making api when call api this function then this function run ,this only get api
    public List<QuizQuestion> getQuestion(){//make mathod with the object of QuizQuestion and acces throw service layer
        return questionService.getAllQuestion();//return the method of servic layer whos hold all question
    }

    @PostMapping(value = "/save", consumes = "application/json",produces ="application/json" )//this is api whos update and save more question in database
public QuizQuestion saveQuestion(@RequestBody QuizQuestion question)//again object of entity layer becouse question stuructor writen in entity layer and also get from same structure
    {
        return questionService.saveQuestion(question);// now return the save and update question
    }


}
