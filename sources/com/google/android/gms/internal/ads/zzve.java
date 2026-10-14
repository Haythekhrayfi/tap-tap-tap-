package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzve implements zzabz {
    private boolean zzA;
    private boolean zzB;
    private zzqv zzC;
    private final zzuy zza;
    private final zzqu zzd;
    private final zzqo zze;
    private zzvd zzf;
    private zzam zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzam zzy;
    private zzam zzz;
    private final zzva zzb = new zzva();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzaby[] zzn = new zzaby[1000];
    private final zzvl zzc = new zzvl(new zzec() { // from class: com.google.android.gms.internal.ads.zzuz
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;

    public zzve(zzxp zzxpVar, zzqu zzquVar, zzqo zzqoVar) {
        this.zzd = zzquVar;
        this.zze = zzqoVar;
        this.zza = new zzuy(zzxpVar);
    }

    private final int zzA(int i10) {
        int i11 = this.zzq + i10;
        int i12 = this.zzh;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private final synchronized int zzB(zzkj zzkjVar, zzhp zzhpVar, boolean z10, boolean z11, zzva zzvaVar) {
        zzhpVar.zzc = false;
        if (!zzJ()) {
            if (!z11 && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar == null || (!z10 && zzamVar == this.zzg)) {
                    return -3;
                }
                zzG(zzamVar, zzkjVar);
                return -5;
            }
            zzhpVar.zzc(4);
            return -4;
        }
        zzam zzamVar2 = ((zzvc) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z10 && zzamVar2 == this.zzg) {
            int iZzA = zzA(this.zzr);
            if (!zzK(iZzA)) {
                zzhpVar.zzc = true;
                return -3;
            }
            zzhpVar.zzc(this.zzl[iZzA]);
            if (this.zzr == this.zzo - 1 && (z11 || this.zzv)) {
                zzhpVar.zza(536870912);
            }
            long j10 = this.zzm[iZzA];
            zzhpVar.zzd = j10;
            if (j10 < this.zzs) {
                zzhpVar.zza(Integer.MIN_VALUE);
            }
            zzvaVar.zza = this.zzk[iZzA];
            zzvaVar.zzb = this.zzj[iZzA];
            zzvaVar.zzc = this.zzn[iZzA];
            return -4;
        }
        zzG(zzamVar2, zzkjVar);
        return -5;
    }

    private final synchronized long zzC(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.zzo;
        if (i11 != 0) {
            long[] jArr = this.zzm;
            int i12 = this.zzq;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.zzr) != i11) {
                    i11 = i10 + 1;
                }
                int iZzz = zzz(i12, i11, j10, false);
                if (iZzz == -1) {
                    return -1L;
                }
                return zzE(iZzz);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i10 = this.zzo;
        if (i10 == 0) {
            return -1L;
        }
        return zzE(i10);
    }

    private final long zzE(int i10) {
        long j10 = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iZzA = zzA(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.zzm[iZzA]);
                if ((this.zzl[iZzA] & 1) != 0) {
                    break;
                }
                iZzA--;
                if (iZzA == -1) {
                    iZzA = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j10, jMax);
        this.zzo -= i10;
        int i12 = this.zzp + i10;
        this.zzp = i12;
        int i13 = this.zzq + i10;
        this.zzq = i13;
        int i14 = this.zzh;
        if (i13 >= i14) {
            this.zzq = i13 - i14;
        }
        int i15 = this.zzr - i10;
        this.zzr = i15;
        if (i15 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i12);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i16 = this.zzq;
        if (i16 == 0) {
            i16 = this.zzh;
        }
        int i17 = i16 - 1;
        return this.zzj[i17] + ((long) this.zzk[i17]);
    }

    private final synchronized void zzF(long j10, int i10, long j11, int i11, zzaby zzabyVar) {
        int i12 = this.zzo;
        if (i12 > 0) {
            int iZzA = zzA(i12 - 1);
            zzdy.zzd(this.zzj[iZzA] + ((long) this.zzk[iZzA]) <= j11);
        }
        this.zzv = (536870912 & i10) != 0;
        this.zzu = Math.max(this.zzu, j10);
        int iZzA2 = zzA(this.zzo);
        this.zzm[iZzA2] = j10;
        this.zzj[iZzA2] = j11;
        this.zzk[iZzA2] = i11;
        this.zzl[iZzA2] = i10;
        this.zzn[iZzA2] = zzabyVar;
        this.zzi[iZzA2] = 0;
        if (this.zzc.zzf() || !((zzvc) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzqt zzqtVar = zzqt.zzb;
            zzvl zzvlVar = this.zzc;
            int i13 = this.zzp + this.zzo;
            zzam zzamVar = this.zzz;
            Objects.requireNonNull(zzamVar);
            zzvlVar.zzc(i13, new zzvc(zzamVar, zzqtVar, null));
        }
        int i14 = this.zzo + 1;
        this.zzo = i14;
        int i15 = this.zzh;
        if (i14 == i15) {
            int i16 = i15 + 1000;
            long[] jArr = new long[i16];
            long[] jArr2 = new long[i16];
            long[] jArr3 = new long[i16];
            int[] iArr = new int[i16];
            int[] iArr2 = new int[i16];
            zzaby[] zzabyVarArr = new zzaby[i16];
            int i17 = this.zzq;
            int i18 = i15 - i17;
            System.arraycopy(this.zzj, i17, jArr2, 0, i18);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i18);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i18);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i18);
            System.arraycopy(this.zzn, this.zzq, zzabyVarArr, 0, i18);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i18);
            int i19 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i18, i19);
            System.arraycopy(this.zzm, 0, jArr3, i18, i19);
            System.arraycopy(this.zzl, 0, iArr, i18, i19);
            System.arraycopy(this.zzk, 0, iArr2, i18, i19);
            System.arraycopy(this.zzn, 0, zzabyVarArr, i18, i19);
            System.arraycopy(this.zzi, 0, jArr, i18, i19);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzabyVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i16;
        }
    }

    private final void zzG(zzam zzamVar, zzkj zzkjVar) {
        zzam zzamVar2 = this.zzg;
        boolean z10 = zzamVar2 == null;
        zzad zzadVar = z10 ? null : zzamVar2.zzp;
        this.zzg = zzamVar;
        zzad zzadVar2 = zzamVar.zzp;
        zzkjVar.zza = zzamVar.zzc(this.zzd.zza(zzamVar));
        zzkjVar.zzb = this.zzC;
        if (z10 || !zzfj.zzC(zzadVar, zzadVar2)) {
            zzqv zzqvVar = zzamVar.zzp != null ? new zzqv(new zzqm(new zzqx(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE)) : null;
            this.zzC = zzqvVar;
            zzkjVar.zzb = zzqvVar;
        }
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int i10) {
        if (this.zzC != null) {
            return (this.zzl[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzam zzamVar) {
        this.zzx = false;
        if (zzfj.zzC(zzamVar, this.zzz)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zzvc) this.zzc.zzb()).zza.equals(zzamVar)) {
            zzamVar = ((zzvc) this.zzc.zzb()).zza;
        }
        this.zzz = zzamVar;
        zzam zzamVar2 = this.zzz;
        this.zzA = zzcc.zze(zzamVar2.zzm, zzamVar2.zzj);
        this.zzB = false;
        return true;
    }

    public static /* synthetic */ void zzl(zzvc zzvcVar) {
        zzqt zzqtVar = zzvcVar.zzb;
        int i10 = zzqs.zza;
    }

    private final int zzz(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.zzm[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.zzl[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzh) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzb(long j10, boolean z10) {
        int i10 = this.zzr;
        int iZzA = zzA(i10);
        if (zzJ() && j10 >= this.zzm[iZzA]) {
            if (j10 > this.zzu && z10) {
                return this.zzo - i10;
            }
            int iZzz = zzz(iZzA, this.zzo - i10, j10, true);
            if (iZzz == -1) {
                return 0;
            }
            return iZzz;
        }
        return 0;
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzkj r9, com.google.android.gms.internal.ads.zzhp r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zzva r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzg()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzuy r9 = r8.zza
            com.google.android.gms.internal.ads.zzva r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzuy r9 = r8.zza
            com.google.android.gms.internal.ads.zzva r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.zzd(com.google.android.gms.internal.ads.zzkj, com.google.android.gms.internal.ads.zzhp, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final /* synthetic */ int zze(zzt zztVar, int i10, boolean z10) {
        return zzabx.zza(this, zztVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final int zzf(zzt zztVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zza(zztVar, i10, z10);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzam zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j10, boolean z10, boolean z11) {
        this.zza.zzc(zzC(j10, false, z11));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final void zzk(zzam zzamVar) {
        this.zzy = zzamVar;
        boolean zZzL = zzL(zzamVar);
        zzvd zzvdVar = this.zzf;
        if (zzvdVar == null || !zZzL) {
            return;
        }
        zzvdVar.zzL(zzamVar);
    }

    public final void zzm() throws IOException {
        zzqv zzqvVar = this.zzC;
        if (zzqvVar != null) {
            throw zzqvVar.zza();
        }
    }

    public final void zzn() {
        zzj();
        zzH();
    }

    public final void zzo() {
        zzp(true);
        zzH();
    }

    public final void zzp(boolean z10) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z10) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final /* synthetic */ void zzq(zzfa zzfaVar, int i10) {
        zzabx.zzb(this, zzfaVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final void zzr(zzfa zzfaVar, int i10, int i11) {
        this.zza.zzh(zzfaVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final void zzs(long j10, int i10, int i11, int i12, zzaby zzabyVar) {
        if (this.zzw) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzA) {
            if (j10 < this.zzs) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzB) {
                    zzer.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i10 |= 1;
            }
        }
        zzF(j10, i10, (this.zza.zzb() - ((long) i11)) - ((long) i12), i11, zzabyVar);
    }

    public final void zzt(long j10) {
        this.zzs = j10;
    }

    public final void zzu(zzvd zzvdVar) {
        this.zzf = zzvdVar;
    }

    public final synchronized void zzv(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzr + i10 <= this.zzo) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdy.zzd(z10);
        this.zzr += i10;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z10) {
        boolean z11 = true;
        if (zzJ()) {
            if (((zzvc) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzK(zzA(this.zzr));
        }
        if (!z10 && !this.zzv) {
            zzam zzamVar = this.zzz;
            if (zzamVar == null) {
                z11 = false;
            } else if (zzamVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    public final synchronized boolean zzy(long j10, boolean z10) {
        zzI();
        int i10 = this.zzr;
        int iZzA = zzA(i10);
        if (!zzJ() || j10 < this.zzm[iZzA] || (j10 > this.zzu && !z10)) {
            return false;
        }
        int iZzz = zzz(iZzA, this.zzo - i10, j10, true);
        if (iZzz == -1) {
            return false;
        }
        this.zzs = j10;
        this.zzr += iZzz;
        return true;
    }
}
