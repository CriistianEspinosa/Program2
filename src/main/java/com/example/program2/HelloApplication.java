package com.example.program2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        System.out.println("PROGRAM TO FIND PRIME NUMBERS");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int NumberOfCases = scanner.nextInt();
        scanner.close();

        System.out.println("Prime numbers up to " + NumberOfCases + ":");
        for (int i = 2; i <= NumberOfCases; i++) {
            if (IsPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean IsPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

