package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzais implements zzaij {
    private final zzajk zza;
    private long zze;
    private String zzg;
    private zzabz zzh;
    private zzair zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaiy zzb = new zzaiy(7, 128);
    private final zzaiy zzc = new zzaiy(8, 128);
    private final zzaiy zzd = new zzaiy(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzfa zzm = new zzfa();

    public zzais(zzajk zzajkVar, boolean z10, boolean z11) {
        this.zza = zzajkVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i10, int i11) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i10, i11);
            this.zzc.zza(bArr, i10, i11);
        }
        this.zzd.zza(bArr, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) {
        int i10;
        int i11;
        zzaiy zzaiyVar;
        zzdy.zzb(this.zzh);
        int i12 = zzfj.zza;
        int iZzc = zzfaVar.zzc();
        int iZzd = zzfaVar.zzd();
        byte[] bArrZzH = zzfaVar.zzH();
        this.zze += (long) zzfaVar.zza();
        this.zzh.zzq(zzfaVar, zzfaVar.zza());
        while (true) {
            int iZza = zzfu.zza(bArrZzH, iZzc, iZzd, this.zzf);
            if (iZza == iZzd) {
                zzf(bArrZzH, iZzc, iZzd);
                return;
            }
            int i13 = iZza + 3;
            int i14 = bArrZzH[i13] & Ascii.US;
            int i15 = iZza - iZzc;
            if (i15 > 0) {
                zzf(bArrZzH, iZzc, iZza);
            }
            int i16 = iZzd - iZza;
            long j10 = this.zze - ((long) i16);
            int i17 = i15 < 0 ? -i15 : 0;
            long j11 = this.zzk;
            if (this.zzj) {
                i10 = iZzd;
                i11 = i13;
            } else {
                this.zzb.zzd(i17);
                this.zzc.zzd(i17);
                if (this.zzj) {
                    i10 = iZzd;
                    i11 = i13;
                    zzaiy zzaiyVar2 = this.zzb;
                    if (zzaiyVar2.zze()) {
                        this.zzi.zzb(zzfu.zze(zzaiyVar2.zza, 4, zzaiyVar2.zzb));
                        zzaiyVar = this.zzb;
                        zzaiyVar.zzb();
                    } else {
                        zzaiy zzaiyVar3 = this.zzc;
                        if (zzaiyVar3.zze()) {
                            this.zzi.zza(zzfu.zzd(zzaiyVar3.zza, 4, zzaiyVar3.zzb));
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzaiy zzaiyVar4 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzaiyVar4.zza, zzaiyVar4.zzb));
                    zzaiy zzaiyVar5 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzaiyVar5.zza, zzaiyVar5.zzb));
                    zzaiy zzaiyVar6 = this.zzb;
                    zzft zzftVarZze = zzfu.zze(zzaiyVar6.zza, 4, zzaiyVar6.zzb);
                    zzaiy zzaiyVar7 = this.zzc;
                    zzfs zzfsVarZzd = zzfu.zzd(zzaiyVar7.zza, 4, zzaiyVar7.zzb);
                    i11 = i13;
                    String strZza = zzea.zza(zzftVarZze.zza, zzftVarZze.zzb, zzftVarZze.zzc);
                    zzabz zzabzVar = this.zzh;
                    zzak zzakVar = new zzak();
                    i10 = iZzd;
                    zzakVar.zzH(this.zzg);
                    zzakVar.zzS("video/avc");
                    zzakVar.zzx(strZza);
                    zzakVar.zzX(zzftVarZze.zze);
                    zzakVar.zzF(zzftVarZze.zzf);
                    zzakVar.zzP(zzftVarZze.zzg);
                    zzakVar.zzI(arrayList);
                    zzabzVar.zzk(zzakVar.zzY());
                    this.zzj = true;
                    this.zzi.zzb(zzftVarZze);
                    this.zzi.zza(zzfsVarZzd);
                    this.zzb.zzb();
                } else {
                    i10 = iZzd;
                    i11 = i13;
                }
                zzaiyVar = this.zzc;
                zzaiyVar.zzb();
            }
            if (this.zzd.zzd(i17)) {
                zzaiy zzaiyVar8 = this.zzd;
                this.zzm.zzD(this.zzd.zza, zzfu.zzb(zzaiyVar8.zza, zzaiyVar8.zzb));
                this.zzm.zzF(4);
                this.zza.zza(j11, this.zzm);
            }
            if (this.zzi.zze(j10, i16, this.zzj, this.zzl)) {
                this.zzl = false;
            }
            long j12 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzc(i14);
                this.zzc.zzc(i14);
            }
            this.zzd.zzc(i14);
            this.zzi.zzd(j10, i14, j12);
            iZzc = i11;
            iZzd = i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        this.zzg = zzajvVar.zzb();
        zzabz zzabzVarZzv = zzaazVar.zzv(zzajvVar.zza(), 2);
        this.zzh = zzabzVarZzv;
        this.zzi = new zzair(zzabzVarZzv, false, false);
        this.zza.zzb(zzaazVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzk = j10;
        }
        this.zzl |= (i10 & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzfu.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzair zzairVar = this.zzi;
        if (zzairVar != null) {
            zzairVar.zzc();
        }
    }
}
