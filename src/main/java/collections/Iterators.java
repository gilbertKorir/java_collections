package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("toyota");
        cars.add("suzuki");
        cars.add("range");

        Iterator<String> it = cars.iterator();

        while (it.hasNext()){
            String car = it.next();
            if(car.equalsIgnoreCase("volvo")){
                it.remove();
            }
        }
        System.out.println(cars);
    }
}
