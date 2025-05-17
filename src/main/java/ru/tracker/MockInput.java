package ru.tracker;

public class MockInput implements Input {
    @Override
    public String askStr(String question) {
        return "";
    }

    @Override
    public int askInt(String queston) {
        return 0;
    }
}
