/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorrerlista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author J-Kmilo
 */
public class RecorrerLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
         ArrayList<Integer> ArrListNumber = new ArrayList<Integer>(); 
         LinkedList<Integer> LinkedListNumber = new LinkedList<>();
         
         ArrayList<Integer> ArrListNumber2 = new ArrayList<Integer>();
         ArrayList<Integer> ArrListNumber3 = new ArrayList<Integer>();
           int cantidadElementos = 10000000; //   Cantidad de elentos dentro del arreglo
//        for(int i = 0;i< cantidadElementos;i++){
//             ArrListNumber.add(i, 0);  // Se establece 0 para cada unos de los elementos dentro del arreglo
//        }
//        int tamañoArreglo = ArrListNumber.size(); // tamaño del arreglo
        
        double TiempoInicial = System.currentTimeMillis();
        
                
        
        //////////////////////////////////////// FOR ////////////////////7///////////////////////////////
        
        for(int i = 0;i< cantidadElementos;i++){
            int num = (int) (Math.random() * cantidadElementos);
             ArrListNumber.add(i, num);
        }
        
        for(int i = 0;i< cantidadElementos;i++){
            int num = (int) (Math.random() * cantidadElementos);
            LinkedListNumber.add(i, num);
        }
        
        double TiempoFinalFOR = System.currentTimeMillis() - TiempoInicial;
        System.out.println("Mediante ciclo for clasico tardo : " + TiempoFinalFOR + "ms");
        
        double TiempoFinalLink = System.currentTimeMillis() - TiempoInicial;
        System.out.println("Mediante ciclo for en Linked tardo : " + TiempoFinalLink + "ms");
       
        
        
       
        //////////////////////////////////////// FOR EACH ////////////////////////////////////////////////
        ArrListNumber2.forEach((i) -> {
            int num = (int) (Math.random() * cantidadElementos);
            ArrListNumber2.set(i, num);
        });
        
        double TiempoFinalFOREACH = System.currentTimeMillis() - TiempoInicial - TiempoFinalFOR ;
        System.out.println("Mediante ciclo for clasico tardo : " + TiempoFinalFOREACH + "ms");
     
        
        //////////////////////////////////////// ITERATOR /////////////////////////////////////////////////
        
        Iterator<Integer> i = ArrListNumber3.iterator();
        while(i.hasNext()){
           int num = (int) (Math.random() * cantidadElementos);
            ArrListNumber3.set(i.next(), num);
        }
        
        double TiempoFinalI = System.currentTimeMillis() - TiempoInicial - TiempoFinalFOR - TiempoFinalFOREACH;
        System.out.println("Mediante ciclo for clasico tardo : " + TiempoFinalI + "ms");
        
        /////////////////////////////////////////////////////////////////////////////////////////////////
     
        
        

        if((TiempoFinalFOR < TiempoFinalFOREACH) && (TiempoFinalFOR < TiempoFinalI)){
        System.out.println("El menor tiempo fue de :" + TiempoFinalFOR + " / Metodo FOR ");
           } else if((TiempoFinalFOREACH < TiempoFinalFOR) && (TiempoFinalFOREACH < TiempoFinalI)){
         System.out.println("El menor tiempo fue de :" + TiempoFinalFOREACH + " / Metodo FOR EACH");
        } else{
         System.out.println("El menor tiempo fue de : " + TiempoFinalI + " / Metodo ITERATOR");
        }
      
        
      
        
        
    }
    
}
