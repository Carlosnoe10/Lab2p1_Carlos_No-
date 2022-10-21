
package lab2p1_carlosnoé;

import java.util.Scanner;

public class Lab2P1_CarlosNoé {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        
        
            System.out.println("Menu");
            
            System.out.println("Opcion 1 (Indice Academico)" );
            
            System.out.println("Opcion 2 (¡OK Boomer!" );
            
            System.out.println("Opcion 3 (¡Gotta Know Them All!) ");
            
            System.out.println("Opcion 4 (Salida)");
            
            int menu=scanner.nextInt();
            
    while (menu != 4){       
            
            if (menu == 1){
                
                        int numA, numB;
                
                System.out.println("Ingrese el numero A: ");
                
                numA = scanner.nextInt();
                
                System.out.println("Ingrese el numero B: ");
                
                numB = scanner.nextInt();
                
                int numC, numD;
                
                numC = numA;
                numD = numB;
                
                        
                    if ( numA > 0 && numB > 0 ) {
                            
                        while (numC != numD  ) {
                            if (numC > numD ){
                                numC= numC-numD;
                            }else if (numD > numC){
                                numD = numD-numC;
                            }
                            }
                    System.out.println( "El MCD de "+numA+" y "+numB+" es "+numC );}
                    else {
                            System.out.println("Los números ingresados deben ser positivos.");
                    }
                    
                            
            } else if (menu == 2){
                        
            
                
                int an1os;
        
            System.out.println("Ingrese el año de nacimniento: ");
        
            an1os = scanner.nextInt();
        
            if ((an1os>= 1946) && (an1os <= 1964)){
            
             System.out.println("¡Felicidades usted es de la generación Baby Boomer) ");           
            
            }else if ((an1os >= 1965) && (an1os <= 1979)){
            
                System.out.println("¡Felicidades usted es de la generación X) ");
    
            }else if ((an1os >= 1979) && (an1os <= 1985)){
            
                System.out.println("¡Felicidades usted es de la generación Xennials) ");
            
            }else if ((an1os>= 1985) && (an1os <= 1994)){
            
                System.out.println("¡Felicidades usted es de la generación Millenials) ");
                        
            }else if ((an1os>= 1994) && (an1os <= 2012)){
            
                System.out.println("¡Felicidades usted es de la Gen Z) ");
            
            }else if ((an1os>= 1990) && (an1os <= 2012)){
            
                System.out.println("¡Felicidades usted es de la Gen Alpha) ");
        
            }else{ 
            
                System.out.println(" Introduzca una fecha adecuada ");}
        
            
            
            
            
            }else if (menu == 3){
                
                int tipoA, tipoD;
                
                System.out.println ("¡Hola Entrenador!, Como el maestro Pokémon que eres has sido seleccionado para desarrollar un");
                
                System.out.println (" método que nos ayude a identificar que tipo de Pokémon es “Super Eficaz”, “Débil” o “Neutral” ");
                
                System.out.println("ante otro tipo. Te daremos 4 tipos a utilizar: Hada (1), Luchador (2), Hierro (3) y Psíquico (4).");
                
                System.out.println("Ingrese el tipo atacante: ");
                
                tipoA = scanner.nextInt();
                
                System.out.println("Ingrese el tipo defensor: ");
                
                tipoD = scanner.nextInt();
               
                if (tipoA == 1){
                    if (tipoD == 1){
                        
                        System.out.println( "¡El tipo Fairy es Neutral   contra el tipo Fairy!");
                        
                    }else if (tipoD == 2) { 
                        
                        System.out.println("¡El tipo Fairy es Super Eficaz contra el tipo Luchador!");
                        
                    }else if (tipoD == 3) {
                        
                        System.out.println("¡El tipo Fairy es Debil contra el tipo Steel!");
                        
                    }else if (tipoD == 4){
                        
                        System.out.println("¡El tipo Fairy es Normal contra el tipo Psiquico");
                        
                    }else{ 
                        
                        System.out.println("Ingrese el termino correctamente");
                    }
                }else if (tipoA == 2){
                    
                        if (tipoD == 1){
                        
                            System.out.println( "¡El tipo Luchador es Debil contra el tipo Fairy!");
                        
                        }else if (tipoD == 2) { 
                        
                            System.out.println("¡El tipo Luchador es Normal contra el tipo Luchador!");
                        
                        }else if (tipoD == 3) {
                        
                            System.out.println("¡El tipo Luchador es Eficaz contra el tipo Steel!");
                        
                        }else if (tipoD == 4){
                        
                            System.out.println("¡El tipo Luchador es Debil contra el tipo Psiquico");
                        
                        }else{ 
                        
                            System.out.println("Ingrese el termino correctamente");
                }
                }else if (tipoA == 3){
                    
                        if (tipoD == 1){
                        
                            System.out.println( "¡El tipo Hierro es Eficaz contra el tipo Fairy!");
                        
                        }else if (tipoD == 2) { 
                        
                            System.out.println("¡El tipo Hierro es Normal contra el tipo Luchador!");
                        
                        }else if (tipoD == 3) {
                        
                            System.out.println("¡El tipo Hierro es Debil contra el tipo Steel!");
                        
                        }else if (tipoD == 4){
                        
                            System.out.println("¡El tipo Hierro es Normal contra el tipo Psiquico");
                        
                        }else{ 
                        
                            System.out.println("Ingrese el termino correctamente");
                        }
                }else if (tipoA == 4){
                    
                        if (tipoD == 1){
                        
                            System.out.println( "¡El tipo Psíquico es Normal contra el tipo Fairy!");
                        
                        }else if (tipoD == 2) { 
                        
                            System.out.println("¡El tipo Psíquico es Eficaz contra el tipo Luchador!");
                        
                        }else if (tipoD == 3) {
                        
                            System.out.println("¡El tipo Psíquico es Debil contra el tipo Steel!");
                        
                        }else if (tipoD == 4){
                        
                            System.out.println("¡El tipo Psíquico es Debil contra el tipo Psiquico");
                        
                        }else{ 
                        
                            System.out.println("Ingrese el termino correctamente");
                                }
                }else{
                    
                    System.out.println("Ingrese el termino correctamente");  
            }
                
                
            }else{
                
                System.out.println("Salida");
                
            }
                        System.out.println("Menu");
            
            System.out.println("Opcion 1 (Indice Academico)" );
            
            System.out.println("Opcion 2 (¡OK Boomer!" );
            
            System.out.println("Opcion 3 (¡Gotta Know Them All!) ");
            
            System.out.println("Opcion 4 (Salida)");
            
            menu=scanner.nextInt();
            
            }
    }
}

            
            

                
        
                            
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
        
       

                              
