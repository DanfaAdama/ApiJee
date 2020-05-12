package cours.jee.m1gl.api.dao;

import cours.jee.m1gl.api.model.Service;
import cours.jee.m1gl.api.model.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialiteRepository  extends JpaRepository<Specialite, Integer> {
    public Specialite findById(int id);
    public Specialite deleteById(int id);
}
