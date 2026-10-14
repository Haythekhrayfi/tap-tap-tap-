package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.o;
import v1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzov extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzov(int i10, int i11, int i12, int i13, zzam zzamVar, boolean z10, Exception exc) {
        String strValueOf = String.valueOf(zzamVar);
        StringBuilder sbA = o.a("AudioTrack init failed ", i10, " Config(", i11, ", ");
        b.a(sbA, i12, ", ", i13, ") ");
        sbA.append(strValueOf);
        sbA.append(true != z10 ? "" : " (recoverable)");
        super(sbA.toString(), exc);
        this.zza = i10;
        this.zzb = z10;
        this.zzc = zzamVar;
    }
}
