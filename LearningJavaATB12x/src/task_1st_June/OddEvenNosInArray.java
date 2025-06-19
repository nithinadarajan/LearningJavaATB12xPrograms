package task_1st_June;

public class OddEvenNosInArray {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        int even;
        int odd;
        System.out.println("Even numbers are : ");
        for (int i : numbers){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Odd numbers are : ");
        for (int j : numbers) {
            if (j%2!=0){
                System.out.print(j + " ");
            }
        }
}
}
