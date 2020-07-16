package com.datastructures.sparsearray;

/**
 * @author XH
 * @Package com.datastructures
 * @date 2020/7/3 15:00
 */
public class SparseArray {
    public static void main(String[] args) {
        // 创建一个原始的11*11数组
        // 0：表示没有棋子
        // 1：表示黑子
        // 2：表示蓝子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[4][5] = 1;
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        // 将二维数组转稀疏数组
        // 1.先遍历二维数组得到非0数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j <11; j++) {
                if(chessArr1[i][j] != 0){
                    ++sum;
                }
            }
        }

        // 2.创建一个稀疏数组
        int sparseArr[][] = new int[sum + 1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        // 3.遍历二维数组，将非0的值存放到稀疏数组种
        int count = 1; // count用来记录是第几个非0值
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j <11; j++) {
                if(chessArr1[i][j] != 0){
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                    ++count;
                }
            }
        }

        // 4.打印稀疏数组
        for (int[] row : sparseArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        // 将稀疏数组恢复成二维数组
        // 1.先读取稀疏数组第一行，根据第一行，创建原始的二维数组
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];

        //2.遍历稀疏数组，从第2行开始
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        // 3.打印恢复后的二维数组
        for (int[] row : chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
