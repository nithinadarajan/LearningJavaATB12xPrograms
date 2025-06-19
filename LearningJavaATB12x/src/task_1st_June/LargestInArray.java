package task_1st_June;

public class LargestInArray {

	public static void main(String[] args) {
		 int[] array = {10,20,30,40,50,60,70,80,90,100};
	     int max = array[0];
	     for(int i=0;i< array.length;i++){
	        if(array[i] > max){
	        max = array[i];
	        }
	     }
	     System.out.println("Max element is "+ max);
	       

	}

}
