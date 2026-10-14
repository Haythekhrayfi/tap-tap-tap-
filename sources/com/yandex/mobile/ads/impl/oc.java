package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23766a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23767b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oc.class != obj.getClass()) {
            return false;
        }
        oc ocVar = (oc) obj;
        return this.f23766a == ocVar.f23766a && Float.compare(ocVar.f23767b, this.f23767b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23767b) + ((this.f23766a + 527) * 31);
    }
}
