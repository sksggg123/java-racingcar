package edu.nextstep.stepone;

import java.util.Arrays;
import java.util.List;

/**
 * author       : gwonbyeong-yun <sksggg123>
 * ------------------------------------------
 * | email        : sksggg123               |
 * | github       : github.com/sksggg123    |
 * | blog         : sksggg123.github.io     |
 * ------------------------------------------
 * project      : java-racingcar
 * create date  : 2019-06-14 15:09
 */
public class Validation {
    private String SEPARATOR_SPLIT = " ";

    /*
    null & " " 데이터 체크
     */
    public boolean isBlank(String inputData) {
        if(inputData.trim().equals("") || inputData == null) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    /*
    사용자가 입력한 문자열(숫자 + 연산자)를 List에 저장
     */
    public List<String> splitSpace(String inputData) {
        String[] tempArray = inputData.split(SEPARATOR_SPLIT);
        List<String> tempList = Arrays.asList(tempArray);

        return tempList;
    }

    /*
    문자 -> 숫자 변환
     */
    public int convertInt(String letter) {
        try {
            return Integer.parseInt(letter);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }


}
