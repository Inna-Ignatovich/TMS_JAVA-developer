package Lesson16;
import java.util.*;
/**
 * @author Inna Ignatovich
 * @Date 02.05.2026
 */
public class StarTask {
//    Задача *:
//    Задана строка, которая может иметь внутри себя скобки. Скобкой считается
//    любой из следующих символов — «(«, «)», «[«, «]», «{«, «}». Проверить
//    сбалансированность расстановки скобок в этой строке. Набор скобок считается
//    сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
//    соответствующей закрывающей скобки ")", "]" и "} ", соответственно. Строка,
//    содержащая пары скобок, не сбалансирована, если набор заключенных в нее
//    скобок не совпадает.
    public static void main(String[] args) {
        System.out.println(isBalanced("[{(x-1)*((y-2x) = z}]"));
    }

    public static boolean isBalanced(String input) {
        ArrayDeque<Character> bracketsStack = new ArrayDeque<>();
        for(char c : input.toCharArray()) {
            if(isClosingBracket(c)) {
                if(bracketsStack.isEmpty()) return false;
                if(isPair(bracketsStack.peek(), c)) {
                    bracketsStack.pop();
                    continue;
                } else return false;
            }
            if(isOpeningBracket(c)) bracketsStack.push(c);
        }
        return bracketsStack.isEmpty();
    }

    public static boolean isPair(char openBracket, char closeBracket) {
        return openBracket == '(' && closeBracket == ')' || openBracket == '{' && closeBracket == '}'
                || openBracket == '[' && closeBracket == ']';
    }

    public static boolean isClosingBracket(char bracket) {
        return (bracket == ')' || bracket == '}' || bracket == ']');
    }
    public static boolean isOpeningBracket(char bracket) {
        return (bracket == '(' || bracket == '{' || bracket == '[');
    }
}
