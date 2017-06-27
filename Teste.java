/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author aluno
 */
public class Teste {

    public static void main(String[] arg){
        Grafo g = new Grafo();
        g.addVertice(1);
        g.addVertice(2);
        g.addVertice(3);
        g.addAresta(2, 1, 5);
        
        
      
        System.out.println(g.toString());
    }
}
