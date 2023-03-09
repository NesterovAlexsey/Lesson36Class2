public class Soda {

  private String addition;

  public Soda(String addition) { //this is constructor!
    this.addition = addition;
  }

  public String getMyDrinkString() {
    if (addition.isEmpty()) {
      return "Обычная газировка";
    }
    return "Газировка и " + addition;
  }
}
