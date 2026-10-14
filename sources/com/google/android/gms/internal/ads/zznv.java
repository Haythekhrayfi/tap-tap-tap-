package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zznv {
    public final /* synthetic */ zznw zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzto zze;
    private boolean zzf;
    private boolean zzg;

    public zznv(zznw zznwVar, String str, int i10, zzto zztoVar) {
        this.zza = zznwVar;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zztoVar == null ? -1L : zztoVar.zzd;
        if (zztoVar == null || !zztoVar.zzb()) {
            return;
        }
        this.zze = zztoVar;
    }

    public final void zzg(int i10, zzto zztoVar) {
        if (this.zzd == -1 && i10 == this.zzc && zztoVar != null) {
            this.zzd = zztoVar.zzd;
        }
    }

    public final boolean zzj(int i10, zzto zztoVar) {
        if (zztoVar == null) {
            return i10 == this.zzc;
        }
        zzto zztoVar2 = this.zze;
        if (zztoVar2 == null) {
            return !zztoVar.zzb() && zztoVar.zzd == this.zzd;
        }
        return zztoVar.zzd == zztoVar2.zzd && zztoVar.zzb == zztoVar2.zzb && zztoVar.zzc == zztoVar2.zzc;
    }

    public final boolean zzk(zzlt zzltVar) {
        zzto zztoVar = zzltVar.zzd;
        if (zztoVar == null) {
            return this.zzc != zzltVar.zzc;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        if (zztoVar.zzd > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int iZza = zzltVar.zzb.zza(zztoVar.zza);
        int iZza2 = zzltVar.zzb.zza(this.zze.zza);
        zzto zztoVar2 = zzltVar.zzd;
        if (zztoVar2.zzd < this.zze.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        boolean zZzb = zztoVar2.zzb();
        zzto zztoVar3 = zzltVar.zzd;
        if (!zZzb) {
            int i10 = zztoVar3.zze;
            return i10 == -1 || i10 > this.zze.zzb;
        }
        int i11 = zztoVar3.zzb;
        int i12 = zztoVar3.zzc;
        zzto zztoVar4 = this.zze;
        int i13 = zztoVar4.zzb;
        if (i11 <= i13) {
            return i11 == i13 && i12 > zztoVar4.zzc;
        }
        return true;
    }

    public final boolean zzl(zzcw zzcwVar, zzcw zzcwVar2) {
        int i10 = this.zzc;
        if (i10 < zzcwVar.zzc()) {
            zzcwVar.zze(i10, this.zza.zzc, 0L);
            int i11 = this.zza.zzc.zzo;
            while (true) {
                if (i11 > this.zza.zzc.zzp) {
                    i10 = -1;
                    break;
                }
                int iZza = zzcwVar2.zza(zzcwVar.zzf(i11));
                if (iZza != -1) {
                    i10 = zzcwVar2.zzd(iZza, this.zza.zzd, false).zzd;
                    break;
                }
                i11++;
            }
        } else if (i10 >= zzcwVar2.zzc()) {
            i10 = -1;
            break;
        }
        this.zzc = i10;
        if (i10 == -1) {
            return false;
        }
        zzto zztoVar = this.zze;
        return zztoVar == null || zzcwVar2.zza(zztoVar.zza) != -1;
    }
}
