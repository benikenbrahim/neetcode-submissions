//Solution Optimiser :
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> vus = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char numero = board[i][j];

                if (numero != '.') {
                    String ligne = numero + " dans la ligne " + i;
                    String colonne = numero + " dans la colonne " + j;
                    String boite = numero + " dans la boite " + (i / 3) + "-" + (j / 3);

                    if (!vus.add(ligne) || !vus.add(colonne) || !vus.add(boite)) {
                        return false; 
                    }
                }
            }
        }
        return true; 
    }
}