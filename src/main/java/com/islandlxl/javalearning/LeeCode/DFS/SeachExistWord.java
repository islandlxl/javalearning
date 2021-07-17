package com.islandlxl.javalearning.LeeCode.DFS;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.DFS
 * @DESCRIPTION: https://leetcode-cn.com/problems/word-search/
 * @COMMENT: 奔跑吧, 骚年====>> 79. 单词搜索
 * @USER: longxl
 * @DATE: 2021/7/15 20:58
 */
public class SeachExistWord {

    public  int row;
    private  int col;
    private  String word;
    private  int wordLength;
    private  char[][] board;
    private  int[][] DIRECTIONS=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    private  boolean[][] visited;


    public static   void main(String[] args) {

        char[][] arr= new char[][]{
               {'A','B','C','E'},
               {'S','F','C','S'},
               {'A','D','E','E'}
        };
        String word="ABCCED";
        SeachExistWord seachExistWord = new SeachExistWord();
        boolean exist = seachExistWord.exist(arr, word);
        System.out.println("exist = " + exist);
    }
    public boolean exist(char[][] board, String word) {
        //初始化
        this.board=board;
        this.row= board.length;
        this.col=board[0].length;
        this.word=word;
        this.visited=new boolean[row][col];
        this.wordLength=word.length();
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                char currW=board[i][j];
                if (isMatched(currW,0)&&existWord(i,j,0)){
                    return true;
                }

            }
        }
        return false;
    }
    //
    public   boolean existWord(int i,int j,int index) {
        if (index==wordLength-1){
            return board[i][j]==word.charAt(index);
        }
        if (isMatched(board[i][j],index)){
            visited[i][j]=true;
            for (int[] pos:DIRECTIONS){
                int newX= i+pos[0];
                int newY= j+pos[1];
               if (isArea(newX,newY)&&!visited[newX][newY]){
                   if (existWord(newX,newY,index+1)){
                       return true;
                   }
               }
            }
            visited[i][j]=false;
        }
        return false;
    }
    public Boolean isArea(int x,int y){
        if (x>=0&&x<row&&y>=0&&y<col){
            return true;
        }
        return false;
    }

   
    public  boolean isMatched(char targetChar,int index){
        char c = word.charAt(index);
        if (targetChar==c){
            return true;
        }
        return false;
    }
}
