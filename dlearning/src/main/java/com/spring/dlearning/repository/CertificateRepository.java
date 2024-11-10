package com.spring.dlearning.repository;

import com.spring.dlearning.entity.Certificate;
import com.spring.dlearning.entity.Course;
import com.spring.dlearning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> {

    boolean existsByCourseAndUser(Course course, User user);
    List<Certificate> findByUser(User user);
}