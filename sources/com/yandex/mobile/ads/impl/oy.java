package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class oy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23930b;

    public oy(String str, String str2) {
        this.f23929a = str;
        this.f23930b = str2;
    }

    public final String a() {
        return this.f23929a;
    }

    public final String b() {
        return this.f23930b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oy.class != obj.getClass()) {
            return false;
        }
        oy oyVar = (oy) obj;
        return TextUtils.equals(this.f23929a, oyVar.f23929a) && TextUtils.equals(this.f23930b, oyVar.f23930b);
    }

    public final int hashCode() {
        return this.f23930b.hashCode() + (this.f23929a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("Header[name=");
        sbA.append(this.f23929a);
        sbA.append(",value=");
        return androidx.activity.k.a(sbA, this.f23930b, "]");
    }
}
