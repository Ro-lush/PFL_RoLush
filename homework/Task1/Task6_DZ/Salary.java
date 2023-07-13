package homework.Task1.Task6_DZ;



public class Salary implements NamePer<Integer>{


    private String from;
    private String to;
    private int content;

    public Salary(String from, String to, int content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }


    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}
