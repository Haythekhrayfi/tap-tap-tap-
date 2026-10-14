package com.yandex.metrica.impl.ob;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
class U7 implements FilenameFilter {
    public U7(V7 v10) {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(".dmp");
    }
}
