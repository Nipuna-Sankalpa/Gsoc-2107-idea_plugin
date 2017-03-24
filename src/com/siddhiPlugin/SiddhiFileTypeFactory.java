package com.siddhiPlugin;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by yellowflash on 3/13/17.
 */
public class SiddhiFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(SiddhiFileType.INSTANCE, PluginConstants.SIDDHI_EXTENSION);
    }
}
