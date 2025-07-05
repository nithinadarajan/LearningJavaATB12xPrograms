package test_5th_July_WrapperClass;

public class Pair<T,U> {
	T first;
    U second;

   Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void printPair() {
        System.out.println("First: " + first + ", Second: " + second);
    }
	
    public static void main(String[] args) {
	Pair<String, Integer> p1 = new Pair<>("Age", 30);
	p1.printPair();

	Pair<Double, String> p2 = new Pair<>(99.9, "Score");
	p2.printPair();
	}
	}
