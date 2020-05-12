package cours.jee.m1gl.api.service;

import cours.jee.m1gl.api.model.Service;
import cours.jee.m1gl.api.model.Specialite;

import java.util.List;

public interface ISpecialiteService {
    public Specialite save(Specialite s);
    public Specialite deleteById(int id);
    public Specialite findById(int id);
    public List<Specialite> findAll();
}
