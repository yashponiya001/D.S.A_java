class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2) q.add(new Pair(i,j));
            }
        }
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            boolean f=false;
            while(size-->0){
                Pair x=q.poll();
                int r=x.r,c=x.c;
                if(r>0 && grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    q.add(new Pair(r-1,c));
                    f=true;
                }
                if(r<n-1 && grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    q.add(new Pair(r+1,c));
                    f=true;
                }
                if(c>0 && grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    q.add(new Pair(r,c-1));
                    f=true;
                }
                if(c<m-1 && grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    q.add(new Pair(r,c+1));
                    f=true;
                }
            }
            if(f) ans++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return ans;
    }
}
class Pair{
    int r;
    int c;
    Pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}
