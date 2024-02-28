class Solution {
  //check if all rooms can be visited
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[] = new boolean [rooms.size()];
      //visited rooms tracker
        dfs(rooms, vis, 0);// starting DFS form room 0 
        for(boolean i: vis) if (!i) return false;// check all rooms are visited and return false for unvisited rooms
        return true;// stated all rooms are visited
    }
    public void dfs(List<List<Integer>> rooms, boolean[] vis, int cur){
        if(vis[cur]) return;
        vis[cur] = true;
        for(int i:rooms.get(cur)) dfs(rooms,vis,i);
    }
}
