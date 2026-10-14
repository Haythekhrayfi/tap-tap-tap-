package com.google.android.play.core.internal;

import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class av {
    public static au a() {
        switch (Build.VERSION.SDK_INT) {
            case 24:
                return new bg();
            case 25:
                return new bh();
            case 26:
                return new bk();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new bl();
                }
                break;
        }
        return new bn();
    }

    public static String a(File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().replaceFirst("(_\\d+)?\\.apk", "").replace("base-", "config.").replace("-", ".config.").replace(".config.master", "").replace("config.master", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static <T> void a(T t10, Object obj) {
        if (t10 == null) {
            throw new NullPointerException((String) obj);
        }
    }

    public static void a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
