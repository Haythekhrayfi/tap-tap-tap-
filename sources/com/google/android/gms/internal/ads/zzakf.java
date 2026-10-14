package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzakf {
    public final int zza;
    public final long zzb;

    private zzakf(int i10, long j10) {
        this.zza = i10;
        this.zzb = j10;
    }

    public static zzakf zza(zzaax zzaaxVar, zzfa zzfaVar) throws IOException {
        ((zzaam) zzaaxVar).zzm(zzfaVar.zzH(), 0, 8, false);
        zzfaVar.zzF(0);
        return new zzakf(zzfaVar.zze(), zzfaVar.zzq());
    }
}
