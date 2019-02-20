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
         LinkedList<Integer> LinkedListNumber2 = new LinkedList<>();
         
         ArrayList<Integer> ArrListNumber3 = new ArrayList<Integer>();
         LinkedList<Integer> LinkedListNumber3 = new LinkedList<>();
         
         
           int cantidadElementos = 800000; //   Cantidad de elentos dentro del arreglo
//        for(int i = 0;i< cantidadElementos;i++){
//             ArrListNumber.add(i, 0);  // Se establece 0 para cada unos de los elementos dentro del arreglo
//        }
//        int tamañoArreglo = ArrListNumber.size(); // tamaño del arreglo
        
        
        
                
        
        //////////////////////////////////////// FOR ////////////////////7///////////////////////////////
        double TiempoInicial = System.currentTimeMillis();
        
        
        for(int i = 0;i< cantidadElementos;i++){
            int num = (int) (Math.random() * cantidadElementos);
             ArrListNumber.add(i, num);
        }
        
        double TiempoFinalFOR = System.currentTimeMillis() - TiempoInicial;
        System.out.println("Mediante ciclo for clasico tardo : " + TiempoFinalFOR + "ms");
        
         double TiempoInicial2 = System.currentTimeMillis();
        
        for(int i = 0;i< cantidadElementos;i++){
            int num = (int) (Math.random() * cantidadElementos);
            LinkedListNumber.add(i, num);
        }
        
        double TiempoFinalFORLink = System.currentTimeMillis() - TiempoInicial2;
        System.out.println("Mediante ciclo for en Linked tardo : " + TiempoFinalFORLink + "ms");
       
        
//////////////////////////////////////// FOR EACH ////////////////////////////////////////////////
         double TiempoInicial3 = System.currentTimeMillis();
        
        ArrListNumber2.forEach((i) -> {
            int num = (int) (Math.random() * cantidadElementos);
            ArrListNumber2.add(i, num);
        });
        
         double TiempoFinalFOREACH = System.currentTimeMillis() - TiempoInicial3;
        System.out.println("Mediante ciclo for each tardo : " + TiempoFinalFOREACH + "ms");
        
          double TiempoInicial4 = System.currentTimeMillis();
        
        ArrListNumber2.forEach((i) -> {
            int num = (int) (Math.random() * cantidadElementos);
            LinkedListNumber2.add(i, num);
        });
        
       
        
        double TiempoFinalFOREACHLink = System.currentTimeMillis() - TiempoInicial4;
        System.out.println("Mediante ciclo for each en Linked tardo : " + TiempoFinalFOREACHLink + "ms");
     
        
        //////////////////////////////////////// ITERATOR /////////////////////////////////////////////////
        
          double TiempoInicial5 = System.currentTimeMillis();
        
        Iterator<Integer> i = ArrListNumber3.iterator();
        while(i.hasNext()){
           int num = (int) (Math.random() * cantidadElementos);
            ArrListNumber3.add(i.next(), num);
        }
        
        double TiempoFinalI = System.currentTimeMillis() - TiempoInicial5;
        System.out.println("Mediante ciclo iterador tardo : " + TiempoFinalI + "ms");
        
        double TiempoInicial6 = System.currentTimeMillis();
        
        Iterator<Integer> i2 = LinkedListNumber3.iterator();
        while(i2.hasNext()){
           int num = (int) (Math.random() * cantidadElementos);
            LinkedListNumber3.add(i2.next(), num);
        }
        
        double TiempoFinalILink = System.currentTimeMillis() - TiempoInicial6;
        System.out.println("Mediante ciclo iterador Linked tardo : " + TiempoFinalILink + "ms");
        
        /////////////////////////////////////////////////////////////////////////////////////////////////
     
        
        
        System.out.println("===============================================================");
        if((TiempoFinalFOR < TiempoFinalFOREACH) && (TiempoFinalFOR < TiempoFinalI)){
        System.out.println("El menor tiempo fue de :" + TiempoFinalFOR + " / Metodo FOR ");
           } else if((TiempoFinalFOREACH < TiempoFinalFOR) && (TiempoFinalFOREACH < TiempoFinalI)){
         System.out.println("El menor tiempo fue de :" + TiempoFinalFOREACH + " / Metodo FOR EACH");
        } else{
         System.out.println("El menor tiempo fue de : " + TiempoFinalI + " / Metodo ITERATOR");
        }
        
        
        System.out.println("===============================================================");
        if((TiempoFinalFOREACHLink < TiempoFinalFOREACHLink) && (TiempoFinalFOREACHLink < TiempoFinalILink)){
        System.out.println("El menor tiempo fue de :" + TiempoFinalFOREACHLink + " / Metodo FOR Linked");
           } else if((TiempoFinalFOREACHLink < TiempoFinalFOREACHLink) && (TiempoFinalFOREACHLink < TiempoFinalILink)){
         System.out.println("El menor tiempo fue de :" + TiempoFinalFOREACHLink + " / Metodo FOR EACH Linked");
        } else{
         System.out.println("El menor tiempo fue de : " + TiempoFinalILink + " / Metodo ITERATOR Linked");
        }
      
        long i66 = System.currentTimeMillis();       
        System.out.println(i66);
        
        
        
    }
    
}
