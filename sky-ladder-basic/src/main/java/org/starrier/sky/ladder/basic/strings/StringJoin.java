package org.starrier.sky.ladder.basic.strings;

import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * @author starrier
 * @date 2021/5/19
 */
public class StringJoin {

    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(";");
        IntStream.range(1,10).forEach(s->stringJoiner.add("+"));
        System.out.println(stringJoiner);
    }
}
