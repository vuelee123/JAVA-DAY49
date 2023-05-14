package OverloadingPractice;

public class CounterMain {
        public static void main(String[] args){

            Counter counter1 = new Counter(5);

            System.out.println("First count");
            System.out.println("start value: " +counter1.value());

            counter1.increase();
            System.out.println("increase value: "+counter1.value());

            counter1.decrease();
            System.out.println("decrease value: " +counter1.value());

            counter1.decrease(9);
            System.out.println("decrease by 9: " +counter1.value());

            counter1.increase(19);
            System.out.println("increase by 19: " +counter1.value());


            Counter counter2 = new Counter();
            System.out.println();
            System.out.println("Second count");

            System.out.println("start value: " +counter2.value());

            counter2.increase(20);
            System.out.println("increase by 20: " +counter2.value());

            counter2.increase(-10);
            System.out.println("increase by -10: " +counter2.value());

            counter2.decrease();
            System.out.println("decrease: " +counter2.value());

            counter2.increase();
            System.out.println("increase: " +counter2.value());

            counter2.decrease(22);
            System.out.println("decrease by 22: " +counter2.value());

            counter2.decrease(-6);
            System.out.println("decrease by -6: " +counter2.value());
        }
}
