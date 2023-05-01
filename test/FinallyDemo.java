package test;

public class FinallyDemo {
    static void subA(){
        throw new ArithmeticException();
    }

    static void subB(){
        try{
            return;
        }
        finally{
            System.out.println("Inside subB");
        }
    }

    static void subC(){
        try{
            System.out.println();
        }
        finally{
            System.out.println("Inside subC");
        }
    }
    public static void main(String args[]){
        try{
            subA();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Inside subA");
        }

        subB();
        subC();

    }    
}
