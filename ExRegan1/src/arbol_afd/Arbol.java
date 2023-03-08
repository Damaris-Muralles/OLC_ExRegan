
package arbol_afd;


import Thomson.Afnd;
import arbol_afd.Type.Tipos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


public class Arbol {
    public Stack pilac;
    public int numnodo;
    nodo root;

    public Arbol( String er,String idex, ArrayList<nodo> leaves, ArrayList<ArrayList> table ) {
        
        numhoja numHoja = new numhoja(er);
        String expresion = er;
        Stack pila = new Stack();
        pilac = new Stack();
        String[] erSplit = er.split("");
        ArrayList<String> Listsplit = new ArrayList();
        int n=0;
        int v=0;
        int c=0;
        String id="";
        for (int i=0;i<erSplit.length;i++){
            c=0;
            if ("{".equals(erSplit[i])){
                n=1;
            }
            if ("}".equals(erSplit[i])){
                Listsplit.add(id);
                
                
                n=0;
                id="";
            }
            if (("\"".equals(erSplit[i]))&& (v==1)){
                id+=erSplit[i];
                Listsplit.add(id); 
                v=0;
                n=0;
                c=1;
                id="";
            }
            if (("\"".equals(erSplit[i]))&& (v==0)&&(c==0)){
                n=1;
                v=1;
            }
          
            if (n==1){
                if (v==1){
                    id+=erSplit[i];
                }else{
                    if (!"{".equals(erSplit[i])){
                        id+=erSplit[i];
                        
                    }
                }
            }
            if (n==0){
                if (!("}".equals(erSplit[i]))&&!("\"".equals(erSplit[i]))){
                        Listsplit.add(erSplit[i]);
                }    
            }   
        }
        
        
        Collections.reverse(Listsplit);
       
        numnodo=Listsplit.size();
        
        Listsplit.forEach((character) -> {
       
            switch (character) {
                case "|":
                    nodo lefto = (nodo) pila.pop();
                    nodo righto = (nodo) pila.pop();
                      
                    nodo no = new nodo(character, Tipos.OR,numbernod(), 0, lefto, righto, leaves, table);
                    pila.push(no);
                    pilac.push(no);
                    break;
                
                case ".":
                    nodo lefta = (nodo) pila.pop();
                    nodo righta = (nodo) pila.pop();
                    
                    nodo na = new nodo(character, Tipos.AND,numbernod(), 0, lefta, righta, leaves, table);
                    pila.push(na);
                    pilac.push(na);
                    break;
                case "*":
                    nodo unario = (nodo) pila.pop();
                    
                    nodo nk = new nodo(character, Tipos.KLEENE,numbernod(), 0, unario, null, leaves, table);
                    pila.push(nk);
                    pilac.push(nk);
                    break;
                case "+":
                    nodo unariop = (nodo) pila.pop();
                    
                    nodo np = new nodo(character, Tipos.POSITIVA,numbernod(), 0, unariop, null, leaves, table);
                    pila.push(np);
                    pilac.push(np);
                    break;
                case "?":
                    nodo unariob = (nodo) pila.pop();
                    
                    nodo nb = new nodo(character, Tipos.BOOL,numbernod(), 0, unariob, null, leaves, table);
                    pila.push(nb);
                    pilac.push(nb);
                    break;
                default:
                    
                    nodo nd = new nodo(character, Tipos.HOJA,numbernod(), numHoja.getNum(), null, null, leaves, table);
                    pila.push(nd); //Contruir el arbol
                    pilac.push(nd);
                    hojas hoja = new hojas();
                    hoja.addLeave(nd, leaves); //Tabla de siguientes o transiciones
                    break;
            }
        });
        
        this.root = (nodo) pila.pop();
        impTree(expresion,idex);
    }
    
    public nodo getRoot(){
        return this.root;
    }
    public int numbernod(){
        return numnodo-=1;
    }
    
