package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 {
    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "browser";
        }
        if (i10 == 2) {
            return "webview";
        }
        if (i10 == 3) {
            return "custom";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i10) {
        if (i10 == 1) {
            return "BROWSER";
        }
        if (i10 == 2) {
            return "WEBVIEW";
        }
        return i10 == 3 ? "CUSTOM" : "null";
    }
}
