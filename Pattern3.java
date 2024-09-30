public class Pattern3 {
    public static void main(String[] args) {
// 9 9 9 9 9 9
// 9 9 9 9 9 9
// 9 9 9 9 9 9
// 9 9 9 9 9 9
// 9 9 9 9 9 9
        int k=9;
        for(int i=1;i<=5;i++){
            for(int j=1; j<=5; j++)
            {
                System.out.print(k+" ");
            }
            System.out.println(k+"");
        }
    }
    
}
