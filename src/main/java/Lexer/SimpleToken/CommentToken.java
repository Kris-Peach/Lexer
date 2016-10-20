package Lexer.SimpleToken;

/**
 * Created by kristi on 10.10.16.
 */
public class CommentToken  implements Yytoken{

    private String text;
    private int lnBegin;
    private int lnEnd;
    private int indexBegin;
    private int indexEnd;
    public CommentToken(String text, int lnBegin, int indexBegin, int lnEnd, int indexEnd)
    {
        this.text = text;
        this.lnBegin = lnBegin;
        this.indexBegin = indexBegin;
        this.lnEnd = lnEnd;
        this.indexEnd = indexEnd;
    }
    @Override
    public String toString()
    {
        return "Comment(\"" + text + "\";"+ lnBegin + ";"+ indexBegin + ";" + lnEnd +";"+ indexEnd +");";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLnBegin() {
        return lnBegin;
    }

    public void setLnBegin(int lnBegin) {
        this.lnBegin = lnBegin;
    }

    public int getLnEnd() {
        return lnEnd;
    }

    public void setLnEnd(int lnEnd) {
        this.lnEnd = lnEnd;
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
