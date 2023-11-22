/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.decorator.tutorialspoint;

/**
 *
 * @author Computer Arena
 */
public class DecoratorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      
      System.out.println("Circle with normal border:"+circle.getPrice());
        circle.draw();

        System.out.println("\nCircle of red border:"+redCircle.getPrice());
        redCircle.draw();

        System.out.println("\nRectangle of red border:"+redRectangle.getPrice());
        redRectangle.draw();

    }
    
}
