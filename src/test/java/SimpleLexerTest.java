/**
 * Created by kristi on 10.10.16.
 */

import Lexer.SimpleLexer;
import org.junit.Test;
import Lexer.SimpleToken.Yytoken;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SimpleLexerTest {
    private java.io.FileReader myReader;
    private SimpleLexer myLexer;

    @Test
    public void testGetToken() throws Exception {
        doTest("/home/kristi/IdeaProjects/Lexer/src/test/resourses/Test3.txt", "/home/kristi/IdeaProjects/Lexer/src/test/resourses/Res3.txt");
    }
    @Test
    public void testComments() throws Exception {
        doTest("/home/kristi/IdeaProjects/Lexer/src/test/resourses/Test2.txt", "/home/kristi/IdeaProjects/Lexer/src/test/resourses/Res2.txt");
    }
    @Test
    public void testBrackets() throws Exception {
        doTest("/home/kristi/IdeaProjects/Lexer/src/test/resourses/Test1.txt", "/home/kristi/IdeaProjects/Lexer/src/test/resourses/Res1.txt");
    }
    @Test
    public void testWhile() throws Exception {
        doTest("/home/kristi/IdeaProjects/Lexer/src/test/resourses/Test4.txt", "/home/kristi/IdeaProjects/Lexer/src/test/resourses/Res4.txt");
    }
    @Test
    public void testWhileIf() throws Exception {
        doTest("/home/kristi/IdeaProjects/Lexer/src/test/resourses/Test5.txt", "/home/kristi/IdeaProjects/Lexer/src/test/resourses/Res5.txt");
    }

    public void doTest(String text,String result) throws Exception{
        myReader = new java.io.FileReader (text);
        myLexer = new SimpleLexer(myReader);
        Yytoken token;
        String tokens = "";
        do {
            token = myLexer.yylex();
            if(token != null)
                tokens += token;
        } while(token != null);
        System.out.println(tokens);
        java.nio.file.Path path = Paths.get(result);
        String res = Files.lines(path).collect(Collectors.joining("\n"));
        assertEquals(tokens, res);
    }
}
