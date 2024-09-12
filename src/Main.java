import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {


        int[] randomNumbers = new int[6];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * 100);
        }

        for (int number : randomNumbers)
        {
            System.out.print(number + ", ");
        }


        ArrayList<Integer> randomNumbersList = new ArrayList<>();

        for (int i = 0; i < 6; i++)
        {
            randomNumbersList.add( (int)(Math.random() * 100) );
        }

        System.out.println(randomNumbersList);
    }
}