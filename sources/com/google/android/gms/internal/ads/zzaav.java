package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaav implements zzabz {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzabz
    public final /* synthetic */ int zze(zzt zztVar, int i10, boolean z10) {
        return zzabx.zza(this, zztVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final int zzf(zzt zztVar, int i10, boolean z10, int i11) throws IOException {
        int iZza = zztVar.zza(this.zza, 0, Math.min(4096, i10));
        if (iZza != -1) {
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final void zzk(zzam zzamVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final /* synthetic */ void zzq(zzfa zzfaVar, int i10) {
        zzabx.zzb(this, zzfaVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final void zzr(zzfa zzfaVar, int i10, int i11) {
        zzfaVar.zzG(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final void zzs(long j10, int i10, int i11, int i12, zzaby zzabyVar) {
    }
}
