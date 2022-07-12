/*
Create an Enum.
Create another Enum with parameters.
Create a class with two fields of the first and second Enum types.
Create an object of this class and populate fields in the main method.
*/

package task6;

import java.util.Scanner;
enum Level { Elementary, PreIntermediate, Intermediate, UpperIntermediate, Advanced}

enum Language {English, Polish, Belarusian}
public class LevelLanguage {

    public static void main(String[] args) {
        // Перечисление
        // 1. Объявить переменную типа Level
        Level lv = Level.Elementary;

        // 2. Ввести номер уровня с клавиатуры
        System.out.print("level = ");
        Scanner input = new Scanner(System.in);
        int numLevel = input.nextInt();

        // 3. По номеру уров присвоить
        //   соответствующее значение экземпляру mn
        switch (numLevel) {
            case 1:
                lv = Level.Elementary;
                break;
            case 2:
                lv = Level.PreIntermediate;
                break;
            case 3:
                lv = Level.Intermediate;
                break;
            case 4:
                lv = Level.UpperIntermediate;
                break;
            case 5:
                lv = Level.Advanced;
                break;
            default:
                System.out.println("Incorrect input");
                return;
        }
        // 4. Вывести название константы, которая соответствует введенному номеру месяца
        System.out.println(lv);
    }
}

