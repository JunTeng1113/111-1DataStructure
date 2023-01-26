
package Maze;

public class Maze {

    static int[] start_point = {5, 8};
    static int[] end_point = {1, 1};

    static char[][] maze = {
        {'■', '■', '■', '■', '■', '■', '■', '■', '■', '■'},
        {'■', '0', '■', '0', '0', '0', '0', '0', '0', '■'},
        {'■', '0', '■', '0', '■', '0', '■', '■', '0', '■'},
        {'■', '0', '0', '0', '■', '■', '■', '0', '0', '■'},
        {'■', '0', '■', '0', '0', '0', '0', '0', '■', '■'},
        {'■', '0', '0', '0', '■', '■', '■', '0', '0', '■'},
        {'■', '■', '■', '■', '■', '■', '■', '■', '■', '■'}};

    static boolean findPath(int y, int x) {
        if (y == end_point[0] && x == end_point[1]) {
            maze[y][x] = '★'; // 終點
            return true;
            
        } else if (maze[y][x] == '0') {
            if (y == start_point[0] && x == start_point[1]) {
                maze[y][x] = '☆'; // 起點
            } else {
                maze[y][x] = '1'; // 走過的路
            }

            if (findPath(y - 1, x) || findPath(y + 1, x) || findPath(y, x - 1) || findPath(y, x + 1)) {
                return true;
            } else {
                maze[y][x] = '×' ;
                return false;
            }

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        findPath(start_point[0], start_point[1]);
        for (int i = 0; i < maze.length; i++) {  
            for (int j = 0; j < maze[0].length; j++) 
            {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}