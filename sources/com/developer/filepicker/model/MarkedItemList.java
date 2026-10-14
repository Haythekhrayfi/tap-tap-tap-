package com.developer.filepicker.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MarkedItemList {
    private static HashMap<String, FileListItem> ourInstance = new HashMap<>();

    public static void addSelectedItem(FileListItem fileListItem) {
        ourInstance.put(fileListItem.getLocation(), fileListItem);
    }

    public static void addSingleFile(FileListItem fileListItem) {
        HashMap<String, FileListItem> map = new HashMap<>();
        ourInstance = map;
        map.put(fileListItem.getLocation(), fileListItem);
    }

    public static void clearSelectionList() {
        ourInstance = new HashMap<>();
    }

    public static int getFileCount() {
        return ourInstance.size();
    }

    public static String[] getSelectedPaths() {
        Set<String> setKeySet = ourInstance.keySet();
        String[] strArr = new String[setKeySet.size()];
        Iterator<String> it = setKeySet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = it.next();
            i10++;
        }
        return strArr;
    }

    public static boolean hasItem(String str) {
        return ourInstance.containsKey(str);
    }

    public static void removeSelectedItem(String str) {
        ourInstance.remove(str);
    }
}
