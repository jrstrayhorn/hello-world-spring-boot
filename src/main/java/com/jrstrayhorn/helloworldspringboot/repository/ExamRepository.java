package com.jrstrayhorn.helloworldspringboot.repository;

import com.jrstrayhorn.helloworldspringboot.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}
