class Solution {
    public int equalPairs(int[][] grid) {
    var map = new HashMap<Integer, Integer>();
        var len = grid.length;
        for (int r = 0; r < len; r++){
            var key = getRowHash(grid, r);
            var value = map.getOrDefault(key, 0)+1;
            map.put(key, value);
        }
        var retVal = 0;
        for (int c = 0; c < len; c++){
            var key = getColumnHash(grid, c);
            var value = map.getOrDefault(key, -1);
            if (value != -1){
                retVal+=value;
            }
        }
        return retVal;
    }

    private Integer getRowHash(int[][] grid, int r){
        var retVal = 0;
        for (int c = 0; c < grid.length; c++){
            retVal = grid[r][c] + 17 * retVal;
        }
        return retVal;
    }

    private Integer getColumnHash(int[][] grid, int c){
        var retVal = 0;
        for (int r = 0; r < grid.length; r++){
            retVal = grid[r][c] + 17 * retVal;
        }
        return retVal;
    }

    private void display(String str, int[] ar){
        System.out.println(str);
        for (int i : ar){
            System.out.print(String.format("%d ", i));
        }
        System.out.println("");
    }

}        


        /*HashMap<String,Integer> h=new HashMap<>();
        int n=grid.length;
        String x="";
        for(int i=0;i<n;i++){
            x="";
            for(int j=0;j<n;j++){
                x+=grid[i][j]+"+";
            }
            h.put(x,h.getOrDefault(x,0)+1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            x="";
            for(int j=0;j<n;j++){
                x+=grid[j][i]+"+";
            }
            if(h.containsKey(x)){
                count+=h.get(x);
            } 
        }
        return count;
    }
}*/
