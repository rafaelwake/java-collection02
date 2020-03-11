/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fai.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner

/**
 *
 * @author Rafael
 */
public class Main {
    public static void main (String[] args){
        Main app = new Main();
        app.start();
            
    }
    
    

    private Map<String, String> mapa =
            new HashMap<String, String>();
    
    private void start() {
        
        adicionarItensNoMapa();
        iterarMapa();
        System.out.println("Proxima etapa");
        exibirValoresDoMapaPelaChave(lerMapa());
        System.out.println("FIM");
        
        
    }
    
    private void adicionarItensNoMapa(){
        try {
            mapa.put("SRS", "Santa Rita do Sapucaí");
            mapa.put("PA", "Pouso Alegre");
            mapa.put("ITA", "Itajuba");
            mapa.put("ZORO", "Canceicao dos Ouros");
            mapa.put("CAXU", "Cachoeira de Minas");
        } catch (Exception e) {
            System.out.println("Erro de excessao");
        } finally{
            System.out.println("Cheguei no finally");
        }
        
    }
    
    private String lerMapa(){
        String lendo;
        System.out.println("Entre com a cidade procurara: ");
        Scanner ler = new Scanner(System.in); 
        lendo = ler.nextLine();
        
        return lendo;
    }
    
    private void iterarMapa(){
        for(String chave: mapa.keySet()){
            System.out.println("-------------------------------");
            System.out.println("Chave: " + chave + " | Valor " + mapa.get(chave));
        }
    }
    
    
    private void exibirValoresDoMapaPelaChave(String chave) {
        String valorDoItemNoMapa = mapa.get(chave);
        
        
        if(valorDoItemNoMapa == null || valorDoItemNoMapa.isEmpty()){
            System.out.print("Essa chave nao existe no mapa"+ chave);
        }else{
            System.out.println("O valor dessa chave eh: "+ mapa.get(chave));
        }
        
        //System.out.println("O valor dessa chave eh: " +mapa.get(chave));
    }
    
    
}
