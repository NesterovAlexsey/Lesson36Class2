public class Soda {

  private String addition;

  public Soda(String addition) { //this is constructor!
    this.addition = addition;
  }

  public void printInfo() {
    System.out.println(addition);
  }

  public String getMyDrinkString() {
    return "Газировка и " + addition;
  }

  public String getAddition(){
    return addition;
  }
}
