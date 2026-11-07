package payrollsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new FullTimeEmployee("E001", "أحمد علي", 5000, LocalDate.of(2020, 5, 12), 1200));
        employees.add(new ContractorEmployee("E002", "سارة محمد", LocalDate.of(2022, 1, 15), 50, 160));
        employees.add(new FullTimeEmployee("E003", "خالد عبدالله", 7000, LocalDate.of(2018, 11, 1), 1500));
        employees.add(new ContractorEmployee("E004", "منى أحمد", LocalDate.of(2023, 3, 10), 40, 150));

        System.out.println("=== قائمة الموظفين قبل الفرز ===");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees);
        System.out.println("\n=== قائمة الموظفين بعد الفرز تنازلياً حسب صافي الراتب ===");
        for (Employee e : employees) {
            System.out.println(e);
        }

        employees.sort(Comparator.comparing(Employee::getJoinDate));
        System.out.println("\n=== قائمة الموظفين مرتبة حسب تاريخ الانضمام (الأقدمية) ===");
        for (Employee e : employees) {
            System.out.println(e);
        }

        double totalTax = 0;
        double totalBonus = 0;
        double performanceScoreExample = 4.5;

        for (Employee e : employees) {
            totalTax += e.calculateTax();
            totalBonus += e.calculateBonus(performanceScoreExample);
        }

        System.out.println("\n=== النتائج المالية الإجمالية ===");
        System.out.println("إجمالي الضرائب المستحقة: " + totalTax);
        System.out.println("إجمالي المكافآت الموزعة: " + totalBonus);
    }
}