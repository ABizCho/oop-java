package lab.lab3;

import java.util.Scanner;

public class ShopSupp {   
    // field
    private int[] idArr = {0,1,2,3,4};
    private int[] stockArr = {25,25,25,25,25};
    private int[] priceArr = {500,1000,600,1200,1500};
    private int[] minStockArr = {1,1,1,1,1};

    // sold info
    private int[] soldArr = {0,0,0,0,0};
    private int[] cumSalesArr = {0,0,0,0,0};

    public void record(int pId, int soldNum){
        soldArr[pId] += soldNum;
        cumSalesArr[pId] += soldNum * priceArr[pId];
        System.out.println("* Successfully recorded on sold-Info system: { product Id:"+ pId + " | Cumulative sales of the item :" + cumSalesArr[pId] + " }");
    }
    public void delete(int pId, int soldNum){
        if ( minStockArr[pId] <= stockArr[pId] - soldNum){
            this.record(pId, soldNum);
            stockArr[pId] -= soldNum;

            System.out.println("* Successfully subtracted:"+" { "+ "product Id: " + pId + " | sold Quantity: " + soldNum + " | current stock: " + stockArr[pId] + " } ");

        }
        else {
            System.out.println("The product is out of stock");
        }

    }
    
    public void viewUnitPrice(int pId) {
        System.out.println("Unit price: " + priceArr[pId]);
    }

    public void calculateTotalPrice() {
        int total = 0;
        for(int id: idArr)
            total += soldArr[id] * priceArr[id];

        System.out.println("-----Table of cumulative sales of items-----");
        for(int id: idArr){
            if (soldArr[id] != 0) {
                System.out.println("-item "+id+": "+cumSalesArr[id]);
            }
        }
        System.out.println("\nTotal Sales: " + total);
        System.exit(1);
    }

    public static void main(String[] args) {
        int inId;
        int inNum;
        int menuNum;

        Scanner scan = new Scanner(System.in);
        ShopSupp supporter = new ShopSupp();

        while(true) {
            System.out.println("Enter the number of menu you want\n1. Record\n2. ViewUnitPrice\n3. CalculateTotalPrice");

            
            menuNum = scan.nextInt();

            switch(menuNum) {
                case 1: 
                    System.out.println("Insert product Id: ");
                    inId = scan.nextInt();
            
                    System.out.println("Insert sold qunatity: ");
                    inNum = scan.nextInt();
                    
                    
                    supporter.delete(inId,inNum);
                    break;
                
                case 2:
                    System.out.println("Which item's price do you want to see?: ");
                    inId = scan.nextInt();
                    supporter.viewUnitPrice(inId);
                    break;

                case 3:
                    supporter.calculateTotalPrice();
                    break;
                default:
                    System.out.println("Error: Insert the right number");
                    break;

            }
            System.out.println("\n");
            
        }
        
    }
}
