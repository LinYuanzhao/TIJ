package exception;

class SimpleException extends Exception {}

public class InheritingExceptions {

    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }
    
    public static void main(String[] args) {
        InheritingExceptions inheritingExceptions = new InheritingExceptions();
        try{
            inheritingExceptions.f();        
        }catch(SimpleException e){
            System.out.println("got it");
        }
    }
}
