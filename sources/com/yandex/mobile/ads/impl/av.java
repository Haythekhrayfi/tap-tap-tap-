package com.yandex.mobile.ads.impl;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class av {
    public static final void a(File file) {
        fd.j0.i(file, "<this>");
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
