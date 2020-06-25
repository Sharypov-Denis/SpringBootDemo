package net.proselyte.springbootdemo.model;

import lombok.Data;

import javax.persistence.*;
/*
аннотирован как @Entity, означая, что он является JPA сущностью.
Из-за отсутствия аннотации @Table, предполагается,
что сущность будет соответствовать таблице с названием Customer.
 */
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

}