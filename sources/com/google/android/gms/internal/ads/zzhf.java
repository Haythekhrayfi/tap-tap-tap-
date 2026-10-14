package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhf implements zzge {
    private final zzge zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzhf(zzge zzgeVar) {
        this.zza = zzgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int iZza = this.zza.zza(bArr, i10, i11);
        if (iZza != -1) {
            this.zzb += (long) iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws IOException {
        this.zzc = zzgjVar.zza;
        this.zzd = Collections.emptyMap();
        long jZzb = this.zza.zzb(zzgjVar);
        Uri uriZzc = zzc();
        Objects.requireNonNull(uriZzc);
        this.zzc = uriZzc;
        this.zzd = zze();
        return jZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzf(zzhg zzhgVar) {
        Objects.requireNonNull(zzhgVar);
        this.zza.zzf(zzhgVar);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}
