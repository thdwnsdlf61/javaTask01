package calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escape;

        do  {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            if (num2 == 0 && operator == '/' || operator =='%') {
                System.out.println("버그 발생!!!");
                while (num2 == 0) {
                    num2 = sc.nextInt();
                    System.out.println("다시 입력해라!!!!!");
                }
            }

            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("잘못입력되었습니다. (+, -, *, /, %)");
                    break;
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (종료: exit 입력, 계산: 아무키 입력)");
            sc.nextLine(); // 버퍼 비우기 : 이 코드가 없으면 계산 종료여부 문구가 출력 됨과 동시에 다음줄에 첫번째 숫자 입력 문구가 출력됨
            escape = sc.nextLine();
        } while (!escape.equals("exit")); // 입력된 값이 "exit"가 아닐때 반복
    }
}