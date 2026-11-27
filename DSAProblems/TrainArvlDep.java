package DSAProblems;

import java.util.Arrays;

public class TrainArvlDep
{
    public static int minimumPlatformRequired(int[] arrival, int[] depart)
    {
        int maxPlatformOccupiedSofar = 0;
        int currentPlatformOccupiedCount = 0;

        Arrays.sort(arrival);
        Arrays.sort(depart);

        for(int i = 0; i < arrival.length; i++)
        {
            System.out.println(arrival[i] +" - is arriving train time.  "+depart[i]+" - departing train time.");         
        }

        int arrivalIndex = 0;
        int departeIndex = 0;

        while(arrivalIndex < arrival.length)
        {
            if(arrival[arrivalIndex] <= depart[departeIndex])
            {
                currentPlatformOccupiedCount++;
                maxPlatformOccupiedSofar = Math.max(currentPlatformOccupiedCount, maxPlatformOccupiedSofar);
                arrivalIndex++;
            }
            else
            {
                currentPlatformOccupiedCount--;
                departeIndex++;
            }
        }


        
        return maxPlatformOccupiedSofar;
    }

    public static void main(String[] args) 
    {
        int[] arrival = {1030, 1050, 1035, 1050, 1037};
        int[] depart = {1045, 1055, 1040, 1110, 1058};


        int minPlatformCount = minimumPlatformRequired(arrival, depart);
        System.out.println("minimum number of platform required is - "+minPlatformCount);
    }
    
}



















/*
for(int i = 1; i < arrival.length; i++)
        {
            maxcountSofar = currentCount;
            for(int j = 0; j < depart.length; j++)
            {
                if(arrival[i] < depart[j])
                {
                    currentCount++;
                }
                else
                {
                    currentCount--;
                }
            }
            if(currentCount > maxcountSofar)
                {
                    maxcountSofar = currentCount;
                }
        } */