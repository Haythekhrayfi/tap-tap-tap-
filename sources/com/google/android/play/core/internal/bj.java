package com.google.android.play.core.internal;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class bj implements ay {
    @Override // com.google.android.play.core.internal.ay
    public final boolean a(Object obj, File file, File file2) {
        try {
            return !((Boolean) bq.a(Class.forName("dalvik.system.DexFile"), Boolean.class, (Class<String>) String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
