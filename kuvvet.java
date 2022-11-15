import java.util.Scanner;   
    
    public class kuvvet {
    
        public static void main(String[] args) {
            
            int n,b;
            
                Scanner inp =new Scanner(System.in);

                    System.out.print("\n4`ün kuvvetleri yazdığınız sayıya kadar alınacaktır. Sınır sayıyı giriniz :");

                        n=inp.nextInt();

                    System.out.print("\n5`in kuvvetleri yazdığınız sayıya kadar alınacaktır. Sınır sayıyı giriniz :");

                        b=inp.nextInt();
                        System.out.println("\t\t\t\t\t\t\n4`ÜN KUVVETLERİ\n\t");
                        for (int i = 1; i<=n ; i*=4) {

                            System.out.println("\n"+i+"\n");
                
            }                            System.out.println("\t\t\t\t\t\t\n5`İN KUVVETLERİ\n\t");
        for (int i = 1; i <= b; i*=5) {System.out.println("\n"+i+"\n");
            
        }}
}
