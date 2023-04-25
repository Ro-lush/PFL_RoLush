package Task2;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int stringLength;

    public TooLongTextAnalyzer(int stringLength) {
        this.stringLength = stringLength;
    }

    @Override
    public Label processText(String text) {
        if(text.length()>stringLength){
            return Label.TOO_LONG;
        } else return Label.OK;
    }
}
