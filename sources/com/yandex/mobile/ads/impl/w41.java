package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
final class w41 implements eb<String> {
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    public static boolean a2(String str) {
        return !(TextUtils.isEmpty(str) || "null".equals(str));
    }

    @Override // com.yandex.mobile.ads.impl.eb
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return a2(str);
    }
}
