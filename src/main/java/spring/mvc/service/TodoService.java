package spring.mvc.service;

import spring.mvc.entity.ToDo;

import java.util.List;

public interface TodoService {
    List<ToDo> getAllTodo();

    void saveTodo(ToDo addedTodo);

    ToDo findById(Integer id);

    void delete(Integer id);
}
