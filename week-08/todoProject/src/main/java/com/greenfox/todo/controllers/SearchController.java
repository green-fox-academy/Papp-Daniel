package com.greenfox.todo.controllers;


import com.greenfox.todo.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SearchController {
    private TodoRepository todoRepository;

    public SearchController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/search")
    public String searchTodo(String title, Model model) {
        model.addAttribute("todoList",todoRepository.findByTitle(title));
        return "todo";
    }

}
//?title=" + todo.getTitle()