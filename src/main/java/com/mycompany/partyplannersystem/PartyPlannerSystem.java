/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.partyplannersystem;

/**
 *
 * @author linasmacbook
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PartyPlannerSystem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\t\t\t\t\t *|* welcome To The Party Planner System *|* \t\t\t\t\n");

        Balloon[] balloon = new Balloon[1];
        Dinner[] dinner = new Dinner[1];
        Drinks[] drinks = new Drinks[1];

        //entering client's data
        System.out.println("\n************************************************ Personal Information *******************************************\n");
        //name
        System.out.print("please enter your first name: ");
        String FN = in.next();
        System.out.print("please enter your mid name: ");
        String MN = in.next();
        System.out.print("please enter your last name : ");
        String LN = in.next();
        Name name = new Name(FN, MN, LN);

        //phone number
        System.out.print("\nplease enter your phone number : ");
        long PhoneNumber = in.nextLong();

        //address
        System.out.print("\nPlease enter the name of country: ");
        String lineco = in.nextLine();
        String contry = in.nextLine();
        System.out.print("Please enter the name of city: ");
        String city = in.next();
        System.out.print("Please enter the name of district: ");
        String district = in.next();
        System.out.print("Please enter the name of street: ");
        String street = in.next();

        Address address = new Address(contry, city, district, street);

        //instanteation of client 
        Client client = new Client(name, PhoneNumber, address);

        System.out.println("\n_______________________________________________________________________________________");

        //instanteation of OrderList            
        OrderList list = new OrderList();

        System.out.println("\nHello " + FN + "!\n");

        System.out.print("What the service you want?");
        //lable
        out:

        //for loop of the main services of the program
        for (int i = 0; i < 100; i++) {
            System.out.print("\n1-Add a new order "
                    + "\n2-Display an order "
                    + "\n3-Print the Bill"
                    + "\n4-Delete an order "
                    + "\n5-Quite program\n");

            System.out.print("\nPlease put your choice here: ");
            int choice = in.nextInt();

            //if the choice is not avilabe will repet inputing new choice
            if (choice > 5 || choice < 1) {
                System.err.println("The Choice You Entered NOt Found!!\n");
                continue out;
            }
            
            //switch for the main services of the program
            switch (choice) {
                
                case 1://1-add a new order

                    System.out.println("\n************************************************ Order Information *******************************************\n");

                    //time and date (now)
                    int DayNow = LocalDate.now().getDayOfMonth();
                    int MonthNow = LocalDate.now().getMonthValue();
                    int YearNow = LocalDate.now().getYear();

                    //instanteation of the order date 
                    Date dateNow = new Date(DayNow, MonthNow, YearNow);

                    int hourNow = LocalTime.now().getHour();
                    int minuteNow = LocalTime.now().getMinute();
                    int secondNow = LocalTime.now().getSecond();

                    //instanteation of the order time
                    Time timeNow = new Time(hourNow, minuteNow, secondNow);

                    //choosing party type
                    System.out.print("How many party you want in your order?   ");
                    System.out.print("\nPlease write here: ");
                    int numOfParty = in.nextInt();

                    //inshalisatoin of the party array
                    Party[] partyList = new Party[numOfParty];

                    //instanteation of the order 
                    Order order = new Order();
                    
                    order.setClient(client);
                    order.setDateOfOrder(dateNow);
                    order.setTimeOfOrder(timeNow);
                    
                    //for loop for the partys
                    for (int h = 0; h < numOfParty; h++) {
                        
                        System.out.print("\nchose the party type number\n");
                        System.out.println("\n1-wedding party "
                                + "\n2-founding day party "
                                + "\n3-gender revell party"
                                + "\n4-birthday party"
                                + "\n5-graduation party");
                        System.out.print("\nPlease put your choice here: ");
                        int choice1 = in.nextInt();

                        System.out.println("\n************************************************ Patry Information ********************************************\n");

                        //date of the party
                        System.out.print("Enter the day of the party: ");
                        int day = in.nextInt();
                        System.out.print("Enter the month of the party: ");
                        int month = in.nextInt();
                        System.out.print("Enter the year of the party: ");
                        int year = in.nextInt();

                        //instanteation of date of party  
                        Date dateOfParty = new Date(day, month, year);

                        //calling the compare to method from the Date class
                        
                        try {
                            dateOfParty.compareTo(dateOfParty, dateNow);
                            
                        } catch (ArithmeticException e) {
                            System.out.println("\nThe Date You Entered Not Avaliable!!\n");
                            
                            System.out.println("Please enter the date again..\n");

                            System.out.print("Enter the day of the party: ");
                            int day1 = in.nextInt();
                            System.out.print("Enter the month of the party: ");
                            int month1 = in.nextInt();
                            System.out.print("Enter the year of the party: ");
                            int year1 = in.nextInt();
                            
                            Date dateOfParty1 = new Date(day1, month1, year1);
                            
                            dateOfParty = dateOfParty1;
                        }

                        System.out.print("\nPlease enter the number invitees to your party: ");
                        int numOfInvitees = in.nextInt();

                        System.out.print("\nChose the services you want in your party \n");
                        System.out.println("\n1-cake "
                                + "\n2-cake and drinks"
                                + "\n3-cake and drinks and dinner"
                                + "\n4-cake and drinks and dinner and ballons");
                        System.out.print("\nPlease put your choice here: ");
                        int choice2 = in.nextInt();

                        switch (choice2) {

                            case 4://7-cake, drinks, ballons and dinner
                                System.out.println("\n************************************************ Balloons Service *******************************************");

                                System.out.println("\nhow many color of balloon you want? ");
                                System.out.print("Please write here: ");
                                int numOfBalloon = in.nextInt();

                                //creation of balloon array
                                balloon = new Balloon[numOfBalloon];

                                //for loop of balloons
                                for (int o = 0; o < numOfBalloon; o++) {
                                    System.out.println("\nchoose number to fill the ballon  \n");
                                    System.out.println("1- ballons full of helium (10 SAR )"
                                            + "\n2- ballons with out helium (3 SAR ) ");
                                    System.out.print("\nPlease put your choice here:  ");
                                    int helium = in.nextInt();

                                    System.out.print("\nPlease Enter the color of balloon: ");
                                    String colorOfBalloon = in.next();
                                    System.out.print("How many " + colorOfBalloon + " ballons you want?");
                                    System.out.print("\nPlease write here: ");
                                    int numOfballoons = in.nextInt();

                                    //instanteation of balloon
                                    balloon[o] = new Balloon(numOfballoons, colorOfBalloon, helium);
                                }//End forloop of balloon

                            case 3://2-cake, drinks and dinner 
                                //dinner 
                                System.out.println("\n************************************************ Dinner Menu *******************************************");
                                System.out.println("\n1-appetizer (30 SAR)"
                                        + "\n2-burger (20 SAR)"
                                        + "\n3-pasta (25 SAR) "
                                        + "\n4-pizza (30 SAR)"
                                        + "\n5-salad (15 SAR)"
                                        + "\n6-meat Balls (35 SAR)"
                                        + "\n7-potato Balls (25 SAR) "
                                        + "\n8-rice (15 SAR)"
                                        + "\n9-steak (45 SAR)"
                                        + "\n10-fried Potatoes (10 SAR)");
                                System.out.println("\nHow many type of dishes you want ? ");
                                System.out.print("Please write here: ");
                                int typeOfDishes = in.nextInt();

                                //creation of dinner array
                                dinner = new Dinner[typeOfDishes];
                                //for loop of dinner
                                for (int o = 0; o < typeOfDishes; o++) {
                                    System.out.print("\nEnter the type of dish you want: ");
                                    int typeOfDish = in.nextInt();
                                    System.out.print("How many blate of this type you want: ");
                                    int numOfBlate = in.nextInt();

                                    dinner[o] = new Dinner(typeOfDish, numOfBlate);

                                }//End forloop of dinner

                            case 2:
                                //drinks
                                System.out.println("\n************************************************ Drinks Menu ********************************************");
                                System.out.print("\n1-tea (3 SAR)"
                                        + "\n2-coffee (7 SAR)"
                                        + "\n3-juice (4 SAR) "
                                        + "\n4-soft drinks (3 SAR)\n");

                                System.out.println("\nHow many type of drink you want?  ");
                                System.out.print("Please write here: ");
                                int typeOfDrinks = in.nextInt();

                                //creation of drinks array
                                drinks = new Drinks[typeOfDrinks];
                                //for loop of drinks
                                for (int o = 0; o < typeOfDrinks; o++) {
                                    System.out.print("\nPlease enter the type of drink: ");
                                    int typeOfDrink = in.nextInt();
                                    System.out.print("How many cubs of this type of drink you want: ");
                                    int numOfCubs = in.nextInt();
                                    
                                    //instanteation of drinks
                                    drinks[o] = new Drinks(typeOfDrink, numOfCubs);

                                }//End forloop of drinks

                                
                                
                                
                            case 1:
                                //cake
                                System.out.println("\n************************************************ Cake Service *********************************************\n");

                                System.out.print("chose the height of your cake \n");
                                System.out.println("\n1- 6 inchs (150 SAR)"
                                        + "\n2- 8 inchs (200 SAR)\n");
                                System.out.print("Please put your choice here: ");
                                int hight = in.nextInt();

                                System.out.print("please enter the flaver of your cake: ");
                                String flaver = in.next();
                                System.out.print("please enter the number of levels of your cake: ");
                                int numOfLevels = in.nextInt();
                                System.out.print("please enter the sentence you want to write in your cake: ");
                                String linec = in.nextLine();
                                String sentence = in.nextLine();

                                System.out.print("please enter the number of candles you want in your cake: ");
                                int NumOfCandles = in.nextInt();

                                //instanteation of cake
                                Cake cake = new Cake(hight, flaver, numOfLevels, sentence, NumOfCandles);

                                
                                //switch for the party type
                                switch (choice1) {
                                    
                                    case 1://wedding party
                                        
                                        System.out.println("\n**************************** Decoration *******************************\n");
                                        System.out.print("Enter Flowers Color to decorate the place: ");
                                        String FlowersColor = in.next();
                                        System.out.print("Enter Chairs Color: ");
                                        String ChairsColor = in.next();
                                        System.out.print("\nchoose the Flowers type you want to decorate the place \n");
                                        System.out.println("\n1-Natural Flowers (500 SAR)"
                                                + "\n2-industrial Flowers (350 SAR)");
                                        System.out.print("\nplease put the choice here: ");
                                        int Flowerstype = in.nextInt();

                                        //if statemens for the constructer type 
                                        //polymorpheisem
                                        if (choice2 == 1) {//cake only

                                            Party WeddingParty = new Wedding(FlowersColor, Flowerstype, ChairsColor, numOfInvitees, cake, dateOfParty);
                                            partyList[h] = WeddingParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            WeddingParty.musicList();

                                        } else if (choice2 == 2) {// Cake, drinks

                                            Party WeddingParty = new Wedding(FlowersColor, Flowerstype, ChairsColor, numOfInvitees, cake, drinks, dateOfParty);
                                            partyList[h] = WeddingParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            WeddingParty.musicList();

                                        } else if (choice2 == 3) {//dinner, Cake, drinks

                                            Party WeddingParty = new Wedding(FlowersColor, Flowerstype, ChairsColor, numOfInvitees, dinner, cake, drinks, dateOfParty);
                                            partyList[h] = WeddingParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            WeddingParty.musicList();

                                        } else if (choice2 == 4) {//dinner, Cake, drinks , balloon

                                            Party WeddingParty = new Wedding(FlowersColor, Flowerstype, ChairsColor, numOfInvitees, dinner, cake, drinks, balloon, dateOfParty);
                                            partyList[h] = WeddingParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be:");
                                            WeddingParty.musicList();

                                        } else {
                                            
                                            System.out.println(" ");
                                        }
                                        
                                        System.out.println("\n_______________________________________________________________________________________");
                                        
                                        break;

                                    case 2://founding day party

                                        System.out.println("\n*********************** Traditional Clothes of founding day ***********************\n");
                                        System.out.print("Enter the number Of Traditional Clothes for boys (100 SAR): ");
                                        int numOfBoys = in.nextInt();
                                        System.out.print("Enter the number Of Traditional Clothes for girls (150 SAR): ");
                                        int numOfGirls = in.nextInt();

                                        //if statemens for the constructer type 
                                        //polymorpheisem
                                        if (choice2 == 1) {//cake only

                                            Party foundingday = new FoundingDay(numOfBoys, numOfGirls, numOfInvitees, cake, dateOfParty);
                                            partyList[h] = foundingday;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            foundingday.musicList();

                                        } else if (choice2 == 2) {// Cake, drinks 

                                            Party foundingday = new FoundingDay(numOfBoys, numOfGirls, numOfInvitees, cake, drinks, dateOfParty);
                                            partyList[h] = foundingday;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            foundingday.musicList();

                                        } else if (choice2 == 3) {//dinner, Cake, drinks 

                                            Party foundingday = new FoundingDay(numOfBoys, numOfGirls, numOfInvitees, dinner, cake, drinks, dateOfParty);
                                            partyList[h] = foundingday;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            foundingday.musicList();

                                        } else if (choice2 == 4) {//dinner, Cake, drinks , balloon

                                            Party foundingday = new FoundingDay(numOfBoys, numOfGirls, numOfInvitees, dinner, cake, drinks, balloon, dateOfParty);
                                            partyList[h] = foundingday;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            foundingday.musicList();

                                        } else {
                                            
                                            System.out.println(" ");
                                        }
                                        
                                        System.out.println("\n_______________________________________________________________________________________");

                                        break;

                                    case 3://gender revell party
                                        
                                        System.out.println("\n**************************** Decoration *******************************\n");
                                        System.out.println("\nPlease chose the color that you want in your GenderRevell Party");
                                        System.out.println("\n1-bule"
                                                + "\n2-Pink");
                                        System.out.print("\nPlease put your choice here: ");
                                        int colorOfDecoration = in.nextInt();

                                        //if statemens for the constructer type 
                                        //polymorpheisem
                                        if (choice2 == 1) {//cake only

                                            Party GenderRevellParty = new GenderRevell(colorOfDecoration, numOfInvitees, cake, dateOfParty);
                                            partyList[h] = GenderRevellParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            GenderRevellParty.musicList();

                                        } else if (choice2 == 2) {//dinner, Cake, drinks 

                                            Party GenderRevellParty = new GenderRevell(colorOfDecoration, numOfInvitees, cake, drinks, dateOfParty);
                                            partyList[h] = GenderRevellParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            GenderRevellParty.musicList();

                                        } else if (choice2 == 3) {//dinner, Cake, drinks 

                                            Party GenderRevellParty = new GenderRevell(colorOfDecoration, numOfInvitees, dinner, cake, drinks, dateOfParty);
                                            partyList[h] = GenderRevellParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            GenderRevellParty.musicList();

                                        } else if (choice2 == 4) {//dinner, Cake, drinks , balloon

                                            Party GenderRevellParty = new GenderRevell(colorOfDecoration, numOfInvitees, dinner, cake, drinks, balloon, dateOfParty);
                                            partyList[h] = GenderRevellParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            GenderRevellParty.musicList();

                                        } else {
                                            
                                            System.out.println(" ");
                                        }
                                        
                                        System.out.println("\n_______________________________________________________________________________________");

                                        break;

                                    case 4://birthday party

                                        //if statemens for the constructer type 
                                        //polymorpheisem
                                        if (choice2 == 1) {//cake only

                                            Party birthdayParty = new Birthday(numOfInvitees, cake, dateOfParty);
                                            partyList[h] = birthdayParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            birthdayParty.musicList();

                                        } else if (choice2 == 2) {// Cake, drinks 

                                            Party birthdayParty = new Birthday(numOfInvitees, cake, dateOfParty);
                                            partyList[h] = birthdayParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            birthdayParty.musicList();

                                        } else if (choice2 == 3) {//dinner, Cake, drinks 

                                            Party birthdayParty = new Birthday(numOfInvitees, dinner, cake, drinks, dateOfParty);
                                            partyList[h] = birthdayParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            birthdayParty.musicList();

                                        } else if (choice2 == 4) {//dinner, Cake, drinks , balloon

                                            Party birthdayParty = new Birthday(numOfInvitees, dinner, cake, drinks, balloon, dateOfParty);
                                            partyList[h] = birthdayParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            birthdayParty.musicList();

                                        } else {
                                            
                                            System.out.println(" ");
                                        }
                                        
                                        System.out.println("\n_______________________________________________________________________________________");
                                        
                                        break;

                                    case 5://graduation party
                                        
                                        //if statemens for the constructer type 
                                        //polymorpheisem
                                        if (choice2 == 1) {//cake only

                                            Party GraduationParty = new Graduation(numOfInvitees, cake, dateOfParty);
                                            partyList[h] = GraduationParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            GraduationParty.musicList();

                                        } else if (choice2 == 3) {// Cake, drinks 

                                            Party GraduationParty = new Graduation(numOfInvitees, cake, drinks, dateOfParty);
                                            partyList[h] = GraduationParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            GraduationParty.musicList();

                                        } else if (choice2 == 3) {//dinner, Cake, drinks 

                                            Party GraduationParty = new Graduation(numOfInvitees, dinner, cake, drinks, dateOfParty);
                                            partyList[h] = GraduationParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            GraduationParty.musicList();

                                        } else if (choice2 == 4) {//dinner, Cake, drinks , balloon

                                            Graduation GraduationParty = new Graduation(numOfInvitees, dinner, cake, drinks, balloon, dateOfParty);
                                            partyList[h] = GraduationParty;

                                            System.out.println("\nwe will provide a DJ for your barty, and the songs will be: ");
                                            GraduationParty.musicList();

                                        } else {
                                            
                                            System.out.println(" ");
                                        }
                                        
                                        System.out.println("\n_______________________________________________________________________________________");
                                        
                                        break;
                                }//end the choice1 switch (switch for the party type)
                                
                                break;

                        }//end the choice2 switch(switch for the services type)

                    }//end for the for loop of the party array

                    order.setParty(partyList);

                    //calling add order method
                    list.AddOrder(order);

                    break;

                case 2://display an order
                    
                    System.out.println("\n_______________________________________________________________________________________\n");
                    System.out.print("Please enter your first name: ");
                    String FN1 = in.next();
                    System.out.print("Please enter your mid name: ");
                    String MN1 = in.next();
                    System.out.print("Please enter your last name: ");
                    String LN1 = in.next();
                    Name name1 = new Name(FN1, MN1, LN1);

                    //calling display order method
                    list.displayOrder(name1);

                    break;

                case 3://print bill
                    
                    System.out.println("\n_______________________________________________________________________________________\n");
                    System.out.print("Please enter your first name: ");
                    String FN3 = in.next();
                    System.out.print("please enter your mid name: ");
                    String MN3 = in.next();
                    System.out.print("please enter your last name: ");
                    String LN3 = in.next();
                    Name name3 = new Name(FN3, MN3, LN3);

                    //calling the print bill method
                    list.PrintBill(name3);

                    break;

                case 4://delete an order
                    
                    System.out.println("\n_______________________________________________________________________________________\n");
                    System.out.print("Please enter your first name: ");
                    String FN2 = in.next();
                    System.out.print("Please enter your mid name: ");
                    String MN2 = in.next();
                    System.out.print("Please enter your last name: ");
                    String LN2 = in.next();
                    Name name2 = new Name(FN2, MN2, LN2);

                    //calling the delet an order method
                    list.DeletOrder(name2);

                    break;

                case 5://Quite program
                    
                    System.out.println("\n_______________________________________________________________________________________");
                    System.out.println("\n\t\t\tThank you for choosing us!!");
                    System.out.println("_______________________________________________________________________________________");
                    
                    //طلعنا من البرنامج بكبرو 
                    break out;

            }//end the choice switch(switch for the main services of the programm) 

        }//end the for loop of the main services of the programm

    }//end the main method 

}//end the Party Planner System class
