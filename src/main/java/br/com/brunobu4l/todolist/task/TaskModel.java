package br.com.brunobu4l.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
 /**
     * ID
     * Usuário
     * Descrição
     * Título
     * Data de Inicio
     * Data de Término
     * Prioridade
     * 
     */
@Data
@Entity(name = "tb_tasks")    
public class TaskModel {
   
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;
    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
     private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setTitle(String title) throws Exception{
        if(title.length() >50){
            throw new Exception("O campo excedeu 50 caracters");
        }
        this.title = title;
    }

}
