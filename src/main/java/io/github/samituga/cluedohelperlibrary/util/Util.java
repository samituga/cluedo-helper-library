package io.github.samituga.cluedohelperlibrary.util;

import java.util.List;
import java.util.function.Predicate;

public class Util {

    public static <T> T getOrElseNull(List<T> list, Predicate<T> p) {
        return list.stream()
              .filter(p)
              .findFirst()
              .orElse(null);
    }

}
