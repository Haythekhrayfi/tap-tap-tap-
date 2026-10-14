package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoy extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzoy(int i10, zzam zzamVar, boolean z10) {
        super(android.support.v4.media.a.a("AudioTrack write failed: ", i10));
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzamVar;
    }
}
