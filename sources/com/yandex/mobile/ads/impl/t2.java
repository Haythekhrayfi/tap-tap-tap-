package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25232b;

    public t2(int i10, String str) {
        this.f25232b = i10;
        this.f25231a = str;
    }

    public final int a() {
        return this.f25232b;
    }

    public final String b() {
        return this.f25231a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t2.class != obj.getClass()) {
            return false;
        }
        t2 t2Var = (t2) obj;
        if (this.f25232b != t2Var.f25232b) {
            return false;
        }
        return this.f25231a.equals(t2Var.f25231a);
    }

    public final int hashCode() {
        return (this.f25231a.hashCode() * 31) + this.f25232b;
    }

    public final String toString() {
        return String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s)", Integer.valueOf(this.f25232b), this.f25231a);
    }
}
