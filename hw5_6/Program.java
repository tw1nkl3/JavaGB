package hw5_6;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        int[][] map = Mapa();
        Printer(Queue_(map));
      
    }

    

    public static int[][] Mapa() {
        
        int[][] map = {
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,-1,00,00,00,00,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,-1,00,00,00,00,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,-1,00,00,00,00,00,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,00,00,-1,00,00,00,00,00,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,00,00,-1,00,00,00,00,00,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,00,00,-1,00,00,-1,-1,-1,-1,-1,-1,-1,00,00,00,-1},
            {-1,00,00,00,00,00,-1,00,00,00,00,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,-1,-1,-1,-1,-1,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,-1,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,-1,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1,00,00,00,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        };
        return map;
    }

    public static void Printer(int[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == -1) {
                    System.out.printf("███");
                
                }
                else if ( map[i][j] == 1) {
                    System.out.printf("o_o");
                } 
                else if (i == 2 & j == 17) {
                    System.out.printf("%3d",map[i][j]);
                }
                else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }  
    }

    public static int[][] Queue_(int[][] map) {
        Queue<Integer> qm = new LinkedList<Integer>();
        Queue<Integer> qn = new LinkedList<Integer>();
        int m = 12;
        int n = 7;
        map[m][n] = 1;
        qm.add(m);
        qn.add(n);
        System.out.println(qm.isEmpty());
        while (!qm.isEmpty()) {
            if (map[qm.element()-1][qn.element()] != -1) {
                if (map[qm.element()-1][qn.element()] ==0 || 
                map[qm.element()-1][qn.element()] > map[qm.element()][qn.element()] + 1) { 
                    map[qm.element()-1][qn.element()] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element()-1);
                    qn.add(qn.element());
                }
            }
            if (map[qm.element()][qn.element()+1] != -1) {
                if (map[qm.element()][qn.element()+1] == 0 || 
                map[qm.element()][qn.element()+1] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element()][qn.element()+1] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element());
                    qn.add(qn.element()+1);
                }
            }
            if (map[qm.element()+1][qn.element()] != -1) {
                if (map[qm.element()+1][qn.element()] == 0 || 
                map[qm.element()+1][qn.element()] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element()+1][qn.element()] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element()+1);
                    qn.add(qn.element());
                }
            }
            if (map[qm.element()][qn.element()-1] != -1) {
                if (map[qm.element()][qn.element()-1] == 0 || 
                map[qm.element()][qn.element()-1] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element()][qn.element()-1] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element());
                    qn.add(qn.element()-1);
                }
            }
            qm.remove();
            qn.remove();
        }
        return map;
       
    }
    
}