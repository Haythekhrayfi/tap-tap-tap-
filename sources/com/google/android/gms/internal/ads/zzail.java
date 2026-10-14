package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzail implements zzaij {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzabz zzc;
    private final zzajy zzd;
    private final zzfa zze;
    private final zzaiy zzf;
    private final boolean[] zzg;
    private final zzaik zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzail() {
        this(null);
    }

    public zzail(zzajy zzajyVar) {
        zzfa zzfaVar;
        this.zzd = zzajyVar;
        this.zzg = new boolean[4];
        this.zzh = new zzaik(128);
        if (zzajyVar != null) {
            this.zzf = new zzaiy(178, 128);
            zzfaVar = new zzfa();
        } else {
            zzfaVar = null;
            this.zzf = null;
        }
        this.zze = zzfaVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) {
        long j10;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        long j11;
        double d10;
        int i14;
        int i15;
        zzdy.zzb(this.zzc);
        int iZzc = zzfaVar.zzc();
        int iZzd = zzfaVar.zzd();
        byte[] bArrZzH = zzfaVar.zzH();
        this.zzi += (long) zzfaVar.zza();
        this.zzc.zzq(zzfaVar, zzfaVar.zza());
        while (true) {
            int iZza = zzfu.zza(bArrZzH, iZzc, iZzd, this.zzg);
            if (iZza == iZzd) {
                break;
            }
            int i16 = iZza + 3;
            int i17 = zzfaVar.zzH()[i16] & 255;
            int i18 = iZza - iZzc;
            if (!this.zzk) {
                if (i18 > 0) {
                    this.zzh.zza(bArrZzH, iZzc, iZza);
                }
                if (this.zzh.zzc(i17, i18 < 0 ? -i18 : 0)) {
                    zzaik zzaikVar = this.zzh;
                    String str = this.zzb;
                    Objects.requireNonNull(str);
                    byte[] bArrCopyOf = Arrays.copyOf(zzaikVar.zzc, zzaikVar.zza);
                    int i19 = bArrCopyOf[4] & 255;
                    int i20 = bArrCopyOf[5] & 255;
                    int i21 = bArrCopyOf[6] & 255;
                    int i22 = i20 & 15;
                    int i23 = (i20 >> 4) | (i19 << 4);
                    int i24 = (bArrCopyOf[7] & 240) >> 4;
                    int i25 = (i22 << 8) | i21;
                    if (i24 == 2) {
                        i11 = i25 * 4;
                        i12 = i23 * 3;
                    } else if (i24 != 3) {
                        if (i24 != 4) {
                            f10 = 1.0f;
                        } else {
                            i11 = i25 * 121;
                            i12 = i23 * 100;
                        }
                        zzak zzakVar = new zzak();
                        zzakVar.zzH(str);
                        zzakVar.zzS("video/mpeg2");
                        zzakVar.zzX(i23);
                        zzakVar.zzF(i25);
                        zzakVar.zzP(f10);
                        zzakVar.zzI(Collections.singletonList(bArrCopyOf));
                        zzam zzamVarZzY = zzakVar.zzY();
                        i13 = (bArrCopyOf[7] & 15) - 1;
                        j11 = 0;
                        if (i13 >= 0 && i13 < 8) {
                            d10 = zza[i13];
                            byte b10 = bArrCopyOf[zzaikVar.zzb + 9];
                            i14 = (b10 & 96) >> 5;
                            i15 = b10 & Ascii.US;
                            if (i14 != i15) {
                                d10 *= (((double) i14) + 1.0d) / ((double) (i15 + 1));
                            }
                            j11 = (long) (1000000.0d / d10);
                        }
                        Pair pairCreate = Pair.create(zzamVarZzY, Long.valueOf(j11));
                        this.zzc.zzk((zzam) pairCreate.first);
                        this.zzl = ((Long) pairCreate.second).longValue();
                        this.zzk = true;
                    } else {
                        i11 = i25 * 16;
                        i12 = i23 * 9;
                    }
                    f10 = i11 / i12;
                    zzak zzakVar2 = new zzak();
                    zzakVar2.zzH(str);
                    zzakVar2.zzS("video/mpeg2");
                    zzakVar2.zzX(i23);
                    zzakVar2.zzF(i25);
                    zzakVar2.zzP(f10);
                    zzakVar2.zzI(Collections.singletonList(bArrCopyOf));
                    zzam zzamVarZzY2 = zzakVar2.zzY();
                    i13 = (bArrCopyOf[7] & 15) - 1;
                    j11 = 0;
                    if (i13 >= 0) {
                        d10 = zza[i13];
                        byte b11 = bArrCopyOf[zzaikVar.zzb + 9];
                        i14 = (b11 & 96) >> 5;
                        i15 = b11 & Ascii.US;
                        if (i14 != i15) {
                            d10 *= (((double) i14) + 1.0d) / ((double) (i15 + 1));
                        }
                        j11 = (long) (1000000.0d / d10);
                    }
                    Pair pairCreate2 = Pair.create(zzamVarZzY2, Long.valueOf(j11));
                    this.zzc.zzk((zzam) pairCreate2.first);
                    this.zzl = ((Long) pairCreate2.second).longValue();
                    this.zzk = true;
                }
            }
            zzaiy zzaiyVar = this.zzf;
            if (zzaiyVar != null) {
                if (i18 > 0) {
                    zzaiyVar.zza(bArrZzH, iZzc, iZza);
                    i10 = 0;
                } else {
                    i10 = -i18;
                }
                if (this.zzf.zzd(i10)) {
                    zzaiy zzaiyVar2 = this.zzf;
                    int iZzb = zzfu.zzb(zzaiyVar2.zza, zzaiyVar2.zzb);
                    zzfa zzfaVar2 = this.zze;
                    int i26 = zzfj.zza;
                    zzfaVar2.zzD(this.zzf.zza, iZzb);
                    this.zzd.zza(this.zzo, this.zze);
                }
                if (i17 == 178) {
                    if (zzfaVar.zzH()[iZza + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i17 = 178;
                }
            }
            if (i17 == 0 || i17 == 179) {
                int i27 = iZzd - iZza;
                if (this.zzq && this.zzk) {
                    long j12 = this.zzo;
                    if (j12 != -9223372036854775807L) {
                        j10 = -9223372036854775807L;
                        this.zzc.zzs(j12, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i27, i27, null);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                } else {
                    j10 = -9223372036854775807L;
                }
                if (!this.zzj || this.zzq) {
                    this.zzn = this.zzi - ((long) i27);
                    long j13 = this.zzm;
                    if (j13 == j10) {
                        long j14 = this.zzo;
                        j13 = j14 != j10 ? j14 + this.zzl : j10;
                    }
                    this.zzo = j13;
                    z10 = false;
                    this.zzp = false;
                    this.zzm = j10;
                    z11 = true;
                    this.zzj = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                this.zzq = i17 == 0 ? z11 : z10;
            } else {
                if (i17 == 184) {
                    this.zzp = true;
                }
                iZzd = iZzd;
                bArrZzH = bArrZzH;
            }
            iZzd = iZzd;
            bArrZzH = bArrZzH;
            iZzc = i16;
        }
        if (!this.zzk) {
            this.zzh.zza(bArrZzH, iZzc, iZzd);
        }
        zzaiy zzaiyVar3 = this.zzf;
        if (zzaiyVar3 != null) {
            zzaiyVar3.zza(bArrZzH, iZzc, iZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        this.zzb = zzajvVar.zzb();
        this.zzc = zzaazVar.zzv(zzajvVar.zza(), 2);
        zzajy zzajyVar = this.zzd;
        if (zzajyVar != null) {
            zzajyVar.zzb(zzaazVar, zzajvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzd(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        zzfu.zzf(this.zzg);
        this.zzh.zzb();
        zzaiy zzaiyVar = this.zzf;
        if (zzaiyVar != null) {
            zzaiyVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
