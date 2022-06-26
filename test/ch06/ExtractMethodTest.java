package ch06;

import ch06.ExtractMethod.ExtractMethod;
import ch06.ExtractMethod.ExtractMethod1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractMethodTest {

    ExtractMethod extractMethod;
    ExtractMethod1 extractMethod1;

    @BeforeEach()
    public void setup(){
        extractMethod = new ExtractMethod();
        extractMethod1 = new ExtractMethod1();
    }

    @Test()
    public void refactor1(){
        double amount = 10.1;

    }

}
