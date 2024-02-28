public class Main {
    public static void main(String[] args) {
        String[][] digit = new String[7][4];

        for (int i = 0; i < digit.length; i++){
            for (int j = 0; j < digit[i].length; j++){
                if (i== 0 || i == 3 || i == 6){
                    digit[i][j] = " * ";
                } else if ( j == 0 || j == 3){
                    digit[i][j] = " * ";
                } else {
                    digit[i][j] = "   ";
                }
            }
        }

        for (String[] row : digit){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}