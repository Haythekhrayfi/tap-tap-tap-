package com.yandex.metrica.impl.ob;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class U6 {
    public boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdir();
        }
        if (file.isDirectory()) {
            return true;
        }
        if (file.delete()) {
            return file.mkdir();
        }
        return false;
    }
}
