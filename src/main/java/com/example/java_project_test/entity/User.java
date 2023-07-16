package com.example.java_project_test.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "AssociateUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Userid;

    private String Username;

    private String email;

    private String gender;



}
