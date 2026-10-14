package com.google.android.gms.internal.measurement;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public enum zzne {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzjd.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzne(Object obj) {
        this.zzk = obj;
    }
}
