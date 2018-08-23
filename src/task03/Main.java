package task03;

public class Main {
    public static void main(String[] args) {

        Integer[] f = {20, 15, 30, 10, 5, 30, 81, 3, 2, 31};
        MathBox mb = new MathBox(f);
        int div = 3;
        System.out.println("1. Отсортированный массив: "  + mb);

        System.out.println("2. Cумма всех элементов коллекции: " + mb.summator());

        System.out.println("3. Mетод splitter, возвращающий результат деления элементов коллекции на "
                            + div + " :" + mb.splitter(div));

        mb.remove(3);
        System.out.println("4. Удаление элемента коллекции '3': " + mb);


    }

}
