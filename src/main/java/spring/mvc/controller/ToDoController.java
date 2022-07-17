package spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.entity.ToDo;
import spring.mvc.example.dto.ThingsToDo;
import spring.mvc.service.TodoService;

import java.util.List;

@Controller
public class ToDoController {
    @Autowired
    private TodoService todoService;
    @RequestMapping("/")
    public String showAllToDo(Model model){
        List<ToDo> allToDo = todoService.getAllTodo();
        model.addAttribute("allToDs", allToDo);
        return "all-todos";
    }
    @RequestMapping("/addNewTodo")
    public String addNewTodo(Model model){
        model.addAttribute("addedTodo", new ToDo());
        return "added-todo-info";
    }

    @RequestMapping("/saveAddedToDo")
    public String saveAddedToDo(@ModelAttribute ToDo addedTodo){
        todoService.saveTodo(addedTodo);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateTodo(@RequestParam("todoId") Integer id, Model model){
            ToDo toDo = todoService.findById(id);
            model.addAttribute("addedTodo",toDo);
        return "added-todo-info";
    }

    @RequestMapping("/deleteTodo")
    public String deleteTodo(@RequestParam("todoId") Integer id){
            todoService.delete(id);
        return "redirect:/";
    }
}
