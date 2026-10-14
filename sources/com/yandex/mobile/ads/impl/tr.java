package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class tr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25445b;

    public tr(int i10, String str) {
        this.f25444a = str;
        this.f25445b = i10;
    }

    public final String a() {
        return this.f25444a;
    }

    public final int b() {
        return this.f25445b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tr.class != obj.getClass()) {
            return false;
        }
        tr trVar = (tr) obj;
        if (this.f25445b != trVar.f25445b) {
            return false;
        }
        return this.f25444a.equals(trVar.f25444a);
    }

    public final int hashCode() {
        return (this.f25444a.hashCode() * 31) + this.f25445b;
    }
}
