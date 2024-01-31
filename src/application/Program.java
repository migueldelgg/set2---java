package application;

import entities.User;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<User> a = new HashSet<>();
        Set<User> b = new HashSet<>();
        Set<User> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int userId = sc.nextInt();
            a.add(new User(userId));
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int userId = sc.nextInt();
            b.add(new User(userId));
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int userId = sc.nextInt();
            c.add(new User(userId));
        }

        Set<User> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());
    }
}
