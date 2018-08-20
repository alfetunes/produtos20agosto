public class Codigo<T,U> {
    private T cod01;
    private U cod02;
    
    public Codigo(T cod01,  U cod02){
        this.cod01 = cod01;
        this.cod02 = cod02;
    }

    @Override
    public String toString(){
        return ""+this.cod01+""+this.cod02;
    }
}