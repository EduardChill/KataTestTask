import java.util.Scanner;
        public class Calculator {


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите выражение для вычесления:");
                if (scanner.hasNextInt()) {
                    int a = scanner.nextInt();
                    String o = scanner.next();
                    int b = scanner.nextInt();
                    if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {

                        switch (o) {
                            case "+":
                                System.out.println(a + b);
                                break;
                            case "-":
                                System.out.println(a - b);
                                break;
                            case "*":
                                System.out.println(a * b);
                                break;
                            case "/":
                                System.out.println(a / b);
                                break;

                        }
                    } else System.out.println("Недопустимое значение!");
                } else {
                    int a = getArabian(scanner.next());
                    String o = scanner.next();
                    int b = getArabian(scanner.next());
                    if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
                        switch (o) {
                            case "+":
                                System.out.println(intToRoman(a + b));
                                break;
                            case "-":
                                if ((a - b) >= 1) {
                                    System.out.println(intToRoman(a - b));
                                } else System.out.println("Результат вычеслений меньше 1");
                                break;
                            case "*":
                                System.out.println(intToRoman(a * b));
                                break;
                            case "/":
                                System.out.println(intToRoman(a / b));
                                break;
                        }



            }


                    else System.out.println("Недопустимое значение!");
                }
            }




            public static int getArabian(String roman) {
                if ("I".equals(roman)) return 1;
                else if ("II".equals(roman)) return 2;
                else if ("III".equals(roman)) return 3;
                else if ("IV".equals(roman)) return 4;
                else if ("V".equals(roman)) return 5;
                else if ("VI".equals(roman)) return 6;
                else if ("VII".equals(roman)) return 7;
                else if ("VIII".equals(roman)) return 8;
                else if ("IX".equals(roman)) return 9;
                else if ("X".equals(roman)) return 10;
                return 0;
            }
            public static String intToRoman(int num)
            {
                var keys = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
                var vals = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

                StringBuilder ret = new StringBuilder();
                int ind = 0;

                while(ind < keys.length)
                {
                    while(num >= vals[ind])
                    {
                        var d = num / vals[ind];
                        num = num % vals[ind];
                        for(int i=0; i<d; i++)
                            ret.append(keys[ind]);
                    }
                    ind++;
                }

                return ret.toString();
            }
        }
