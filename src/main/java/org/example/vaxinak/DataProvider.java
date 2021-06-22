package org.example.vaxinak;

import java.util.Arrays;
import java.util.List;

public class DataProvider {

    public static List<ListItem> getData() {
        return Arrays.asList(
                new ListItem(1, "Սիրուն կով", 500000, "https://s.list.am/r/329/48086329.webp"),
                new ListItem(2, "Jaylami dzu", 8000, "https://s.list.am/r/863/52918863.webp")
        );
    }

}
