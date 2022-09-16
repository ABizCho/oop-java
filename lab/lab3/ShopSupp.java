package lab.lab3;

import java.util.Scanner;

public class ShopSupp {   
    // field
    private int[] idArr = {0,1,2,3,4};
    private int[] stockArr = {25,25,25,25,25};
    private int[] priceArr = {500,1000,600,1200,1500};
    private int[] soldArr = {0,2,3,0,0};
    private int[] minStockArr = {1,1,1,1,1};

    public void record(int pId, int soldNum){
        if ( minStockArr[pId] < stockArr[pId] - soldNum){
            soldArr[pId] += soldNum;
            stockArr[pId] -= soldNum;

            System.out.println("Successfully recorded:"+" { "+ "product Id: " + pId + " | sold Quantity: " + soldNum + " | current stock: " + stockArr[pId] + " } ");
        }
        else {
            System.out.println("There are only ( " + stockArr[pId] + " items ) you can sell");
        }
        
    }
    public void delete(){

    }
    
    public void viewUnitPrice() {
        for(int p: priceArr)
            System.out.println(p);
    }

    public void calculateTotalPrice() {
        int total = 0;
        for(int id: idArr)
            total += soldArr[id] * priceArr[id];
        System.out.println(total);
    }

    public static void main(String[] args) {
        int inId;
        int inNum;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert product Id: ");
        inId = scan.nextInt();

        System.out.println("Insert sold qunatity: ");
        inNum = scan.nextInt();
        
        ShopSupp supporter = new ShopSupp();

        supporter.record(inId,inNum);
        // supporter.viewUnitPrice();
        // supporter.calculateTotalPrice();
    }
}
