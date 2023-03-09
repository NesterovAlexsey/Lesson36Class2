public class Soda {

  private String addition;

  public Soda(String addition) { //this is constructor!
    this.addition = addition;
  }

  public void printInfo() {
    System.out.println(addition);
  }

  public String getMyDrinkString() {
    if (addition.isEmpty()) {
      return "Обычная газировка";
    }
    return "Газировка и " + addition;
  }

  public String getAddition(){
    return addition;
  }
}
