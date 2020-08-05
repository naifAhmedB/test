package com.example.asem.share;

import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][] {
                // LOCALIZE THE SECOND STRING OF EACH ARRAY (e.g., "OK")
                {"OkKey", "OK"},
                {"CancelKey", "Cancel"},
                // END OF MATERIAL TO LOCALIZE
        };
    }
}