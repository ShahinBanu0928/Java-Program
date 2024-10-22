public class Method12 {
    //without arguments without return type
    static void myMethod1(){
        System.out.println("Hi,Welcome to credo systemz!!!");
    }

    //with arguments without return type
    static void myMethod2(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        //call first method
        Method12.myMethod1();
        //call second method
        Method12.myMethod2("How are you?");
    }
}
