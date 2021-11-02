/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.auditorio.Reto3.web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reto3.auditorio.Reto3.modelo.Auditorio;
import reto3.auditorio.Reto3.servicios.ServiciosAuditorio;

/**
 *
 * @author Tatiana
 */
@RestController
@RequestMapping("/api/Audience")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebAuditorio {
    
      @GetMapping("/holaMundo")
    public String saludad(){
    return "Hola Mundo Tutoria";
    }
    
    @Autowired
    private ServiciosAuditorio servicio;
    @GetMapping("all")
    public List <Auditorio> getAuditorio(){
        return servicio.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Auditorio> getAuditorio(@PathVariable("id") int idAudience) {
        return servicio.getAuditorio(idAudience);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Auditorio save(@RequestBody Auditorio audience) {
        return servicio.save(audience);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Auditorio update(@RequestBody Auditorio audience) {
        return servicio.update(audience);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int audienceId) {
        return servicio.deleteAuditorio(audienceId);
    }
}
