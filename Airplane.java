import java.util.Arrays;

/**
 *
 * @author Victoria
 */
public class Airplane {
    
    private boolean[] firstClass;
    private boolean[] economyClass;
    private final int[] windowFirstSeat = {0, 3, 4, 7, 8, 11, 12, 15, 16, 19};
    private final int[] aisleFirstSeat = {1, 2, 5, 6, 9, 10, 13, 14, 17, 18};
    private final int[] windowEcoSeat = {0, 5, 6, 11, 12, 17, 18, 23, 24, 29, 30, 35, 36, 41, 42, 47, 48, 53, 54, 59, 60, 65, 66, 71, 72, 77, 78, 83, 84, 89};
    private final int[] centerEcoSeat = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55, 58, 61, 64, 67, 70, 73, 76, 79, 82, 85, 88};
    private final int[] aisleEcoSeat = {2, 3, 8, 9, 14, 15, 20, 21, 26, 27, 32, 33, 38, 39, 44, 45, 50, 51, 56, 57, 62, 63, 68, 69, 74, 75, 80, 81, 86, 87};
    int airClass;
    int seating;
    
    public Airplane()
    {
        firstClass = new boolean[20];
        economyClass = new boolean[90];
        this.airClass = airClass;
        this.seating = seating;
    }
    
    public void addPassenger(int airClass, int seating)
    {
        boolean success = false;
        if(airClass == 1)
        {
            if(seating == 1)
            {
                for(int i = 0; i < firstClass.length; i++)
                {
                    if(!firstClass[i] && (i == windowFirstSeat[0] || i == windowFirstSeat[1] || i == windowFirstSeat[2] || i == windowFirstSeat[3] || 
					  i == windowFirstSeat[4] || i == windowFirstSeat[5] || i == windowFirstSeat[6] || i == windowFirstSeat[7] || 
					  i == windowFirstSeat[8] || i == windowFirstSeat[9]))
                    {
                        firstClass[i] = true;


			System.out.println("Passenger successfully added to seat");
                        break;                                
                    }
                }
                if(success == false)
                {
                    System.out.println("There are no more window seats available");
                }
            }
            if(seating == 2)
            {
                for(int i = 0; i < firstClass.length; i++)
                {
                    if(!firstClass[i] && (i == aisleFirstSeat[0] || i == aisleFirstSeat[1] || i == aisleFirstSeat[2] || i == aisleFirstSeat[3] || i == aisleFirstSeat[4] || i == aisleFirstSeat[5] || i == aisleFirstSeat[6] || i == aisleFirstSeat[7] || i == aisleFirstSeat[8] || i == aisleFirstSeat[9]))
                    {
                        firstClass[i] = true;
                        success = true;
                        break;                                
                    }
                }
                if(success == false)
                {
                    System.out.println("There are no more aisle seats available");
                }
            }
        }
        if(airClass == 2)
        {
            if(seating == 1)
            {
                for(int i = 0; i < economyClass.length; i++)
                {
                    if(!economyClass[i] && (i == windowEcoSeat[0] || i == windowEcoSeat[1] || i == windowEcoSeat[2] 
                       || i == windowEcoSeat[3] || i == windowEcoSeat[4] || i == windowEcoSeat[5] || i == windowEcoSeat[6] 
                       || i == windowEcoSeat[7] || i == windowEcoSeat[8] || i == windowEcoSeat[9]
                       || i == windowEcoSeat[10] || i == windowEcoSeat[11] || i == windowEcoSeat[12] 
                       || i == windowEcoSeat[13] || i == windowEcoSeat[14] || i == windowEcoSeat[15] || i == windowEcoSeat[16] 
                       || i == windowEcoSeat[17] || i == windowEcoSeat[18] || i == windowEcoSeat[19]
                       || i == windowEcoSeat[20] || i == windowEcoSeat[21] || i == windowEcoSeat[22] 
                       || i == windowEcoSeat[23] || i == windowEcoSeat[24] || i == windowEcoSeat[25] || i == windowEcoSeat[26] 
                       || i == windowEcoSeat[27] || i == windowEcoSeat[28] || i == windowEcoSeat[29]))
                    {
                        economyClass[i] = true;
                        success = true;
                        break;                                
                    }
                }
                if(success == false)
                {
                    System.out.println("There are no more window seats available");
                }
            }
            else if(seating == 2)
            {
                for(int i = 0; i < economyClass.length; i++)
                {
                    if(!economyClass[i] && (i == centerEcoSeat[0] || i == centerEcoSeat[1] || i == centerEcoSeat[2] 
                       || i == centerEcoSeat[3] || i == centerEcoSeat[4] || i == centerEcoSeat[5] || i == centerEcoSeat[6] 
                       || i == centerEcoSeat[7] || i == centerEcoSeat[8] || i == centerEcoSeat[9]
                       || i == centerEcoSeat[10] || i == centerEcoSeat[11] || i == centerEcoSeat[12] 
                       || i == centerEcoSeat[13] || i == centerEcoSeat[14] || i == centerEcoSeat[15] || i == centerEcoSeat[16] 
                       || i == centerEcoSeat[17] || i == centerEcoSeat[18] || i == centerEcoSeat[19]
                       || i == centerEcoSeat[20] || i == centerEcoSeat[21] || i == centerEcoSeat[22] 
                       || i == centerEcoSeat[23] || i == centerEcoSeat[24] || i == centerEcoSeat[25] || i == centerEcoSeat[26] 
                       || i == centerEcoSeat[27] || i == centerEcoSeat[28] || i == centerEcoSeat[29]))
                    {
                        economyClass[i] = true;
                        success = true;
                        break;                                
                    }
                }
                if(success == false)
                {
                    System.out.println("There are no more aisle seats available");
                }
            }
            else if(seating == 3)
            {
                for(int i = 0; i < economyClass.length; i++)
                {
                    if(!economyClass[i] && (i == aisleEcoSeat[0] || i == aisleEcoSeat[1] || i == aisleEcoSeat[2] 
                       || i == aisleEcoSeat[3] || i == aisleEcoSeat[4] || i == aisleEcoSeat[5] || i == aisleEcoSeat[6] 
                       || i == aisleEcoSeat[7] || i == aisleEcoSeat[8] || i == aisleEcoSeat[9]
                       || i == aisleEcoSeat[10] || i == aisleEcoSeat[11] || i == aisleEcoSeat[12] 
                       || i == aisleEcoSeat[13] || i == aisleEcoSeat[14] || i == aisleEcoSeat[15] || i == aisleEcoSeat[16] 
                       || i == aisleEcoSeat[17] || i == aisleEcoSeat[18] || i == aisleEcoSeat[19]
                       || i == aisleEcoSeat[20] || i == aisleEcoSeat[21] || i == aisleEcoSeat[22] 
                       || i == aisleEcoSeat[23] || i == aisleEcoSeat[24] || i == aisleEcoSeat[25] || i == aisleEcoSeat[26] 
                       || i == aisleEcoSeat[27] || i == aisleEcoSeat[28] || i == aisleEcoSeat[29]))
                    {
                        economyClass[i] = true;
                        success = true;
                        break;                                
                    }
                }
                if(success == false)
                {
                    System.out.println("There are no more aisle seats available");
                }
            }
            else
            {
                System.out.println("Option does not exist. ");
            }
        }            
    }
    
    public void showSeating()
    {
        for(int i = 0; i < firstClass.length; i++)
        {
            if(i % 4 == 0)
            {
                System.out.print("\n");
            }
            if(i % 2 == 0)
            {
                System.out.print(" ");
            }
            if(firstClass[i])
            {
                System.out.print("X");
            }
            else
            {
                System.out.print("-");
            }
        }

        for(int i = 0; i < economyClass.length; i++)
        {
            if(i % 6 == 0)
            {
                System.out.print("\n");
            }
            if(i % 3 == 0)
            {
                System.out.print(" ");
            }
            if(economyClass[i])
            {
                System.out.print("X");
            }
            else
            {
                System.out.print("-");
            }
        }        
    }
    
    
}
