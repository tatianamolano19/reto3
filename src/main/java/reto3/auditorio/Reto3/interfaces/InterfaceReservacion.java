/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto3.auditorio.Reto3.interfaces;

import org.springframework.data.repository.CrudRepository;
import reto3.auditorio.Reto3.modelo.Reservacion;

/**
 *
 * @author Tatiana
 */
public interface InterfaceReservacion extends CrudRepository<Reservacion,Integer>  {
    
}
