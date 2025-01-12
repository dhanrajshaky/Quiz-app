package com.shakya.quiz.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class QuizQuestion {//this class communicate with data base and also structure of database like question and we can get and post question through this class
    @Id//this is primary id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//this means id gereration every time by one
    private Long id;

    private String questionText;

    private String correctAnswer;

    @ElementCollection
    @CollectionTable (name ="question_options",joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "option_text")
    private List<String> options;//we can add many option in one veraible and show them

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

}
