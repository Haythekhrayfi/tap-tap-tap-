package com.google.android.gms.internal.ads;

import android.support.v4.media.j;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgok extends zzgom {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzgok(InputStream inputStream, int i10, zzgoj zzgojVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        byte[] bArr = zzgpw.zzd;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.zze.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw zzgpy.zzj();
                }
                this.zzk += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final void zzL(int i10) throws IOException {
        if (zzM(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw zzgpy.zzj();
        }
        throw zzgpy.zzi();
    }

    private final boolean zzM(int i10) throws IOException {
        int i11 = this.zzi;
        int i12 = i11 + i10;
        int i13 = this.zzg;
        if (i12 <= i13) {
            throw new IllegalStateException(j.a("refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.zzk;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.zzl) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.zzk + i11;
            this.zzk = i14;
            i13 = this.zzg - i11;
            this.zzg = i13;
            this.zzi = 0;
        }
        try {
            int i15 = this.zze.read(this.zzf, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 == 0 || i15 < -1 || i15 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
            }
            if (i15 <= 0) {
                return false;
            }
            this.zzg += i15;
            zzK();
            if (this.zzg >= i10) {
                return true;
            }
            return zzM(i10);
        } catch (zzgpy e10) {
            e10.zzk();
            throw e10;
        }
    }

    private final byte[] zzN(int i10, boolean z10) throws IOException {
        byte[] bArrZzO = zzO(i10);
        if (bArrZzO != null) {
            return bArrZzO;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzJ = zzJ(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i10) throws IOException {
        if (i10 == 0) {
            return zzgpw.zzd;
        }
        if (i10 < 0) {
            throw zzgpy.zzf();
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw zzgpy.zzi();
        }
        int i14 = this.zzl;
        if (i13 > i14) {
            zzB((i14 - i11) - i12);
            throw zzgpy.zzj();
        }
        int i15 = this.zzg - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zze.available()) {
                    return null;
                }
            } catch (zzgpy e10) {
                e10.zzk();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i15 < i10) {
            try {
                int i17 = this.zze.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw zzgpy.zzj();
                }
                this.zzk += i17;
                i15 += i17;
            } catch (zzgpy e11) {
                e11.zzk();
                throw e11;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final void zzA(int i10) {
        this.zzl = i10;
        zzK();
    }

    public final void zzB(int i10) throws IOException {
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw zzgpy.zzf();
        }
        int i14 = this.zzk;
        int i15 = i14 + i12;
        int i16 = this.zzl;
        if (i15 + i10 > i16) {
            zzB((i16 - i14) - i12);
            throw zzgpy.zzj();
        }
        this.zzk = i15;
        this.zzg = 0;
        this.zzi = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.zze.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzgpy e10) {
                    e10.zzk();
                    throw e10;
                }
            } catch (Throwable th) {
                this.zzk += i13;
                zzK();
                throw th;
            }
        }
        this.zzk += i13;
        zzK();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzg;
        int i18 = i17 - this.zzi;
        this.zzi = i17;
        while (true) {
            zzL(1);
            int i19 = i10 - i18;
            int i20 = this.zzg;
            if (i19 <= i20) {
                this.zzi = i19;
                return;
            } else {
                i18 += i20;
                this.zzi = i20;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final boolean zzC() throws IOException {
        return this.zzi == this.zzg && !zzM(1);
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final boolean zzE(int i10) throws IOException {
        int iZzm;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zza() < 0) {
                        i12++;
                    }
                }
                throw zzgpy.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zzf;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzgpy.zze();
            return true;
        }
        if (i11 == 1) {
            zzB(8);
            return true;
        }
        if (i11 == 2) {
            zzB(zzj());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzgpy.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i10 >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() throws IOException {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zze(int i10) throws zzgpy {
        if (i10 < 0) {
            throw zzgpy.zzf();
        }
        int i11 = this.zzk + this.zzi;
        int i12 = this.zzl;
        int i13 = i10 + i11;
        if (i13 > i12) {
            throw zzgpy.zzj();
        }
        this.zzl = i13;
        zzK();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzL(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzj() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzi = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.zzi = r1
            return r0
        L6d:
            long r0 = r5.zzs()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgok.zzj():int");
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zzl() throws IOException {
        return zzgom.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzgpy.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzL(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long zzr() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 < 0) {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = ((long) i18) ^ (((long) bArr[i14]) << 28);
                            if (j14 >= 0) {
                                j13 = 266354560;
                            } else {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (((long) bArr[i19]) << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (((long) bArr[i16]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j10 = (j15 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j11 = j10;
                                                }
                                            }
                                        }
                                        i14 = i19;
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                            }
                            j10 = j14 ^ j13;
                        }
                        this.zzi = i14;
                        return j11;
                    }
                    j10 = i17 ^ 16256;
                    i14 = i16;
                    j11 = j10;
                    this.zzi = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.zzi = i14;
                return j11;
            }
        }
        return zzs();
    }

    public final long zzs() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZza = zza();
            j10 |= ((long) (bZza & Ascii.DEL)) << i10;
            if ((bZza & 128) == 0) {
                return j10;
            }
        }
        throw zzgpy.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final long zzu() throws IOException {
        return zzgom.zzG(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final zzgoe zzw() throws IOException {
        int iZzj = zzj();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (iZzj <= i10 - i11 && iZzj > 0) {
            zzgoe zzgoeVarZzv = zzgoe.zzv(this.zzf, i11, iZzj);
            this.zzi += iZzj;
            return zzgoeVarZzv;
        }
        if (iZzj == 0) {
            return zzgoe.zzb;
        }
        byte[] bArrZzO = zzO(iZzj);
        if (bArrZzO != null) {
            return zzgoe.zzv(bArrZzO, 0, bArrZzO.length);
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int i14 = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzJ = zzJ(iZzj - i14);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzf, i12, bArr, 0, i14);
        for (byte[] bArr2 : listZzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return new zzgoa(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzj <= i10 - i11) {
                String str = new String(this.zzf, i11, iZzj, zzgpw.zzb);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj > this.zzg) {
            return new String(zzN(iZzj, false), zzgpw.zzb);
        }
        zzL(iZzj);
        String str2 = new String(this.zzf, this.zzi, iZzj, zzgpw.zzb);
        this.zzi += iZzj;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final String zzy() throws IOException {
        byte[] bArrZzN;
        int iZzj = zzj();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (iZzj <= i11 - i10 && iZzj > 0) {
            bArrZzN = this.zzf;
            this.zzi = i10 + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj <= i11) {
                zzL(iZzj);
                bArrZzN = this.zzf;
                this.zzi = iZzj;
            } else {
                bArrZzN = zzN(iZzj, false);
            }
            i10 = 0;
        }
        return zzgsv.zzh(bArrZzN, i10, iZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final void zzz(int i10) throws zzgpy {
        if (this.zzj != i10) {
            throw zzgpy.zzb();
        }
    }
}
