package com.larnyINC.TutsApiDemo.Dao;

import com.larnyINC.TutsApiDemo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentDao extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {

}
