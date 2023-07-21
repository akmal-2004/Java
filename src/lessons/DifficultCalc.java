package lessons;

import java.util.Scanner;
import static java.lang.System.exit;

class DifficultCalc{
    public static int calc(int a, char operator, int b){
        if (operator == '+') return (a + b);
        else if (operator == '-') return (a - b);
        else if (operator == '*') return (a * b);
        else return (a / b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] variableValues = new int[26];
        char[] variableNames = new char[26];
        System.out.println("# out <operation>        => print output");
        System.out.println("# int <any letter>       => declare a variable");
        System.out.println("# <variable> <operation> => enter a value to variable");
        while (true){
            System.out.print("#-> ");
            String cmd = sc.next();

            // declaration of variable
            if (cmd.equalsIgnoreCase("int")){
                String variableName = sc.next();
                if (variableName.charAt(0) >= 'a' && variableName.charAt(0) <= 'z' && variableName.length() == 1){
                    variableNames[variableName.charAt(0) - 'a'] = variableName.charAt(0);
                }
                else System.out.println("# !> invalid declaration of the variable \"" + variableName + "\"");
            }

            // entering a value to variable
            else if (cmd.length() ==  1 && cmd.charAt(0) >= 'a' && cmd.charAt(0) <= 'z'){
                char variableName = cmd.charAt(0);
                if (variableNames[variableName - 'a'] == variableName){
                    sc.next(); // reading "=" sign
                    Scanner valueForVariable = new Scanner(sc.nextLine());
                    String valueA = valueForVariable.next();
                    if (valueA.length() == 1 && valueA.charAt(0) >= 'a' && valueA.charAt(0) <= 'z'){
                        if (variableNames[valueA.charAt(0) - 'a'] != valueA.charAt(0)){
                            System.out.println("# !> variable \"" + valueA.charAt(0) + "\" doesn't exists");
                            continue;
                        }
                        variableValues[variableName - 'a'] = variableValues[valueA.charAt(0) - 'a'];
                    }
                    else variableValues[variableName - 'a'] = Integer.parseInt(valueA);
                    if (valueForVariable.hasNext()){
                        char operator = valueForVariable.next().charAt(0);
                        String valueB = valueForVariable.next();
                        if (valueB.length() == 1 && valueB.charAt(0) >= 'a' && valueB.charAt(0) <= 'z'){
                            variableValues[variableName - 'a'] = calc(variableValues[variableName - 'a'], operator, variableValues[valueB.charAt(0) - 'a']);
                        }
                        else variableValues[variableName - 'a'] = calc(variableValues[variableName - 'a'], operator, Integer.parseInt(valueB));
                    }
                }
                else System.out.println("# !> variable \"" + variableName + "\" doesn't exists");
            }

            // printing output
            else if (cmd.equalsIgnoreCase("out")){
                int res;
                Scanner valueForVariable = new Scanner(sc.nextLine());
                if (!valueForVariable.hasNext()) continue;
                String valueA = valueForVariable.next();
                if (valueA.charAt(0) >= 'a' && valueA.charAt(0) <= 'z'){
                    if (variableNames[valueA.charAt(0) - 'a'] != valueA.charAt(0) || valueA.length() != 1){
                        System.out.println("# !> variable \"" + valueA + "\" doesn't exists");
                        continue;
                    }
                    res = variableValues[valueA.charAt(0) - 'a'];
                }
                else res = Integer.parseInt(valueA);
                if (valueForVariable.hasNext()){
                    char operator = valueForVariable.next().charAt(0);
                    String valueB = valueForVariable.next();
                    if (valueB.length() == 1 && valueB.charAt(0) >= 'a' && valueB.charAt(0) <= 'z'){
                        res = calc(res, operator, variableValues[valueB.charAt(0) - 'a']);
                    }
                    else res = calc(res, operator, Integer.parseInt(valueB));
                }
                System.out.println("#=> " + res);
            }

            else if (cmd.equalsIgnoreCase("exit")) exit(0);
            else System.out.println("# !> Invalid operation!");
        }
    }
}