package cours.jee.m1gl.api.service;

import cours.jee.m1gl.api.dao.SpecialiteRepository;
import cours.jee.m1gl.api.model.Service;
import cours.jee.m1gl.api.model.Specialite;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class SpecialiteService implements ISpecialiteService {
    @Autowired
    private SpecialiteRepository specialiteRepository;


    @Override
    public Specialite save(Specialite s) {
        return specialiteRepository.save(s);
    }

    @Override
    public Specialite deleteById(int id) {
        return specialiteRepository.deleteById(id);
    }

    @Override
    public Specialite findById(int id) {
        return specialiteRepository.findById(id);
    }

    @Override
    public List<Specialite> findAll() {
        return specialiteRepository.findAll();
    }
}
