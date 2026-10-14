package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wb0 {
    public static int a(String str) {
        for (int i10 : a6.b(2)) {
            if (a(i10).equals(str)) {
                return i10;
            }
        }
        return 0;
    }

    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "streaming";
        }
        if (i10 == 2) {
            return "progressive";
        }
        throw null;
    }
}
