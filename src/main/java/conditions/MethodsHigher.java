package conditions;


public class MethodsHigher {
//    static class Man{
        public void myPublic(){
            System.out.println("Public methods must be called by creating objects");
        }
//    }
    static void myStatic(){
        System.out.println("i can be accessed without an object creation");
    }


    public static void main(String[] args) {
        myStatic();
        MethodsHigher man = new MethodsHigher();
        man.myPublic();
    }
}
