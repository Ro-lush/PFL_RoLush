package homework.Task2;

public abstract class AbstractKeywordAnalyzer implements TextAnalyzer {
    public abstract String[] getKeywords();
    public abstract Label getLabel();

    @Override
    public Label processText(String text) {
        String[] key = getKeywords();
        for (int i = 0; i < key.length; i++) {
            if (text.contains(key[i])){
                return getLabel();
            }
        }
        return Label.OK;
    }
}
