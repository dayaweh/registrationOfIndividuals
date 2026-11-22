package dev.java.registrationOfIndividuals;

import jakarta.persistence.*;

// Entity - turns the class into an entity
// JPA - Java Persistence API
@Entity  // Entity notation for databases
@Table(name= "tb_user_registration") // Generation table registration for db
public class UserModel {

    @Id // The @Id annotation indicates that the first attribute below it is the ID.
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
   private String name;
   private String email;
   private int age;

    public UserModel() { // No Args
    }

    public UserModel(String name, String email, int age) { // All-Args
        this.name = name;
        this.email = email;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
