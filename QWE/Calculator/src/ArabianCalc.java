public class ArabianCalc {
    public String arabianCalc(int leftSide, int rightSide, String operator) {
        String result = "";
        if (leftSide > 10 || rightSide > 10
                || leftSide < 1 || rightSide < 1) {
            throw new RuntimeException("Выход за рамки чисел");
        }

        switch (operator) {
            case ("+") -> result = String.valueOf(leftSide + rightSide);
            case ("-") -> result = String.valueOf(leftSide - rightSide);
            case ("*") -> result = String.valueOf(leftSide * rightSide);
            case ("/") -> result = String.valueOf(leftSide / rightSide);
        }
        return result;
    }
}