    public void impTree(String ex,String id){
        ex=ex.replace("\"", "\\\"");
        String contenido1 ="graph \"\" {\n" +
"\n" +
"    fontcolor=\"cyan4\"\n" +
"    bgcolor=\"#170920\"\n" +
"    node [fontname=\"Helvetica,Arial,sans-serif\", shape=none]\n" +
"\n" +
"    label=\""+ex+"\"\n" +
"\n" +
"    subgraph cluster01{\n" +
"        color=\"#5ee7cd\"\n" +
"        label=\"EXP: "+id+"\"\n";
        String contenido ="";
        nodo nsig=(nodo) this.root.getNode();
        nodo aux=(nodo) nsig;
        
        for (int i=0;i<pilac.size();i++){
            nsig=(nodo) pilac.get(i);
            System.out.println(nsig.numnodo+" <--> "+nsig.lexema+" <--> "+nsig.tipo+" <--> "+nsig.number+" <--> "+nsig.first+" <--> "+nsig.last+" <--> "+nsig.left+" <--> "+nsig.right);
            String anul ="";
            if (nsig.anulable==false){
                anul="N";
            } else {
                anul="A";
            }
            
            if (Tipos.HOJA.equals(nsig.tipo)){
                contenido="        n"+nsig.numnodo+" [label = <\n" +
"                <table border=\"0\">\n" +
"                    <tr><td colspan=\"3\"><font color=\"blue\">"+anul+"</font></td></tr>\n" +
"                    <tr><td><font color=\"green\">"+nsig.first+"</font></td>\n" +
"                    <td bgcolor=\"#5ee7cd\"><font color=\"black\">"+nsig.lexema+"</font></td>\n" +
"                    <td ><font color=\"red\">"+nsig.last+"</font></td></tr>\n" +
"                    <tr><td colspan=\"3\"><font color=\"white\">"+nsig.number+"</font></td></tr>\n" +
"                </table>\n" +
"            > ] ;"+contenido;
            }
            if ((Tipos.AND.equals(nsig.tipo))||(Tipos.OR.equals(nsig.tipo))){
                contenido="        n"+nsig.numnodo+" [label = <\n" +
"                <table border=\"0\">\n" +
"                    <tr><td colspan=\"3\"><font color=\"blue\">"+anul+"</font></td></tr>\n" +
"                    <tr><td><font color=\"green\">"+nsig.first+"</font></td>\n" +
"                    <td bgcolor=\"#5ee7cd\"><font color=\"black\">"+nsig.lexema+"</font></td>\n" +
"                    <td ><font color=\"red\">"+nsig.last+"</font></td></tr>\n" +
"                </table>\n" +
"            > ] ;\n"+contenido;
                aux= (nodo) nsig.right;
                contenido="        n"+nsig.numnodo+" -- n"+aux.numnodo+" [color=\"#5ee7cd\"] ;\n"+contenido;
                aux= (nodo) nsig.left;
                contenido="        n"+nsig.numnodo+" -- n"+aux.numnodo+" [color=\"#5ee7cd\"] ;\n"+contenido;
            }
            if ((Tipos.KLEENE.equals(nsig.tipo))||(Tipos.POSITIVA.equals(nsig.tipo))||(Tipos.BOOL.equals(nsig.tipo))){
                contenido="        n"+nsig.numnodo+" [label = <\n" +
"                <table border=\"0\">\n" +
"                    <tr><td colspan=\"3\"><font color=\"blue\">"+anul+"</font></td></tr>\n" +
"                    <tr><td><font color=\"green\">"+nsig.first+"</font></td>\n" +
"                    <td bgcolor=\"#5ee7cd\"><font color=\"black\">"+nsig.lexema+"</font></td>\n" +
"                    <td ><font color=\"red\">"+nsig.last+"</font></td></tr>\n" +
"                </table>\n" +
"            > ] ;\n"+contenido;
                aux= (nodo) nsig.left;
                contenido="        n"+nsig.numnodo+" -- n"+aux.numnodo+" [color=\"#5ee7cd\"] ;\n"+contenido;
            }
            
        }
        
        contenido1+=contenido+"    }\n" +
"}"; 
        String archivoname ="./REPORTES/ARBOLES_202100953/Arbol_EXP_"+id;
        GenerarDot(contenido1, archivoname);
        thomsom(id);
    }
    
