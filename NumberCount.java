
public class NumberCount{
    public static void main(String[] args){

        // int[] arr = new int[10];
        // String a = " (^-^) ";
        // for (int i = 1;i<=5;i++){
        //     System.out.println(a);
        //     a = a + " (^-^) ";
        // }
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        int count6 = 0;
        int[] array1 = {2,5,6,3,2,5,6,3,2,6};
        for(int i = 0;i<=9;i++){
            if(array1[i]==2){
                count2++;
            }if(array1[i]==3){
                count3++;
            }if(array1[i]==5){
                count5++;
            }if(array1[i]==6){
                count6++;
            }
        }
        System.out.println("Number of 2 : "+count2);
        System.out.println("Number of 3 : "+count3);
        System.out.println("Number of 5 : "+count5);
        System.out.println("Number of 6 : "+count6);
        // try(Scanner sc = new Scanner(System.in)){
        //     int[] array = new int[5];
        //     for(int i = 0;i<=4;i++){
        //         array[i] = sc.nextInt();

        //     }
        // }
    }
}
