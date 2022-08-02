package conditions;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        String myArr[] = {"jared","k"};
        //asList
        System.out.println("as a list: " + Arrays.asList(myArr));

        //binary search
        int age[] = {34,23,21,67,12};

         Arrays.sort(age);
         int ageX = 23;
        System.out.println(ageX + "found at index" + Arrays.binarySearch(age,ageX));

        //comparing arrays
        int valX[] = {23,12,34};
        int valY[]={3,4,5,12,23,34};

        System.out.println("Comparison " + Arrays.compare(valX,valY));
    }
}
