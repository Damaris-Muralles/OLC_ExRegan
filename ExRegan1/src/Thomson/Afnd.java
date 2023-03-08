
package Thomson;

import arbol_afd.nodo;

public class Afnd {
    public int initial;
    public nodo transitions;
    public String epsilont;
    public int finalS;
    
    public Afnd( int initial, nodo transitions,String epsilont, int finalS ) {
        this.initial= initial;
        this.transitions = transitions;
        this.epsilont = epsilont;
        this.finalS = finalS;
    }
    
    
}
