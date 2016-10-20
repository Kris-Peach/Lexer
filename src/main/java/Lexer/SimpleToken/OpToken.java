package Lexer.SimpleToken;

/**
 * Created by kristi on 09.10.16.
 */
public class OpToken implements Yytoken {

    private String op;
    private int ln;
    private int indexBegin;
    private int indexEnd;
    public OpToken(String op, int ln, int inBegin, int inEnd)
    {
        this.op = op;
        this.ln = ln;
        this.indexBegin = inBegin;
        this.indexEnd = inEnd;
    }
    @Override
    public String toString()
    {
        return "Op"+"(" +op+";"+ ln + ";"+ indexBegin + ";" + indexEnd +");";
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
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
