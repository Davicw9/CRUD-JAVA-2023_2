/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.Infrastructure.model;

import static br.com.ifba.Infrastructure.model.GenericDAO.entityManager;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author davia
 * @param <Entity>
 */
public interface IGenericDao<Entity extends AbstractEntity>{
    
     //Faz uma busca no banco de dados usando o ID como paramnetro 

    Entity getById(Long id);
    
     //salva um ojeto no banco de dados 
    Entity save(Entity obj);
        
     //atualiza um ojeto salvo no banco de dados 
    Entity update(Entity obj);
    
    
    void delete(Entity obj);
    
    List<Entity> findAll();
}
