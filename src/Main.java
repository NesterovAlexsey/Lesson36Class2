//Задача 1
// Создайте класс Soda (для определения типа газированной воды).

// У класса должен быть конструктор, принимающий 1 аргумент при инициализации - строку добавка
// (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
//
// В этом классе реализуйте метод public String GetMyDrinkString(),
// возвращающий строку Газировка и {добавка} в случае наличия добавки.
//
// Если добавки нет, нужно вернуть строку "Обычная газировка".

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    String additionalTaste = read.readLine();

    Soda myBestDrink = new Soda("Raspberry");
    Soda test = new Soda(additionalTaste);

    System.out.println(myBestDrink.getMyDrinkString());
    System.out.println(test.getMyDrinkString());
  }
}
