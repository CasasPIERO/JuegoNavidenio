package juegonavideno.logica;

import java.util.Random;

public class Controlador {

    public String[][] cargarMatriz(String matriz[][]){
        String emojis [] = {"🎅🏻", "🎄", "⭐", "🎁"};
        Random random = new Random();
        
        for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matriz[i][j] = emojis[random.nextInt(emojis.length)];
            }
        }
        return matriz;
    }
    
    public int buscarEmoji(String matriz[][], String emoji){
        int encontrado = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(matriz[i][j].equals(emoji)){
                    encontrado++;
                }
            }
        }
        return encontrado;
    }
}
