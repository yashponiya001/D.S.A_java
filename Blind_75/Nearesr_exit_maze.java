class Solution {
    	//1.BFS
    //Runtime: 10 ms, faster than 79.05% of Java online submissions for Nearest Exit from Entrance in Maze.
    //Memory Usage: 71.9 MB, less than 44.28% of Java online submissions for Nearest Exit from Entrance in Maze.
    //Time: O(N); Space: O(N);
    //let N be the number of cells in maze
    public int nearestExit(char[][] maze, int[] entrance) {

        int[][] shifts = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        maze[entrance[0]][entrance[1]] = '+';

        //Space: O(N)
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{entrance[0], entrance[1], 0});

        //Time: O(N);
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            //up down left right
            for(int[] shift : shifts) {
                int x = node[0] + shift[0], y = node[1] + shift[1];

                if (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == '.'){
                    if (x == 0 || y == 0 || x == maze.length - 1 || y == maze[0].length - 1)
                        return node[2] + 1;
                    else {
                        maze[x][y] = '+';
                        queue.add(new int[]{x, y, node[2] + 1});
                    }
                }
            }
        }
        return -1;
    }
}
