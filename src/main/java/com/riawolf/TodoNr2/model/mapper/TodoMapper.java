package com.riawolf.TodoNr2.model.mapper;


import com.riawolf.TodoNr2.model.todo.Todo;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface TodoMapper {

    @Select("SELECT * FROM Todo_table_Nr2")
    ArrayList<Todo> getAllItems();

    @Insert("INSERT INTO Todo_table_Nr2 (`title`) VALUES (#{title})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void addItems(Todo todo);

    @Update("UPDATE Todo_table_Nr2 SET title= #{title}, checked=#{checked} WHERE id = #{id}")
    void updateItem(Todo todo);

    @Delete("DELETE FROM Todo_table_Nr2 WHERE id = #{id}")
    void deleteItems(Todo todo);

}
