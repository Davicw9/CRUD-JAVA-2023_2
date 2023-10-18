/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tarefa.service;

import br.com.ifba.Infrastructure.model.exception.BusinessException;
import br.com.ifba.tarefa.dao.DaoTarefa;
import br.com.ifba.tarefa.dao.IDaoTarefa;
import br.com.ifba.tarefa.model.Tarefa;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author davia
 */
public class ServiceTarefa implements IServiceTarefa{
    
    //mensagem de erro se a Tarefa for null;
    public final static String TAREFA_NULL = "Tarefa não existe";
    
    //mensagem de erro se a Tarefa já existir;
    public final static String TAREFA_EXISTE = "A Tarefa já existe,";
    
    //mensagem de erro se algum campo não for preenchido;
    public final static String CAMPO_NULL = "Algum campo não esta preenchido";
    
    //mensagem de erro se a Tarefa não existir no banco;
    public final static String TAREFA_NAO_EXISTE = "A tarefa não existe na base de dados";
    
    //mensagem de erro se a Tarefa for inválido;
    public final static String TAREFA_INVALIDO = "Tarefa inválido";
    
    
    
    private final IDaoTarefa daoTarefa =  new DaoTarefa();

    @Override
    public Tarefa saveTarefa(Tarefa tarefa) {
        if(tarefa == null){
            throw new BusinessException(TAREFA_NULL);
        } else if(daoTarefa.getById(tarefa.getId()) != null){
            throw new BusinessException(TAREFA_EXISTE);
        } else {
            return daoTarefa.save(tarefa);
        }
    }

    @Override
    public Tarefa updateTarefa(Tarefa tarefa){
        if(tarefa == null){
            throw new BusinessException(TAREFA_NULL);
        } else {
            return daoTarefa.update(tarefa);
        }
    }

    @Override
    public void deleteTarefa(Tarefa tarefa) {
        if(tarefa == null){
            throw new BusinessException(TAREFA_NULL);
        } else {
            daoTarefa.delete(tarefa);
        }
    }
    

    @Override
    public List<Tarefa> getAllTarefa() {
        return daoTarefa.findAll();
    }

    @Override
    public List<Tarefa> findByLocal(String local) {
        if(local == null){
            throw new BusinessException("Local null");
        } else if(local.isEmpty()){
            throw new BusinessException("Local vazio");
        } else {
            return daoTarefa.findByLocal(local);
        }    
    }
    
}
