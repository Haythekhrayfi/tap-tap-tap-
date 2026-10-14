package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagy implements zzaaw, zzabv {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzagv
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzagy.zza;
            return new zzaaw[]{new zzagy(0)};
        }
    };
    private final zzfa zzb;
    private final zzfa zzc;
    private final zzfa zzd;
    private final zzfa zze;
    private final ArrayDeque zzf;
    private final zzaha zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzfa zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzaaz zzr;
    private zzagx[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzafa zzx;

    public zzagy() {
        this(0);
    }

    public zzagy(int i10) {
        this.zzi = 0;
        this.zzg = new zzaha();
        this.zzh = new ArrayList();
        this.zze = new zzfa(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzfa(zzfu.zza);
        this.zzc = new zzfa(4);
        this.zzd = new zzfa();
        this.zzn = -1;
        this.zzr = zzaaz.zza;
        this.zzs = new zzagx[0];
    }

    private static int zzf(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzahf zzahfVar, long j10) {
        int iZza = zzahfVar.zza(j10);
        return iZza == -1 ? zzahfVar.zzb(j10) : iZza;
    }

    private static long zzj(zzahf zzahfVar, long j10, long j11) {
        int iZzi = zzi(zzahfVar, j10);
        return iZzi == -1 ? j11 : Math.min(zzahfVar.zzc[iZzi], j11);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01a2 A[LOOP:2: B:76:0x019f->B:78:0x01a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cd A[ADDED_TO_REGION] */
    private final void zzl(long j10) throws zzcd {
        zzbz zzbzVar;
        zzbz zzbzVar2;
        zzbz zzbzVar3;
        long j11;
        zzbz zzbzVar4;
        int i10;
        zzbz zzbzVar5;
        long j12;
        int i11;
        int i12;
        while (!this.zzf.isEmpty() && ((zzagc) this.zzf.peek()).zza == j10) {
            zzagc zzagcVar = (zzagc) this.zzf.pop();
            if (zzagcVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i13 = this.zzw;
                zzabl zzablVar = new zzabl();
                zzagd zzagdVarZzb = zzagcVar.zzb(1969517665);
                if (zzagdVarZzb != null) {
                    zzagm zzagmVarZzb = zzagn.zzb(zzagdVarZzb);
                    zzbz zzbzVar6 = zzagmVarZzb.zza;
                    zzbz zzbzVar7 = zzagmVarZzb.zzb;
                    zzbz zzbzVar8 = zzagmVarZzb.zzc;
                    if (zzbzVar6 != null) {
                        zzablVar.zzb(zzbzVar6);
                    }
                    zzbzVar = zzbzVar8;
                    zzbzVar2 = zzbzVar6;
                    zzbzVar3 = zzbzVar7;
                } else {
                    zzbzVar = null;
                    zzbzVar2 = null;
                    zzbzVar3 = null;
                }
                zzagc zzagcVarZza = zzagcVar.zza(1835365473);
                zzbz zzbzVarZza = zzagcVarZza != null ? zzagn.zza(zzagcVarZza) : null;
                List listZzc = zzagn.zzc(zzagcVar, zzablVar, -9223372036854775807L, null, false, i13 == 1, new zzfov() { // from class: com.google.android.gms.internal.ads.zzagw
                    @Override // com.google.android.gms.internal.ads.zzfov
                    public final Object apply(Object obj) {
                        zzahc zzahcVar = (zzahc) obj;
                        zzabd zzabdVar = zzagy.zza;
                        return zzahcVar;
                    }
                });
                int size = listZzc.size();
                long j13 = -9223372036854775807L;
                zzbz zzbzVar9 = zzbzVar;
                int size2 = -1;
                int i14 = 0;
                long j14 = -9223372036854775807L;
                while (true) {
                    j11 = 0;
                    if (i14 >= size) {
                        break;
                    }
                    zzahf zzahfVar = (zzahf) listZzc.get(i14);
                    if (zzahfVar.zzb == 0) {
                        zzbzVar5 = zzbzVarZza;
                        zzablVar = zzablVar;
                        j12 = j13;
                    } else {
                        zzahc zzahcVar = zzahfVar.zza;
                        long j15 = zzahcVar.zze;
                        if (j15 == j13) {
                            j15 = zzahfVar.zzh;
                        }
                        long jMax = Math.max(j14, j15);
                        zzagx zzagxVar = new zzagx(zzahcVar, zzahfVar, this.zzr.zzv(i14, zzahcVar.zzb));
                        int i15 = "audio/true-hd".equals(zzahcVar.zzf.zzm) ? zzahfVar.zze * 16 : zzahfVar.zze + 30;
                        zzak zzakVarZzb = zzahcVar.zzf.zzb();
                        zzakVarZzb.zzL(i15);
                        if (zzahcVar.zzb == 2 && j15 > 0 && (i12 = zzahfVar.zzb) > 1) {
                            zzakVarZzb.zzE(i12 / (j15 / 1000000.0f));
                        }
                        if (zzahcVar.zzb == 1 && zzablVar.zza()) {
                            zzakVarZzb.zzC(zzablVar.zza);
                            zzakVarZzb.zzD(zzablVar.zzb);
                        }
                        int i16 = zzahcVar.zzb;
                        zzbz[] zzbzVarArr = new zzbz[3];
                        zzbzVarArr[0] = zzbzVar3;
                        if (this.zzh.isEmpty()) {
                            i10 = 1;
                            zzbzVar4 = null;
                        } else {
                            zzbzVar4 = new zzbz(this.zzh);
                            i10 = 1;
                        }
                        zzbzVarArr[i10] = zzbzVar4;
                        zzbzVarArr[2] = zzbzVar9;
                        int i17 = size2;
                        zzbz zzbzVar10 = new zzbz(-9223372036854775807L, new zzby[0]);
                        if (i16 == i10) {
                            if (zzbzVar2 != null) {
                                zzbzVar10 = zzbzVar2;
                            }
                            zzbzVar5 = zzbzVarZza;
                            j12 = -9223372036854775807L;
                            for (i11 = 0; i11 < 3; i11++) {
                                zzbzVar10 = zzbzVar10.zzd(zzbzVarArr[i11]);
                            }
                            if (zzbzVar10.zza() > 0) {
                                zzakVarZzb.zzM(zzbzVar10);
                            }
                            zzagxVar.zzc.zzk(zzakVarZzb.zzY());
                            size2 = (zzahcVar.zzb == 2 || i17 != -1) ? i17 : arrayList.size();
                            arrayList.add(zzagxVar);
                            j14 = jMax;
                        } else {
                            if (i16 == 2) {
                                zzbzVar5 = zzbzVarZza;
                                if (zzbzVar5 != null) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < zzbzVar5.zza()) {
                                            zzby zzbyVarZzb = zzbzVar5.zzb(i18);
                                            if (zzbyVarZzb instanceof zzfn) {
                                                zzfn zzfnVar = (zzfn) zzbyVarZzb;
                                                if ("com.android.capture.fps".equals(zzfnVar.zza)) {
                                                    zzby[] zzbyVarArr = {zzfnVar};
                                                    zzablVar = zzablVar;
                                                    j12 = -9223372036854775807L;
                                                    zzbzVar10 = new zzbz(-9223372036854775807L, zzbyVarArr);
                                                }
                                            }
                                            i18++;
                                            zzablVar = zzablVar;
                                        }
                                    }
                                }
                                zzablVar = zzablVar;
                                j12 = -9223372036854775807L;
                            }
                            while (i11 < 3) {
                                zzbzVar10 = zzbzVar10.zzd(zzbzVarArr[i11]);
                            }
                            if (zzbzVar10.zza() > 0) {
                                zzakVarZzb.zzM(zzbzVar10);
                            }
                            zzagxVar.zzc.zzk(zzakVarZzb.zzY());
                            if (zzahcVar.zzb == 2) {
                            }
                            arrayList.add(zzagxVar);
                            j14 = jMax;
                        }
                        zzbzVar5 = zzbzVarZza;
                        j12 = -9223372036854775807L;
                        while (i11 < 3) {
                            zzbzVar10 = zzbzVar10.zzd(zzbzVarArr[i11]);
                        }
                        if (zzbzVar10.zza() > 0) {
                            zzakVarZzb.zzM(zzbzVar10);
                        }
                        zzagxVar.zzc.zzk(zzakVarZzb.zzY());
                        if (zzahcVar.zzb == 2) {
                        }
                        arrayList.add(zzagxVar);
                        j14 = jMax;
                    }
                    i14++;
                    zzbzVarZza = zzbzVar5;
                    listZzc = listZzc;
                    size = size;
                    zzablVar = zzablVar;
                    j13 = j12;
                    zzbzVar9 = zzbzVar9;
                }
                this.zzu = size2;
                this.zzv = j14;
                zzagx[] zzagxVarArr = (zzagx[]) arrayList.toArray(new zzagx[0]);
                this.zzs = zzagxVarArr;
                int length = zzagxVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i19 = 0; i19 < zzagxVarArr.length; i19++) {
                    jArr[i19] = new long[zzagxVarArr[i19].zzb.zzb];
                    jArr2[i19] = zzagxVarArr[i19].zzb.zzf[0];
                }
                int i20 = 0;
                while (i20 < zzagxVarArr.length) {
                    long j16 = RecyclerView.FOREVER_NS;
                    int i21 = -1;
                    for (int i22 = 0; i22 < zzagxVarArr.length; i22++) {
                        if (!zArr[i22]) {
                            long j17 = jArr2[i22];
                            if (j17 <= j16) {
                                i21 = i22;
                                j16 = j17;
                            }
                        }
                    }
                    int i23 = iArr[i21];
                    long[] jArr3 = jArr[i21];
                    jArr3[i23] = j11;
                    zzahf zzahfVar2 = zzagxVarArr[i21].zzb;
                    j11 += (long) zzahfVar2.zzd[i23];
                    int i24 = i23 + 1;
                    iArr[i21] = i24;
                    if (i24 < jArr3.length) {
                        jArr2[i21] = zzahfVar2.zzf[i24];
                    } else {
                        zArr[i21] = true;
                        i20++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzC();
                this.zzr.zzN(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzagc) this.zzf.peek()).zzc(zzagcVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:218:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        boolean z10;
        boolean z11;
        long jZzf;
        long j10;
        int i10;
        int i11;
        long j11;
        long j12;
        long j13;
        zzfa zzfaVar;
        while (true) {
            int i12 = this.zzi;
            if (i12 == 0) {
                if (this.zzl == 0) {
                    if (!zzaaxVar.zzn(this.zze.zzH(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzl = 8;
                    this.zze.zzF(0);
                    this.zzk = this.zze.zzs();
                    this.zzj = this.zze.zze();
                }
                long j14 = this.zzk;
                if (j14 == 1) {
                    zzaaxVar.zzi(this.zze.zzH(), 8, 8);
                    this.zzl += 8;
                    jZzf = this.zze.zzt();
                } else {
                    if (j14 == 0) {
                        long jZzd = zzaaxVar.zzd();
                        if (jZzd == -1) {
                            zzagc zzagcVar = (zzagc) this.zzf.peek();
                            jZzd = zzagcVar != null ? zzagcVar.zza : -1L;
                        }
                        if (jZzd != -1) {
                            jZzf = (jZzd - zzaaxVar.zzf()) + ((long) this.zzl);
                        }
                    }
                    j10 = this.zzk;
                    i10 = this.zzl;
                    if (j10 >= i10) {
                        throw zzcd.zzc("Atom size less than header length (unsupported).");
                    }
                    i11 = this.zzj;
                    if (i11 != 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1701082227 || i11 == 1835365473) {
                        long jZzf2 = zzaaxVar.zzf();
                        j11 = this.zzk;
                        long j15 = jZzf2 + j11;
                        j12 = this.zzl;
                        if (j11 != j12 && this.zzj == 1835365473) {
                            this.zzd.zzC(8);
                            zzaaxVar.zzh(this.zzd.zzH(), 0, 8);
                            zzagn.zzd(this.zzd);
                            zzaaxVar.zzk(this.zzd.zzc());
                            zzaaxVar.zzj();
                        }
                        j13 = j15 - j12;
                        this.zzf.push(new zzagc(this.zzj, j13));
                        if (this.zzk == this.zzl) {
                            zzl(j13);
                        } else {
                            zzk();
                        }
                    } else {
                        if (i11 == 1835296868 || i11 == 1836476516 || i11 == 1751411826 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1937011571 || i11 == 1668576371 || i11 == 1701606260 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1953196132 || i11 == 1718909296 || i11 == 1969517665 || i11 == 1801812339 || i11 == 1768715124) {
                            zzdy.zzf(i10 == 8);
                            zzdy.zzf(this.zzk <= 2147483647L);
                            zzfaVar = new zzfa((int) this.zzk);
                            System.arraycopy(this.zze.zzH(), 0, zzfaVar.zzH(), 0, 8);
                        } else {
                            long jZzf3 = zzaaxVar.zzf();
                            long j16 = this.zzl;
                            long j17 = jZzf3 - j16;
                            if (this.zzj == 1836086884) {
                                this.zzx = new zzafa(0L, j17, -9223372036854775807L, j17 + j16, this.zzk - j16);
                            }
                            zzfaVar = null;
                        }
                        this.zzm = zzfaVar;
                        this.zzi = 1;
                    }
                }
                this.zzk = jZzf;
                j10 = this.zzk;
                i10 = this.zzl;
                if (j10 >= i10) {
                    throw zzcd.zzc("Atom size less than header length (unsupported).");
                }
                i11 = this.zzj;
                if (i11 != 1836019574) {
                }
                long jZzf4 = zzaaxVar.zzf();
                j11 = this.zzk;
                long j18 = jZzf4 + j11;
                j12 = this.zzl;
                if (j11 != j12) {
                    this.zzd.zzC(8);
                    zzaaxVar.zzh(this.zzd.zzH(), 0, 8);
                    zzagn.zzd(this.zzd);
                    zzaaxVar.zzk(this.zzd.zzc());
                    zzaaxVar.zzj();
                }
                j13 = j18 - j12;
                this.zzf.push(new zzagc(this.zzj, j13));
                if (this.zzk == this.zzl) {
                    zzl(j13);
                } else {
                    zzk();
                }
            } else {
                if (i12 != 1) {
                    long jZzf5 = zzaaxVar.zzf();
                    int i13 = this.zzn;
                    if (i13 == -1) {
                        int i14 = -1;
                        int i15 = -1;
                        boolean z12 = true;
                        boolean z13 = true;
                        long j19 = Long.MAX_VALUE;
                        long j20 = Long.MAX_VALUE;
                        long j21 = Long.MAX_VALUE;
                        int i16 = 0;
                        while (true) {
                            zzagx[] zzagxVarArr = this.zzs;
                            if (i16 >= zzagxVarArr.length) {
                                break;
                            }
                            zzagx zzagxVar = zzagxVarArr[i16];
                            int i17 = zzagxVar.zze;
                            zzahf zzahfVar = zzagxVar.zzb;
                            if (i17 != zzahfVar.zzb) {
                                long j22 = zzahfVar.zzc[i17];
                                long[][] jArr = this.zzt;
                                int i18 = zzfj.zza;
                                long j23 = jArr[i16][i17];
                                long j24 = j22 - jZzf5;
                                boolean z14 = j24 < 0 || j24 >= 262144;
                                if (z14) {
                                    z10 = z13;
                                } else {
                                    if (z13) {
                                        z13 = z14;
                                        i15 = i16;
                                        j21 = j24;
                                        j20 = j23;
                                    } else {
                                        z10 = false;
                                    }
                                    if (j23 < j19) {
                                        z12 = z14;
                                        i14 = i16;
                                        j19 = j23;
                                    }
                                }
                                if (z14 != z10 || j24 >= j21) {
                                    z13 = z10;
                                } else {
                                    z13 = z14;
                                    i15 = i16;
                                    j21 = j24;
                                    j20 = j23;
                                }
                                if (j23 < j19) {
                                    z12 = z14;
                                    i14 = i16;
                                    j19 = j23;
                                }
                            }
                            i16++;
                        }
                        i13 = (j19 == RecyclerView.FOREVER_NS || !z12 || j20 < j19 + SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE) ? i15 : i14;
                        this.zzn = i13;
                        if (i13 == -1) {
                            return -1;
                        }
                    }
                    zzagx zzagxVar2 = this.zzs[i13];
                    zzabz zzabzVar = zzagxVar2.zzc;
                    int i19 = zzagxVar2.zze;
                    zzahf zzahfVar2 = zzagxVar2.zzb;
                    long j25 = zzahfVar2.zzc[i19];
                    int i20 = zzahfVar2.zzd[i19];
                    zzaca zzacaVar = zzagxVar2.zzd;
                    long j26 = (j25 - jZzf5) + ((long) this.zzo);
                    if (j26 < 0 || j26 >= 262144) {
                        zzabsVar.zza = j25;
                        return 1;
                    }
                    if (zzagxVar2.zza.zzg == 1) {
                        j26 += 8;
                        i20 -= 8;
                    }
                    zzaaxVar.zzk((int) j26);
                    zzahc zzahcVar = zzagxVar2.zza;
                    int i21 = zzahcVar.zzj;
                    if (i21 == 0) {
                        if ("audio/ac4".equals(zzahcVar.zzf.zzm)) {
                            if (this.zzp == 0) {
                                zzaaa.zzb(i20, this.zzd);
                                zzabzVar.zzq(this.zzd, 7);
                                this.zzp += 7;
                            }
                            i20 += 7;
                        } else if (zzacaVar != null) {
                            zzacaVar.zzd(zzaaxVar);
                        }
                        while (true) {
                            int i22 = this.zzp;
                            if (i22 >= i20) {
                                break;
                            }
                            int iZze = zzabzVar.zze(zzaaxVar, i20 - i22, false);
                            this.zzo += iZze;
                            this.zzp += iZze;
                            this.zzq -= iZze;
                        }
                    } else {
                        byte[] bArrZzH = this.zzc.zzH();
                        bArrZzH[0] = 0;
                        bArrZzH[1] = 0;
                        bArrZzH[2] = 0;
                        int i23 = 4 - i21;
                        while (this.zzp < i20) {
                            int i24 = this.zzq;
                            if (i24 == 0) {
                                zzaaxVar.zzi(bArrZzH, i23, i21);
                                this.zzo += i21;
                                this.zzc.zzF(0);
                                int iZze2 = this.zzc.zze();
                                if (iZze2 < 0) {
                                    throw zzcd.zza("Invalid NAL length", null);
                                }
                                this.zzq = iZze2;
                                this.zzb.zzF(0);
                                zzabzVar.zzq(this.zzb, 4);
                                this.zzp += 4;
                                i20 += i23;
                            } else {
                                int iZze3 = zzabzVar.zze(zzaaxVar, i24, false);
                                this.zzo += iZze3;
                                this.zzp += iZze3;
                                this.zzq -= iZze3;
                            }
                        }
                    }
                    zzahf zzahfVar3 = zzagxVar2.zzb;
                    long j27 = zzahfVar3.zzf[i19];
                    int i25 = zzahfVar3.zzg[i19];
                    if (zzacaVar != null) {
                        zzacaVar.zzc(zzabzVar, j27, i25, i20, 0, null);
                        if (i19 + 1 == zzagxVar2.zzb.zzb) {
                            zzacaVar.zza(zzabzVar, null);
                        }
                    } else {
                        zzabzVar.zzs(j27, i25, i20, 0, null);
                    }
                    zzagxVar2.zze++;
                    this.zzn = -1;
                    this.zzo = 0;
                    this.zzp = 0;
                    this.zzq = 0;
                    return 0;
                }
                long j28 = this.zzk - ((long) this.zzl);
                long jZzf6 = zzaaxVar.zzf() + j28;
                zzfa zzfaVar2 = this.zzm;
                if (zzfaVar2 != null) {
                    zzaaxVar.zzi(zzfaVar2.zzH(), this.zzl, (int) j28);
                    if (this.zzj == 1718909296) {
                        zzfaVar2.zzF(8);
                        int iZzf = zzf(zzfaVar2.zze());
                        if (iZzf == 0) {
                            zzfaVar2.zzG(4);
                            do {
                                if (zzfaVar2.zza() <= 0) {
                                    iZzf = 0;
                                    break;
                                }
                                iZzf = zzf(zzfaVar2.zze());
                            } while (iZzf == 0);
                        }
                        this.zzw = iZzf;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzagc) this.zzf.peek()).zzd(new zzagd(this.zzj, zzfaVar2));
                    }
                } else {
                    if (j28 < 262144) {
                        zzaaxVar.zzk((int) j28);
                    } else {
                        zzabsVar.zza = zzaaxVar.zzf() + j28;
                        z11 = true;
                    }
                    zzl(jZzf6);
                    if (z11 && this.zzi != 2) {
                        return 1;
                    }
                }
                z11 = false;
                zzl(jZzf6);
                if (z11) {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzr = zzaazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j10 == 0) {
            zzk();
            return;
        }
        for (zzagx zzagxVar : this.zzs) {
            zzahf zzahfVar = zzagxVar.zzb;
            int iZza = zzahfVar.zza(j11);
            if (iZza == -1) {
                iZza = zzahfVar.zzb(j11);
            }
            zzagxVar.zze = iZza;
            zzaca zzacaVar = zzagxVar.zzd;
            if (zzacaVar != null) {
                zzacaVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        return zzahb.zzb(zzaaxVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        long j11;
        long j12;
        int iZzb;
        zzagx[] zzagxVarArr = this.zzs;
        if (zzagxVarArr.length == 0) {
            zzabw zzabwVar = zzabw.zza;
            return new zzabt(zzabwVar, zzabwVar);
        }
        int i10 = this.zzu;
        long jZzj = -1;
        if (i10 != -1) {
            zzahf zzahfVar = zzagxVarArr[i10].zzb;
            int iZzi = zzi(zzahfVar, j10);
            if (iZzi == -1) {
                zzabw zzabwVar2 = zzabw.zza;
                return new zzabt(zzabwVar2, zzabwVar2);
            }
            long j13 = zzahfVar.zzf[iZzi];
            j11 = zzahfVar.zzc[iZzi];
            if (j13 >= j10 || iZzi >= zzahfVar.zzb - 1 || (iZzb = zzahfVar.zzb(j10)) == -1 || iZzb == iZzi) {
                j12 = -9223372036854775807L;
            } else {
                j12 = zzahfVar.zzf[iZzb];
                jZzj = zzahfVar.zzc[iZzb];
            }
            j10 = j13;
        } else {
            j11 = RecyclerView.FOREVER_NS;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            zzagx[] zzagxVarArr2 = this.zzs;
            if (i11 >= zzagxVarArr2.length) {
                break;
            }
            if (i11 != this.zzu) {
                zzahf zzahfVar2 = zzagxVarArr2[i11].zzb;
                long jZzj2 = zzj(zzahfVar2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    jZzj = zzj(zzahfVar2, j12, jZzj);
                }
                j11 = jZzj2;
            }
            i11++;
        }
        zzabw zzabwVar3 = new zzabw(j10, j11);
        return j12 == -9223372036854775807L ? new zzabt(zzabwVar3, zzabwVar3) : new zzabt(zzabwVar3, new zzabw(j12, jZzj));
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return true;
    }
}
