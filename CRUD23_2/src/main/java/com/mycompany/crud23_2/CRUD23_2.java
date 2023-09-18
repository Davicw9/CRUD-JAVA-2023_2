/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud23_2;

import com.mycompany.model.Tarefa;
import com.mycompany.model.TarefaDAO;

/**
 *
 * @author davia
 */
public class CRUD23_2 {

    public static void main(String[] args) {
        Tarefa t = new Tarefa();
        
        /*t.setId(1);
        t.setDescricao("Dormir ");
        t.setLocal("Em casa");*/
        
        TarefaDAO tdao = new TarefaDAO();
        
        t = tdao.findById(3);
        System.out.println("ID " + t.getId() + "\nDescricao " + t.getDescricao() + "\nLocal " + t.getLocal());
        //tdao.excluirTarefa(15);
        //tdao.atualizarTarefa(t);
        /*tdao.listarTarefas(t);
        System.out.println("\nListagem completa!!");*/
    }
}
