import java.util.ArrayList;
import java.util.Scanner;

public class Lottery
{
    private ArrayList<Integer> randomNumbers;
    private ArrayList<Integer> userNumbers;
    private ArrayList<Integer> hitNumbers;

    /**
     * @param amount defines how many numbers will be inserted into ArrayList
     * @param distinct defines if numbers will be distinct
     * @return ArrayList of random Integers
     */
    private void randomNumbers(int amount)
    {
        randomNumbers = new ArrayList<>();

        for (int i = 0; i < amount; i++)
        {
            int newInt;
            do {
                newInt = (int)(Math.random() * 100);
            }
            while (randomNumbers.contains(newInt));
            randomNumbers.add( newInt );
        }
    }

    private void enterNumbersFromInput(int amount)
    {
        Scanner keyboard = new Scanner(System.in);
        userNumbers = new ArrayList<>();

        for (int i = 0; i < amount; i++)
        {
            userNumbers.add(keyboard.nextInt());
        }
    }

    private void checkForHitNumbers()
    {
        hitNumbers = new ArrayList<>();
        for (int randomNumber : randomNumbers)
        {
            if (userNumbers.contains(randomNumber))
            {
                hitNumbers.add(randomNumber);
            }
        }
    }

    private void printIterable(Iterable container)
    {
        for (var item : container) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    public void play()
    {
        randomNumbers(6);
        System.out.println("Wprowadź 6 liczb:");
        enterNumbersFromInput(6);

        checkForHitNumbers();

        if (hitNumbers.size() > 0) {
            System.out.println("Trafione:");
            printIterable(hitNumbers);
        }

        System.out.println("Liczby to:");
        printIterable(randomNumbers);
    }
}
