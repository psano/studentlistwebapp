package com.example.batsucollege.Repository;

import com.example.batsucollege.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
