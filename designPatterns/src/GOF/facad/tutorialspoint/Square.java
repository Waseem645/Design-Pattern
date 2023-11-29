/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.facad.tutorialspoint;

/**
 *
 * @author Computer Arena
 */
public class Square implements Shape {
    
   @Override
   public void draw(String... arguments) {
      StringBuilder sb = new StringBuilder();
      for (String argument : arguments) {
         sb.append(argument).append(", ");
      }
      sb.setLength(sb.length() - 2);
      System.out.println("Square::draw() - Arguments: " + sb.toString());
   }
}

