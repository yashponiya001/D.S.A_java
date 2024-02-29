class Solution {
    public int minReorder(int n, int[][] connections) {
        LinkedList<int[]>[] g = new LinkedList[n];
    for(int i = 0; i != n; ++i) g[i] = new LinkedList<>();  //create graph   
    for(int[] c: connections){             //put all edges 
      g[c[0]].add(new int[]{c[1], 1});     //index[1] == 1 - road is present
      g[c[1]].add(new int[]{c[0], 0});     //index[1] == 0 - road is absent
    }  

    int[] vis = new int[n];
    int reorderRoads = 0;
    LinkedList<Integer> q = new LinkedList<>();             //queue for BFS
    q.add(0);
    while(! q.isEmpty()){                                   //BFS  
      int city = q.poll();
      if(vis[city] == 1) continue;
      vis[city] = 1;

      for(int[] neib: g[city])
        if(vis[neib[0]] == 0){
          q.add(neib[0]);
          if(neib[1] == 1) ++reorderRoads;
        }
    }

    return reorderRoads;
  }
}
