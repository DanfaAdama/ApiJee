package cours.jee.m1gl.api.service;

import cours.jee.m1gl.api.dao.ServiceRepositoty;
import cours.jee.m1gl.api.model.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceService implements IServiceService {
    @Autowired
    private ServiceRepositoty serviceRepositoty;

    @Override
    public Service save(Service s) {
        return serviceRepositoty.save(s);
    }

    @Override
    public Service deleteById(int id) {
        return serviceRepositoty.deleteById(id);
    }


    @Override
    public Service findById(int id) {
        return serviceRepositoty.findById(id);
    }

    @Override
    public List<Service> findAll() {
        return serviceRepositoty.findAll();
    }
}
