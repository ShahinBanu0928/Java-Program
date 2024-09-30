public class EBbillCalculator {
    public static void main(String[] args) {
        int unitConsumed = 250;
        double billAmount = 0;
        double rate1 = 1.50; // for 100 units
        double rate2 = 2.00; // for (101 to 200 units)
        double rate3 = 3.00; // for (above 200 units)
        if (unitConsumed <= 100){
            billAmount = unitConsumed * rate1;
        }
        else if (unitConsumed <= 200){
            billAmount = (100*rate1) + ((unitConsumed - 100)*rate2);
        }
        else{
            billAmount = (100*rate1) + (100*rate2) +((unitConsumed - 200)*rate3);
        }
        System.out.println("Electricity bill Rs " + billAmount);
    }
}
