package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaio implements zzaij {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzajy zzb;
    private final zzfa zzc;
    private final boolean[] zzd;
    private final zzaim zze;
    private final zzaiy zzf;
    private zzain zzg;
    private long zzh;
    private String zzi;
    private zzabz zzj;
    private boolean zzk;
    private long zzl;

    public zzaio() {
        this(null);
    }

    public zzaio(zzajy zzajyVar) {
        this.zzb = zzajyVar;
        this.zzd = new boolean[4];
        this.zze = new zzaim(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzaiy(178, 128);
        this.zzc = new zzfa();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) {
        int i10;
        int i11;
        zzdy.zzb(this.zzg);
        zzdy.zzb(this.zzj);
        int iZzc = zzfaVar.zzc();
        int iZzd = zzfaVar.zzd();
        byte[] bArrZzH = zzfaVar.zzH();
        this.zzh += (long) zzfaVar.zza();
        this.zzj.zzq(zzfaVar, zzfaVar.zza());
        while (true) {
            int iZza = zzfu.zza(bArrZzH, iZzc, iZzd, this.zzd);
            if (iZza == iZzd) {
                break;
            }
            int i12 = iZza + 3;
            int i13 = zzfaVar.zzH()[i12] & 255;
            int i14 = iZza - iZzc;
            if (!this.zzk) {
                if (i14 > 0) {
                    this.zze.zza(bArrZzH, iZzc, iZza);
                }
                if (this.zze.zzc(i13, i14 < 0 ? -i14 : 0)) {
                    zzabz zzabzVar = this.zzj;
                    zzaim zzaimVar = this.zze;
                    int i15 = zzaimVar.zzb;
                    String str = this.zzi;
                    Objects.requireNonNull(str);
                    byte[] bArrCopyOf = Arrays.copyOf(zzaimVar.zzc, zzaimVar.zza);
                    zzez zzezVar = new zzez(bArrCopyOf, bArrCopyOf.length);
                    zzezVar.zzm(i15);
                    zzezVar.zzm(4);
                    zzezVar.zzk();
                    zzezVar.zzl(8);
                    if (zzezVar.zzn()) {
                        zzezVar.zzl(4);
                        zzezVar.zzl(3);
                    }
                    int iZzd2 = zzezVar.zzd(4);
                    float f10 = 1.0f;
                    if (iZzd2 == 15) {
                        int iZzd3 = zzezVar.zzd(8);
                        int iZzd4 = zzezVar.zzd(8);
                        if (iZzd4 == 0) {
                            zzer.zzf("H263Reader", "Invalid aspect ratio");
                        } else {
                            f10 = iZzd3 / iZzd4;
                        }
                    } else if (iZzd2 < 7) {
                        f10 = zza[iZzd2];
                    } else {
                        zzer.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    float f11 = f10;
                    if (zzezVar.zzn()) {
                        zzezVar.zzl(2);
                        zzezVar.zzl(1);
                        if (zzezVar.zzn()) {
                            zzezVar.zzl(15);
                            zzezVar.zzk();
                            zzezVar.zzl(15);
                            zzezVar.zzk();
                            zzezVar.zzl(15);
                            zzezVar.zzk();
                            zzezVar.zzl(3);
                            zzezVar.zzl(11);
                            zzezVar.zzk();
                            zzezVar.zzl(15);
                            zzezVar.zzk();
                            i11 = 2;
                        } else {
                            i11 = 2;
                        }
                    } else {
                        i11 = 2;
                    }
                    if (zzezVar.zzd(i11) != 0) {
                        zzer.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzezVar.zzk();
                    int iZzd5 = zzezVar.zzd(16);
                    zzezVar.zzk();
                    if (zzezVar.zzn()) {
                        if (iZzd5 == 0) {
                            zzer.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i16 = iZzd5 - 1;
                            int i17 = 0;
                            while (i16 > 0) {
                                i16 >>= 1;
                                i17++;
                            }
                            zzezVar.zzl(i17);
                        }
                    }
                    zzezVar.zzk();
                    int iZzd6 = zzezVar.zzd(13);
                    zzezVar.zzk();
                    int iZzd7 = zzezVar.zzd(13);
                    zzezVar.zzk();
                    zzezVar.zzk();
                    zzak zzakVar = new zzak();
                    zzakVar.zzH(str);
                    zzakVar.zzS("video/mp4v-es");
                    zzakVar.zzX(iZzd6);
                    zzakVar.zzF(iZzd7);
                    zzakVar.zzP(f11);
                    zzakVar.zzI(Collections.singletonList(bArrCopyOf));
                    zzabzVar.zzk(zzakVar.zzY());
                    this.zzk = true;
                }
            }
            this.zzg.zza(bArrZzH, iZzc, iZza);
            zzaiy zzaiyVar = this.zzf;
            if (i14 > 0) {
                zzaiyVar.zza(bArrZzH, iZzc, iZza);
                i10 = 0;
            } else {
                i10 = -i14;
            }
            if (this.zzf.zzd(i10)) {
                zzaiy zzaiyVar2 = this.zzf;
                int iZzb = zzfu.zzb(zzaiyVar2.zza, zzaiyVar2.zzb);
                zzfa zzfaVar2 = this.zzc;
                int i18 = zzfj.zza;
                zzfaVar2.zzD(this.zzf.zza, iZzb);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if (i13 == 178) {
                if (zzfaVar.zzH()[iZza + 2] == 1) {
                    this.zzf.zzc(178);
                }
                i13 = 178;
            }
            int i19 = iZzd - iZza;
            this.zzg.zzb(this.zzh - ((long) i19), i19, this.zzk);
            this.zzg.zzc(i13, this.zzl);
            iZzc = i12;
        }
        if (!this.zzk) {
            this.zze.zza(bArrZzH, iZzc, iZzd);
        }
        this.zzg.zza(bArrZzH, iZzc, iZzd);
        this.zzf.zza(bArrZzH, iZzc, iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        this.zzi = zzajvVar.zzb();
        zzabz zzabzVarZzv = zzaazVar.zzv(zzajvVar.zza(), 2);
        this.zzj = zzabzVarZzv;
        this.zzg = new zzain(zzabzVarZzv);
        this.zzb.zzb(zzaazVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzl = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        zzfu.zzf(this.zzd);
        this.zze.zzb();
        zzain zzainVar = this.zzg;
        if (zzainVar != null) {
            zzainVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }
}
