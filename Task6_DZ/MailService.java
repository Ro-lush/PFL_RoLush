package Task6_DZ;


import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<NamePer<T>> {


    Map<String, List<T>> tListMap = new HashMap<>();


    public Map<String, List<T>> getMailBox() {
       return tListMap;
    }


    @Override
    public void accept(NamePer<T> tNamePer) {
        List<T> tList = new ArrayList<>();
        tList.add(tNamePer.getContent());
        if (tListMap.containsKey(tNamePer.getTo())){
           String str = tListMap.get(tNamePer.getTo()).toString().replace("[","")
                   .replace("]", "\"")+","+"\""+tNamePer.getContent();

           List<T> doubleList = new ArrayList<>();
           doubleList.add((T) str);
            tListMap.put(tNamePer.getTo(), doubleList);

        } else {
            tListMap.put(tNamePer.getTo(),tList);
        }

    }
}