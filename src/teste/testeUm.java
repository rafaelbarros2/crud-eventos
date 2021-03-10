/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.List;
import static java.lang.Compiler.command;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class testeUm {
    
    public static void main(String[] args) {
        // TODO code application logic heSystem.out.println("Buscar todos alunos banco de dados");
        List<Integer> alunos = new ArrayList<Integer>();
        alunos.add(1);
        alunos.add(2);
        alunos.add(3);
        alunos.add(4);
        alunos.add(5);
        alunos.add(6);

        System.out.println("Buscar todas as salas do banco de dados...");
        List<Integer> salas = new ArrayList<Integer>();
        salas.add(1);
        salas.add(2);

        int qtdAluno = alunos.size();
        int qtdSala = salas.size();

        int divisao = qtdAluno/qtdSala;

        System.out.println("Divisão: " + divisao);

        System.out.println("Criando matriz para adicionar a nova divisão de sala...");
        List<List<String>> salasDivididas = new ArrayList<List<String>>();
        for(int i = 0;i < divisao; i++) {
            System.out.println("Passou " + (i+1));
            System.out.println("Criando nova lista de sala com os alunos...");
            List<String> salaNova = new ArrayList<String>();
            String salaFormada = alunos.get(1) + "" + salas.get(1);
            salaNova.add(salaFormada);
            salasDivididas.add(salaNova);
        }

        System.out.println("Salas Formadas" + salasDivididas);re
    }
}
