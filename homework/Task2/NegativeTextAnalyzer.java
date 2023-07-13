package homework.Task2;

public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer  {
    private String[] key = new String[]{":(", "=(", ":|"};



    @Override
    public String[] getKeywords() {
        return key;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
