/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto5_Web.interfaces;


import Reto5_Web.modelo.Supplements;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceSupplements extends MongoRepository<Supplements, String> {
     public List<Supplements> findByPrice(double price);
    public List<Supplements> findByDescriptionContainingIgnoreCase(String description);
    
}
