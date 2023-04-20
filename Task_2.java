// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

//public String shuffle(final String s, final int[] index){

//return "";


import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: "); 
        String S = sc.nextLine();
        System.out.println("Введите массив индексов через запятую(1, 2, 3): ");
        String num = sc.nextLine();
        sc.close();
        String StrArr[] = num.split(", ");
        int[] index = new int[StrArr.length];
        for (int i = 0; i < StrArr.length; i++) {
            index[i] = Integer.parseInt(StrArr[i]);
    }
        System.out.print(shuffle(S, index)); //shuffle перетасовка       
}

    public static String shuffle(final String S, final int[] index) {
        String result = "";
        for (int i = 0; i < index.length; i++) {
        int j = index[i];
        result += S.charAt(j - 1); //charAt возвращает символ, расположенный по указанному индексу строки
    }
        return result;
}
}
