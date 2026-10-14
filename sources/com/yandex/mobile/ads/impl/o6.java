package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23701a;

    public final String a() {
        return this.f23701a;
    }

    public final void a(String str) {
        if (str == null || ed.q.k(str)) {
            o60.c("Ad Unit Id can't be null or empty.", new Object[0]);
            return;
        }
        String str2 = this.f23701a;
        if (str2 == null || fd.j0.d(str2, str)) {
            this.f23701a = str;
        } else {
            o60.c("Ad Unit Id can't be set twice.", new Object[0]);
        }
    }
}
