package Lexer.SimpleToken;

/**
 * Created by kristi on 10.10.16.
 */
public class Semicolon implements Yytoken {
    private int ln;
    private int indexBegin;
    private int indexEnd;
    public Semicolon (int ln, int indexBegin, int indexEnd){
        this.ln = ln;
        this.indexBegin = indexBegin;
        this.indexEnd = indexEnd;
    }
    @Override
    public String toString()
    {
        return "Semiolon(" + ln + ";"+ indexBegin + ";" + indexEnd +");";
    }

    public int getLn() {
        return ln;
    }

    public void setLn(int ln) {
        this.ln = ln;
    }

    public int getIndexBegin() {
        return indexBegin;
    }

    public void setIndexBegin(int indexBegin) {
        this.indexBegin = indexBegin;
    }

    public int getIndexEnd() {
        return indexEnd;
    }

    public void setIndexEnd(int indexEnd) {
        this.indexEnd = indexEnd;
    }
}
