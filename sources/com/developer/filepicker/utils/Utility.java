package com.developer.filepicker.utils;

import android.content.Context;
import com.developer.filepicker.model.FileListItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class Utility {
    public static boolean checkStorageAccessPermissions(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    private boolean hasSupportLibraryInClasspath() {
        try {
            Class.forName("com.android.support:appcompat-v7");
            return true;
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static ArrayList<FileListItem> prepareFileListEntries(ArrayList<FileListItem> arrayList, File file, ExtensionFilter extensionFilter, boolean z10) {
        try {
            for (File file2 : file.listFiles(extensionFilter)) {
                if (file2.canRead() && (!file2.getName().startsWith(".") || z10)) {
                    FileListItem fileListItem = new FileListItem();
                    fileListItem.setFilename(file2.getName());
                    fileListItem.setDirectory(file2.isDirectory());
                    fileListItem.setLocation(file2.getAbsolutePath());
                    fileListItem.setTime(file2.lastModified());
                    arrayList.add(fileListItem);
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        } catch (NullPointerException e10) {
            e10.printStackTrace();
            return new ArrayList<>();
        }
    }
}
