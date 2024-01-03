package Arrays.ArrayProject;

import java.util.Scanner;

public class WeatherCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many days?");
        double[] temperatures = insertTemperatures(s.nextInt());
        double avg = calculateAverageTemperature(temperatures);
        System.out.printf("The average temperature is: %f\n",avg);
        System.out.printf("Days above average temperature: %d\n",daysAboveAverageTemperature(temperatures,avg));

    }

    public static double[] insertTemperatures(int days){
        Scanner s = new Scanner(System.in);
        double[] temperatures = new double[days];
        for (int i = 0; i < days; i++) {
            System.out.printf("Insert mean temperature of the day %d \n", i+1);
            temperatures[i] = Double.parseDouble(s.nextLine());
        }
        s.close();
        return temperatures;
    }

    public static double calculateAverageTemperature(double[] temperatures){
        double sum=0;
        for (int i = 0; i < temperatures.length; i++)
             sum+=temperatures[i];
        return sum/(double)temperatures.length;
    }

    public static int daysAboveAverageTemperature(double[] temperatures, double averageTmp){
        int count =0;
        for (int i = 0; i <temperatures.length ; i++) {
            if(temperatures[i]>averageTmp)count++;
        }
        return count;
    }
}
