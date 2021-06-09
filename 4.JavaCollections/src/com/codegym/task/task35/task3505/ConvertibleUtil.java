package com.codegym.task.task35.task3505;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertibleUtil {

    public static <Key, E extends Convertible<Key>> Map<Key, E> convert(List<E> list) {
        Map<Key, E> result = new HashMap();
        for(E element : list) {
            Key key = element.getKey();
            result.put(key, element);
        }
        return result;
    }
}
