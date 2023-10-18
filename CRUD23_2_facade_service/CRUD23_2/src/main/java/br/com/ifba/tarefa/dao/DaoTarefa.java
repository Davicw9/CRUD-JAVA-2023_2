/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tarefa.dao;

import br.com.ifba.Infrastructure.model.GenericDAO;
import br.com.ifba.tarefa.model.Tarefa;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author davia
 */
public class DaoTarefa extends GenericDAO<Tarefa> implements IDaoTarefa{
   
    
    @Override
    public ArrayList<Tarefa> findByLocal(String local){
  
        Query query = entityManager.createQuery("SELECT t FROM Tarefa t WHERE t.local = :local");
        query.setParameter("local", local);
        
        ArrayList<Tarefa> lista = (ArrayList<Tarefa>) query.getResultList();
        
        return lista;
    }
}
