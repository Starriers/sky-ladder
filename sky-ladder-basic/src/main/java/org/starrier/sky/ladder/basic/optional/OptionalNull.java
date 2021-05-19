package org.starrier.sky.ladder.basic.optional;

import org.starrier.sky.ladder.basic.entity.Student;

import java.util.Optional;

/**
 * @author starrier
 * @date 2021/3/30
 */
public class OptionalNull {

    public static void main(String[] args) {

        Student student = null;

        String optionalElse = Optional.of(student.toString()).orElse("");
        System.out.println(optionalElse);

        String optionalNullElse = Optional.ofNullable(student.toString()).orElse("");
        System.out.println(optionalNullElse);

    }
}
