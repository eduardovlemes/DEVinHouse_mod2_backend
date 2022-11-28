package tech.devinhouse.entity;

import jakarta.persistence.*;

@Entity(name = "pessoas")
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "name")
    private String name;
    @Column (name = "email")
    private String email;
    @Column (name = "status")
    private Boolean status;
}
