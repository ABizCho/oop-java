package mid_exam;

import java.util.Scanner;

public class VehicleTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the number of sears of a car: ");
        int numOfSeat = sc.nextInt();
        Car newCar = new Car()
        System.out.print("Please enter the distance traveled by car in kilometer: ");
        sc.nextInt();

        System.out.print("Please enter the time taken to travel by car in hour: ");
        sc.nextInt();

        System.out.print("****************************************************************");
        
        System.out.print("Please enter the number of wheels of a truck: ");
        sc.nextInt();

        System.out.print("Please enter the length of the 3D space carrying capacity of the truck in meter: ");
        sc.nextInt();
        System.out.print("Please enter the width of the 3D space carrying capacity of the truck in meter: ");
        sc.nextInt();
        System.out.print("Please enter the height of the 3D space carrying capacity of the truck in meter: ");
        sc.nextInt();

    }


    interface Vehicle {
        void getDescription(
        );
    }

    abstract class PassengerCarryingVehicle {
        Double travelingDistance;
        Double travelingTime;

        PassengerCarryingVehicle (Double td, Double tt) {
        }
        public Double getTravelingDistance() {
            return travelingDistance;
        }
        
        public Double getTravelingTime() {
            return travelingTime;
        }
        
        abstract Double computeSpeed();
    }

    abstract class GoodsCarryingVehicle {
        Double lengthOfCapacity;
        Double widthOfCapacity;
        Double heightOfCapacity;

        GoodsCarryingVehicle (Double loc, Double woc, Double hoc ) { 
            lengthOfCapacity = loc;
            widthOfCapacity = woc;
            heightOfCapacity = hoc;   
        }
        public Double getLengthOfCapacity() {
            return lengthOfCapacity;
        }
        
        public Double getWidthOfCapacity() {
            return widthOfCapacity;
        }

        public Double getHeightOfCapacity() {
            return heightOfCapacity;
        }
        
        abstract Double computeVolumeCapacity();

        // @Override
        // public String toString();
    }


    class Car extends PassengerCarryingVehicle implements Vehicle {

        private static int numberOfSeats;

        public Car (Double td, Double tt, int nos) { 
            super(td, tt, nos);
        }

        @Override
        public void getDescription() {
            System.out.println(""+"");
            
        }

        @Override
        public Double computeSpeed() {
            double speed = travelingDistance / travelingTime;
            return speed;
        }

        public void getNumberOfSeats() {
            System.out.println(numberOfSeats);
        }
        
    }    

    class Truck extends GoodsCarryingVehicle implements Vehicle {

        private static int numberOfWheels;

        public Truck ( Double loc, Double woc, Double hoc){
            super(loc, woc, hoc);
        }
        @Override
        Double computeVolumeCapacity() {
            Double volume = lengthOfCapacity * widthOfCapacity * heightOfCapacity;
            return volume;
        }
        @Override
        public void getDescription() {
            
        }

        public void getNumberOfWheels() {
            System.out.println(numberOfWheels);
        }
    }
}