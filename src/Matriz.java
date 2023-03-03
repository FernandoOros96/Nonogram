import java.awt.Color;
import javax.swing.JButton;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aldo
 */
public class Matriz {
   int filas;
   int columnas;
   JButton[][] MATRIZ;
   int checkMatrix [][];
   int gameMatrix [][];
   int count;  

   
 public Matriz(int f, int c) {
       filas=f;
       columnas=c;
       count = 3;

    MATRIZ= new JButton [filas][columnas];
   
    for (int i=0; i < filas; i++){
        for (int j=0; j< columnas; j++){
            MATRIZ [i][j]= new JButton();
            MATRIZ [i][j].setBackground(Color.white);
        }
    }
 }
 
 public String saveMatrix(){
        int i,j;
        checkMatrix = new int [filas][columnas];
        String output = "";
        String NEWLINE = System.getProperty("line.separator");
        
        //Rellenar la matriz de números dependiendo del color de la de botones
        for (i=0; i < filas; i++){
            for (j=0; j< columnas; j++){
               if (MATRIZ[i][j].getBackground()== Color.black){
                   checkMatrix [i][j] = 1; //Esta matriz es de int y se declaró en la clase Matriz
               }else{
                   checkMatrix [i][j] = 0;
               }
            }
        }
        output = count+""+NEWLINE;
        //Pasar Filas al doc
        output = output+ filas+""+NEWLINE;
        //Pasar Columnas al doc
        output = output +columnas+""+NEWLINE;
    
       //Pasar la info al doc en forma de matriz
        for (i=0; i < filas; i++){
            if(i>0){
                output = output + NEWLINE;
            }
            for (j=0; j< columnas; j++){
               output = output+""+checkMatrix[i][j]+" "; 
            }
        }
        return output; //Retorna el String con los datos de la matriz
    }
     
 public void insertNewMatrix(int newMatrix[][], int filas, int columnas){

        for (int i=0; i < filas; i++){
        for (int j=0; j< columnas; j++){
            if (newMatrix[i][j]== 1){
                MATRIZ [i][j].setBackground(Color.black);
            }
            else{
               MATRIZ [i][j].setBackground(Color.white);
            }
        }
    }
  } 
 
 
 public int checkMatrixErrors(){//Para saber cuando restar vidas
        int mistakes;
        mistakes=0;
        for (int i=0; i < filas; i++){
        for (int j=0; j< columnas; j++){
            if((gameMatrix[i][j]==0) && (MATRIZ [i][j].getBackground()==Color.black)){
                MATRIZ [i][j].setBackground(Color.white); 
                MATRIZ [i][j].setEnabled(false);  
              mistakes=1;
            }
          }
        }
        return mistakes;
    }
 
public int checkMatrixCompleted(){ //Para saber si gano
        int correct;
        correct=0;
        for (int i=0; i < filas; i++){
        for (int j=0; j< columnas; j++){
            if(((gameMatrix[i][j]==1) != (MATRIZ [i][j].getBackground()==Color.black))||
                ((gameMatrix[i][j]==0) != (MATRIZ [i][j].getBackground()==Color.white))){
              correct=1;
            }
          }
        }
 return correct;

 }
}