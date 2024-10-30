import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Колекція чисел
        List<Integer> numberList = new ArrayList<>(Arrays.asList(3, 14, 15, 92, 6));
        System.out.println("Колекція чисел: " + numberList);

        // Колекція рядків (ім'я, прізвище, по батькові)
        List<String> nameList = new ArrayList<>(Arrays.asList("Іван", "Лейдичев", "В'ячеславович"));
        System.out.println("Колекція рядків (ім'я, прізвище, по батькові): " + nameList);

        // Сет для унікальних елементів
        Set<Integer> uniqueSet = new HashSet<>(Arrays.asList(3, 14, 15, 92, 6, 14, 15));
        System.out.println("Унікальні елементи в сеті: " + uniqueSet);

        // Мапа міст України з телефонними кодами
        Map<String, String> cityCodes = new HashMap<>();
        cityCodes.put("Київ", "044");
        cityCodes.put("Харків", "057");
        cityCodes.put("Львів", "032");
        cityCodes.put("Одеса", "048");
        System.out.println("Міста України та їх телефонні коди: " + cityCodes);
    }
}
