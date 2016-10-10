package Lexer;

/**
 * Created by kristi on 09.10.16.
 */
import Lexer.SimpleToken.Yytoken;

import java.io.*;
public class Application {
    public static void main(String[] argv){
        try {
            String pp = "/home/kristi/IdeaProjects/Lexer/target/tt.txt";
            SimpleLexer lex = new SimpleLexer(new FileReader(argv[0]));
            Yytoken token;
            do {
                token = lex.yylex();
                if(token != null)
                    System.out.print(token);
                else break;
            } while(true);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
