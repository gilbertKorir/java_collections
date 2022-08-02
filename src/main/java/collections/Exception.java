package collections;

public class Exception {
    public static void main(String[] args) {
        try{
            int num[] = {3,4,5,6};
            System.out.println(num[6]);
        }catch(java.lang.Exception e){
            System.out.println("What you are looking for does not exist");
        }
    }
}
