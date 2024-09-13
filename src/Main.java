import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> randomNumbers = getRandomNumbers(6, true);
        System.out.println("Wprowadź liczby:");
        ArrayList<Integer> userNumbers = getNumbersFromInput(6);

        ArrayList<Integer> hitNumbers = new ArrayList<>();
        for (int randomNumber : randomNumbers)
        {
            if (userNumbers.contains(randomNumber))
            {
                hitNumbers.add(randomNumber);
            }
        }

        System.out.println("Liczby trafione:");
        printIterable(hitNumbers);
    }

    /**
     * @param amount defines how many numbers will be inserted into ArrayList
     * @param distinct defines if numbers will be distinct
     * @return ArrayList of random Integers
     */
    private static ArrayList<Integer> getRandomNumbers(int amount, boolean distinct)
    {
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < amount; i++)
        {
            int newInt;
            do {
                newInt = (int)(Math.random() * 100);
            }
            while (distinct && randomNumbers.contains(newInt));
            randomNumbers.add( newInt );
        }

        return randomNumbers;
    }

    private static ArrayList<Integer> getNumbersFromInput(int amount)
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> userNumbers = new ArrayList<>();

        for (int i = 0; i < amount; i++)
        {
            userNumbers.add(keyboard.nextInt());
        }

        return userNumbers;
    }

    private static void printIterable(Iterable container)
    {
        for (var item : container) {
            System.out.print(item + ", ");
        }
    }

}