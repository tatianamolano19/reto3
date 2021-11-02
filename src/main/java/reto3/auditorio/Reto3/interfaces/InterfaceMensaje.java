/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto3.auditorio.Reto3.interfaces;

import org.springframework.data.repository.CrudRepository;
import reto3.auditorio.Reto3.modelo.Mensaje;

/**
 *
 * @author Tatiana
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
