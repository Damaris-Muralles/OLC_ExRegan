package arbol_afd;

import java.util.ArrayList;

public final class numhoja {
    
    
    public int content;

    public numhoja(String content) {
        this.content = clean(content)+1;
       
    }
    
    public int getNum(){
        content -= 1;
        return content;
    }
    
    
    @SuppressWarnings("empty-statement")
    public int clean(String content){
        content=content.replace("\".\"","P");
        content=content.replace("\"+\"","M");
        content=content.replace("\"|\"","O");
        content=content.replace("\"*\"","K");
        content=content.replace("\"{\"","A");
        content=content.replace("\"?\"","B");
        content=content.replace("\" \"","S");
        content=content.replace("\\\"","C");
        content=content.replace("\\\'","I");
        content=content.replace("\\n","L");
        content=content.replace(".", "").replace("|", "").replace("*", "").replace("+", "").replace("?", "");
        System.out.println("cadena a ev: "+content);
        String[] erSplit = content.split("");
        
        ArrayList<String> Listsplit = new ArrayList();
        int n=0;
        int v=0;
        int c=0;
        int d=0;
        int numi=-1;
        String id="";
       
        for (int i=0;i<erSplit.length;i++){
            c=0;
             //System.out.println("sdfsdf: "+erSplit[i]);
            if ("{".equals(erSplit[i])&& (v==0)){
                n=1;
                //System.out.println("llave abieerta: "+n);
            }
            if ("}".equals(erSplit[i])&& (v==0)){
                Listsplit.add(id);
                //System.out.println("llave cerrada"+id);
                n=0;
                id="";
            }
            if (("\"".equals(erSplit[i]))&& (v==1)&&(numi==-1)){
                id+=erSplit[i];
                Listsplit.add(id); 
                //System.out.println("fin de comilla: "+id);
                v=0;
                n=0;
                c=1;
                id="";
            }
            if (("\"".equals(erSplit[i]))&& (v==0)&&(c==0)&&(numi==-1)){
                n=1;
                v=1;
                //System.out.println("comilla inicial");
            }
            
            if (("\\".equals(erSplit[i]))){
                n=1;
                numi=i;
                //System.out.println("primer escape "+id);
            }
            if (n==1){
                if (v==1){
                    id+=erSplit[i];
                    //System.out.println("v "+id);
                }else{
                    if (!"{".equals(erSplit[i])){
                        id+=erSplit[i];
                       // System.out.println("pr "+id);
                    }
                    if (numi!=-1&&numi+1==i){
                        Listsplit.add(id); 
                       // System.out.println("agregando escape: "+id);
                        id="";
                        n=0;
                    }
                }
            }
            if (n==0){
               // System.out.println("entre");
                if (!("}".equals(erSplit[i]))&&!("\"".equals(erSplit[i]))&&(numi==-1)){
                   // System.out.println("entre : "+erSplit[i]);
                        Listsplit.add(erSplit[i]);
                        
                        
                }
            if (numi+1==i){
                numi=-1;
            }
            }   
        }
        content="";
        //for (int i=0;i<Listsplit.size();i++){
          //  content+=Listsplit.get(i);
        //}
        
        //System.out.println(content);
        return Listsplit.size();
    }
}
