package ru.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
            result = i;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found: " + key);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange"};
        try {
            int index = indexOf(array, "grapes");
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
