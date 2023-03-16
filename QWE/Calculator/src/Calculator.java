import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Доброго времени суток! Введите выражение.");
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));
    }
            public static String calc(String input) {

                String result = "";
                String operator;
                if (input.contains("+")) {
                    operator = "+";
                } else if (input.contains("-")) {
                    operator = "-";
                } else if (input.contains("*")) {
                    operator = "*";
                } else if (input.contains("/")) {
                    operator = "/";
                } else {
                    throw new RuntimeException("Вы ввели недопустимый знак операции.");
                }

                StringBuilder builder = new StringBuilder(input.replaceAll(" ", ""));
                String leftSide = builder.substring(0, builder.indexOf(operator));
                String rightSide = builder.substring(builder.indexOf(operator) + 1, builder.length());

                String numberSystem;
                if (leftSide.chars().allMatch(Character::isLetter) && rightSide.chars().allMatch(Character::isLetter)) {
                    numberSystem = "roman";
                } else if (leftSide.chars().allMatch(Character::isDigit) && rightSide.chars().allMatch(Character::isDigit)) {
                    numberSystem = "arabian";
                } else {
                    throw new RuntimeException("Некорректный ввод.");
                }

                switch (numberSystem) {
                    case ("arabian") -> result = new ArabianCalc().arabianCalc(Integer.parseInt(leftSide),
                            Integer.parseInt(rightSide), operator);
                    case ("roman") -> result = new RomanCalc().romanCalc(leftSide, rightSide, operator);
                }
                return result;

        }
        }
