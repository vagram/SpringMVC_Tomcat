package spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.mvc.dao.ToDoRepository;
import spring.mvc.entity.ToDo;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    ToDoRepository toDoRepository;
    @Override
    @Transactional
    public List<ToDo> getAllTodo() {
        return toDoRepository.getAllToDo();
    }

    @Override
    @Transactional
    public void saveTodo(ToDo addedTodo) {
        toDoRepository.saveTodo(addedTodo);
    }

    @Override
    @Transactional
    public ToDo findById(Integer id) {
        return toDoRepository.findById(id);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        ToDo toDo = toDoRepository.findById(id);
        if (toDo == null){
            return;
        }
        toDoRepository.delete(id, toDo);
    }
}
