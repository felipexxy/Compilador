package fejosa;

import fejosa.Token.TipoToken;

public class Jofel {
    public static void main(String[] args) {
        String teste = 
        "i32 coiso = 1234;\n"
        + "f32 coiso6 = 123.456;\n"
        + "// blablablablabla\n"
        + "string coiso2 = \"hello world\";\n"
        + "u8 coiso3 = 'a';\n"
        + "fn main() -> void {\n"
        + "    if a == 10 {\n"
        + "    } else if b == 11 {\n"
        + "    } else {\n"
        + "    }\n"
        + "for i in 0..10 {\n"
        + "}\n"
        + "struct Bunda {\n"
        + "    i32 a,\n"
        + "    u32 b,\n"
        + "}";
        Lexer lexer = new Lexer(teste);
        Token token = lexer.leToken();
        while (token.tipo != TipoToken.EOF) {
            token.imprimiToken();
            token = lexer.leToken();
        }
    }
}
