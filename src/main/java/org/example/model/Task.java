package org.example.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String StudentName;
    private String status;
}
