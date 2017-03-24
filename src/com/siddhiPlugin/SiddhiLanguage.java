package com.siddhiPlugin;

import com.intellij.lang.Language;

/**
 * Created by yellowflash on 3/13/17.
 */
public class SiddhiLanguage extends Language {
    public static final SiddhiLanguage INSTANCE = new SiddhiLanguage();

    private SiddhiLanguage() {
        super("siddhi");
    }
}
