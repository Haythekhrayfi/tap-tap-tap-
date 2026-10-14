package com.yandex.mobile.ads.impl;

import android.os.Environment;

/* JADX INFO: loaded from: classes3.dex */
public final class bv {
    public static boolean a() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || !(Environment.isExternalStorageRemovable() || "mounted_ro".equals(externalStorageState));
    }
}
