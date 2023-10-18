/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.Infrastructure.model.service;

import br.com.ifba.tarefa.model.Tarefa;
import java.util.List;

/**
 *
 * @author davia
 */
public interface IFacade {
    // ------------------- Usuario -------------------------------//
    public abstract Tarefa saveTarefa(Tarefa usuario);

    public abstract Tarefa updateTarefa(Tarefa usuario);

    public abstract void deleteTarefa(Tarefa usuario);

    public List<Tarefa> getAllTarefa();

    public List<Tarefa> findByName(String name);
    // -----------------------------------------------------------//
}
