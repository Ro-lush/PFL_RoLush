package homework.Task2;

public class SpamAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer{

   private String[] strings;

    public SpamAnalyzer(String[] strings) {
        this.strings = strings;
    }



    @Override
    public String[] getKeywords() {
        return strings;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
