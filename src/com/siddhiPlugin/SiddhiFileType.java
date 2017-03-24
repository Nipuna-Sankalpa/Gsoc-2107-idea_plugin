package com.siddhiPlugin;


import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by yellowflash on 3/13/17.
 */
public class SiddhiFileType extends LanguageFileType {

    public static final SiddhiFileType INSTANCE = new SiddhiFileType();

    /**
     * Creates a language file type for the specified language.
     */
    private SiddhiFileType() {
        super(SiddhiLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Siddhi File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Siddhi Source File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return PluginConstants.SIDDHI_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SiddhiIcon.FILE;
    }
}