    public void thomsom(String name){
        pilac.removeElementAt(0);
        pilac.removeElementAt(pilac.size()-1);  //ultimo + primero b
        Stack afnda =new Stack();
         
        nodo nt=(nodo) pilac.lastElement();
        afnda= TransicionesThomson(0,nt);
        
      
        String cadena="digraph finite_state_machine {\n" +
"    fontcolor=\"White\"\n" +
"    bgcolor=\"#170920\"\n" +
"	fontname=\"Helvetica,Arial,sans-serif\"\n" +
"	label=\"EXP: "+name+"\"\n" +
"	node [fontname=\"Helvetica,Arial,sans-serif\" fontcolor=\"white\"  color=\"#5ee7cd\"]\n" +
"	rankdir=LR;\n";
        String finales =" X0 ";
        String aux ="";
        
        for(int a=0;a<afnda.size();a++){
            Afnd nk=(Afnd) afnda.get(a);
            if (nk.transitions==null){
                System.out.println(nk.initial+ "->"+nk.epsilont+ "->"+nk.finalS); 
                aux+="	X"+nk.initial+" -> X"+nk.finalS+" [label = \""+nk.epsilont+"\" color=\"#5ee7cd\" fontcolor=\"#5ee7cd\"];\n";
            }else{
                System.out.println(nk.initial+ "->"+nk.transitions+ "->"+nk.finalS);
                nodo nda=(nodo)nk.transitions;
                String ex=nda.lexema.replace("\"", "\\\"");
                aux+="	X"+nk.initial+" -> X"+nk.finalS+" [label = \""+ex+"\" color=\"#5ee7cd\" fontcolor=\"#5ee7cd\"];\n";
            }
            int num=0;
            for(int i=0;i<afnda.size();i++){
                Afnd n=(Afnd) afnda.get(i);
                if (nk.finalS==n.initial){
                    num+=1;
                    
                }
            }
            
            if (num==0){
                finales+="X"+nk.finalS+" ";
            }
             
        }
       
       
        
        cadena+="	node [shape = doublecircle];"+finales+"[color=\"red\"];\n" +
"    node [shape = circle];\n"+ aux+"}";
        String archivoname ="./REPORTES/AFND_202100953/Afnd_"+name;
        GenerarDot(cadena,archivoname);
    }
    
