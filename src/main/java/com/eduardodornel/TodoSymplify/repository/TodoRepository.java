package com.eduardodornel.TodoSymplify.repository;


import com.eduardodornel.TodoSymplify.models.TodoModel;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoModel, Id> {
}
