package com.shre.quizApp.service;

import com.shre.quizApp.dao.QuestionDao;
import com.shre.quizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;

    }
}
