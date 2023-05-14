package ru.netology.service;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testRemain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }
    @org.junit.Test
    public void testRemain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }
}