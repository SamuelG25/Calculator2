package edu.jsu.mcis.cs408.calculator;

public class Model {
    StringBuilder stringbuilder = new StringBuilder();
    Double leftOp;
    String operand;
    Double results;

    public Model() {
    }

    public void GetProblem(String v) {
        stringbuilder.append(v);

        switch (v)
        {
            case "+":
                stringbuilder.setLength(stringbuilder.length() - 1);
                leftOp = Double.parseDouble(stringbuilder.toString());
                operand = "+";
                stringbuilder.setLength(0);
                break;

            case "×":
                stringbuilder.setLength(stringbuilder.length() - 1);
                leftOp = Double.parseDouble(stringbuilder.toString());
                operand = "×";
                stringbuilder.setLength(0);
                break;

            case "-":
                stringbuilder.setLength(stringbuilder.length() - 1);
                leftOp = Double.parseDouble(stringbuilder.toString());
                operand = "-";
                stringbuilder.setLength(0);
                break;

            case"÷":
                stringbuilder.setLength(stringbuilder.length() - 1);
                leftOp = Double.parseDouble(stringbuilder.toString());
                operand = "÷";
                stringbuilder.setLength(0);
                break;

            case "√":
                stringbuilder.setLength(stringbuilder.length() - 1);
                double s = Math.sqrt(Double.parseDouble(stringbuilder.toString()));
                stringbuilder.setLength(0);
                stringbuilder.append(s);
                break;

            case"C":
                stringbuilder.setLength(0);
                break;

            case "±":
                stringbuilder.setLength(stringbuilder.length() - 1);
                double np = Double.parseDouble(stringbuilder.toString()) * -1;
                stringbuilder.setLength(0);
                stringbuilder.append(np);
                break;


            case"=":
                switch (operand) {
                    case "+":
                        stringbuilder.setLength(stringbuilder.length() - 1);
                        results = leftOp + Double.parseDouble(stringbuilder.toString());
                        stringbuilder.setLength(0);
                        stringbuilder.append(results);
                        break;

                    case "×":
                        stringbuilder.setLength(stringbuilder.length() - 1);
                        results = leftOp * Double.parseDouble(stringbuilder.toString());
                        stringbuilder.setLength(0);
                        stringbuilder.append(results);
                        break;

                    case "-":
                        stringbuilder.setLength(stringbuilder.length() - 1);
                        results = leftOp - Double.parseDouble(stringbuilder.toString());
                        stringbuilder.setLength(0);
                        stringbuilder.append(results);
                        break;

                    case "÷":
                        stringbuilder.setLength(stringbuilder.length() - 1);
                        results = leftOp / Double.parseDouble(stringbuilder.toString());
                        stringbuilder.setLength(0);
                        stringbuilder.append(results);
                        break;
                }

        }
    }
    public String Return(){
        return stringbuilder.toString();
    }

}
