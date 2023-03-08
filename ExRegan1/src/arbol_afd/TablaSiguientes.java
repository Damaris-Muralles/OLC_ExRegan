
package arbol_afd;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;


public class TablaSiguientes {
    public void append(int numNode, String lexeme, ArrayList flwList, ArrayList<ArrayList> table){
        for (ArrayList item : table){
            if( (int) item.get(0) == numNode && item.get(1) == lexeme ){
                for (Object flwItem : flwList){
                    if(! ((ArrayList)item.get(2)).contains((int)flwItem) ){
                       ((ArrayList)item.get(2)).add(flwItem);
                    }
                }
                return;
            }
        }
        ArrayList dato = new ArrayList();
        dato.add(numNode);
        dato.add(lexeme);
        dato.add(flwList);
        
        table.add(dato);
    }
    
    public ArrayList next(int numNode, ArrayList<ArrayList> table){
        ArrayList result = new ArrayList();
        for(ArrayList item : table){
            if( (int) item.get(0) == numNode ){
                result.add(item.get(1));
                result.add(((ArrayList)item.get(2)).clone());
                return result;
            }
        }
        result.add("");
        result.add(new ArrayList());
    return result;
    }
    
    public void printTable(ArrayList<ArrayList> table, String name){
          for(ArrayList item : table){
            System.out.println(item.get(0) + " - " + item.get(1) + " - " + item.get(2) );
        }
        String contenido="digraph G {\n" +
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
"                    <tr><td  colspan=\"2\" align=\"center\" bgcolor=\"#5ee7cd\"><font color=\"black\"> HOJA </font></td>\n" +
"                    <td  align=\"center\" bgcolor=\"#5ee7cd\"><font color=\"black\"> SIGUIENTES </font></td></tr>\n";
        for (int j=1; j<table.size()+1;j++){
            for(int i=0; i<table.size();i++){
                if (table.get(i).get(0).equals(j)){
                    contenido+="                    <tr><td><font color=\"white\" align=\"center\">"+table.get(i).get(0)+"</font></td>\n" +
"                    <td align=\"center\"><font color=\"white\">"+table.get(i).get(1)+"</font></td>\n" +
"                    <td ><font color=\"white\" align=\"center\">"+table.get(i).get(2)+"</font></td></tr>\n"; 
                }
            }  
        }
        contenido+="                    <tr><td><font color=\"white\" align=\"center\">"+(table.size()+1)+"</font></td>\n" +
"                    <td align=\"center\"><font color=\"white\">#</font></td>\n" +
"                    <td ><font color=\"white\" align=\"center\">--</font></td></tr>\n" +
"                </table>\n" +
"        > ] ; \n" +
"    }\n" +
"}";
    GenerarDot(contenido,name);
    }
    
    private void GenerarDot(String cadena,String name){
        FileWriter fichero = null;
        PrintWriter escritor = null;
        try{
            fichero = new FileWriter("./REPORTES/SIGUIENTES_202100953/Tabla_siguientes_"+name+".dot");
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
        
        String file_input_path = "./REPORTES/SIGUIENTES_202100953/Tabla_siguientes_"+i+".dot";
        String do_path = "C:\\Program Files\\Graphviz\\bin\\dot.exe";
        
        String file_get_path = "./REPORTES/SIGUIENTES_202100953/Tabla_siguientes_"+i+".png" ;
        
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
