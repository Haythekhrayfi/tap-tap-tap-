package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaiu implements zzaij {
    private final zzajk zza;
    private String zzb;
    private zzabz zzc;
    private zzait zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaiy zzg = new zzaiy(32, 128);
    private final zzaiy zzh = new zzaiy(33, 128);
    private final zzaiy zzi = new zzaiy(34, 128);
    private final zzaiy zzj = new zzaiy(39, 128);
    private final zzaiy zzk = new zzaiy(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzfa zzn = new zzfa();

    public zzaiu(zzajk zzajkVar) {
        this.zza = zzajkVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i10, int i11) {
        this.zzd.zzb(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zza(bArr, i10, i11);
            this.zzh.zza(bArr, i10, i11);
            this.zzi.zza(bArr, i10, i11);
        }
        this.zzj.zza(bArr, i10, i11);
        this.zzk.zza(bArr, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0110  */
    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) {
        zzdy.zzb(this.zzc);
        int i10 = zzfj.zza;
        while (zzfaVar.zza() > 0) {
            int iZzc = zzfaVar.zzc();
            int iZzd = zzfaVar.zzd();
            byte[] bArrZzH = zzfaVar.zzH();
            this.zzl += (long) zzfaVar.zza();
            this.zzc.zzq(zzfaVar, zzfaVar.zza());
            while (iZzc < iZzd) {
                int iZza = zzfu.zza(bArrZzH, iZzc, iZzd, this.zzf);
                if (iZza == iZzd) {
                    zzf(bArrZzH, iZzc, iZzd);
                    return;
                }
                int i11 = iZza + 3;
                int i12 = bArrZzH[i11] & 126;
                int i13 = iZza - iZzc;
                if (i13 > 0) {
                    zzf(bArrZzH, iZzc, iZza);
                }
                int i14 = iZzd - iZza;
                long j10 = this.zzl - ((long) i14);
                int i15 = i13 < 0 ? -i13 : 0;
                long j11 = this.zzm;
                this.zzd.zza(j10, i14, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i15);
                    this.zzh.zzd(i15);
                    this.zzi.zzd(i15);
                    zzaiy zzaiyVar = this.zzg;
                    if (zzaiyVar.zze()) {
                        zzaiy zzaiyVar2 = this.zzh;
                        if (zzaiyVar2.zze()) {
                            zzaiy zzaiyVar3 = this.zzi;
                            if (zzaiyVar3.zze()) {
                                zzabz zzabzVar = this.zzc;
                                String str = this.zzb;
                                int i16 = zzaiyVar.zzb;
                                byte[] bArr = new byte[zzaiyVar2.zzb + i16 + zzaiyVar3.zzb];
                                System.arraycopy(zzaiyVar.zza, 0, bArr, 0, i16);
                                System.arraycopy(zzaiyVar2.zza, 0, bArr, zzaiyVar.zzb, zzaiyVar2.zzb);
                                System.arraycopy(zzaiyVar3.zza, 0, bArr, zzaiyVar.zzb + zzaiyVar2.zzb, zzaiyVar3.zzb);
                                zzfr zzfrVarZzc = zzfu.zzc(zzaiyVar2.zza, 5, zzaiyVar2.zzb);
                                String strZzb = zzea.zzb(zzfrVarZzc.zza, zzfrVarZzc.zzb, zzfrVarZzc.zzc, zzfrVarZzc.zzd, zzfrVarZzc.zze, zzfrVarZzc.zzf);
                                zzak zzakVar = new zzak();
                                zzakVar.zzH(str);
                                zzakVar.zzS("video/hevc");
                                zzakVar.zzx(strZzb);
                                zzakVar.zzX(zzfrVarZzc.zzg);
                                zzakVar.zzF(zzfrVarZzc.zzh);
                                zzakVar.zzP(zzfrVarZzc.zzi);
                                zzakVar.zzI(Collections.singletonList(bArr));
                                zzabzVar.zzk(zzakVar.zzY());
                                this.zze = true;
                            }
                        }
                    }
                }
                if (this.zzj.zzd(i15)) {
                    zzaiy zzaiyVar4 = this.zzj;
                    this.zzn.zzD(this.zzj.zza, zzfu.zzb(zzaiyVar4.zza, zzaiyVar4.zzb));
                    this.zzn.zzG(5);
                    this.zza.zza(j11, this.zzn);
                }
                if (this.zzk.zzd(i15)) {
                    zzaiy zzaiyVar5 = this.zzk;
                    this.zzn.zzD(this.zzk.zza, zzfu.zzb(zzaiyVar5.zza, zzaiyVar5.zzb));
                    this.zzn.zzG(5);
                    this.zza.zza(j11, this.zzn);
                }
                int i17 = i12 >> 1;
                this.zzd.zzd(j10, i14, i17, this.zzm, this.zze);
                if (!this.zze) {
                    this.zzg.zzc(i17);
                    this.zzh.zzc(i17);
                    this.zzi.zzc(i17);
                }
                this.zzj.zzc(i17);
                this.zzk.zzc(i17);
                iZzc = i11;
                iZzd = iZzd;
                bArrZzH = bArrZzH;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        this.zzb = zzajvVar.zzb();
        zzabz zzabzVarZzv = zzaazVar.zzv(zzajvVar.zza(), 2);
        this.zzc = zzabzVarZzv;
        this.zzd = new zzait(zzabzVarZzv);
        this.zza.zzb(zzaazVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzm = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfu.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzait zzaitVar = this.zzd;
        if (zzaitVar != null) {
            zzaitVar.zzc();
        }
    }
}
