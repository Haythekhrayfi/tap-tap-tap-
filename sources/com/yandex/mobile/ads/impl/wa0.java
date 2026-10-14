package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class wa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f26232b;

    public wa0(String str, float f10) {
        this.f26231a = str;
        this.f26232b = f10;
    }

    public final float a() {
        return this.f26232b;
    }

    public final String b() {
        return this.f26231a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wa0.class != obj.getClass()) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        if (Float.compare(wa0Var.f26232b, this.f26232b) != 0) {
            return false;
        }
        String str = this.f26231a;
        String str2 = wa0Var.f26231a;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public final int hashCode() {
        String str = this.f26231a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        float f10 = this.f26232b;
        return iHashCode + (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0);
    }
}
