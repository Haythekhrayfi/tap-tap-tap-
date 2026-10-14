package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzif implements zzkl {
    private final zzlp zza;
    private final zzie zzb;
    private zzli zzc;
    private zzkl zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzif(zzie zzieVar, zzdz zzdzVar) {
        this.zzb = zzieVar;
        this.zza = new zzlp(zzdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final long zza() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    public final long zzb(boolean z10) {
        zzch zzchVarZzc;
        zzli zzliVar = this.zzc;
        if (zzliVar == null || zzliVar.zzP() || (!this.zzc.zzQ() && (z10 || this.zzc.zzJ()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkl zzklVar = this.zzd;
            Objects.requireNonNull(zzklVar);
            long jZza = zzklVar.zza();
            if (!this.zze) {
                this.zza.zzb(jZza);
                zzchVarZzc = zzklVar.zzc();
                if (!zzchVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzchVarZzc);
                    this.zzb.zza(zzchVarZzc);
                }
            } else if (jZza < this.zza.zza()) {
                this.zza.zze();
            } else {
                this.zze = false;
                if (this.zzf) {
                    this.zza.zzd();
                }
                this.zza.zzb(jZza);
                zzchVarZzc = zzklVar.zzc();
                if (!zzchVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzchVarZzc);
                    this.zzb.zza(zzchVarZzc);
                }
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzkl zzklVar2 = this.zzd;
        Objects.requireNonNull(zzklVar2);
        return zzklVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzch zzc() {
        zzkl zzklVar = this.zzd;
        return zzklVar != null ? zzklVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzli zzliVar) {
        if (zzliVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzli zzliVar) throws zzih {
        zzkl zzklVar;
        zzkl zzklVarZzi = zzliVar.zzi();
        if (zzklVarZzi == null || zzklVarZzi == (zzklVar = this.zzd)) {
            return;
        }
        if (zzklVar != null) {
            throw zzih.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzklVarZzi;
        this.zzc = zzliVar;
        zzklVarZzi.zzg(this.zza.zzc());
    }

    public final void zzf(long j10) {
        this.zza.zzb(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzg(zzch zzchVar) {
        zzkl zzklVar = this.zzd;
        if (zzklVar != null) {
            zzklVar.zzg(zzchVar);
            zzchVar = this.zzd.zzc();
        }
        this.zza.zzg(zzchVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
