import ch3.*;
import ch8.ComboLock;
import ch9.clocks.Clock;
import ch9.clocks.WorldClock;
import ch9.chess.Bishop;
import ch9.chess.Knight;
import ch9.chess.Rook;
import ch9.workers.Employee;
import ch9.workers.HourlyEmployee;
import ch9.workers.Manager;
import ch9.workers.SalariedEmployee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CashRegister register = new CashRegister(7.5);
        register.recordPurchase(29.50);
        register.recordPurchase(9.25);
        register.receivePayment(50);
        double change = register.giveChange();
        System.out.println("Сдача: " + change);

        System.out.println("================================");

        Sheet sheet = new Sheet();
        System.out.println(sheet.getName());
        System.out.println(sheet.getWeight());
        System.out.println(sheet.getHeight());
        sheet.cutInHalf();
        System.out.println(sheet.getName());
        System.out.println(sheet.getWeight());
        System.out.println(sheet.getHeight());

        System.out.println("================================");

        Person person1 = new Person("Майк");
        Person person2 = new Person("Джек");
        Person person3 = new Person("Стив");

        person1.befriend(person2);
        person1.befriend(person3);

        System.out.println(person1.getFriendNames());
        System.out.println(person1.getFriendCount());
        person1.unfriend(person2);
        System.out.println(person1.getFriendNames());
        System.out.println(person1.getFriendCount());

        System.out.println("================================");

        Student student = new Student("Алексей");
        student.addQuiz(28);
        student.addQuiz(40);
        student.addQuiz(16);
        System.out.println(student.getTotalScore());
        System.out.println(student.getAverageScore());

        System.out.println("================================");

        Battery battery = new Battery(4500);
        battery.drain(1500);
        System.out.println(battery.getRemainingCapacity());
        battery.charge();
        System.out.println(battery.getRemainingCapacity());

        System.out.println("================================");

        ComboLock lock = new ComboLock(5, 15, 32);
        lock.turnRight(5);
        lock.turnLeft(29);
        lock.turnRight(17);
        if (lock.open()) {
            System.out.println("Замок открыт");
        } else {
            System.out.println("Замок не открылся");
        }

        System.out.println("================================");

        Employee[] staff = new Employee[3];
        staff[0] = new HourlyEmployee("Morgan, Harry", 30);
        staff[1] = new SalariedEmployee("Lin, Sally", 52000);
        staff[2] = new Manager("Smith, Mary", 104000, 50);
        Scanner in = new Scanner(System.in);
        for (Employee e : staff)
        {
            System.out.print("Hours worked by " + e.getName() + ": ");
            int hours = in.nextInt();
            System.out.println("Salary: " + e.weeklyPay(hours));
        }

        System.out.println("================================");

        Bishop bishop = new Bishop();
        bishop.setPosition("C4");
        System.out.println(bishop.canMoveTo());

        Knight knight = new Knight();
        knight.setPosition("E4");
        System.out.println(knight.canMoveTo());
        Rook rook = new Rook();
        rook.setPosition("E4");
        System.out.println(rook.canMoveTo());

        System.out.println("================================");

        Clock clock = new Clock();
        clock.setAlarm(12, 0);
        System.out.println(clock.getTime());
        WorldClock wclock = new WorldClock(2);
        wclock.setAlarm(17, 0);
        System.out.println(wclock.getTime());
    }
}
