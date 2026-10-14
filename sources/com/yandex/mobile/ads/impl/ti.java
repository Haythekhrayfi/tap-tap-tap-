package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25368b;

    public ti(int i10, String str) {
        this.f25368b = i10;
        this.f25367a = str;
    }

    public final String a() {
        return this.f25367a;
    }

    public final int b() {
        return this.f25368b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ti.class != obj.getClass()) {
            return false;
        }
        ti tiVar = (ti) obj;
        String str = this.f25367a;
        if (str == null ? tiVar.f25367a == null : str.equals(tiVar.f25367a)) {
            return this.f25368b == tiVar.f25368b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25367a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        int i10 = this.f25368b;
        return iHashCode + (i10 != 0 ? a6.a(i10) : 0);
    }
}
