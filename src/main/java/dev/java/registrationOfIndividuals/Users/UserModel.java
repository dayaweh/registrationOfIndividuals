package dev.java.registrationOfIndividuals.Users;

import dev.java.registrationOfIndividuals.Professions.ProfessionsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

// Entity - turns the class into an entity
// JPA - Java Persistence API
@Entity  // Entity notation for databases
@Table(name= "tb_user_registration") // Generation table registration for db
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserModel {

    @Id // The @Id annotation indicates that the first attribute below it is the ID.
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
   private String name;

   @Column(unique = true)
   private String email;

   @Column(name = "img_url")
   private String imgUrl;


   @Column(name = "age")
   private int age;

   // @ManyToOne, um usuário para uma missão
   @ManyToOne
   @JoinColumn(name = "profession_id") // Foreing Key
   private ProfessionsModel professions;



}
