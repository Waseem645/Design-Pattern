/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.facad.rfg;


public class Triangle implements Shape {
   @Override
   public void draw(String... color) {
      StringBuilder sb = new StringBuilder();
      for (String argument : color) {
         sb.append(argument).append(", ");
      }
      sb.setLength(sb.length() - 2);
      System.out.println("Triangle:" + sb.toString());
   }
}
