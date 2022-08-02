package conditions;

public class ForLoop {
    public static void main(String[] args) {
        //for loop
        for(int i = 6; i<=10; i++){
            System.out.println(i);
        }
        //for each or enhanced loop;
        System.out.println("Enhanced/ for each loop ");
        String[] cars = {"volvo", "audi","range","lexus"};
        for(String car:cars){
            System.out.println(car);
        }

        //break in for loop
        System.out.println("Brak statement");
        for(int i=0; i<10; i++){
            if(i == 5)
                break;
            System.out.println(i);
        }

        //break in for loop
        System.out.println("CONTINUE statement");
        for(int i=0; i<10; i++){
            if(i == 5)
                continue;
            System.out.println(i);
        }

        //break with while loop
        System.out.println("Break comes after in a while");
        int i = 1;
        while (i<6){
            System.out.println(i);
            i++;
            if (i == 4)
                break;
        }

        // continue comes before the printing in a while loop
        int j = 0;
        while(j < 6){
            if(j == 4) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}
