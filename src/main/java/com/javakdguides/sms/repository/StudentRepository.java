package com.javakdguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javakdguides.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
