package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzss implements zzvf {
    public final zzvf zza;
    public final /* synthetic */ zzst zzb;
    private boolean zzc;

    public zzss(zzst zzstVar, zzvf zzvfVar) {
        this.zzb = zzstVar;
        this.zza = zzvfVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    @Override // com.google.android.gms.internal.ads.zzvf
    public final int zza(zzkj zzkjVar, zzhp zzhpVar, int i10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhpVar.zzc(4);
            return -4;
        }
        int iZza = this.zza.zza(zzkjVar, zzhpVar, i10);
        if (iZza != -5) {
            zzst zzstVar = this.zzb;
            long j10 = zzstVar.zzb;
            if (j10 == Long.MIN_VALUE || ((iZza != -4 || zzhpVar.zzd < j10) && !(iZza == -3 && zzstVar.zzb() == Long.MIN_VALUE && !zzhpVar.zzc))) {
                return iZza;
            }
            zzhpVar.zzb();
            zzhpVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzam zzamVar = zzkjVar.zza;
        Objects.requireNonNull(zzamVar);
        int i11 = zzamVar.zzC;
        if (i11 != 0) {
            int i12 = this.zzb.zzb == Long.MIN_VALUE ? zzamVar.zzD : 0;
            zzak zzakVarZzb = zzamVar.zzb();
            zzakVarZzb.zzC(i11);
            zzakVarZzb.zzD(i12);
            zzkjVar.zza = zzakVarZzb.zzY();
        } else if (zzamVar.zzD != 0) {
            i11 = 0;
            if (this.zzb.zzb == Long.MIN_VALUE) {
            }
            zzak zzakVarZzb2 = zzamVar.zzb();
            zzakVarZzb2.zzC(i11);
            zzakVarZzb2.zzD(i12);
            zzkjVar.zza = zzakVarZzb2.zzY();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final int zzb(long j10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j10);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
