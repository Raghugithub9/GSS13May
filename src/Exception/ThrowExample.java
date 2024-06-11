package Exception;

public class ThrowExample {

public static void ExampleThrow() {
    throw new ArithmeticException("Trying to divide by 0");
  }

  public static void main(String[] args) {
	  ExampleThrow();
  }
}

