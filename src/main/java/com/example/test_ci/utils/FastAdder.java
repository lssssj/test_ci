package com.example.test_ci.utils;

import java.io.IOException;

/**
 * @author bigo
 * @date 2022/9/25
 **/
public class FastAdder
{

    public static int add(int x, int y)
    {
        return x + y;
    }

    public static void he()
            throws IOException
    {
        int x = 2 * 102 + 22 / 2;
        if (x > 10) {
            System.out.println("jj");
        }
    }
}
