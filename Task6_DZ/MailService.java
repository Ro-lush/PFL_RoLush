package Task6_DZ;


import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailMessage> {


    Map<String, List<String>> tListMap = new HashMap<>();


    public Map<String, List<String>> getMailBox() {
       return tListMap;
    }

    @Override
    public void accept(MailMessage mailMessage) {
        List<String> tList = new ArrayList<>();
        tList.add(mailMessage.getContent());
        tListMap.put(mailMessage.getTo(),tList);
    }

}