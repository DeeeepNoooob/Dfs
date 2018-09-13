package com.company;

import java.util.Scanner;

public class Main {

    public static  int dfs(int [][]G,int a,int []visited){

        a = a-1;
        visited[a]=1;
        int deep=1;
        int resDeep=1;

            for (int j=0;j<G.length;j++){
                if (G[a][j]==1&&visited[j]!=1){
                   deep = dfs(G,j+1,visited)+1;
                   if (resDeep<deep);
                   resDeep = deep;
                }
            }

        return resDeep;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入点数：");
        int n = sc.nextInt();
        System.out.print("输入边数：");
        int m = sc.nextInt();
        System.out.print("输入边：");
        System.out.println();
        int [][]G = new int[n][n];
        int []visited = new int[n];
        for (int i = 0;i<m;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            G[a][b] =1;
        }
        System.out.println("邻接矩阵为:");
        for (int i = 0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(G[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("查询的点：");
        int i = sc.nextInt();
        System.out.print("点 "+i+" 的深度为：");
        System.out.print(dfs(G,i,visited));
    }
}