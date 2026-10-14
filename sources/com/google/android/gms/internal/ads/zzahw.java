package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
final class zzahw extends zzahu {
    private zzahv zza;
    private int zzb;
    private boolean zzc;
    private zzace zzd;
    private zzacc zze;

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zza(zzfa zzfaVar) {
        if ((zzfaVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzfaVar.zzH()[0];
        zzahv zzahvVar = this.zza;
        zzdy.zzb(zzahvVar);
        int i10 = !zzahvVar.zzd[(b10 >> 1) & (255 >>> (8 - zzahvVar.zze))].zza ? zzahvVar.zza.zze : zzahvVar.zza.zzf;
        int i11 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzfaVar.zzb() < zzfaVar.zzd() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzfaVar.zzH(), zzfaVar.zzd() + 4);
            zzfaVar.zzD(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzfaVar.zzE(zzfaVar.zzd() + 4);
        }
        long j10 = i11;
        byte[] bArrZzH = zzfaVar.zzH();
        bArrZzH[zzfaVar.zzd() - 4] = (byte) (j10 & 255);
        bArrZzH[zzfaVar.zzd() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrZzH[zzfaVar.zzd() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrZzH[zzfaVar.zzd() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03bd  */
    @Override // com.google.android.gms.internal.ads.zzahu
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzfa zzfaVar, long j10, zzahr zzahrVar) throws IOException {
        zzahv zzahvVar;
        int i10;
        int iZzb;
        int i11;
        if (this.zza != null) {
            Objects.requireNonNull(zzahrVar.zza);
            return false;
        }
        zzace zzaceVar = this.zzd;
        int i12 = 4;
        if (zzaceVar != null) {
            zzacc zzaccVar = this.zze;
            if (zzaccVar == null) {
                this.zze = zzacf.zzc(zzfaVar, true, true);
            } else {
                byte[] bArr = new byte[zzfaVar.zzd()];
                System.arraycopy(zzfaVar.zzH(), 0, bArr, 0, zzfaVar.zzd());
                int i13 = zzaceVar.zza;
                int i14 = 5;
                zzacf.zzd(5, zzfaVar, false);
                int iZzk = zzfaVar.zzk() + 1;
                zzacb zzacbVar = new zzacb(zzfaVar.zzH());
                zzacbVar.zzc(zzfaVar.zzc() * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 2;
                    int i17 = 16;
                    if (i15 >= iZzk) {
                        zzace zzaceVar2 = zzaceVar;
                        int i18 = 6;
                        int iZzb2 = zzacbVar.zzb(6) + 1;
                        for (int i19 = 0; i19 < iZzb2; i19++) {
                            if (zzacbVar.zzb(16) != 0) {
                                throw zzcd.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i20 = 1;
                        int iZzb3 = zzacbVar.zzb(6) + 1;
                        int i21 = 0;
                        while (true) {
                            int i22 = 3;
                            if (i21 >= iZzb3) {
                                int i23 = 1;
                                int iZzb4 = zzacbVar.zzb(i18) + 1;
                                int i24 = 0;
                                while (i24 < iZzb4) {
                                    if (zzacbVar.zzb(16) > 2) {
                                        throw zzcd.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzacbVar.zzc(24);
                                    zzacbVar.zzc(24);
                                    zzacbVar.zzc(24);
                                    int iZzb5 = zzacbVar.zzb(i18) + i23;
                                    int i25 = 8;
                                    zzacbVar.zzc(8);
                                    int[] iArr = new int[iZzb5];
                                    for (int i26 = 0; i26 < iZzb5; i26++) {
                                        iArr[i26] = ((zzacbVar.zzd() ? zzacbVar.zzb(5) : 0) * 8) + zzacbVar.zzb(3);
                                    }
                                    int i27 = 0;
                                    while (i27 < iZzb5) {
                                        int i28 = 0;
                                        while (i28 < i25) {
                                            if ((iArr[i27] & (1 << i28)) != 0) {
                                                zzacbVar.zzc(i25);
                                            }
                                            i28++;
                                            i25 = 8;
                                        }
                                        i27++;
                                        i25 = 8;
                                    }
                                    i24++;
                                    i18 = 6;
                                    i23 = 1;
                                }
                                int iZzb6 = zzacbVar.zzb(i18) + 1;
                                for (int i29 = 0; i29 < iZzb6; i29++) {
                                    int iZzb7 = zzacbVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        zzer.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb7);
                                    } else {
                                        if (zzacbVar.zzd()) {
                                            i10 = 1;
                                            iZzb = zzacbVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzacbVar.zzd()) {
                                            int iZzb8 = zzacbVar.zzb(8) + i10;
                                            for (int i30 = 0; i30 < iZzb8; i30++) {
                                                int i31 = i13 - 1;
                                                zzacbVar.zzc(zzacf.zza(i31));
                                                zzacbVar.zzc(zzacf.zza(i31));
                                            }
                                        }
                                        if (zzacbVar.zzb(2) != 0) {
                                            throw zzcd.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i32 = 0; i32 < i13; i32++) {
                                                zzacbVar.zzc(4);
                                            }
                                        }
                                        for (int i33 = 0; i33 < iZzb; i33++) {
                                            zzacbVar.zzc(8);
                                            zzacbVar.zzc(8);
                                            zzacbVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzacbVar.zzb(6) + 1;
                                zzacd[] zzacdVarArr = new zzacd[iZzb9];
                                for (int i34 = 0; i34 < iZzb9; i34++) {
                                    zzacdVarArr[i34] = new zzacd(zzacbVar.zzd(), zzacbVar.zzb(16), zzacbVar.zzb(16), zzacbVar.zzb(8));
                                }
                                if (!zzacbVar.zzd()) {
                                    throw zzcd.zza("framing bit after modes not set as expected", null);
                                }
                                zzahvVar = new zzahv(zzaceVar2, zzaccVar, bArr, zzacdVarArr, zzacf.zza(iZzb9 - 1));
                                break;
                            }
                            int iZzb10 = zzacbVar.zzb(i17);
                            if (iZzb10 == 0) {
                                i11 = iZzb3;
                                int i35 = 8;
                                zzacbVar.zzc(8);
                                zzacbVar.zzc(16);
                                zzacbVar.zzc(16);
                                zzacbVar.zzc(6);
                                zzacbVar.zzc(8);
                                int iZzb11 = zzacbVar.zzb(4) + 1;
                                int i36 = 0;
                                while (i36 < iZzb11) {
                                    zzacbVar.zzc(i35);
                                    i36++;
                                    i35 = 8;
                                }
                            } else {
                                if (iZzb10 != i20) {
                                    throw zzcd.zza("floor type greater than 1 not decodable: " + iZzb10, null);
                                }
                                int iZzb12 = zzacbVar.zzb(i14);
                                int[] iArr2 = new int[iZzb12];
                                int i37 = -1;
                                for (int i38 = 0; i38 < iZzb12; i38++) {
                                    int iZzb13 = zzacbVar.zzb(4);
                                    iArr2[i38] = iZzb13;
                                    if (iZzb13 > i37) {
                                        i37 = iZzb13;
                                    }
                                }
                                int i39 = i37 + 1;
                                int[] iArr3 = new int[i39];
                                int i40 = 0;
                                while (i40 < i39) {
                                    iArr3[i40] = zzacbVar.zzb(i22) + 1;
                                    int iZzb14 = zzacbVar.zzb(i16);
                                    int i41 = 8;
                                    if (iZzb14 > 0) {
                                        zzacbVar.zzc(8);
                                    }
                                    int i42 = iZzb3;
                                    int i43 = 0;
                                    for (int i44 = 1; i43 < (i44 << iZzb14); i44 = 1) {
                                        zzacbVar.zzc(i41);
                                        i43++;
                                        i41 = 8;
                                    }
                                    i40++;
                                    iZzb3 = i42;
                                    i16 = 2;
                                    i22 = 3;
                                }
                                i11 = iZzb3;
                                zzacbVar.zzc(i16);
                                int iZzb15 = zzacbVar.zzb(4);
                                int i45 = 0;
                                int i46 = 0;
                                for (int i47 = 0; i47 < iZzb12; i47++) {
                                    i45 += iArr3[iArr2[i47]];
                                    while (i46 < i45) {
                                        zzacbVar.zzc(iZzb15);
                                        i46++;
                                    }
                                }
                            }
                            i21++;
                            iZzb3 = i11;
                            i18 = 6;
                            i17 = 16;
                            i16 = 2;
                            i20 = 1;
                            i14 = 5;
                        }
                    } else {
                        if (zzacbVar.zzb(24) != 5653314) {
                            throw zzcd.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzacbVar.zza(), null);
                        }
                        int iZzb16 = zzacbVar.zzb(16);
                        int iZzb17 = zzacbVar.zzb(24);
                        if (zzacbVar.zzd()) {
                            zzacbVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzacbVar.zzb(zzacf.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzacbVar.zzd();
                            for (int i48 = 0; i48 < iZzb17; i48++) {
                                if (!zZzd || zzacbVar.zzd()) {
                                    zzacbVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzacbVar.zzb(i12);
                        if (iZzb19 > 2) {
                            throw zzcd.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 == 2) {
                            }
                            i15++;
                            zzaceVar = zzaceVar;
                            i12 = 4;
                        } else {
                            i16 = iZzb19;
                        }
                        zzacbVar.zzc(32);
                        zzacbVar.zzc(32);
                        int iZzb20 = zzacbVar.zzb(i12) + 1;
                        zzacbVar.zzc(1);
                        zzacbVar.zzc((int) ((i16 == 1 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb17) * ((long) iZzb16)) * ((long) iZzb20)));
                        i15++;
                        zzaceVar = zzaceVar;
                        i12 = 4;
                    }
                }
            }
            this.zza = zzahvVar;
            if (zzahvVar == null) {
                return true;
            }
            zzace zzaceVar3 = zzahvVar.zza;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzaceVar3.zzg);
            arrayList.add(zzahvVar.zzc);
            zzbz zzbzVarZzb = zzacf.zzb(zzfsc.zzk(zzahvVar.zzb.zzb));
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/vorbis");
            zzakVar.zzv(zzaceVar3.zzd);
            zzakVar.zzO(zzaceVar3.zzc);
            zzakVar.zzw(zzaceVar3.zza);
            zzakVar.zzT(zzaceVar3.zzb);
            zzakVar.zzI(arrayList);
            zzakVar.zzM(zzbzVarZzb);
            zzahrVar.zza = zzakVar.zzY();
            return true;
        }
        zzacf.zzd(1, zzfaVar, false);
        int iZzh = zzfaVar.zzh();
        int iZzk2 = zzfaVar.zzk();
        int iZzh2 = zzfaVar.zzh();
        int iZzg = zzfaVar.zzg();
        int i49 = iZzg <= 0 ? -1 : iZzg;
        int iZzg2 = zzfaVar.zzg();
        int i50 = iZzg2 <= 0 ? -1 : iZzg2;
        int iZzg3 = zzfaVar.zzg();
        int i51 = iZzg3 <= 0 ? -1 : iZzg3;
        int iZzk3 = zzfaVar.zzk();
        this.zzd = new zzace(iZzh, iZzk2, iZzh2, i49, i50, i51, (int) Math.pow(2.0d, iZzk3 & 15), (int) Math.pow(2.0d, (iZzk3 & 240) >> 4), 1 == (zzfaVar.zzk() & 1), Arrays.copyOf(zzfaVar.zzH(), zzfaVar.zzd()));
        zzahvVar = null;
        this.zza = zzahvVar;
        if (zzahvVar == null) {
            return true;
        }
        zzace zzaceVar4 = zzahvVar.zza;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(zzaceVar4.zzg);
        arrayList2.add(zzahvVar.zzc);
        zzbz zzbzVarZzb2 = zzacf.zzb(zzfsc.zzk(zzahvVar.zzb.zzb));
        zzak zzakVar2 = new zzak();
        zzakVar2.zzS("audio/vorbis");
        zzakVar2.zzv(zzaceVar4.zzd);
        zzakVar2.zzO(zzaceVar4.zzc);
        zzakVar2.zzw(zzaceVar4.zza);
        zzakVar2.zzT(zzaceVar4.zzb);
        zzakVar2.zzI(arrayList2);
        zzakVar2.zzM(zzbzVarZzb2);
        zzahrVar.zza = zzakVar2.zzY();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzi(long j10) {
        super.zzi(j10);
        this.zzc = j10 != 0;
        zzace zzaceVar = this.zzd;
        this.zzb = zzaceVar != null ? zzaceVar.zze : 0;
    }
}
