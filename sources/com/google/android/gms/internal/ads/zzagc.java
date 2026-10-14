package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
final class zzagc extends zzage {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzagc(int i10, long j10) {
        super(i10);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final String toString() {
        return q.a(zzage.zzf(this.zzd), " leaves: ", Arrays.toString(this.zzb.toArray()), " containers: ", Arrays.toString(this.zzc.toArray()));
    }

    public final zzagc zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzagc zzagcVar = (zzagc) this.zzc.get(i11);
            if (zzagcVar.zzd == i10) {
                return zzagcVar;
            }
        }
        return null;
    }

    public final zzagd zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzagd zzagdVar = (zzagd) this.zzb.get(i11);
            if (zzagdVar.zzd == i10) {
                return zzagdVar;
            }
        }
        return null;
    }

    public final void zzc(zzagc zzagcVar) {
        this.zzc.add(zzagcVar);
    }

    public final void zzd(zzagd zzagdVar) {
        this.zzb.add(zzagdVar);
    }
}
