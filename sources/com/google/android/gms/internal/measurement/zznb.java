package com.google.android.gms.internal.measurement;

import n1.c;

/* JADX INFO: loaded from: classes2.dex */
final class zznb extends IllegalArgumentException {
    public zznb(int i10, int i11) {
        super(c.a("Unpaired surrogate at index ", i10, " of ", i11));
    }
}
