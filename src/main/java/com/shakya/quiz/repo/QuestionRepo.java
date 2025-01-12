package com.shakya.quiz.repo;

import com.shakya.quiz.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo  extends JpaRepository<QuizQuestion,Long> {//in <> we mention class of entity and long means data type of primary key
//in this interface we extends jparepository for take jpa functionality
}
