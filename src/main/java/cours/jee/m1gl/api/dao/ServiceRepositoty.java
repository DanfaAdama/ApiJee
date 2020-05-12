package cours.jee.m1gl.api.dao;

import cours.jee.m1gl.api.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepositoty extends JpaRepository<Service,Integer> {
    public Service findById(int id);
    public Service deleteById(int id);

}
