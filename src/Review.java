/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Review {
    
    public void printMaze(char[][] maze) {
        for(int row = 0; row < maze.length; row++){
            for(int col = 0; col < maze[row].length; col++){
                System.out.print(maze[row][col]);
            }
            System.out.println("");
        }
    }
    
    public boolean solveMaze(char[][] maze, int row, int col){
        if(row < 0 || row >= maze.length){
            return false;
        }
        if(col < 0 || col >= maze[0].length){
            return false;
        }
        if(maze[row][col] == 'x' || maze[row][col]== '+'){
            return false;
        }
        if(maze[row][col] == 'E'){
            return true;
        }
        
        maze[row][col] = '+';
        
        
        if(solveMaze(maze, row - 1, col)){
            return true;
        }
        
        if(solveMaze(maze, row, col + 1)){
            return true;
        }
        
        if(solveMaze(maze, row + 1, col)){
            return true;
        }
        
        if(solveMaze(maze, row, col - 1)){
            return true;
        }
        
        maze[row][col] = '.';
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Review test = new Review();
        
        char[][] maze = {
            {'x','x','x','x','x','x','x','x','x','x'},
            {'S','.','x','.','.','.','.','.','.','x'},
            {'x','.','x','.','x','.','x','x','.','x'},
            {'x','.','x','.','x','.','x','x','.','x'},
            {'x','.','.','.','x','.','x','.','.','x'},
            {'x','.','x','x','x','.','x','x','x','x'},
            {'x','.','x','.','x','.','x','x','x','x'},
            {'x','.','x','.','x','.','x','.','.','E'},
            {'x','.','.','.','x','.','.','.','x','x'},
            {'x','x','x','x','x','x','x','x','x','x'}
        };
        
        test.printMaze(maze);
        if(test.solveMaze(maze, 1,0)){
            System.out.println("Solved Maze");
            test.printMaze(maze);
        }else{
            System.out.println("Failed to solve maze");
            
        }
    }
}
