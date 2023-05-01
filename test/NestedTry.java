package test;

class NestedTry{
    public static void main(String args[]){
        int a = args.length;
        try{
            int b = 42/a;

            try{
                if(a == 1){
                    b = 42/(a-a);
                }
                if(a == 2){
                    int c[] = {1};
                    c[42]=3;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bounds");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }

    }
}
