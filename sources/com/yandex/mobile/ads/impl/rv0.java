package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class rv0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rv0 f24876b = new rv0(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24877a;

    public rv0(boolean z10) {
        this.f24877a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rv0.class == obj.getClass() && this.f24877a == ((rv0) obj).f24877a;
    }

    public final int hashCode() {
        return !this.f24877a ? 1 : 0;
    }
}
