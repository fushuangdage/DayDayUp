package com.example.daydayup.test;

import com.example.daydayup.test.Test;
import com.example.daydayup.test.Test1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: fushuang
 * Date: 2020/11/20 12:42 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
public class ZZ implements Serializable {

    private static final long serialVersionUID = 1L;

    public void a(){
        Test.Companion.getAA();
        Test1.Companion.getAA();
    }

    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

    public void test(int[][] aar){
        int length = aar.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < aar[i].length; j++) {

            }
        }
    }
}
