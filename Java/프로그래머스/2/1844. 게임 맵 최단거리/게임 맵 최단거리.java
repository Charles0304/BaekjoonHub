import java.util.*;
class Solution {
    static int[][] map;
    static int[][] visited;
    static int[] dx={1,0,-1,0};
    static int[] dy={0,1,0,-1};
    
    static class Pos{
        int x;
        int y;
        Pos(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static int bfs(Pos p){
        Queue<Pos> q= new LinkedList<>();
        q.add(p);
        visited[p.y][p.x]=1;
        while(!q.isEmpty()){
            Pos pos = q.poll();
            for(int i=0;i<4;i++){
                int nextX=pos.x+dx[i];
                int nextY=pos.y+dy[i];
                if(nextX>=0&&nextX<map[0].length&&nextY>=0&&nextY<map.length&&map[nextY][nextX]==1&&visited[nextY][nextX]==0){
                    if(nextX==map[0].length-1&&nextY==map.length-1)
                        return visited[pos.y][pos.x]+1;
                    visited[nextY][nextX]=visited[pos.y][pos.x]+1;
                    Pos nextPos = new Pos(nextX,nextY);
                    q.add(nextPos);
                }
            }
        }
        
        return -1;
    }
    public int solution(int[][] maps) {
        map=maps;
        visited = new int[maps.length][maps[0].length];
        int answer = bfs(new Pos(0,0));
        return answer;
    }
}