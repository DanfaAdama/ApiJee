package cours.jee.m1gl.api.controllers;

import cours.jee.m1gl.api.model.ErrorResponse;
import cours.jee.m1gl.api.model.Service;
import cours.jee.m1gl.api.model.Specialite;
import cours.jee.m1gl.api.service.ISpecialiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SpecialiteController {
    @Autowired
    private ISpecialiteService iSpecialiteService;

    @PreAuthorize("hasAuthority('ROLE_MEDECIN')")
    @GetMapping("/")
    public ResponseEntity<?> authenticateUser() {
        return ResponseEntity.ok(new ErrorResponse("Hello"));
    }

//    @PostMapping("/add_specialite/{id}")
//    public ResponseEntity<?> addSpecialite(@RequestBody Specialite specialites, @PathVariable("id") int id){
//        Service service=iSpecialiteService.findById(id).orElse(null);
//        if (service != null) {
//            specialites.setServices(service);
//            iSpecialiteService.save(specialites);
//            return ResponseEntity.ok("Specialité enregistrée");
//        } else {
//            return ResponseEntity.ok(new ErrorResponse("Service non disponible"));
//        }
//    }
}
