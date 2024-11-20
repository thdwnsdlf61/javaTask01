package calcApp;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escape;
        boolean roop = true;
        Calculator calculator = new Calculator();

        while (roop) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            if (num2 == 0 && operator == '/' || operator == '%') {
                System.out.println("버그 발생!!!");
                while (num2 == 0) {
                    num2 = sc.nextInt();
                    System.out.println("다시 입력해라!!!!!");
                }
            }

            int result = calculator.Operator(num1, num2, operator);
            System.out.println("결과: " + result);

            calculator.addResult(result);
            ArrayList<Integer> results = calculator.getResults();
            System.out.println("저장된 리스트:" + results);

            //System.out.println(results.toString());

//            int index = sc.nextInt();
//            calculator.removeResult(index);

            System.out.println("더 계산하시겠습니까?(종료: exit 입력, 계산: 아무키 입력)");

            sc.nextLine();
            escape = sc.nextLine();

            if (!escape.equals("exit")) {
                roop = true;
            } else {
                roop = false;
            }
        }
    }
}
