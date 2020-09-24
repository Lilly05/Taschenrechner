package sample;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RechnerTest {
    Rechner rechner = new Rechner();

    @Test
    public void test1() {
        int resultatPlus = rechner.rechnePlus(100,50);
        MatcherAssert.assertThat(resultatPlus, CoreMatchers.is(CoreMatchers.equalTo(150)));
    }
    @Test
    public void test2() {
        int resultatMinus = rechner.rechneMinus(20, 10);
        MatcherAssert.assertThat(resultatMinus, CoreMatchers.is(CoreMatchers.equalTo(10)));
    }
    @Test
    public void test3() {
        int resultatMal = rechner.rechneMal(5,5);
        MatcherAssert.assertThat(resultatMal, CoreMatchers.is(CoreMatchers.equalTo(25)));
    }
    @Test
    public void test4() {
        int resultatGeteilt = rechner.rechneGeteilt(10, 2);
        MatcherAssert.assertThat(resultatGeteilt, CoreMatchers.is(CoreMatchers.equalTo(5)));
    }
    @Test
    public void test5() {
        int resultatModulo = rechner.rechneModulo(5, 3);
        MatcherAssert.assertThat(resultatModulo, CoreMatchers.is(CoreMatchers.equalTo(2)));
    }


}