/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.auditorio.Reto3.servicios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reto3.auditorio.Reto3.modelo.Auditorio;
import reto3.auditorio.Reto3.repositorio.RepositorioAuditorio;

/**
 *
 * @author Tatiana
 */
@Service
public class ServiciosAuditorio {
     @Autowired
    private RepositorioAuditorio metodosCrud;
    
    public List<Auditorio> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Auditorio> getAuditorio(int idAudience){
        return metodosCrud.getAuditorio(idAudience);
    }
    
    public Auditorio save(Auditorio audience){
        if(audience.getId()==null){
            return metodosCrud.save(audience);
        }else{
            Optional<Auditorio> evt=metodosCrud.getAuditorio(audience.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(audience);
            }else{
                return audience;
            }
        }
    }
    public Auditorio update(Auditorio audience){
        if(audience.getId()!=null){
            Optional<Auditorio> e=metodosCrud.getAuditorio(audience.getId());
            if(!e.isEmpty()){
                if(audience.getName()!=null){
                    e.get().setName(audience.getName());
                }
                if(audience.getOwner()!=null){
                    e.get().setOwner(audience.getOwner());
                }
                if(audience.getCapacity()!=null){
                    e.get().setCapacity(audience.getCapacity());
                }
                if(audience.getDescription()!=null){
                    e.get().setDescription(audience.getDescription());
                }
                if(audience.getCategory()!=null){
                    e.get().setCategory(audience.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return audience;
            }
        }else{
            return audience;
        }
    }

    public boolean deleteAuditorio(int audienceId) {
        Boolean aBoolean = getAuditorio(audienceId).map(audience -> {
            metodosCrud.delete(audience);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
