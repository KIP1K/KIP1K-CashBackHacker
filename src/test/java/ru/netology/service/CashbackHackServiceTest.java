package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void less1000() {
        CashbackHackService service = new CashbackHackService();
        service.remain(900);

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void more1000() {
        CashbackHackService service = new CashbackHackService();
        service.remain(1100);

        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void amount1000() {
        CashbackHackService service = new CashbackHackService();
        service.remain(1000);

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual,expected);

    }
}