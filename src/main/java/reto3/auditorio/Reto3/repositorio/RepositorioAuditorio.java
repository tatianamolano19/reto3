/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.auditorio.Reto3.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto3.auditorio.Reto3.interfaces.InterfaceAuditorio;
import reto3.auditorio.Reto3.modelo.Auditorio;

/**
 *
 * @author Tatiana
 */
@Repository
public class RepositorioAuditorio {
     @Autowired
    private InterfaceAuditorio crud;
    

    public List<Auditorio> getAll(){
        return (List<Auditorio>) crud.findAll();       
    }
    
    public Optional <Auditorio> getAuditorio(int id){
        return crud.findById(id);
    }
    
    public Auditorio save(Auditorio audience){
        return crud.save(audience);
    }
      public void delete(Auditorio audience){
        crud.delete(audience);
    }
    
}
