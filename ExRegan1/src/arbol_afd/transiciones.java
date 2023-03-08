package arbol_afd;


public class transiciones {

    public String initial;
    public String transition;
    public String finalS;
    
    public transiciones( String initial, String transition, String finalS ) {
        this.initial= initial;
        this.transition = transition;
        this.finalS = finalS;
    }
    
    public boolean compare(String initialState, String transition){
        
        return this.initial.equals(initial) && this.transition.equals(transition);
    }
    
    @Override
    public String toString(){
        return this.initial + " " + this.transition + " " + this.finalS;
    }
    
    public String graph(){
        return this.initial +  "->"  + this.finalS + "[label=\"" + this.transition + "\"]";
    }
}
