import java.util.ArrayList;
import java.util.Scanner;

interface saveable {
    void getValue();

    ArrayList<String> setValue();
}

public class dummyclass implements saveable {

    ArrayList<String> values = new ArrayList<String>();
    ArrayList<String> values1 = new ArrayList<String>();
    String stringInput;

    void save1(ArrayList<String> values) {
        values1.addAll(values);
    }

    public static void main(String[] args) {
        dummyclass dummyclass = new dummyclass();
        dummyclass.save1(dummyclass.setValue());
        dummyclass.getValue();


    }

    @Override
    public void getValue() {
        if (values1.size() != 0)
            System.out.println("Inserted values : " + values1);
        else
            System.out.println("no values are inserted");
    }

    @Override
    public ArrayList<String> setValue() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    @Override
    public String toString() {
        return stringInput;
    }
}
