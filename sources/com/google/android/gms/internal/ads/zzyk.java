package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyk extends zzrq {
    public zzyk(Throwable th, zzrs zzrsVar, Surface surface) {
        super(th, zzrsVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
