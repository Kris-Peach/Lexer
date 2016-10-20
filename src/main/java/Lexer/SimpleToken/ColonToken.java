package Lexer.SimpleToken;

/**
 * Created by kristi on 09.10.16.
 */
public class ColonToken implements Yytoken{
    private int ln;
    private int indexBegin;
    private int indexEnd;
    public ColonToken(int ln, int inBegin, int inEnd)
    {
        this.ln = ln;
        this.indexBegin = inBegin;
        this.indexEnd = inEnd;
    }

    @Override
    public String toString()
    {
        return "Colon(" + ln + ";"+ indexBegin + ";" + indexEnd +");";
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
