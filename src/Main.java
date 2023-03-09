//Задача 1
// Создайте класс Soda (для определения типа газированной воды).

// У класса должен быть конструктор, принимающий 1 аргумент при инициализации - строку добавка
// (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
//
// В этом классе реализуйте метод public String GetMyDrinkString(),
// возвращающий строку Газировка и {добавка} в случае наличия добавки.
//
// Если добавки нет, нужно вернуть строку "Обычная газировка".

public class Main {
  public static void main(String[] args) {

    Soda myBestDrink = new Soda("Raspberry");
    Soda test = new Soda("test taste");

    myBestDrink.printInfo();

    System.out.println(myBestDrink.getMyDrinkString());
    System.out.println(test.getMyDrinkString());
    System.out.println(myBestDrink.getAddition());
  }
}
