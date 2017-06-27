/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author aluno
 */
public class Aresta {
    
    private Vertice origem;
    private Vertice destino;
    private int custo;
    
    public Aresta(int origem, int destino, int custo){
        this.origem = new Vertice(origem);
        this.destino = new Vertice(destino);
        this.custo = custo;
    }

    /**
     * @return the origem
     */
    public Vertice getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    /**
     * @return the destino
     */
    public Vertice getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    /**
     * @return the custo
     */
    public int getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(int custo) {
        this.custo = custo;
    }
    
    public boolean equals(Aresta x){
        if((origem.equals(x.getOrigem()) && destino.equals(x.getDestino())) 
                || (origem.equals(x.getDestino()) && destino.equals(x.getOrigem()))){
            return true;
        }else{
            return false;
        }
    }
}
