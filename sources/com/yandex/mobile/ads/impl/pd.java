package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public enum pd {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("constant"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("ratio"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("screen_based"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("screen_orientation_based");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24040a;

    public static final class a {
        public static pd a(String str) {
            for (pd pdVar : pd.values()) {
                if (fd.j0.d(pdVar.a(), str)) {
                    return pdVar;
                }
            }
            return null;
        }
    }

    pd(String str) {
        this.f24040a = str;
    }

    public final String a() {
        return this.f24040a;
    }
}
