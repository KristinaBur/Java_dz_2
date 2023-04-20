import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // считываем символ перехода на новую строку

        // Ввод строк книги
        String[] book = new String[n];
        for (int i = 0; i < n; i++) {
            book[i] = scanner.nextLine();
        }

        // Ввод количества продуктов с аллергией
        int m = scanner.nextInt();
        scanner.nextLine(); // считываем символ перехода на новую строку

        // Создание массива замен продуктов
        String[] replacements = new String[m];
        for (int i = 0; i < m; i++) {
            replacements[i] = scanner.nextLine();
        }

        // Замена продуктов в книге
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String[] replacePair = replacements[j].split(" - ");
                book[i] = book[i].replaceAll(replacePair[0], replacePair[1]);
                book[i] = book[i].replaceAll(replacePair[0].toUpperCase(), replacePair[1].substring(0,1).toUpperCase() + replacePair[1].substring(1));
            }
        }

        // Вывод книги с замененными продуктами
        for (String line : book) {
            System.out.println(line);
        }
    }
}
   
