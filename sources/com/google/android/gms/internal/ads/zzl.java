package com.google.android.gms.internal.ads;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl {
    public final int zza = 0;
    public final float zzb = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    public zzl(int i10, float f10) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzl.class == obj.getClass()) {
            if (Float.compare(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) + 16337;
    }
}
