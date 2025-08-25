package com.shre.quizApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTitle;
    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;
}
