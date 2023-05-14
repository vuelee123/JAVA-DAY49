package ObjectsInList;

import java.util.Scanner;
import java.util.ArrayList;
public class AnimalMain {

    public static void main (String[] args){

        ArrayList<Animal> animals = new ArrayList <> ();
        Scanner scan = new Scanner(System.in);
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        while (true){
            System.out.print("Please enter an name: ");
            String cowName = scan.nextLine();
            if (cowName.isBlank()) break;
            System.out.print("Is it a cow? Yes or no: ");
            String cowOrNot= scan.nextLine();
            if (cowOrNot.isBlank()) break;
            if( cowName.equals("") || cowOrNot.equals("" )){
                break;
            }else{
                animals.add(new Animal(cowName, cowOrNot));
            }
        }
        for (int i = 0; i < animals.size(); i ++){
            System.out.println(animals.get(i));

        }
    }
}
