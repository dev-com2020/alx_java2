package org.example;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParamTest {

    @Parameter(0)
    public Integer input1;

    @Parameter(1)
    public String input2;

    @Parameters(name= "Mój test #{index} -- z danymi: {0} i {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {{ 1, "hello"},{ 2, "goodbye"}});
    }

    @Test
    public void test() {
        System.out.println(input1 + " " + input2);
    }

}