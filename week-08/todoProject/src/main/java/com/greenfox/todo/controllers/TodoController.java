package com.greenfox.todo.controllers;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping(value = {"/todo", "/"})
    public String list(@RequestParam(required = false) Boolean isActive, Model model) {
        if (isActive == null) {
            model.addAttribute("todoList", todoRepository.findAll());
        } else if (isActive == true) {
            List<Todo> isNotDone = Streamable.of(todoRepository.findAll()).stream()
                    .filter(a -> !a.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todoList", isNotDone);
        } else if (isActive == false) {
            List<Todo> isNotDone = Streamable.of(todoRepository.findAll()).stream()
                    .filter(a -> a.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todoList", isNotDone);

        }
        return "todo";
    }
    @GetMapping ("/{id}/delete")
    public String delete(@PathVariable(value = "id") Long id) {
        todoRepository.deleteById(id);
        return "redirect:/";
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

