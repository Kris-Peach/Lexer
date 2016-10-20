package Lexer.SimpleToken;

/**
 * Created by kristi on 09.10.16.
 */
public class NumToken implements Yytoken{
    private String num;
    private int ln;
    private int indexBegin;
    private int indexEnd;
    public NumToken(String num, int ln, int inBegin, int inEnd)
    {
        this.num = num;
        this.ln = ln;
        this.indexBegin = inBegin;
        this.indexEnd = inEnd;
    }
    @Override
    public String toString()
    {
        return "Num(" + num + ";" + ln + ";"+ indexBegin + ";" + indexEnd +");";
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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
