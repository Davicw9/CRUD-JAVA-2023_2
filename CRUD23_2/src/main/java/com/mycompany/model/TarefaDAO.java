/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author davia
 */
public class TarefaDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
    EntityManager em = emf.createEntityManager();
    
    public void salvaTarefa(Tarefa tarefa){
        em.getTransaction().begin();
        em.persist(tarefa);
        em.getTransaction().commit();
        System.out.println("Tarefa Salva!!!");
    }
    
    public void excluirTarefa(int x){
        Tarefa encontrada = em.find(Tarefa.class, x);
        em.getTransaction().begin();
        em.remove(encontrada);
        em.getTransaction().commit();
        System.out.println("Tarefa removido com sucesso!!!");
    }
    
    
    public void atualizarTarefa(Tarefa tarefa){
        em.getTransaction().begin();
        em.merge(tarefa);
        em.getTransaction().commit();
        System.out.println("Tarefa atualizada com sucesso!!!");
    }
    
    public ArrayList<Tarefa> findAll(){
        
        //ArrayList<Tarefa> lista = null;
        
        ArrayList<Tarefa> lista = (ArrayList<Tarefa>) em.createQuery("from Tarefa").getResultList();
        
        
        return lista;
    }
    public Tarefa findById(int id){
        
        Tarefa tarefa = new Tarefa();
        
        Query query = em.createQuery("SELECT t FROM Tarefa t WHERE t.id = :id");
        query.setParameter("id", id);
        
        tarefa = (Tarefa) query.getSingleResult();
        
        return tarefa;
    }
    public ArrayList<Tarefa> findByLocal(String local){
  
        Query query = em.createQuery("SELECT t FROM Tarefa t WHERE t.local = :local");
        query.setParameter("local", local);
        
        ArrayList<Tarefa> lista = (ArrayList<Tarefa>) query.getResultList();
        
        return lista;
    }
    
}
