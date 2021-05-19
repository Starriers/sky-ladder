package org.starrier.sky.ladder.basic.strings;

/**
 * @author starrier
 * @date 2021/4/30
 */
public class StringIntegerConvert {

    public static void main(String[] args) {

        String orderId = "222222     ";

        Long longOrder = Long.valueOf(orderId);

        System.out.println(longOrder);


    }
}
