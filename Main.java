public class Main{
    public static void main(String [] args){
        Codigo<String,Integer> codigo = new Codigo<String,Integer> ("BB",112);
        ProdutoG<Codigo> p1 = new ProdutoG<Codigo>(codigo,"Radio", 438);
        System.out.println(p1);    
    }

}