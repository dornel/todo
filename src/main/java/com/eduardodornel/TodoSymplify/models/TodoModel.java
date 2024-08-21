package com.eduardodornel.TodoSymplify.models;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "TB_TODO")
public class TodoModel extends RepresentationModel<TodoModel> {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long  id ;
    private String name;
    private String status;
    private String priority;

    public long getId(){
        return id;

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
