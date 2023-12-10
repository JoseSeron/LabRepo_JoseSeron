package labrepo_joseseron;

import java.util.Scanner;

//Estos no se que son pero me sirven para mostrar los simbolos en consola
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;

/**
 *
 * @author Jose Seron
 */
public class LabRepo_JoseSeron {

    /**BONUS BONUS BONUS BONUS
     * Si adivinas quien es volveras en el tiempo y veras a Zelda TOTK ganar el Goty 2023, y entonces el mundo sera un lugar mejor
     * Repocision Laboratorio 6 - Dungeons and Dragons (memo)
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@&/////@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@/(###@@@(%/@@@@@&@@.,,,..,.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@%#/(@ @@@%@..,**@@(,,,///@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@@@(% @%#@/*+/#&@@@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@@%//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@/(#@@@@@@@@@@@@@@@@@@@...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@//(#@@@@@@@@*................&.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@#/////(///@***&%........ .. . ...*&@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@#////(/(*@%......**********.......*@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@#/////(%@@@/******%@@******@ . *+/@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@#####(.*.**@..*  @@@@.@**+/@*,****@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@@@####@.*.%.... @@@@ ....@@@@*@**&@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@@@@@@##@..@.............,@@@./@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@&@@@@@@@/@.........@.......**@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@%@**(&@@@@@,,**@..............**@*@@@@@@@@@@@@@@@@@@@@@@@@&@ .*@
//@@@@@@@@@@@@@@@(((/*#&@@@@@@@@@..*@@@(*,,*,*@@@@*@@@@@@@@@@@@@@@@@@@@@@... ...@@
//@@@@@@@@@@@@#*#(/#&**(@@@@@//@,,,*@##%#%#@@@@@@@@@@@@@@@@@@@@@@@@@@@@ .......@@@
//@@@@@@@@@@**#(,/(,(+/#@///@///&///(###&///(%@@@@@@@@@@@@@@@@@@@@@@*. ........&@@
//@@@@@@@@/&##*(/(((#%**(@@//(//////###%//(//@&@@@@@@@@@@@@@@@@@@@ .. .......@@@@@
//@@@@@@*@,(#&&%&###,#@*,#@#/(#///(#####@@/,,/#@@@@@@@@@@@@@@@@@ ..@...,+/@#@@@@@@
//@@@@@*(,*(,&#@((#(#/(@**(@#//##/(#####@@@%/,,*@@@@@@@@@@@@@@...//,+//@&@@@@@@@@@
//@@@%/#(##,(/#((,#,#(##(,*(#&#/#######@&@@@@(*,,,@@@@@@@@@*..@/////@@@@@@@@@@@@@@
//@@@@(#,,,#%##,(####%,//(%@##///######&@@@@@@//*,,@@&(/@...//////@@@@@@@@@@@@@@@@
//@@@%#,,*,,(#(#(##*,/(@**&.,@%%&&&&@#@@@@@@@@@@/*,,/@((@@(&//*@@@@@@@@@@@@@@@@@@@
//@@@*(((####(%//*##@@@&**.**@@@@@@&&&@@@@@@@@@@@(@+/,@(/(%@@#@@@@@@@@@@@@@@@@@@@@
//@@@@@/+/**+/((@@@##//(##/////(///###%@@@@@@@@@@%+/*@**@&##@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@////////(///////&@@,.,,@%@@@@@.*,**@*@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@.@&//*////@@@@@@@@,...., .,*@@@(,(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@...*,,@@@@@@@@@@@@@@@@@&..... ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@..,,,@@%@@@@@@@@@@@@@@@@@@@....,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@.,,,*@@@@@@@@@@@@@@@@@@@@@@%%##%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@##(#&%@@@@@@@@@@@@@@@@@@@@@@@@%%##%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@###%%@@@@@@@@@@@@@@@@@@@@@@@@@@####&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@%@@@@//@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    public static void main(String[] args) {

