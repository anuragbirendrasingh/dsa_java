package BackTracking;

public class Queen_Combination {
    public static void main(String[] args) {
        int n = 4 ;
        boolean[] board = new boolean[n];
        int tq =  2 ;
        int qpsf = 0;
        String ans = "";
        int idx = 0 ; // to keep track of the index knha queen baitha diya hai ab usske aage baithenge loop me 
        Combinantion(board,tq,qpsf,ans,idx);
    }

    public static void Combinantion(boolean[] board,int tq,int qpsf,String ans,int idx){
                if(qpsf==tq){
                    System.out.println(ans);
                    return;
                }

                for(int i=idx ; i<board.length ;i++){
                    if(board[i]==false){
                        board[i] = true ; // queen ko baith denge
                        Combinantion(board, tq, qpsf + 1, ans + "b" + i + "q", i+1);
                        board[i] = false ;
                    }
                }
    }
}
