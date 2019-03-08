package com.larnyINC.TutsApiDemo.Controller;


import com.larnyINC.TutsApiDemo.DTO.ResponseDTO;
import com.larnyINC.TutsApiDemo.Dao.StudentDao;
import com.larnyINC.TutsApiDemo.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @PostMapping("/register")
    public @ResponseBody
    ResponseDTO register(@RequestBody Student student) throws IOException {
        try {
            studentDao.save(student);
            return new ResponseDTO("00", "Registered", null);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseDTO("XX", "Error Occurred", null);
        }
    }

    @GetMapping("/all")
    public @ResponseBody
    ResponseDTO getAll() throws IOException {
        try {
            return new ResponseDTO("00", "Loaded all students", studentDao.findAll());
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseDTO("XX", "Error Occurred", null);
        }
    }

    @GetMapping("/get/{id}")
    public @ResponseBody
    ResponseDTO getOne(@PathVariable Long id) throws IOException, NumberFormatException {
        try {
            studentDao.findById(id);
            return new ResponseDTO("00", "Students gotten by id", studentDao.findById(id));
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseDTO("XX", "Error Occurred", null);
        }
    }

    @PutMapping("/update/{id}")
    public @ResponseBody
    ResponseDTO update(@RequestBody Student student) throws IOException {
        try {
            studentDao.save(student);
            return new ResponseDTO("00", "Updated", null);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseDTO("XX", "Error Occurred", null);
        }
    }

    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseDTO delete(@PathVariable Long id) throws IOException, NumberFormatException {
        try {
            studentDao.deleteById(id);
            return new ResponseDTO("00", "deleted", null);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseDTO("XX", "Error Occurred", null);
        }
    }

}
