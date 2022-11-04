package lab4p1_gabrielzelaya;
import java.util.Scanner;
import java.util.Random;

public class Lab4P1_GabrielZelaya {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------Menú----------");
        System.out.println("(1) Fallout words (2) Rodatcripne (3) Alpha (4) Salir");
        int menu = entrada.nextInt();
        
        while (menu != 4) {
            if (menu == 1) {
                ejercicio1(entrada);
            } else if (menu == 2) {
                ejercicio2(entrada);
            } else {
                is_alpha(entrada);
            }
            System.out.println("----------Menú----------");
            System.out.println("(1) Fallout words (2) Rodatcripne (3) Alpha (4) Salir");
            menu = entrada.nextInt();
        }
        System.out.println("¡Ha sido un gusto!");
    }
    
    public static void ejercicio1(Scanner entrada) {
        int vidas =2;
        int numRandom = new Random().nextInt((10 - 1) + 1) + 1;
        String palabraRandom = "";
        
        switch(numRandom) {
            case 1:
                palabraRandom = "Comer";
                break;
            case 2:
                palabraRandom = "Unida";
                break;
            case 3:
                palabraRandom = "Jugar";
                break;
            case 4:
                palabraRandom = "Venti";
                break;
            case 5:
                palabraRandom = "Salta";
                break;
            case 6:
                palabraRandom = "Llama";
                break;
            case 7:
                palabraRandom = "Llora";
                break;
            case 8:
                palabraRandom = "Eevee";
                break;
            case 9:
                palabraRandom = "Muere";
                break;
            case 10:
                palabraRandom = "Local";
                break;
            default:
                System.out.println("Número incorrecto");
                break;
            }
        int numUsuario;
        do {
            numUsuario = 0;
            System.out.println("Escoga una de las siguientes palabras: ");
            System.out.println("(1) Comer (2) Unida \n(3) Jugar (4) Venti \n(5) Salta (6) Llama \n(7) Llora (8) Eevee \n(9) Muere (10) Local");
            numUsuario += entrada.nextInt();
            String palabraUsuario = "";

            switch(numUsuario) {
                case 1:
                    palabraUsuario = "Comer";
                    break;
                case 2:
                    palabraUsuario = "Unida";
                    break;
                case 3:
                    palabraUsuario = "Jugar";
                    break;
                case 4:
                    palabraUsuario = "Venti";
                    break;
                case 5:
                    palabraUsuario = "Salta";
                    break;
                case 6:
                    palabraUsuario = "Llama";
                    break;
                case 7:
                    palabraUsuario = "Llora";
                    break;
                case 8:
                    palabraUsuario = "Eevee";
                    break;
                case 9:
                    palabraUsuario = "Muere";
                    break;
                case 10:
                    palabraUsuario = "Local";
                    break;
                default:
                    System.out.println("Número incorrecto");
                    continue;
            }
            System.out.println("Su palabra es: " + palabraUsuario);
            int posicionCorrecta = 0;
            for (int i = 0; i < palabraUsuario.length(); i++) {
                char letraUsuarioPos = palabraUsuario.charAt(i);
                char letraRandomPos = palabraRandom.charAt(i);
                if (letraUsuarioPos == letraRandomPos) {
                    posicionCorrecta++;
                } 
            }
            int letrasCorrectas = 0;
            for (int i = 0;i < palabraUsuario.length(); i++) {
                for (int j = 0; j < palabraRandom.length();j++) {
                    char letraRandom = palabraRandom.charAt(j);
                    char letraUsuario = palabraUsuario.charAt(i);
                    if (letraRandom == letraUsuario) {
                        letrasCorrectas++;
                    }
                }
            }
            if (posicionCorrecta == 1) {
                System.out.println("1 posición correcta");
            } else {
                System.out.println(posicionCorrecta + " posiciones correctas");
            }
            if (letrasCorrectas == 1) {
                System.out.println("1 letra correcta");
            } else {
                System.out.println(letrasCorrectas + " letras correctas");
            }
            if (palabraUsuario.equals(palabraRandom)) {
                System.out.println("¡Acceso concedido!");
                break;
            } else {
                System.out.println(vidas + " vida(s) restantes");
                System.out.println("");
                vidas--;
            }
        } while (vidas >= 0 && numUsuario < 11);     
    }
    public static void ejercicio2(Scanner entrada) {
        System.out.println("Ingrese su contraseña: ");
        entrada = new Scanner(System.in);
        String contraseña = entrada.nextLine();
        contraseña = contraseña.toLowerCase();
        String nuevaContraseña = "";
        for (int i = 0; i < contraseña.length();i++) {
            char invertida = contraseña.charAt(i);
            nuevaContraseña = invertida + nuevaContraseña;
        }
        int generarRandom = 0;
        String acum = "" + generarRandom;
        for (int i = 0; i < nuevaContraseña.length(); i++) {
            generarRandom = new Random().nextInt((9 - 0) + 1) + 0;
            char letra = nuevaContraseña.charAt(i);
            if (i % 2 != 0) {
                acum = acum + generarRandom;
            }else{
                acum = acum + letra;
            }
        }
        System.out.println(acum);    
    }
    public static void is_alpha(Scanner entrada) {
        
    }
    
}
