package com.fedorenko.customer.object.dao.impl;

import com.fedorenko.customer.object.Student;
import com.fedorenko.customer.object.dao.StudentsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCStudentsDAO implements StudentsDAO {

    private static final String SQL_INSERT_STUDENT = "insert into students (pib,course) values (?,?)";

    @Autowired
    private SimpleJdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        jdbcTemplate.update(SQL_INSERT_STUDENT,
                student.getPib(),
                student.getCourse());
    }
}
