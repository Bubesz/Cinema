package iit.cinema.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bubesz on 2015.10.21..
 */
public class ListUtil {

    public static <T> List<T> createListFromIterable(Iterable<T> iterable) {
        List<T> list = new ArrayList<T>();
        for (T element : iterable) {
            list.add(element);
        }
        return list;
    }
}
