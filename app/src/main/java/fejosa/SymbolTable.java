package fejosa;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    // associa nome ao objeto do tipo Symbol
    Map<String, Symbol> symbols = new HashMap<>();

    // add novos simbolos a tabela
    void define(String name, String type) {
        symbols.put(name, new Symbol(name, type));
    }

    Symbol resolve(String name) {
        return symbols.get(name);
    }


}
