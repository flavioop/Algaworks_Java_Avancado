package com.algaworks.generics.sorteio;

import java.util.Random;

public class Sorteador {

   private static final Random RANDOM = new Random();

   public static <T>T sortear(T[]objetos){
       if(objetos.length == 0){
           throw new IllegalArgumentException("Minimo de 1 objeto requerid");
       }
       int posicao = RANDOM.nextInt(objetos.length);
       return objetos[posicao];
   }

}