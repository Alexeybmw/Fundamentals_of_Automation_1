package ru.netology.service;

class CashbackHackServiceTest2 {

    @org.junit.jupiter.api.Test
    public void testRemain_0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    public void testRemain_1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    public void testRemain_2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);

    }
}