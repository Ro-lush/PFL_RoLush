package Task2;

public class Main {
    public static String text = "Рекомендации:\n" +
            "Можно пока не заморачиваться с проверкой допустимых значений.\n" +
            "Посмотрите в сторону String.contains().\n" +
            "Конечно, вы можете задавать в классах любые дополнительные поля " +
            "и методы для вашего удобства. Однако, если это возможно, стоит их " +
            "помечать приватными. Вася\n";
    public static Label check(TextAnalyzer[] textAnalyzers,String s ){
        for (int i = 0; i < textAnalyzers.length; i++) {
            if(textAnalyzers[i].processText(s) != Label.OK){
                return textAnalyzers[i].processText(s);
            }
        }return Label.OK;
    }
    public static void main(String[] args) {
    NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
    SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"тут","был","Вася"});
    TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(100);

        System.out.println(check(new TextAnalyzer[]{negativeTextAnalyzer},text)+
                "\n"+check(new TextAnalyzer[]{spamAnalyzer},text)+"\n"+
                check(new TextAnalyzer[]{tooLongTextAnalyzer},text));



    }
}
