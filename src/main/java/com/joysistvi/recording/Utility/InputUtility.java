package com.joysistvi.recording.Utility;

import java.util.Scanner;

public final class InputUtility {

    private InputUtility() {
    }

    public static int readInt(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input.trim());
            } catch (RuntimeException e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }

    public static int readOptionalInt(Scanner scanner, int currentValue) {
        while (true) {
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                return currentValue;
            }

            try {
                return Integer.parseInt(input.trim());
            } catch (RuntimeException e) {
                System.out.print("Please enter a valid number or press Enter to keep the current: ");
            }
        }
    }
}
