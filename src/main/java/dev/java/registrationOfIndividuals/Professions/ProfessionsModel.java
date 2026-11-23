package dev.java.registrationOfIndividuals.Professions;

import dev.java.registrationOfIndividuals.Users.UserModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_professions")
public class ProfessionsModel {



    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long professionId;
    private String profession;
    private boolean professionStatus;

    // Uma profissão pode ter vários usuários
    @OneToMany(mappedBy = "professions")
    private List<UserModel> user;

    public ProfessionsModel() {
    }

    public ProfessionsModel(String profession, boolean professionStatus, UserModel user) {
        this.profession = profession;
        this.professionStatus = professionStatus;
    }



    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


    public boolean isProfessionStatus() {
        return professionStatus;
    }

    public void setProfessionStatus(boolean professionStatus) {
        this.professionStatus = professionStatus;
    }


}
