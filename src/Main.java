import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> employees1 = List.of("ichiro", "jiro", "saburo", "siro", "goro", "ichiro");

//        List<String> listA = new ArrayList<String>(Arrays.asList("s", "a", "m", "u", "r", "a", "i"));
        List<String> employees2 = employees1.stream().distinct().toList();

        System.out.println("ListA = " + employees1);
        System.out.println("ListB = " + employees2);


        List<String> sortedResult = employees2.stream().sorted().toList();
        System.out.println("昇順:" + sortedResult);

        long count = employees2.stream().filter(name -> name.startsWith("s")).count();
        System.out.println("\"s\" の個数は" + count);

        boolean hasIchiro = employees2.stream().anyMatch(name -> name.equals("ichiro"));
        System.out.println(hasIchiro);


        sortedResult.stream().map(String::toUpperCase).forEach(System.out::println);


    }
}