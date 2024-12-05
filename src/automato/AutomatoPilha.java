package automato;

import java.util.Stack;

public class AutomatoPilha {
    public String pertenceLinguagem(String cadeia) {

        Stack<Character> pilha = new Stack<>();

        if (cadeia.isEmpty()) {
            return "A cadeia (" + cadeia + ") nao pertence a L = {0^n1 ^n | n >= 0}";
        }

        boolean zeros = false;

        for (int i = 0; i < cadeia.length(); i++) {
            if (cadeia.charAt(i) == '0' && !zeros) {
                pilha.push('0');
            } else if (cadeia.charAt(i) == '1') {
                zeros = true;
                if (pilha.isEmpty()) {
                    return "A cadeia(" + cadeia + ") nao pertence a L = {0^n1 ^n | n >= 0}";
                }
                pilha.pop();
            }else {
                return "A cadeia(" + cadeia + ") nao pertence a L = {0^n1 ^n | n >= 0}";
            }
        }

        return "A cadeia (" + cadeia + ") nao pertence a L = {0^n1 ^n | n >= 0}";
    }

}