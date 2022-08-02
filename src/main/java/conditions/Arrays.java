package conditions;

public class Arrays {
    public static void main(String[] args) {
        String []friends = {"john","cathe","Halima","joan"};

        //loop through an array using enhanced loops
        for(String friendList: friends){
            System.out.println(friendList);
        }

        //loop using normal array
        for(int i=0; i<friends.length; i++){
            System.out.println(i + " " + friends[i]);
        }

        //multidimensional array
        int[][] myInt = {{1, 2, 3}, {4,5,6},{7,8,9}};
        int x = myInt[1][2]; //element 2 in array 1
        System.out.println(x); //6

        //looping multidimensional array
        for(int i = 0; i<myInt.length; i++){
            for(int j=0; j<myInt[i].length; j++){
                System.out.println(myInt[i][j]);
            }
        }

    }
}
