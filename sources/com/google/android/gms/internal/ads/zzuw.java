package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuw extends zzsp implements zzun {
    private final zzbp zza;
    private final zzbi zzb;
    private final zzgd zzc;
    private final zzqu zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    private zzhg zzj;
    private final zzut zzk;
    private final zzxt zzl;

    public /* synthetic */ zzuw(zzbp zzbpVar, zzgd zzgdVar, zzut zzutVar, zzqu zzquVar, zzxt zzxtVar, int i10, zzuv zzuvVar) {
        zzbi zzbiVar = zzbpVar.zzd;
        Objects.requireNonNull(zzbiVar);
        this.zzb = zzbiVar;
        this.zza = zzbpVar;
        this.zzc = zzgdVar;
        this.zzk = zzutVar;
        this.zzd = zzquVar;
        this.zzl = zzxtVar;
        this.zze = i10;
        this.zzf = true;
        this.zzg = -9223372036854775807L;
    }

    private final void zzv() {
        long j10 = this.zzg;
        boolean z10 = this.zzh;
        boolean z11 = this.zzi;
        zzbp zzbpVar = this.zza;
        zzvj zzvjVar = new zzvj(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, zzbpVar, z11 ? zzbpVar.zzf : null);
        zzo(this.zzf ? new zzus(this, zzvjVar) : zzvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzF(zztm zztmVar) {
        ((zzur) zztmVar).zzM();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zztm zzH(zzto zztoVar, zzxp zzxpVar, long j10) {
        zzge zzgeVarZza = this.zzc.zza();
        zzhg zzhgVar = this.zzj;
        if (zzhgVar != null) {
            zzgeVarZza.zzf(zzhgVar);
        }
        Uri uri = this.zzb.zzb;
        zzut zzutVar = this.zzk;
        zzb();
        return new zzur(uri, zzgeVarZza, new zzsr(zzutVar.zza), this.zzd, zzc(zztoVar), this.zzl, zze(zztoVar), this, zzxpVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzbp zzI() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zza(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.zzg;
        }
        if (!this.zzf && this.zzg == j10 && this.zzh == z10 && this.zzi == z11) {
            return;
        }
        this.zzg = j10;
        this.zzh = z10;
        this.zzi = z11;
        this.zzf = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzn(zzhg zzhgVar) {
        this.zzj = zzhgVar;
        Objects.requireNonNull(Looper.myLooper());
        zzb();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzy() {
    }
}
