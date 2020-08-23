package leetCodePractice.test;

import java.util.*;

public class slidingPuzzle {

    public int slidingPuzzle(int[][] board) {

        Queue<Node> q = new LinkedList<>();
        Set<String> visited = new LinkedHashSet<>();

        String target = Arrays.deepToString(new int[][]{
                {1, 2, 3},
                {4, 5, 0}
        });
        //System.out.print(target);

        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    Node start = new Node(board, i, j, 0);
                    q.offer(start);
                    visited.add(start.boardString);
                }
            }
        }
        //int step = 0;
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if(cur.boardString.equals(target))
                return cur.depth;
            for(int[] dr: directions){
                int newX = dr[0]+cur.x;
                int newY = dr[1]+cur.y;

                //abs是用来计算坐标变化的绝对值，当坐标绝对值和变化超过1时，说明移动的方向不对
                if((Math.abs(newX-cur.x)) + Math.abs(newY-cur.y) != 1 || newX<0 || newX>=2 || newY<0 || newY>=3)continue;

                int[][] newBoard = new int[2][3];
                int t = 0;
                //复制当前的board数组到新的数组中
                for(int[] row : cur.board)newBoard[t++] = row.clone();
                //将0和移动的方向互换
                newBoard[cur.x][cur.y] = newBoard[newX][newY];
                newBoard[newX][newY] = 0;

                //更新新的移动目的地，并判断路径是否走过，假如走过就忽略这次，假如没走过就添加进结点队列和StringSet中
                Node newNode = new Node(newBoard,newX,newY,cur.depth+1);
                if(visited.contains(newNode.boardString))continue;;
                q.add(newNode);
                visited.add(newNode.boardString);
            }


        }

        return -1;


    }


    public static void main(String[] args) {

        int[][] board = {
                {1,2,3},
                {5,4,0}
        };
        slidingPuzzle ts = new slidingPuzzle();
        System.out.print(ts.slidingPuzzle(board));
    }

    public class Node{
        int[][] board;
        String boardString;
        int x;
        int y;
        int depth;
        public Node(int x,int y){
            this.x = x;
            this.y = y;
        }
        public Node(int[][] board,int x,int y,int depth){
            this.board = board;
            boardString = Arrays.deepToString(board);
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }




}
