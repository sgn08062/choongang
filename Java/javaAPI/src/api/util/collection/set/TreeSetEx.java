package api.util.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("java");
        set.add("js");
        set.add("java");
        set.add("html");
        set.add("css");

        System.out.println(set.toString());
    }
}
