package cours.jee.m1gl.api.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30)
    private String libelle;

    public Service getServices() {
        return services;
    }

    public void setServices(Service services) {
        this.services = services;
    }

    @ManyToOne
    @JoinColumn(name = "service_id")
    Service services;


    @ManyToMany(mappedBy = "specialites")
    private List<Medecin> medecins;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }



    public List<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(List<Medecin> medecins) {
        this.medecins = medecins;
    }
    public  Specialite(){
        services=new Service();
    }


}
