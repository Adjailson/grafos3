/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author aluno
 */
public class Vertice {
    
    private int indentificador;
    
    public Vertice(int id){
        this.indentificador = id;
    }

   
    public int getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }
    
    public boolean equals(Vertice v){
        return this.indentificador == v.getIndentificador();
    }
    
    public String toString(){
        return this.indentificador + "";
    }
    
}
