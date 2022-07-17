package spring.mvc.dao;

import spring.mvc.entity.ToDo;

import java.util.List;

public interface ToDoRepository {
    public List<ToDo> getAllToDo();

    void saveTodo(ToDo addedTodo);

    ToDo findById(Integer id);

    void delete(Integer id, ToDo toDo);
}
