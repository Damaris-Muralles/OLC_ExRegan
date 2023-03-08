package arbol_afd;


import arbol_afd.Type.Tipos;
import java.util.ArrayList;


public class nodo {
    

    ArrayList<Integer> first;
    ArrayList<Integer> last;
    boolean anulable;
    
    String lexema;
    Tipos tipo;
    int number;
    int numnodo;
    boolean acceptacion;
    
    Object left;
    Object right;
    
    ArrayList<nodo> hojas;
    ArrayList<ArrayList> tablas;
    
    public nodo(String lexema, Tipos type, int numnodo,int number, Object left, Object right, ArrayList<nodo> hojas, ArrayList<ArrayList> tablas) {
        first = new ArrayList();
        last = new ArrayList();
        anulable = true;
        
        this.lexema = lexema;
        this.tipo = type;
        this.number = number;
        this.numnodo = numnodo;
        acceptacion = "#".equals(this.lexema);
        
        this.left = left;
        this.right = right;
        
        this.hojas = hojas;
        this.tablas = tablas;
    }

    nodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public nodo getNode(){
        
        Object leftNode =  this.left instanceof nodo ? ((nodo) this.left).getNode(): null;
        Object rightNode = this.right instanceof nodo ? ((nodo) this.right).getNode(): null;
        
        if(null != this.tipo)switch (this.tipo) {
            case HOJA:
                this.anulable = false;
                this.first.add(this.number);
                this.last.add(this.number);
                break;
            case AND:
                if(leftNode instanceof nodo && rightNode instanceof nodo){
                    this.anulable = ((nodo)leftNode).anulable && ((nodo) rightNode).anulable;
                    
                    this.first.addAll(((nodo)leftNode).first);
                    if(((nodo)leftNode).anulable){
                        this.first.addAll(((nodo)rightNode).first);
                    }
                    
                    if(((nodo)rightNode).anulable){
                        this.last.addAll(((nodo)leftNode).last);
                    }
                    this.last.addAll(((nodo)rightNode).last);
                }   
                break;
            case OR:
                if(leftNode instanceof nodo && rightNode instanceof nodo){
                    this.anulable = ((nodo)leftNode).anulable || ((nodo) rightNode).anulable;
                    
                    this.first.addAll(((nodo)leftNode).first);
                    this.first.addAll(((nodo)rightNode).first);
                    
                    
                    this.last.addAll(((nodo)leftNode).last);
                    this.last.addAll(((nodo)rightNode).last);
                }  
                break;
            case KLEENE:
                if(leftNode instanceof nodo){
                    this.anulable = true;
                    this.first.addAll(((nodo)leftNode).first);
                    this.last.addAll(((nodo)leftNode).last);
                }
                break;
            case POSITIVA:
                if(leftNode instanceof nodo){
                    this.anulable = ((nodo)leftNode).anulable;
                    this.first.addAll(((nodo)leftNode).first);
                    this.last.addAll(((nodo)leftNode).last);
                }
                break;
            case BOOL:
                if(leftNode instanceof nodo){
                    this.anulable = true;
                    this.first.addAll(((nodo)leftNode).first);
                    this.last.addAll(((nodo)leftNode).last);
                }
                break;
            default:
                break;
        }
        return this;
    }
    
    public Object follow(){
        Object leftFollow=  this.left instanceof nodo ? ((nodo) this.left).follow() : null;
        Object rightFollow =  this.right instanceof nodo ? ((nodo) this.right).follow() : null;
        
        if(null != this.tipo)switch (this.tipo) {
            case AND:
                for (int item : ((nodo)leftFollow).last) {
                    hojas hoja = new hojas();
                    nodo nodo = hoja.getLeave(item, hojas);
                    TablaSiguientes tabla = new TablaSiguientes();
                    tabla.append(nodo.number, nodo.lexema, ((nodo) rightFollow).first, tablas);
                }
                break;
            case KLEENE:
                for (int item : ((nodo)leftFollow).last) {
                    hojas hoja = new hojas();
                    nodo nodo = hoja.getLeave(item, hojas);
                    TablaSiguientes tabla = new TablaSiguientes();
                    tabla.append(nodo.number, nodo.lexema, ((nodo) leftFollow).first, tablas);
                }
                break;
            case POSITIVA:
                for (int item : ((nodo)leftFollow).last) {
                    hojas hoja = new hojas();
                    nodo nodo = hoja.getLeave(item, hojas);
                    TablaSiguientes tabla = new TablaSiguientes();
                    tabla.append(nodo.number, nodo.lexema, ((nodo) leftFollow).first, tablas);
                }
                break;
            default:
                break;
        }
        
        return this;
    }
    
}

