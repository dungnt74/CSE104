package Lab4;

import java.util.Scanner;

public class EISALARY2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        double TotalOfOfficeHours = 0d, TotalOfOvertime = 0d;
        double TotalOfOfficeHourlySalary = 0d, TotalOfOvertimeSalary = 0d;

        for (int i = 0; i < n; i++) {
            double OfficeTime = 0;
            double Overtime = 0;
            double OfficeSalary = 0, OvertimeSalary = 0;

            for (int j = 0; j < 5; j++) {
                double day = sc.nextDouble();
                if (day > 8.0) {
                    OfficeTime += 8.0;
                    Overtime += day - 8.0;
                } else
                    OfficeTime += day;
            }
            double HourlyWage = sc.nextDouble();

            OfficeSalary = OfficeTime * HourlyWage;
            OvertimeSalary = Overtime * 1.5 * HourlyWage;

            TotalOfOfficeHours += OfficeTime;
            TotalOfOvertime += Overtime;
            TotalOfOfficeHourlySalary += OfficeSalary;
            TotalOfOvertimeSalary += OvertimeSalary;

            System.out.printf("%.2f\n", (OfficeSalary + OvertimeSalary));

        }
        double answer = Math.round((TotalOfOfficeHourlySalary / TotalOfOfficeHours) * 100) / 100d;
        double answer2 = Math.round((TotalOfOvertimeSalary / TotalOfOvertime) * 100) / 100d;

        System.out.printf("%.2f\n", answer);
        System.out.printf("%.2f\n", answer2);
    }
}

