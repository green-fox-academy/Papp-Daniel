package com.greenfox.todo.controllers;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SearchController {
    private TodoRepository todoRepository;

    public SearchController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping("/search")
    public String searchTodo(String title, Model model) {
        model.addAttribute("todoList",todoRepository.findByTitle(title));
        return "todo";
    }

}
//?title=" + todo.getTitle()