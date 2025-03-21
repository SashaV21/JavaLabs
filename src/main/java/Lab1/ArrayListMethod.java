package Lab1;

import java.util.Scanner;

public class ArrayListMethod {
    public static int[] addElementToEnd(int[] array, int size, int element){
        if (size >= array.length){
            int newSize = (int)(array.length * 1.5);
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = element;
        return array;
    }

    public static int[] addElementAtIndex(int[] array, int size, int element, int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        if (size >= array.length){
            int newSize = (int)(array.length * 1.5);
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        for (int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = element;
        return array;
    }

    public static int getElementAtIndex(int[] array, int size, int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return array[index];
    }

    // 4. Метод для печати массива
    public static void printArray(int[] array, int size) {
        if (size == 0) {
            System.out.println("Массив пуст.");
        } else {
            System.out.print("Текущий массив: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем массив фиксированного размера
        int[] array = new int[10];
        int size = 0;

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить элемент в конец массива");
            System.out.println("2. Добавить элемент по индексу");
            System.out.println("3. Получить элемент по индексу");
            System.out.println("4. Показать текущий массив");
            System.out.println("5. Выйти из программы");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1: // Добавление в конец
                        System.out.print("Введите элемент для добавления: ");
                        int elementToAdd = scanner.nextInt();
                        array = addElementToEnd(array, size, elementToAdd);
                        size++;
                        System.out.println("Элемент успешно добавлен.");
                        break;

                    case 2: // Добавление по индексу
                        System.out.print("Введите элемент для добавления: ");
                        int elementToInsert = scanner.nextInt();
                        System.out.print("Введите индекс: ");
                        int indexToInsert = scanner.nextInt();
                        array = addElementAtIndex(array, size, elementToInsert, indexToInsert);
                        size++;
                        System.out.println("Элемент успешно добавлен.");
                        break;

                    case 3: // Получение по индексу
                        System.out.print("Введите индекс: ");
                        int indexToGet = scanner.nextInt();
                        int element = getElementAtIndex(array, size, indexToGet);
                        System.out.println("Элемент по индексу " + indexToGet + ": " + element);
                        break;

                    case 4: // Печать массива
                        printArray(array, size);
                        break;

                    case 5: // Выход из программы
                        System.out.println("Выход из программы...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
            }
        }
    }
}



