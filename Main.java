public class Main{
    public static void main(String [] args){
        Codigo<String,Integer> codigo = new Codigo<String,Integer> ("BB",112);
        ProdutoG<String> p1 = new ProdutoG<String>(codigo.toString(),"Radio", 438);
        System.out.println(p1.toString());    
    }

}