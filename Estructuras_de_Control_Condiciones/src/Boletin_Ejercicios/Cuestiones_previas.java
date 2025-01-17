/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Ejercicios;

/**
 *
 * @author Daniel
 */
public class Cuestiones_previas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
//Cuestiones previas Evaluar las siguientes expresiones (verdadero o falso) , teniendo en cuenta los valores de las variables y razona la respuesta:
//
//a)i=1 i >= 10
//R=1 no es mayor o igual a 10. “FALSO”
//
//b) i=1 i > 0 && i < 10
//R=1 es mayor que 0 y menor que 10. VERDADERO, VERDADERO= VERDADERO
//
//c) i=1 i > 0 && i > 10 //¿tiene sentido?
//R= 1 es mayor que cero pero no es mayor que 10.
//
//VERDADERO AND FALSO=FALSO
//Tiene sentido porque si i=9, por ejemplo:
//Verdadero AND Falso=FALSO,
//Y si es i=11, entonces es:
//Verdadero AND verdadero= Verdadero.
//
//d) i=-1 i > 0 || i < 10
//R= Falso OR Verdadero = Verdadero
//
//e) i=1, j=10 i > 0 && i < 10 || j==1
//R= Verdadero AND Verdadero OR Falso
//VERDADERO OR FALSO = VERDADERO
//
//f) i=1 !(i==1)
//R= Falso, la expresión dice No es 1=1
//
//g) i=1, j=10 !(i==10) && j==10
//Falso, cortocircuito =FALSO
//
//h) i=1, j=10 i > 2 || i < 10 && j==10
//R= Falso OR Verdadero AND Verdadero = Verdadero
//
//i)i=1, j=0, k= -1 i+k <= j-k*3 && k>=2
//R= 1+(-1)=0 <= 0-(-1)*3 && -1>=2
//0<=3 && -1>=2
//
//verdadero AND Falso = Falso
//
//j) i=3, j=2, k=-1 i==3 || j <=2 && k>0
//R=Verdadero OR Verdadero AND falso = falso
//
//k) i=3, j=2, k=-1 (i==3 || j <= 2) && k > 0
//R= (Verdadero OR Verdadero) && Falso
//Verdadero && Falso=Falso
//
//l) año = 2020 año % 4 ==0
//R= El resto es cero, asi que es Verdadero
//
//m) año = 2000 año % 4 ==0 && año %100 !=0 || año %400==0 //bisiesto
//R=Verdadero && Falso Cortocircuito = FALSO   
    }
    
}