        if (!"UTF-8".equals(System.out.charset().displayName())) {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8));
        }

        // codigo corazon ♥ \u2665
        // triangulo ▲ \u25B2
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        //varibles
        boolean repEjercicio = true;
        char volverAJugar, simb = 00;
        char[][] tablero = crearTablero();
        int HP = 0, EN = 0;
        boolean bandera1 = true;
        boolean bandera2 = true;
        
        
        System.out.println("****************************");
        System.out.println("Bienvenido al Lab Repocision\n");

        System.out.println("Que ejercicio desea ejecutar?");
        System.out.println("1. Dungeons and Dragons");
        System.out.println("2. Maze");
        System.out.println("3. Salir");
        int option = input.nextInt();

        switch (option) {
            case 1:
        while (repEjercicio) {

            char personaje = seleccionarPersonaje();
            if (personaje == 49) {
                HP = 250;
                EN = 50;
                simb = 'C';
                System.out.println("Usted eligio ser Caballero!");
                System.out.println("Puntos de Vida: 250");
                System.out.println("Puntos de Energia: 50");
                tablero = actualizarTablero(tablero, simb, 0);
            } else if (personaje == 50) {
                HP = 150;
                EN = 230;
                simb = 'M';
                System.out.println("Usted eligio ser Mago!");
                System.out.println("Puntos de Vida: 150");
                System.out.println("Puntos de Energia: 230");
                tablero = actualizarTablero(tablero, simb, 0);
            }

            imprimirTablero(tablero);

            while (sigueJugando(HP, EN)) {

                System.out.println("HP: " + HP);
                System.out.println("Energia: " + EN);

                System.out.println("Presiona enter para continuar");
                char continuar = input.next().charAt(0);

                int dado = random.nextInt(1, 17);
                System.out.println("Usted saco " + dado + "!");

                tablero = actualizarTablero(tablero, simb, dado);
         
                imprimirTablero(tablero);

                if (filaActual(tablero, simb) == tablero.length - 1 || HP <= 0 || EN <= 0) {

                    System.out.println("El juego ha terminado.");
                    if (filaActual(tablero, simb) == tablero.length - 1) {
                        System.out.println("¡Has alcanzado el final del calabozo!");
                    } else if (HP <= 0) {
                        System.out.println("¡Te quedaste sin vida! Has perdido.");
                    } else {
                        System.out.println("¡Te quedaste sin energía! Has perdido.");
                    }
                    repEjercicio = false;
                    break;
                }

                if (dado % 2 != 0) {
                    

                    int fila = filaActual(tablero, simb);
                    int dragonesMax = dragonesMax(fila);

                    int dragons = random.nextInt(1, dragonesMax + 1);

                    System.out.println("¡Ha encontrado " + dragons + " dragones!");

                    if (random.nextInt(1, 101) <= 50) {
                        System.out.println("¡Ha ganado la batalla contra los dragones!");
                        EN -= 5 * dragons;
                    } else {
                        System.out.println("¡Ha huido de los dragones!");
                        HP -= 25 * dragons;
                        
                    }
                }
                
                       bonoSolidarioXiomi(tablero, simb, filaActual(tablero, simb), HP, EN);
                
                
            }

            do {
                System.out.println("Desea volver a jugar? ( 0=NO    1=SI )");
                volverAJugar = input.next().charAt(0);
                if (volverAJugar == 48) {
                    System.out.println("Saliendo del juego...");
                    repEjercicio = false;
                    break;
                        }
                    } while (volverAJugar < 48 || volverAJugar > 49);

                }

                break;
            case 2:
      
                
                System.out.println("MAZE");

                char[][] maze = {
                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                    {'#', 'C', '#', ' ', ' ', ' ', '#', '#', ' ', '#'},
                    {'#', ' ', '#', ' ', '#', '#', '#', ' ', ' ', ' '},
                    {'#', ' ', '#', ' ', ' ', ' ', '#', ' ', '#', '#'},
                    {'#', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', '#'},
                    {'#', ' ', '#', ' ', '#', ' ', '#', '#', ' ', '#'},
                    {'#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', '#'},
                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                };

                Scanner totkgoty = new Scanner(System.in);

                int columna = 1;
                int fila = 1;

                for (int i = 0; i < maze.length; i++) {
                    for (int j = 0; j < maze[i].length; j++) {
                        System.out.print(maze[i][j]);
                    }
                    System.out.println("");
                }

                while (true) {

                    System.out.println("Ingrese un movimiento (w/a/s/d)");
                    char mov = totkgoty.next().charAt(0);

                    switch (mov) {
                        case 'w':
                            if (maze[fila - 1][columna] != '#') {
                                maze[fila][columna] = ' ';
                                fila--;
                            }
                            break;
                        case 'a':
                            if (maze[fila][columna - 1] != '#') {
                                maze[fila][columna] = ' ';
                                columna--;
                            }
                            break;
                        case 's':
                            if (maze[fila+1][columna] != '#') {
                                maze[fila][columna] = ' ';
                                fila++;
                            }
                            break;
                        case 'd':
                            if (maze[fila][columna + 1] != '#') {
                                maze[fila][columna] = ' ';
                                columna++;
                            }
                            break;
                        default:
                            System.out.println("Movimiento no valido");
                            break;
                    }
                    
                    maze[fila][columna]='C';

                    for (int i = 0; i < maze.length; i++) {
                        for (int j = 0; j < maze[i].length; j++) {
                            System.out.print(maze[i][j]);
                        }
                        System.out.println("");
                    }

                    if (fila == 2 && columna == 9) {
                        System.out.println("Felicidades! Completaste el Laberinto! (le da un pico en el cachete)");
                        break;
                    }
                }

           
            case 3:
                System.out.println("Saliendo");
                break;
            default:
                throw new AssertionError();
        }

        
        

        System.out.println("****************************");

    }

    public static void bonoSolidarioXiomi(char[][] tablero, char simb, int fila, int HP, int EN) {
        char landedSymbol = tablero[fila][0];

        if (landedSymbol == '\u2665') {
            HP += 25;
            System.out.println("¡Has recibido un bono de +25 HP!");
        } else if (landedSymbol == '\u25B2') {
            EN += 5;
            System.out.println("¡Has recibido un bono de +5 EN!");
        }
    }

    public static int dragonesMax(int fila) {
        if ((fila > -1 && fila < 3)) {
            return 2;
        } else if ((fila > 2 && fila < 6)) {
            return 3;

        } else if ((fila > 5 && fila < 9)) {
            return 4;
        } else {

            return 5;
        }

    }

    public static int filaActual(char[][] tablero, char simb) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == simb) {
                    return i;
                }
            }
        }
        return 0;

    }

    public static boolean sigueJugando(int HP, int EN) {
        boolean sigueJugando = true;

        if (HP < 1 || EN < 1) {
            sigueJugando = false;
        }
        return sigueJugando;
    }

    public static char seleccionarPersonaje() {
        Scanner input = new Scanner(System.in);
        char personaje;
        do {
            System.out.println("Ingrese el numero de el heroe quiere ser: ");
            System.out.println("1: Caballero ( HP: 250  Energia:50 )");
            System.out.println("2: Mago ( HP: 150  Energia: 230 )");
            personaje = input.next().charAt(0);
        } while (personaje < 49 || personaje > 50);

        return personaje;
    }

    public static char[][] actualizarTablero(char[][] tableroOriginal, char simb, int dado) {
        char[][] tableroProvisional = crearTablero();

        if (dado == 0) {
            tableroProvisional[0][0] = simb;
        } else {

            for (int i = 0; i < tableroOriginal.length; i++) {
                for (int j = 0; j < tableroOriginal[i].length; j++) {

                    if (tableroOriginal[i][j] == simb) {

                        int PocisionesRestantes = tableroOriginal[i].length - (j + 1);

                        if (PocisionesRestantes >= dado) {
                            tableroProvisional[i][j] = '·';
                            tableroProvisional[i][j + dado ] = simb;

                        } else {

                            tableroProvisional[i][j] = '·';
                            int restantesSiguienteFila = dado - PocisionesRestantes;

                            if (restantesSiguienteFila < tableroOriginal[i + 1].length) {
                                tableroProvisional[i + 1][restantesSiguienteFila-1] = simb;
                            } else {
                                int fokinoutbounds = restantesSiguienteFila % tableroOriginal[i + 1].length;

                                tableroProvisional[i + 2][fokinoutbounds] = simb;
                            }

                        }
                    }
                }
            }
        }

        return tableroProvisional;
    }

    public static char[][] crearTablero() {
        char[][] matriz = new char[10][10];
        char corazon = '\u2665';
        char triangulo = '\u25B2';

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (((i) == (j) && (i != 0 && j != 0)) || ((j == matriz.length - 1 - i))) {
                    matriz[i][j] = triangulo;
                } else if (((j == 1) || (j == 3) || (j == 6) || (j == 9)) && ((i % 2) == 0)) {
                    matriz[i][j] = corazon;
                } else {
                    matriz[i][j] = '-';
                }

            }
        }

        return matriz;
    }

    public static void imprimirTablero(char[][] tablero) {

        System.out.print("\u2554");
        for (int k = 0; k < 32; k++) {
            System.out.print("\u2550");
        }
        System.out.println("\u2557");

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                System.out.print(tablero[i][j] + "  ");

            }
            System.out.println("");
        }

        System.out.print("\u255A");
        for (int k = 0; k < 32; k++) {
            System.out.print("\u2550");
        }
        System.out.println("\u255D");
    }

}
