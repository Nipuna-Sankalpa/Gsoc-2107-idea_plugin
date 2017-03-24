package com.siddhiPlugin.psi;

import com.intellij.psi.tree.IElementType;
import com.siddhiPlugin.SiddhiLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by yellowflash on 3/13/17.
 */
public class SiddhiTokenType extends IElementType {
    public SiddhiTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SiddhiLanguage.INSTANCE);
    }

    public String toString() {
        return "Siddhi Token Type" + super.toString();
    }
}