    public Stack TransicionesThomson(int cont, nodo nt){
      
        Stack afnd =new Stack();
        Stack paux =new Stack();
        int auxn=0;
        int auxn2=0;
        Afnd trans ;
            if (nt.tipo.equals(Tipos.POSITIVA)){
                
                trans = new Afnd( cont,null, "ε", cont+=1);
                afnd.add(trans);
                auxn=cont;
                if (nt.left==null){
                    trans = new Afnd( cont, (nodo) nt,null, cont+=1);
                    afnd.add(trans);
                }else{
                    
                    paux=TransicionesThomson(cont, (nodo)nt.left);
                    for (int a=0;a<paux.size();a++){
                        Afnd nk=(Afnd) paux.get(a);
                        afnd.add(nk);
                        cont=nk.finalS;
                        /*
                        if (nk.transitions!=null){
                            nodo nd =(nodo)nk.transitions;
                            System.out.println(nd.lexema+nk.finalS);
                            
                        }else{
                            System.out.println(nk.epsilont+nk.finalS); 
                        }*/
                        
                    }
                    
                }
                
                trans = new Afnd( cont,null, "ε", auxn);
                afnd.add(trans);
                trans = new Afnd( cont,null, "ε", cont+=1);
                afnd.add(trans);
            }
            if (nt.tipo.equals(Tipos.KLEENE)){
                
                trans = new Afnd( cont,null, "ε", cont+=1);
                afnd.add(trans);
                auxn=cont;
                if (nt.left==null){
                    trans = new Afnd(cont, (nodo) nt.left,null,  cont+=1);
                    afnd.add(trans);
                }else{
                    
                    paux=TransicionesThomson(cont, (nodo)nt.left);
                    for (int a=0;a<paux.size();a++){
                        Afnd nk=(Afnd) paux.get(a);
                        afnd.add(nk);
                        cont=nk.finalS;  
                    }
                    
                }
                trans = new Afnd( cont,null, "ε", auxn);
                afnd.add(trans);
                trans = new Afnd( cont,null, "ε", cont+=1);
                afnd.add(trans);
                trans = new Afnd( auxn-1,null, "ε", cont);
                afnd.add(trans);
            }
            if (nt.tipo.equals(Tipos.BOOL)){
                auxn=cont;
                trans = new Afnd( cont,null, "ε", cont+=1);
                afnd.add(trans);
                
                if (nt.left==null){
                    trans = new Afnd(cont, (nodo) nt.left,null,  cont+=1);
                    afnd.add(trans);
                }else{
                    
                    paux=TransicionesThomson(cont, (nodo)nt.left);
                    for (int a=0;a<paux.size();a++){
                        Afnd nk=(Afnd) paux.get(a);
                        afnd.add(nk);
                        cont=nk.finalS;  
                    }
                    
                }
                trans = new Afnd( cont,null, "ε", cont+=1);
                afnd.add(trans);
                trans = new Afnd( auxn,null, "ε", cont);
                afnd.add(trans);
            }
            
            if (nt.tipo.equals(Tipos.OR)){
                auxn=cont;
                trans = new Afnd( cont,null, "ε", cont+=1);
                afnd.add(trans);
                
                if (nt.left==null){
                    trans = new Afnd(cont, (nodo) nt.left,null,  cont+=1);
                    afnd.add(trans);
                }else{
                    paux=TransicionesThomson(cont, (nodo)nt.left);
                    for (int a=0;a<paux.size();a++){
                        Afnd nk=(Afnd) paux.get(a);
                        afnd.add(nk);
                        cont=nk.finalS;  
                    }
                    
                }
                auxn2=cont;
                trans = new Afnd( auxn,null, "ε", cont+=1);
                afnd.add(trans);
                
                if (nt.right==null){
                    trans = new Afnd(cont, (nodo) nt.right,null,  cont+=1);
                    afnd.add(trans);     
                }else{
                     
                    paux=TransicionesThomson(cont, (nodo)nt.right);
                    for (int a=0;a<paux.size();a++){
                        Afnd nk=(Afnd) paux.get(a);
                        afnd.add(nk);
                        cont=nk.finalS;  
                    }
                    
                }
                
                trans = new Afnd(cont,null, "ε",cont+=1 );
                afnd.add(trans);
                trans = new Afnd( auxn2,null, "ε",cont );
                afnd.add(trans);
               
            }
            
            if (nt.tipo.equals(Tipos.AND)){
                if (nt.left==null){
                    trans = new Afnd(cont, (nodo) nt.left,null,  cont+=1);
                    afnd.add(trans);
                }else{
                    
                    paux=TransicionesThomson(cont, (nodo)nt.left);
                    for (int a=0;a<paux.size();a++){
                        Afnd nk=(Afnd) paux.get(a);
                        afnd.add(nk);
                        cont=nk.finalS;  
                    }
                    
                }
                if (nt.right==null){
                    trans = new Afnd(cont, (nodo) nt.right,null,  cont+=1);
                    afnd.add(trans);     
                }else{
                     
                    paux=TransicionesThomson(cont, (nodo)nt.right);
                    for (int a=0;a<paux.size();a++){
                        Afnd nk=(Afnd) paux.get(a);
                        afnd.add(nk);
                        cont=nk.finalS;  
                    }
                    
                }
               
            }
            if (nt.tipo.equals(Tipos.HOJA)){
                trans = new Afnd( cont,(nodo) nt,null, cont+1);
                afnd.add(trans);
               
            }
            
       
        return afnd;
    }
    
    private void GenerarDot(String cadena,String name){
        FileWriter fichero = null;
        PrintWriter escritor = null;
        try{
            fichero = new FileWriter(name+".dot");
            escritor = new PrintWriter(fichero);
            escritor.println(cadena);
            escritor.close();
            fichero.close();
            generarpng(name);
        } catch (Exception e) {
            System.out.println("error en generar dot");
            e.printStackTrace();
        }
    }
    
    public void generarpng(String i) throws IOException {
        
        String file_input_path = i+".dot";
        String do_path = "C:\\Program Files\\Graphviz\\bin\\dot.exe";
        
        String file_get_path = i+".png" ;
        
        try {
            ProcessBuilder pBuilder;
            pBuilder = new ProcessBuilder(do_path, "-Tpng",  file_input_path,"-o", file_get_path);
            pBuilder.redirectErrorStream(true);
           pBuilder.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
     
       //Desktop.getDesktop().open(new File(file_get_path));
    }
    
}
//String lexema, Tipos type, int numnodo,int number, Object left, Object right, ArrayList<nodo> hojas