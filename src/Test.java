import java.util.*;
public class Test {
    
    public static void main(String []args){
        try{
        
        String data = "one two three four";
        StringTokenizer st = new StringTokenizer(data," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
