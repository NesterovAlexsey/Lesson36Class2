public class Triangle {
  private int sideA;
  private int sideB;
  private int sideC;

  public Triangle(int sideA, int sideB, int sideC) {
    if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
      System.err.println("Incorrect input data, side couldn't be <= 0");
    }
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }
}
