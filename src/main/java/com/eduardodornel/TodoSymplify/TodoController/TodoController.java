package com.eduardodornel.TodoSymplify.TodoController;

import com.eduardodornel.TodoSymplify.dtos.TodoRecordDto;
import com.eduardodornel.TodoSymplify.models.TodoModel;
import com.eduardodornel.TodoSymplify.repository.TodoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @PostMapping
       public ResponseEntity<TodoModel> saveTodo(@RequestBody @Valid TodoRecordDto todoRecordDto){

        var todoModel = new TodoModel();
        BeanUtils.copyProperties(todoRecordDto,todoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(todoRepository.save(todoModel));

    }

    @GetMapping
    public ResponseEntity<List<TodoModel>> getAllTodo(){
        return ResponseEntity.status(HttpStatus.OK).body(todoRepository.findAll());
    }



}
