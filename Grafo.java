/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Grafo {
    
    private ArrayList<Aresta> arestas = new ArrayList<>();
    private ArrayList<Vertice> vertices = new ArrayList<>();
    
    
    
    public void addVertice(int id){
        Vertice v = new Vertice(id);
        if(!vertices.contains(v)){
            vertices.add(v);
        }
    }
    public void addAresta(int origem, int destino, int custo){
        Aresta a = new Aresta(origem,destino,custo);
        if(!arestas.contains(a)){
            arestas.add(a);
        }
    }
    
    /**
     * @return the aresta
     */
    public ArrayList<Aresta> getAresta() {
        return arestas;
    }

    /**
     * @param aresta the aresta to set
     */
    public void setAresta(ArrayList<Aresta> aresta) {
        this.arestas = aresta;
    }

    /**
     * @return the vertice
     */
    public ArrayList<Vertice> getVertice() {
        return vertices;
    }

    /**
     * @param vertice the vertice to set
     */
    public void setVertice(ArrayList<Vertice> vertice) {
        this.vertices = vertice;
    }
   
    public String toString(){
        String saida = "v[";
        for(Vertice v: vertices){
            saida += v.getIndentificador()+",";
        }
        saida += "]\nA[";
        for(Aresta a: arestas){
            saida += "("+a.getOrigem()+","+a.getDestino()+","+a.getCusto()+"),";
        }
        saida += "]";
        return saida;
    }
    
}
