import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ichiro"));
        employees.add(new Employee("jiro"));
        employees.add(new Employee("saburo"));
        employees.add(new Employee("siro"));
        employees.add(new Employee("goro"));
        employees.add(new Employee("ichiro"));


        System.out.println("重複を削除");
        List<String> employees1 = employees.stream()
                .map(Employee::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(employees1);


        System.out.println("昇順");
        List<String> sortedResult = employees1.stream().sorted().toList();
        System.out.println(sortedResult);


        long count = employees1.stream()
                .filter(name -> name.startsWith("s"))
                .count();
        System.out.println("\"s\" の個数は" + count);


        System.out.println("リストに\"ichiro\"が存在するか");
        boolean hasIchiro = employees1.stream()
                .anyMatch(name -> name.equals("ichiro"));
        System.out.println(hasIchiro);


        sortedResult.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
