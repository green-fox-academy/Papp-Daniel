package com.greenfox.todo.controllers;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EditController {
    private TodoRepository todoRepository;

    public EditController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @GetMapping("/{id}/edit")
    public String editPage(@PathVariable Long id, Model model) {
        Todo todo = todoRepository.findById(id).get();
        model.addAttribute("id",todo.getId());
        model.addAttribute("title",todo.getTitle());
        model.addAttribute("urgent",todo.isUrgent());
        model.addAttribute("done",todo.isDone());

        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editTodo(@PathVariable Long id, String title, boolean done, boolean urgent) {
        Todo todo = todoRepository.findById(id).get();
        todo.setTitle(title);
        todo.setUrgent(urgent);
        todo.setDone(done);
        todoRepository.save(todo);

        return "redirect:/";
    }

}
