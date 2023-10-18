/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tarefa.dao;

import br.com.ifba.Infrastructure.model.IGenericDao;
import br.com.ifba.tarefa.model.Tarefa;
import java.util.ArrayList;

/**
 *
 * @author davia
 */
public interface IDaoTarefa extends IGenericDao<Tarefa>{
    public ArrayList<Tarefa> findByLocal(String local);
}
