package interfaces;

public class Rectangle implements Shape {

    @Override
    public void calculateArea(int widt, int height) {
        System.out.println("Rectangle area is : " + (widt * height));
    }
}
