/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class recursiveMaze {

    public void printMaze(char[][] maze){
    for(int row = 0; row < maze.length; row++){
        for(int col = 0; col < maze[row].length; col++){
            System.out.print((maze[row][col]));
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
        if(maze[row][col] == 'x'||
                maze[row][col] == '+'){
            return false;
        }
        
        //winning condition: found the exit
        if(maze[row][col] == 'e'){
            return true;
        }
        
        //mark spot as visited
        maze[row][col] = '+';
        
        //try north
        row--;
        
        //try path. if successful = done!
        if(solveMaze(maze, row - 1, col)){
            return true;
        }
        //try east
        //if path succesful = DONE!
        if(solveMaze(maze, row, col + 1)){
            return true;
        }
        //try south
        //if path successful  = DONE!
        if(solveMaze(maze, row, col + 1)){
            return true;
        }
        //try west
        //if path successful = DONE!
        if(solveMaze(maze, row, col - 1)){
            return true;
        }
        
        //tried every direction = NO GOOD!!
        //unvisit the spot
        maze[row][col] = '.';
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        recursiveMaze test = new recursiveMaze();
        
        //x = wall, . = space, s = start
        //e = end, + = path
        char[][] maze = {
            {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x',}, 
            {'s', '.', 'x', '.', 'x', 'x', '.', 'x', '.', 'e',},
            {'x', '.', 'x', '.', 'x', 'x', '.', 'x', '.', 'x',},
            {'x', '.', 'x', '.', 'x', 'x', '.', 'x', '.', 'x',},
            {'x', '.', 'x', '.', 'x', 'x', '.', 'x', '.', 'x',},
            {'x', '.', '.', '.', 'x', 'x', '.', 'x', '.', 'x',},
            {'x', '.', 'x', '.', 'x', 'x', '.', 'x', '.', 'x',},
            {'x', '.', 'x', '.', 'x', 'x', '.', 'x', '.', 'x',},
            {'x', '.', '.', '.', '.', '.', '.', '.', '.', 'x',},
            {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
        };
               test.printMaze(maze);
        if(test.solveMaze(maze, 1, 0)){
            System.out.println("Solved the maze");
            test.printMaze(maze);
        }else{
            System.out.println("Failed to solve maze");
        }
    }
}
