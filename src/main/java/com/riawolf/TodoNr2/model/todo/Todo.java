package com.riawolf.TodoNr2.model.todo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private Integer id;
    private String title;
    private Boolean checked = false;
}
