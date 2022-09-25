package com.example.test_ci;

import com.example.test_ci.utils.FastAdder;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


/**
 * @author bigo
 * @date 2022/9/25
 **/

public class TestHello {

    @Test
    public void testAdd() {
        int y = 20;
        int z = 10;
        int x = y + z;
        Assert.assertEquals(x, 30);
    }

    @Test
    public void testFastAdd() {
        int res = FastAdder.add(10, 20);
        int expected = 10 + 20;
        Assert.assertEquals(res, expected);
    }
}
