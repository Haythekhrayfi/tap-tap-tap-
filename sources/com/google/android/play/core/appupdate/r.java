package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11765a;

    public r(Context context) {
        this.f11765a = context;
    }

    private static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jA = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jA += a(file2);
            }
        }
        return jA;
    }

    public final long a() {
        return a(new File(this.f11765a.getFilesDir(), "assetpacks"));
    }
}
