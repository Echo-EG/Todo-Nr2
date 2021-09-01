package com.riawolf.TodoNr2.model.todoService;

import com.riawolf.TodoNr2.model.mapper.TodoMapper;
import com.riawolf.TodoNr2.model.todo.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceTodo {

    private final TodoMapper todoMapper;


    public ServiceTodo(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public ArrayList<Todo> getAllItems1() {
        return this.todoMapper.getAllItems();
    }

    public Todo addItems1(Todo todo){
        this.todoMapper.addItems(todo);
        return todo;
    }

    public Todo updateItem1 (Todo todo){
        this.todoMapper.updateItem(todo);
        return todo;
    }

    public Todo deleteItem1(Todo todo){
        this.todoMapper.deleteItems(todo);
        return todo;
    }
}

