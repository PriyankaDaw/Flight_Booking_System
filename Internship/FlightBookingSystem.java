package Internship;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightBookingSystem {
    public static int Ticket= 100;
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("---------------------------------------------------------------------");
        System.out.println(" ✈\uFE0F Welcome to SkyPort – Your Gateway to Hassle-Free Flight Booking! ");
        System.out.println("---------------------------------------------------------------------");
        while(true) {
            System.out.println("Please Select a option");
            System.out.println("1.Search available Flight\n2.Book your ticket\n3.Show your booking\n4.Cancel your ticket\n4.Exit");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt(); //Input from user;
            if(input == 1){               //Flight info
                System.out.println("Enter source city: ");
                String source = sc.next();
                System.out.print("Enter your Destination: ");
                String des = sc.next();
                System.out.print("Enter the Journey date: ");
                String date = sc.next();
                System.out.println(" \uD83D\uDCCD Air India\n \uD83D\uDCCD IndiGo\n \uD83D\uDCCD Vistara\n \uD83D\uDCCD Emirates\n \uD83D\uDCCD Qatar Airways");
                System.out.println("---------------------------------------------------------------------");
            }
            else if (input ==2) {            // Ticket Booking process.
                Ticket+=1;
                l.add(Ticket);
                System.out.print("Enter your name: ");
                String name = sc.next();
                System.out.print("Enter name of your flight: ");
                int flight= sc.nextInt();
                String flight_name;
                int seat;
                if(flight==1){
                    flight_name ="Air India";
                    seat = 57;
                    System.out.println("Total ammount: 2500");
                }
                else if (flight==2) {
                    flight_name = "IndiGo";
                    seat = 65;
                    System.out.println("Total ammount: 3500");
                }
                else if (flight==3) {
                    flight_name = "Vistara";
                    seat = 60;
                    System.out.println("Total ammount: 2500");
                }
                else if (flight==4) {
                    flight_name="Emirates";
                    seat = 43;
                    System.out.println("Total ammount: 5500");
                }
                else {
                    flight_name="Qatar Airways";
                    seat = 15;
                    System.out.println("Total ammount: 4500");
                }
                System.out.print("Are you confirm this details? if Yes enter 1, if No enter 0: "); //Confirm the deatils
                int C = sc.nextInt();
                if(C == 0){
                    break;
                }
                else{
                System.out.println("Transation is being process.");
                }
                System.out.println("---------------------------------------------------------------------");
                System.out.println(" Flight ticket of"+" "+flight_name+" Confirm ");
                System.out.println("------------------------------------------------");
                System.out.println("Passenger name :   "+name);
                System.out.println("Passenger Id:      "+Ticket);
                System.out.println("Seat number:       "+seat);
                System.out.println("🛫 Have a safe and pleasant journey!");
                System.out.println("---------------------------------------------------------------------");
            }
            else if (input == 3) {      //Cancel your booking process.
                System.out.println("Enter your Id: ");
                int Id = sc.nextInt();
                if (l.contains(Id)) {
                    System.out.println("  Your transation is canceled.");
                    System.out.println("---------------------------------------------------------------------");
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
            else {
                System.out.println("  Thankyou for visit \uD83D\uDE0A.");
                System.out.println("---------------------------------------------------------------------");
                break;
            }
        }
    }
}
