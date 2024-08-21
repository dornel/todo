package com.eduardodornel.TodoSymplify.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "TB_TODO")
public class TodoModel extends RepresentationModel<TodoModel> {

    @Id
    int id = 0;
    String name;
    String status;
    String priority;

    public int getId(){
        return id++;

    }

        public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
