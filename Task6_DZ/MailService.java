package Task6_DZ;


import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<NamePer<T>> {
    Map<String, List<T>> tListMap = new Map<>();
    public Map<String, List<T>> getMailBox() {
        return tListMap;
    }

    @Override
    public void accept(NamePer<T> tNamePer) {
        if (tListMap.containsKey(tNamePer.getTo())) {

            List<T> tList = tListMap.get(tNamePer.getTo());
            tList.add(tNamePer.getContent());
            tListMap.put(tNamePer.getTo(), tList);


        } else {
            List<T> tList = new ArrayList<>();
            tList.add(tNamePer.getContent());
            tListMap.put(tNamePer.getTo(), tList);
        }
    }

    private static class Map<M, T> extends HashMap<M, T> {
        public T get(Object key) {
            T temp = super.get(key);
            if (temp == null) temp = (T) Collections.emptyList();
            return temp;
        }

    }
}