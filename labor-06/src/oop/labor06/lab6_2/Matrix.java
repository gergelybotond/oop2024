package oop.labor06.lab6_2;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;
    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }
    public Matrix(double[][] array){
        this.rows = array.length;
        this.columns = array[0].length;
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = array[i][j];
            }
        }
    }
    public Matrix(Matrix copy){
        this.rows = copy.rows;
        this.columns = copy.columns;
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] = copy.data[i][j];
            }
        }
    }

    public static Matrix add(Matrix m1, Matrix m2){
        if(m1.columns != m2.columns || m2.rows != m1.rows){
            System.out.println("Wrong sizes");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m1.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.columns; j++) {
                result.data[i][j] = m1.data[i][j] + m2.data[i][j];
            }
        }
        return result;
    }
    public void printMatrix(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%6.2f", data[i][j]);
            }
            System.out.println();
        }
    }
    public int getRows(){
        return rows;
    }
    public int getColumns(){
        return columns;
    }
    public void fillRandom(double lower, double upper){
        if(this.data == null){
            System.out.println("ERROR");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = Math.random() * (upper - lower) + lower;
            }
        }
    }
    public static Matrix multiply(Matrix m1, Matrix m2){
        if(m1.rows != m2.columns){
            System.out.println("ERROR");
        }
        Matrix result = new Matrix(m1.rows, m2.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.columns; j++) {
                result.data[i][j] = 0;
                for (int k = 0; k < m1.columns; k++) {
                    result.data[i][j] += m1.data[i][k] * m2.data[k][j];
                }
            }
        }
        return result;
    }
    public Matrix transpose(Matrix matrix){
        int rows = matrix.columns;
        int columns = matrix.rows;
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = matrix.data[i][j];
            }
        }
        return result;
    }

}
