package cours.jee.m1gl.api.controllers;

import cours.jee.m1gl.api.model.ErrorResponse;
import cours.jee.m1gl.api.model.Service;
import cours.jee.m1gl.api.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Controller
public class ServiceController {
    @Autowired
    private IServiceService iServiceService;

    @GetMapping(path="/services")
    public ResponseEntity<?> listeServices()
    {
        return ResponseEntity.ok(iServiceService.findAll());
    }

    @PostMapping(path= "/add")
    public ResponseEntity<?> add(@RequestBody Service service) {
        iServiceService.save(service);

        return ResponseEntity.ok("Service enregistre avec succes");
    }

    @DeleteMapping("/services/{id}")
    public ResponseEntity<HttpStatus> deleteService(@PathVariable("id") int id) {
        try {
            iServiceService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }


    @PreAuthorize("hasAuthority('ROLE_MEDECIN')")
    @GetMapping("/")
    public ResponseEntity<?> authenticateUser() {
        return ResponseEntity.ok(new ErrorResponse("Hello"));
    }



}
