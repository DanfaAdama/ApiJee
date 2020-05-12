package cours.jee.m1gl.api.service;

import cours.jee.m1gl.api.model.Service;

import java.util.List;

public interface IServiceService {
    public Service save(Service s);
    public Service deleteById(int id);
    public Service findById(int id);
    public List<Service> findAll();

}
