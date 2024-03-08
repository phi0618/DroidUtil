package com.phi.xutils.utils;

import java.util.Collection;
import java.util.Map;

public class EmptyUtils {
    private EmptyUtils() {

    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(String sc) {
        return sc == null || sc.isEmpty();
    }

    public static boolean isNotEmpty(String sc) {
        return !isEmpty(sc);
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean isBlank(String sc) {
        return sc == null || sc.trim().isEmpty();
    }

    public static boolean isNotBlank(String sc) {
        return !isBlank(sc);
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

    public static <T> boolean isEmpty(T[] arr) {
        return arr == null || arr.length == 0;
    }

    public static <T> boolean isNotEmpty(T[] arr) {
        return !isEmpty(arr);
    }


}
