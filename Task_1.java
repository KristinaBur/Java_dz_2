// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”


// public String findJewelsInStones(String jewels, String stones) {

// return "";

public class Task_1 {
    public static void main(String[] args) {
        String s1 = "aB";
        char [] array = s1.toCharArray();
        String s2 = "aaaAbbbB";
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == array[0]) {
                count1++;
            }
            if (s2.charAt(i) == array[1]) {
                count2++;
            }
        }
        System.out.printf("%c%d%c%d",array[0],count1,array[1],count2);

    }
}