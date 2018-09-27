package com.greenfox.todo.controllers;


import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddController {
    private TodoRepository todoRepository;

    public AddController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/addTodo")
    public String getaddTodo() {
        return "addTodo";
    }

    @PostMapping("/addTodo")
    public String addNewTodo(String title) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todoRepository.save(todo);

        return "redirect:/";
    }
}
