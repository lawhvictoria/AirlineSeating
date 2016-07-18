import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class HW5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Airplane plane = new Airplane();
        
        while(true)
        {
        System.out.println("\n Please choose an option: \n"
                + "1. Add Passengers \n"
                + "2. Show Seating \n"
                + "3. Quit");
        int choice = scan.nextInt();
        
        if(choice == 1)
        {
            System.out.println("Please choose an option: \n"
                    + "1. First Class \n"
                    + "2. Economy Class ");
            int airClass = scan.nextInt();
            
            if(airClass == 1)
            {
                System.out.println("Please enter the amount of passengers. (2 maximum)");
                int passenger = scan.nextInt();
                
                if(passenger < 2)
                {
                    System.out.println("Would you prefer: \n"
                            + "1. Window Seat\n"
                            + "2. Aisle Seat");
                    int seating = scan.nextInt();
                    
                    if(seating == 1)
                    {
                        plane.addPassenger(airClass, seating);
                    }
                    else if(seating == 2)
                    {
                        plane.addPassenger(airClass, seating);
                    }
                    else
                    {
                        System.out.println("You can only choose either a window seat or an aisle seat! ");
                    }
                }
                else if(passenger == 2)
                {
                    for(int p = 0; p < 2; p++)
                    {
                        System.out.println("Would passenger " + (p+1) + " prefer: \n"
                            + "1. Window Seat\n"
                            + "2. Aisle Seat");
                        int seating = scan.nextInt();
                    
                        if(seating == 1)
                        {
                            plane.addPassenger(airClass, seating);
                        }
                        else if(seating == 2)
                        {
                            plane.addPassenger(airClass, seating);
                        }
                        else
                        {
                            System.out.println("You can only choose either a window seat or an aisle seat! ");
                        }
                    }
                }
                else
                {
                    System.out.println("You can only add 2 passengers at a time! ");
                } 
            }
            else if(airClass == 2)
            {
                System.out.println("Please enter the amount of passengers. (3 maximum)");
                int passenger = scan.nextInt();
                
                if(passenger == 1)
                {
                    System.out.println("Would you prefer: \n"
                            + "1. Window Seat \n"
                            + "2. Center Seat \n"
                            + "3. Aisle Seat");
                    int seating = scan.nextInt();
                    
                    if(seating == 1)
                    {
                        plane.addPassenger(airClass, seating);
                    }
                    else if(seating == 2)
                    {
                        plane.addPassenger(airClass, seating);
                    }
                    else if(seating == 3)
                    {
                        plane.addPassenger(airClass, seating);
                    }
                    else
                    {
                        System.out.println("You can only choose either a window seat, a center seat or an aisle seat! ");
                    }
                }
                else if(passenger == 2)
                {
                    for(int p = 0; p < 2; p++)
                    {
                        System.out.println("Would passenger " + (p+1) + " prefer: \n"
                            + "1. Window Seat \n"
                            + "2. Center Seat \n"
                            + "3. Aisle Seat");
                        int seating = scan.nextInt();
                    
                        if(seating == 1)
                        {
                            plane.addPassenger(airClass, seating);
                        }
                        else if(seating == 2)
                        {
                            plane.addPassenger(airClass, seating);
                        }
                        else if(seating == 3)
                        {
                            plane.addPassenger(airClass, seating);
                        }
                        else
                        {
                            System.out.println("You can only choose either a window seat, a center seat or an aisle seat! ");
                        }
                    }
                }
                else if(passenger == 3)
                {
                    for(int p = 0; p < 3; p++)
                    {
                        System.out.println("Would passenger " + (p+1) + " prefer: \n"
                            + "1. Window Seat \n"
                            + "2. Center Seat \n"
                            + "3. Aisle Seat");
                        int seating = scan.nextInt();
                    
                        if(seating == 1)
                        {
                            plane.addPassenger(airClass, seating);
                        }
                        else if(seating == 2)
                        {
                            plane.addPassenger(airClass, seating);
                        }
                        else if(seating == 3)
                        {
                            plane.addPassenger(airClass, seating);
                        }
                        else
                        {
                            System.out.println("You can only choose either a window seat, a center seat or an aisle seat! ");
                        }
                    }
                }
                else
                {
                    System.out.println("You can only add 3 passengers at a time! ");
                }    
            }
            else
            {
                System.out.println("You can only choose First class or Economy class! ");
            }
            
        }
        else if(choice == 2)
        {
            plane.showSeating();
        }

        else if(choice == 3)
        {
            System.exit(0);
        }
        
        else
        {
            System.out.println("Invalid Input... Please Try Again...");
        }
    }   
}
}
