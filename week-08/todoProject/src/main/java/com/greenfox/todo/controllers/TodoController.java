package com.greenfox.todo.controllers;

import com.greenfox.todo.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping("/todo")
    public String list(@RequestParam("isActive")boolean isActive, Model model) {
        model.addAttribute("todoList", todoRepository.findAll());

        return "todo";
    }

    @PostMapping("/addTodo")
    public String addTodo(Model model, String todo) {
        return "addTodo";

    }
}
