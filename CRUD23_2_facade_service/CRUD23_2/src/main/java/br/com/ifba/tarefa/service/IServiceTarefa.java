/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tarefa.service;

import br.com.ifba.tarefa.model.Tarefa;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author davia
 */
public interface IServiceTarefa {
    
    public abstract Tarefa saveTarefa(Tarefa usuario);

    public abstract Tarefa updateTarefa(Tarefa usuario);

    public abstract void deleteTarefa(Tarefa usuario);

    public List<Tarefa> getAllTarefa();

    public List<Tarefa> findByLocal(String local);
    
}
