/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Computer Arena
 */
public class ProxyPatternDemo {
	
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
      int realImageFileSize = 512;
      
      Image fak = new ProxyImage("test_10mb");
      int realImageFileSiz = 200;

      //image will be loaded from disk
      image.display(); 
      System.out.println("");
      
      //image will not be loaded from disk
      image.display(); 	
      
      fak.display(); 
      System.out.println("the image is fake");
      fak.display(); 
    }
}
   

