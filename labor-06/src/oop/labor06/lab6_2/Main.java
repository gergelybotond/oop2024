package oop.labor06.lab6_2;

public class Main {
    public static void main(String[] args) {
        Matrix mat1 = new Matrix(2, 3);
        System.out.println("mat1: ");
        mat1.printMatrix();
        double[][] array = {{1, 2, 3},{1, 2, 3}};
        Matrix mat2 = new Matrix(array);
        System.out.println("mat2: ");
        mat2.printMatrix();
        System.out.println("mat1 + mat2");
        Matrix mat3 = Matrix.add(mat2, mat1);
        mat3.printMatrix();
        Matrix mat4 = new Matrix(3, 3);
        Matrix mat5 = Matrix.add(mat1, mat4);
        if(mat5 != null){
            mat5.printMatrix();
        }
        int sor = mat1.getRows();
        System.out.println("Mat1 sorainak szama: " + sor);
        int oszl = mat1.getColumns();
        System.out.println("Mat1 oszlopainak szama: " + oszl);
        Matrix mat6 = new Matrix(3, 3);
        mat6.fillRandom(1, 10);
        mat6.printMatrix();
        //Matrix.multiply(mat1, mat2).printMatrix();
    }
}
