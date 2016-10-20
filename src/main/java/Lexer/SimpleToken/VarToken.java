package Lexer.SimpleToken;

/**
 * Created by kristi on 09.10.16.
 */
public class VarToken implements Yytoken {
    private String st;
    private int ln;
    private int inBegin;
    private int inEnd;

    public VarToken(String st, int ln, int inBegin, int inEnd)
    {
        this.st = st;
        this.ln = ln;
        this.inBegin = inBegin;
        this.inEnd = inEnd;
    }

    @Override
    public String toString()
    {
        return "Var(\"" + st + "\";" + ln + ";"+ inBegin + ";" + inEnd +");";
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public int getLn() {
        return ln;
    }

    public void setLn(int ln) {
        this.ln = ln;
    }

    public int getInBegin() {
        return inBegin;
    }

    public void setInBegin(int inBegin) {
        this.inBegin = inBegin;
    }

    public int getInEnd() {
        return inEnd;
    }

    public void setInEnd(int inEnd) {
        this.inEnd = inEnd;
    }
}
