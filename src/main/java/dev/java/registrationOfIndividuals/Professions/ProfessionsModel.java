package dev.java.registrationOfIndividuals.Professions;

import dev.java.registrationOfIndividuals.Users.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_professions")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProfessionsModel {



    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long professionId;
    private String profession;
    private boolean professionStatus;

    // Uma profissão pode ter vários usuários
    @OneToMany(mappedBy = "professions")
    private List<UserModel> user;


}
