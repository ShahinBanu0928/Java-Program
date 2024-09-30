public class Bodymassindex {
    public static void main(String[] args) {
        double weight = 100; // in kg
        double height = 2.25; // in m
//Bmi calcuation 
        double bmi = weight /(height * height);
        if (bmi <18.5){
            System.out.println("Under Weight");
        }
        else if (bmi >=18.5 && bmi<25){
            System.out.println("Normal Weight");
        }
        else if (bmi >=25 && bmi <30){
            System.out.println("Over Weight");
        }
        else{
            System.out.println("Obesity");
        }
    }
    
}
