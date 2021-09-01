package com.riawolf.TodoNr2.controller;


import com.riawolf.TodoNr2.model.todo.Todo;
import com.riawolf.TodoNr2.model.todoService.ServiceTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
public class Controller {



    @Autowired
    private ServiceTodo serviceTodo;

//    private ArrayList<Todo> todo;

    @GetMapping("/todo")
    public ArrayList<Todo> getTodo(){

        return this.serviceTodo.getAllItems1();
    }

    @PostMapping("/post")
    public Todo postTodo(@RequestBody Todo item){
        Todo result = this.serviceTodo.addItems1(item);
        return result;
    }

    @PutMapping("/{id}" )
    public Todo putTodo (@RequestBody Todo item){
        this.serviceTodo.updateItem1(item);
        return item;
    }

    @DeleteMapping("delete/{id}")
    public Todo deleteTodo(Todo todo){
        this.serviceTodo.deleteItem1(todo);
        return todo;
    }





}
