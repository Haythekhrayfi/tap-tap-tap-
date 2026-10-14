package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyi {

    @Nullable
    private final Object zza;

    @Nullable
    private final Object zzb;
    private final byte[] zzc;
    private final zzglq zzd;
    private final int zze;
    private final String zzf;
    private final zzfxn zzg;
    private final int zzh;

    public zzfyi(@Nullable Object obj, @Nullable Object obj2, byte[] bArr, int i10, zzglq zzglqVar, int i11, String str, zzfxn zzfxnVar) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i10;
        this.zzd = zzglqVar;
        this.zze = i11;
        this.zzf = str;
        this.zzg = zzfxnVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfxn zzb() {
        return this.zzg;
    }

    public final zzglq zzc() {
        return this.zzd;
    }

    @Nullable
    public final Object zzd() {
        return this.zza;
    }

    @Nullable
    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    @Nullable
    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
