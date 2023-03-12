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
        content=content.replace("\"?\"","B");
        content=content.replace("\" \"","S");
        content=content.replace("\\\"","C");
        content=content.replace("\\\'","I");
        content=content.replace("\\n","L");
        content=content.replace(".", "").replace("|", "").replace("*", "").replace("+", "").replace("?", "").replace("\"", "");
        String[] erSplit = content.split("");
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
                n=0;
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
                Listsplit.add(erSplit[i]);
                   
            }   
        }
        content="";
        for (int i=0;i<Listsplit.size();i++){
            content+=Listsplit.get(i);
        }
        
        //System.out.println(content);
        return content.length();
    }
}
