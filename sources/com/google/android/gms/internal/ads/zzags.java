package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzags {
    public final zzabz zza;
    public zzahf zzd;
    public zzago zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzahe zzb = new zzahe();
    public final zzfa zzc = new zzfa();
    private final zzfa zzj = new zzfa(1);
    private final zzfa zzk = new zzfa();

    public zzags(zzabz zzabzVar, zzahf zzahfVar, zzago zzagoVar) {
        this.zza = zzabzVar;
        this.zzd = zzahfVar;
        this.zze = zzagoVar;
        zzh(zzahfVar, zzagoVar);
    }

    public final int zza() {
        int i10;
        if (this.zzl) {
            i10 = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i10 = this.zzd.zzg[this.zzf];
        }
        return zzf() != null ? i10 | 1073741824 : i10;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i10, int i11) {
        zzfa zzfaVar;
        zzahd zzahdVarZzf = zzf();
        if (zzahdVarZzf == null) {
            return 0;
        }
        int i12 = zzahdVarZzf.zzd;
        if (i12 != 0) {
            zzfaVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzahdVarZzf.zze;
            int i13 = zzfj.zza;
            zzfa zzfaVar2 = this.zzk;
            int length = bArr.length;
            zzfaVar2.zzD(bArr, length);
            zzfaVar = this.zzk;
            i12 = length;
        }
        boolean zZzb = this.zzb.zzb(this.zzf);
        boolean z10 = zZzb || i11 != 0;
        zzfa zzfaVar3 = this.zzj;
        zzfaVar3.zzH()[0] = (byte) ((true != z10 ? 0 : 128) | i12);
        zzfaVar3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzfaVar, i12, 1);
        if (!z10) {
            return i12 + 1;
        }
        if (!zZzb) {
            this.zzc.zzC(8);
            zzfa zzfaVar4 = this.zzc;
            byte[] bArrZzH = zzfaVar4.zzH();
            bArrZzH[0] = 0;
            bArrZzH[1] = 1;
            bArrZzH[2] = 0;
            bArrZzH[3] = (byte) i11;
            bArrZzH[4] = (byte) ((i10 >> 24) & 255);
            bArrZzH[5] = (byte) ((i10 >> 16) & 255);
            bArrZzH[6] = (byte) ((i10 >> 8) & 255);
            bArrZzH[7] = (byte) (i10 & 255);
            this.zza.zzr(zzfaVar4, 8, 1);
            return i12 + 9;
        }
        zzfa zzfaVar5 = this.zzb.zzn;
        int iZzo = zzfaVar5.zzo();
        zzfaVar5.zzG(-2);
        int i14 = (iZzo * 6) + 2;
        if (i11 != 0) {
            this.zzc.zzC(i14);
            byte[] bArrZzH2 = this.zzc.zzH();
            zzfaVar5.zzB(bArrZzH2, 0, i14);
            int i15 = (((bArrZzH2[2] & 255) << 8) | (bArrZzH2[3] & 255)) + i11;
            bArrZzH2[2] = (byte) ((i15 >> 8) & 255);
            bArrZzH2[3] = (byte) (i15 & 255);
            zzfaVar5 = this.zzc;
        }
        this.zza.zzr(zzfaVar5, i14, 1);
        return i12 + 1 + i14;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzahe zzaheVar = this.zzb;
        return zzaheVar.zzi[this.zzf];
    }

    public final zzahd zzf() {
        if (!this.zzl) {
            return null;
        }
        zzahe zzaheVar = this.zzb;
        zzago zzagoVar = zzaheVar.zza;
        int i10 = zzfj.zza;
        int i11 = zzagoVar.zza;
        zzahd zzahdVarZza = zzaheVar.zzm;
        if (zzahdVarZza == null) {
            zzahdVarZza = this.zzd.zza.zza(i11);
        }
        if (zzahdVarZza == null || !zzahdVarZza.zza) {
            return null;
        }
        return zzahdVarZza;
    }

    public final void zzh(zzahf zzahfVar, zzago zzagoVar) {
        this.zzd = zzahfVar;
        this.zze = zzagoVar;
        this.zza.zzk(zzahfVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzahe zzaheVar = this.zzb;
        zzaheVar.zzd = 0;
        zzaheVar.zzp = 0L;
        zzaheVar.zzq = false;
        zzaheVar.zzk = false;
        zzaheVar.zzo = false;
        zzaheVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i10 = this.zzg + 1;
        this.zzg = i10;
        int[] iArr = this.zzb.zzg;
        int i11 = this.zzh;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.zzh = i11 + 1;
        this.zzg = 0;
        return false;
    }
}
