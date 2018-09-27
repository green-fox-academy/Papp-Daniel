package com.greenfox.todo.repository;

import com.greenfox.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    Todo findByTitle(String title);
}
