/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.facad.rfg;


public class FacadePatternDemo {
   public static void main(String[] args) {
      ShapeMaker shapMaker = new ShapeMaker();

      shapMaker.drawCircle();
      shapMaker.drawRectangle();
      shapMaker.drawSquare();	
      shapMaker.drawTriangle();
   }
}
