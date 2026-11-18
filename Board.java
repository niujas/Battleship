public class Board {
    int rows;
    int columns;
    char[][] map = new char[rows][columns];
    public Board() {
        this.rows = 10;
        this.columns = 10;
        this.map = new char[rows][columns];
    }
    public String toString() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                System.out.print(map[r][c] = '~');
                if (c < columns - 1) {
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            if (r < rows - 1) {
                System.out.println();
            }
            System.out.println();
        }
        return "";
    }
}