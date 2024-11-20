package calcApp;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int result;
    private ArrayList<Integer> results = new ArrayList<>();

    public void addResult(int result) { // 연산 결과를 저장함
        this.results.add(result);
    }

//    public void removeResult(int index) {
//        this.results.remove(index);
//    }

    public ArrayList<Integer> getResults() {
        return results;
    }

    public int Operator(int num1, int num2, char operator) {
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
            return result;
    }

}
