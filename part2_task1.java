//Implement a Matrix class that has a constructor which initializes the dimensions of a matrix and a method to fill the matrix with values.

public class part2_task1{
    private int rows;
    private int columns;
    private double[][] data;

    public part2_task1(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public void fillMatrix(double[][] values) {
        if (values.length != rows || values[0].length != columns) {
            System.out.println("Invalid input: Dimensions of provided values do not match matrix dimensions.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = values[i][j];
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 3;
        int numCols = 4;
        double[][] inputValues = {
                {1.0, 2.0, 3.0, 4.0},
                {5.0, 6.0, 7.0, 8.0},
                {9.0, 10.0, 11.0, 12.0}
        };

        part2_task1 myMatrix = new part2_task1(numRows, numCols);
        myMatrix.fillMatrix(inputValues);

        System.out.println("Matrix contents:");
        myMatrix.printMatrix();
    }
}
