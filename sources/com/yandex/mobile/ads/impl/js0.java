package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class js0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f22141c;

    public js0(String str, String str2, HashMap map) {
        this.f22139a = str;
        this.f22140b = str2;
        this.f22141c = map;
    }

    public final Map<String, Object> a() {
        return this.f22141c;
    }

    public final String b() {
        return this.f22139a;
    }

    public final String c() {
        return this.f22140b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || js0.class != obj.getClass()) {
            return false;
        }
        js0 js0Var = (js0) obj;
        if (!this.f22139a.equals(js0Var.f22139a) || !this.f22140b.equals(js0Var.f22140b)) {
            return false;
        }
        Map<String, Object> map = this.f22141c;
        Map<String, Object> map2 = js0Var.f22141c;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public final int hashCode() {
        int iA = z11.a(this.f22140b, this.f22139a.hashCode() * 31, 31);
        Map<String, Object> map = this.f22141c;
        return iA + (map != null ? map.hashCode() : 0);
    }
}
