package Lexer.SimpleToken;

/**
 * Created by kristi on 09.10.16.
 */
public class KeywordToken implements Yytoken {
    private String kw;
    private int ln;
    private int indexBegin;
    private int indexEnd;
    public KeywordToken(String kw, int line, int charBegin, int charEnd)
    {
        this.kw = kw;
        this.ln = line;
        this.indexBegin = charBegin;
        this.indexEnd = charEnd;
    }
    @Override
    public String toString()
    {
        return "KW_"+kw.substring(0, 1).toUpperCase() + kw.substring(1)+"(" + ln + ";"+ indexBegin + ";" + indexEnd +");";
    }

    public String getKw() {
        return kw;
    }

    public void setKw(String kw) {
        this.kw = kw;
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
