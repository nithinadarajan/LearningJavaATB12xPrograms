package test_5th_July_WrapperClass;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		 // Autoboxing: converting int to Integer automatically
        int num = 100;
        Integer boxedNum = num;  // int -> Integer (autoboxing)
        System.out.println("Autoboxed Integer: " + boxedNum);

        // Unboxing: converting Integer to int automatically
        Integer anotherBoxed = Integer.valueOf(200);
        int unboxedNum = anotherBoxed;  // Integer -> int (unboxing)
        System.out.println("Unboxed int: " + unboxedNum);

	}

}
