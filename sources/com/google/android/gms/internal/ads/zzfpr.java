package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzfpr implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzfpu zzb;

    public zzfpr(zzfpu zzfpuVar, CharSequence charSequence) {
        this.zzb = zzfpuVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzfow.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
