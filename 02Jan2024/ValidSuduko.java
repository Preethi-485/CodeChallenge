import java.util.*;
class ValidSuduko {
    public static void main(String[] args) {
        char[][] board={{}};
        System.out.println(isValidSudoku(board));
    }
    static boolean isValidSudoku(char[][] board) {
        //row checking
        for(int i=0;i<9;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.'){
                  /*  int val=(int)board[i][j];
                    if(val<=0||val>9)
                    System.out.println(bbbbbbbbbbbbbbbbb);*/
                    
                if(h.contains(board[i][j]))
                return false;
                h.add(board[i][j]);
            }}

          //  System.out.println(h);
        }
        for(int j=0;j<9;j++){
            HashSet<Character> h=new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j]!='.'){
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
        }
        //box checking
        for(int i=0;i<3;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=0;j<3;j++){
                if(board[i][j]!='.')
                {
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
        }
         for(int i=0;i<3;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=3;j<6;j++){
                if(board[i][j]!='.')
                {
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
            System.out.println(h);
        }
         for(int i=0;i<3;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=6;j<9;j++){
                if(board[i][j]!='.')
                {
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
        }
         for(int i=3;i<6;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=0;j<3;j++){
                if(board[i][j]!='.')
                {
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
        }
         for(int i=3;i<6;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=3;j<6;j++){
                if(board[i][j]!='.')
                {
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
        }
         for(int i=3;i<6;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=6;j<9;j++){
                if(board[i][j]!='.')
                {
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
        }
         for(int i=6;i<9;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=0;j<3;j++){
                if(board[i][j]!='.')
                {
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
        }
         for(int i=6;i<9;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=3;j<6;j++){
                if(board[i][j]!='.')
                {
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
        }
         for(int i=6;i<9;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=6;j<9;j++){
                if(board[i][j]!='.')
                {
                    if(h.contains(board[i][j]))
                    return false;
                    h.add(board[i][j]);
                }
            }
        }
        return true;

    }



    
}