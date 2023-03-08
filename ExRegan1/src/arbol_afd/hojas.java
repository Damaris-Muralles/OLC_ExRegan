package arbol_afd;

import java.util.ArrayList;


public class hojas {
    
    public void addLeave(nodo nodo, ArrayList<nodo> leaves){
        leaves.add(nodo);
    }
    
    public nodo getLeave(int numLeave, ArrayList<nodo> leaves){
        for (nodo item : leaves) {
            if(item.number == numLeave) return item;
        }
        return null;
    }
    
    public boolean isAccept(int numLeave, ArrayList<nodo> leaves){
        for (nodo item : leaves) {
            if(item.number == numLeave) return item.acceptacion;
        }
        return false;
    }
}
