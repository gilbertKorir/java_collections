package interfaces;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
//        rectangle.calculateArea(3,6);

        int j = 4;
        System.out.println(j++);
        String x = "4";
        int y = 34;
        int z = Integer.parseInt(x) + y;
        System.out.println("It\'s a \"concatenation\" " + z);
        System.out.println(Math.random());

        int a = (int) (Math.random()*5);
        System.out.println(a);

        boolean isGrown = true;
        System.out.println(12 == 5);

//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();

//        if(age >= 18)
//          System.out.println("Vote peacefully");
//        else
//            System.out.println("You can\'t vote but be peaceful");

       // ternary operators
        int val = 40;
        String res = (val > 4 || val == 5) ? "right" : "false hey";
        System.out.println(res);

    }

}
