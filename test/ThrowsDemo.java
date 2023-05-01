package test;

public class ThrowsDemo {
    static void throwsOne() throws IllegalAccessException{
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]){
        try{
            throwsOne();
        }
        catch(IllegalAccessException e){
            System.out.println(e);
        }
    }
}
