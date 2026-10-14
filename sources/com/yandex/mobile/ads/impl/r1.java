package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class r1 {
    public static v1 a(String str) {
        v1 v1Var = v1.f25770d;
        if (str == null) {
            return v1Var;
        }
        switch (str) {
            case "preroll":
                return v1.f25767a;
            case "postroll":
                return v1.f25769c;
            case "midroll":
                return v1.f25768b;
            default:
                return v1Var;
        }
    }
}
