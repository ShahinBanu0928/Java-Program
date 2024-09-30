class day1{
    public static void main(String[] args) {
        System.out.println("Hello Java World");
// non-primitive data types check
        char check = 'A';
        System.out.println(check);
        byte bi = 125;
        System.out.println(bi);
        short sh = 32767;
        System.out.println(sh);
        int in= 2147483647;
        System.out.println(in);
        long ln = 9223372036823866666L ;
        System.out.println(ln);
        float fl= 90.5f;
        System.out.println(fl);
        double dou = 86.7;
        System.out.println(dou);
        Boolean bool = true;
        System.out.println(bool);
// create variables in different data types
        int items= 50;
        float costPerItems = 9.99f;
        float total = items*costPerItems;
        char currency = '$';

        System.out.print("Items: " + items);
        System.out.println("Cost Per Item: "+ costPerItems+ currency);
        System.out.println("Total cost " + total+ currency);

        // set the maximum possible score 500 in game

        int maximumScore = 500;
        int userScore = 423;
        double percentage = (double)userScore/maximumScore *100;
        System.out.println("Percentage: " + percentage); 
        }
}