package arbol_afd;

import arbol_afd.transiciones;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class TablaTransiciones {

    public ArrayList<ArrayList> states;
    public int cont;
    
    public TablaTransiciones(nodo root, ArrayList tabla, ArrayList<nodo> leaves) {
        this.states = new ArrayList();
        
        ArrayList datos = new ArrayList();
        datos.add("X0");
        datos.add(root.first);
        datos.add(new ArrayList());
        datos.add(false);
        this.states.add(datos);
        this.cont = 1;
        
        for(int i = 0; i < states.size(); i++){
            ArrayList state = states.get(i);
            
            ArrayList<Integer> elementos = (ArrayList) state.get(1);
            
            for(int hoja : elementos){
                TablaSiguientes sigTabla = new TablaSiguientes();
                ArrayList lexemeNext = (ArrayList) sigTabla.next(hoja, tabla).clone();
                
                
                boolean existe = false;
                String found = "";
                
                for( ArrayList e : states ){
                   // System.out.println("tran "+e.get(1)+" "+lexemeNext.get(1));
                    if(e.get(1).equals(lexemeNext.get(1))){
                        existe = true;
                        found = (String)e.get(0);
                        break;
                    }
                }
                
                if(!existe){
                    hojas Hojas = new hojas();
                    if(Hojas.isAccept(hoja, leaves)){
                        state.set(3, true);
                    }
                    if(lexemeNext.get(0)==""){
                        continue;
                    }
                    
                    ArrayList nuevo = new ArrayList();
                    nuevo.add("X"+cont);
                    nuevo.add(lexemeNext.get(1));
                    nuevo.add(new ArrayList());
                    nuevo.add(false);
                    //System.out.println(state.get(0) + " "+ lexemeNext.get(0) + " "+ nuevo.get(0) + "");
                    transiciones trans = new transiciones(state.get(0) + "", lexemeNext.get(0) + "", nuevo.get(0) + "");
                    ((ArrayList)state.get(2)).add(trans);
                    
                    cont += 1;
                    states.add(nuevo);
                
                }
                else{
                    hojas Hojas = new hojas();
                    if(Hojas.isAccept(hoja, leaves)){
                        state.set(3, true);
                    }
                    
                    boolean trans_exist = false;
                    
                    for(Object trans : (ArrayList)state.get(2)){
                        transiciones t = (transiciones) trans;
                        if(t.compare(state.get(0) + "", lexemeNext.get(0) + "")){
                            trans_exist = true;
                            break;
                        }
                    }
                    if(!trans_exist){
                        //System.out.println(state.get(0) + " "+ lexemeNext.get(0) + " "+ found  + "");
                        transiciones trans = new transiciones(state.get(0) + "", lexemeNext.get(0) + "", found + "");
                        ((ArrayList)state.get(2)).add(trans);
                    }
                }
            }
            
        }
    }
    
    public void impTable(String name){
        ArrayList lex =new ArrayList();
        for(ArrayList state : states){
           
            for(Object tr : (ArrayList)state.get(2)){
                transiciones t = (transiciones) tr;
                lex.add(t.transition);  
            }
            System.out.println(state.get(0) + " " + state.get(1) + " " + state.get(2) + " " + state.get(3));
        }
        
        Set<String> hashSet = new HashSet<String>(lex);
        lex.clear();
        lex.addAll(hashSet);
       
        //GRAPHVIZ
        String contenido ="digraph G {\n" +
"\n" +
"    fontcolor=\"cyan4\"\n" +
"    bgcolor=\"#170920\"\n" +
"    node [fontname=\"Helvetica,Arial,sans-serif\", shape=none, ordering=\"in\"]\n" +
"    label=\" \"\n" +
"\n" +
"    subgraph cluster01{\n" +
"        color=\"#170920\"\n" +
"        label=\"EXP: "+name+"\"\n" +
"        n0 [label = <\n" +
"                <table border=\"0\" cellspacing=\"0\" cellborder=\"1\" color=\"#5ee7cd\">\n" +
"                    <tr>\n" +
"                    <td  align=\"center\" bgcolor=\"#5ee7cd\"><font color=\"black\"> ESTADO </font></td>\n" +
"                    <td  colspan=\""+lex.size()+"\" align=\"center\" bgcolor=\"#5ee7cd\"><font color=\"black\"> TERMINALES </font></td>\n" +
"                    <td  align=\"center\" bgcolor=\"#5ee7cd\"><font color=\"black\"> ACEPTACION </font></td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                    <td  align=\"center\" bgcolor=\"#5ee7cd\"><font color=\"black\">  </font></td>\n";
        
       
        for (int i=0; i<lex.size(); i++){
            
            contenido+="                    <td  align=\"center\" bgcolor=\"#5ee7cd\"><font color=\"black\">"+lex.get(i)+"</font></td>\n";
        }
        contenido+="                    <td  align=\"center\" bgcolor=\"#5ee7cd\"><font color=\"black\">  </font></td>\n" +
"                    </tr>\n";
       
        for(ArrayList state : states){
            contenido+="<tr>\n" +
"                    <td><font color=\"white\" align=\"center\">"+state.get(0)+state.get(1)+"</font></td>\n";
        
            
            ArrayList listt =(ArrayList)state.get(2);
                       
            for (int i=0; i<lex.size(); i++){
               int cont =0;
               int contv=0;
               if (listt.size()!=0 ){
               for(int j=0; j<listt.size(); j++){
                    transiciones t = (transiciones) listt.get(j);
                    if(lex.get(i).equals(t.transition)){ 
                        contenido+="                    <td align=\"center\"><font color=\"white\">"+t.finalS+"</font></td>\n" ;
                        cont=0;
                        contv=1;
                    }else{
                        if (listt.size()==1){
                            contenido+="                    <td align=\"center\"><font color=\"white\"> -- </font></td>\n" ;
                        }else{
                            if (contv==0){
                            cont+=1;
                            }
                        }
                    }
                }
               }else{
                    contenido+="                    <td align=\"center\"><font color=\"white\"> -- </font></td>\n" ;
               }
               
                if (cont>0){
                     
                   contenido+="                    <td align=\"center\"><font color=\"white\"> -- </font></td>\n" ;
                }
                
             }
            
            
           
            if (state.get(3).equals(true)){
            contenido+= "                    <td ><font color=\"white\" align=\"center\">"+state.get(3)+"</font></td>\n";
            }else{
            contenido+= "                    <td ><font color=\"white\" align=\"center\"> </font></td>\n";
            }
        contenido+="                    </tr>";
       
        }
        
        contenido+="                </table>\n" +
"        > ] ; \n" +
"    }\n" +
"}";
    String archivoname ="./REPORTES/TRANSICIONES_202100953/Tabla_transiciones_"+name;
    GenerarDot(contenido,archivoname);
    }
    
    public ArrayList impAFD(String name){
         ArrayList afd = new ArrayList();
         
        String cadena="digraph finite_state_machine {\n" +
"    fontcolor=\"White\"\n" +
"    bgcolor=\"#170920\"\n" +
"	fontname=\"Helvetica,Arial,sans-serif\"\n" +
"	label=\"EXP: "+name+"\"\n" +
"	node [fontname=\"Helvetica,Arial,sans-serif\" fontcolor=\"white\"  color=\"#5ee7cd\"]\n" +
"	rankdir=LR;\n";
        String finales =" X0 ";
        String aux ="";
        
        for(ArrayList state : states){
            String graph = "";
            for(Object tr : (ArrayList)state.get(2)){
                transiciones t = (transiciones) tr; 
                graph += t.graph();
                afd.add(t);
                String ex="";
                if (t.transition.equals("\\\"")){
                    ex=t.transition;
                }else{
                    ex=t.transition.replace("\"","\\\"");
                }
                if (t.transition.equals("\\n")){
                    System.out.println("entro");
                    ex="\\\\n";
                }
                aux += "	"+t.initial+" -> "+t.finalS+" [label = \""+ex+"\" color=\"#5ee7cd\" fontcolor=\"#3ca8c2\"];\n";
            }
            System.out.println(graph);
            if(state.get(3).equals(true)){
                finales+=state.get(0)+"[color=\"red\"] ";
            }
        }
        cadena+="	node [shape = doublecircle];"+finales+"[color=\"red\"];\n" +
"    node [shape = circle];\n"+ aux+"}";
        String archivoname ="./REPORTES/AFD_202100953/Afd_"+name;
        GenerarDot(cadena,archivoname);
        
        return afd;
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
    
     } 
    
}
