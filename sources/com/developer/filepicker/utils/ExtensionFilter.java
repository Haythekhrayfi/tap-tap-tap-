package com.developer.filepicker.utils;

import com.developer.filepicker.model.DialogProperties;
import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ExtensionFilter implements FileFilter {
    private DialogProperties properties;
    private final String[] validExtensions;

    public ExtensionFilter(DialogProperties dialogProperties) {
        String[] strArr = dialogProperties.extensions;
        if (strArr != null) {
            this.validExtensions = strArr;
        } else {
            this.validExtensions = new String[]{""};
        }
        this.properties = dialogProperties;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        if (file.isDirectory() && file.canRead()) {
            return true;
        }
        if (this.properties.selection_type == 1) {
            return false;
        }
        String lowerCase = file.getName().toLowerCase(Locale.getDefault());
        for (String str : this.validExtensions) {
            if (lowerCase.endsWith(str)) {
                return true;
            }
        }
        return false;
    }
}
