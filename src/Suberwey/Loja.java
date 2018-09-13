package Suberwey;
/*Ana Paula Julio de Lima - 160.215-2
 * Vinicius Lellis de Andrade - 160.216-1*/
import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;
import Suberwey.Carne.*;
import Suberwey.Molho.Azeite;
import Suberwey.Molho.Mostarda;
import Suberwey.Molho.Parmesao;
import Suberwey.Pao.Centeio;
import Suberwey.Pao.Integral;
import Suberwey.Pao.Tradicional;
import Suberwey.Salada.*;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int escolha = 0;
        
        Lanche pao = null;
        
        System.out.println("Escolha o p√£o");
        System.out.println("1-Integral");
        System.out.println("2-Centeio");
        System.out.println("3-Tradicional");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                pao = new Integral();
                break;
            case 2:
                pao = new Centeio();
                break;
            case 3:
                pao = new Tradicional();
                break;
        }

        System.out.println("Escolha a carne");
        System.out.println("1-Frango");
        System.out.println("2-Peixe");
        System.out.println("3-Presunto");
        System.out.println("4-Peru");
        System.out.println("5-Rosbife");
        escolha = scanner.nextInt();

        Adicional adicional = null;
        switch (escolha) {
            case 1:
                adicional = new Frango(pao);
                break;
            case 2:
                adicional = new Peixe(pao);
                break;
            case 3:
                adicional = new Presunto(pao);
                break;
            case 4:
                adicional = new Peru(pao);
                break;
            case 5:
                adicional = new Rosbife(pao);
                break;
        }

        
        System.out.println("Escolha o molho:");
        System.out.println("1-Mostarda");
        System.out.println("2-Azeite");
        System.out.println("3-Parmesao");
        System.out.println("4-Sem molho");
        escolha = scanner.nextInt();
        
        if(escolha != 4) {	
        	switch (escolha) {
            	case 1:
            		adicional = new Mostarda(adicional);
            		break;
            	case 2:
            		adicional = new Azeite(adicional);
                    break;
            	case 3:
            		adicional = new Parmesao(adicional);
                    break;
                }
        	
        	System.out.println("Escolha o outro molho:");
            System.out.println("1-Mostarda");
            System.out.println("2-Azeite");
            System.out.println("3-Parmesao");
            System.out.println("4-Sem molho");
            escolha = scanner.nextInt();
            
            if(escolha != 4) {
            	switch (escolha) {
                	case 1:
                		adicional = new Mostarda(adicional);
                		break;
                	case 2:
                		adicional = new Azeite(adicional);
                        break;
                	case 3:
                		adicional = new Parmesao(adicional);
                        break;
                    }
            	}
        }
        
       System.out.println("Escolha a salada");
       System.out.println("1-Alface");
       System.out.println("2-Tomate");
       System.out.println("3-Rucula");
       System.out.println("4-Agri√£o");
       System.out.println("5-Cebola");
       System.out.println("6-Azeitonita");
       System.out.println("7-N„o quero salada");
       
       escolha = scanner.nextInt();
       
       if(escolha != 7) {
    	   switch (escolha) {
    	   		case 1:
    	   			adicional = new Alface(adicional);
    	   			break;
    	   		case 2:
    	   			adicional = new Tomate(adicional);
    	   			break;
    	   		case 3:
    	   			adicional = new Rucula(adicional);
    	   			break;
    	   		case 4:
    	   			adicional = new Agriao(adicional);
    	   			break;
    	   		case 5:
    	   			adicional = new Cebola(adicional);
    	   			break;
    	   		case 6:
    	   			adicional = new Azeitona(adicional);
    	   			break;
    	   	}
    	   System.out.println("Escolha outra salada");
           System.out.println("1-Alface");
           System.out.println("2-Tomate");
           System.out.println("3-Rucula");
           System.out.println("4-Agri√£o");
           System.out.println("5-Cebola");
           System.out.println("6-Azeitonita");
           System.out.println("7-N„o quero salada");
           
           escolha = scanner.nextInt();
           
           if(escolha != 7) {
        	   switch (escolha) {
        	   		case 1:
        	   			adicional = new Alface(adicional);
        	   			break;
        	   		case 2:
        	   			adicional = new Tomate(adicional);
        	   			break;
        	   		case 3:
        	   			adicional = new Rucula(adicional);
        	   			break;
        	   		case 4:
        	   			adicional = new Agriao(adicional);
        	   			break;
        	   		case 5:
        	   			adicional = new Cebola(adicional);
        	   			break;
        	   		case 6:
        	   			adicional = new Azeitona(adicional);
        	   			break;
        	   	}
        	   System.out.println("Escolha outra salada");
               System.out.println("1-Alface");
               System.out.println("2-Tomate");
               System.out.println("3-Rucula");
               System.out.println("4-Agri√£o");
               System.out.println("5-Cebola");
               System.out.println("6-Azeitonita");
               System.out.println("7-N„o quero salada");
               
               escolha = scanner.nextInt();
               
               if(escolha != 7) {
            	   switch (escolha) {
            	   		case 1:
            	   			adicional = new Alface(adicional);
            	   			break;
            	   		case 2:
            	   			adicional = new Tomate(adicional);
            	   			break;
            	   		case 3:
            	   			adicional = new Rucula(adicional);
            	   			break;
            	   		case 4:
            	   			adicional = new Agriao(adicional);
            	   			break;
            	   		case 5:
            	   			adicional = new Cebola(adicional);
            	   			break;
            	   		case 6:
            	   			adicional = new Azeitona(adicional);
            	   			break;
            	   	}
               }
           }
       }
       
       System.out.println(adicional);
    }
}
