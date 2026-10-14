package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfa {
    private static final zzfsh zza = zzfsh.zzo(zzfot.zza, zzfot.zzc, zzfot.zzf, zzfot.zzd, zzfot.zze);
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfa() {
        this.zzb = zzfj.zzf;
    }

    public zzfa(int i10) {
        this.zzb = new byte[i10];
        this.zzd = i10;
    }

    public zzfa(byte[] bArr) {
        this.zzb = bArr;
        this.zzd = bArr.length;
    }

    public zzfa(byte[] bArr, int i10) {
        this.zzb = bArr;
        this.zzd = i10;
    }

    public final void zzA(zzez zzezVar, int i10) {
        zzB(zzezVar.zza, 0, i10);
        zzezVar.zzj(0);
    }

    public final void zzB(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.zzb, this.zzc, bArr, i10, i11);
        this.zzc += i11;
    }

    public final void zzC(int i10) {
        byte[] bArr = this.zzb;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        zzD(bArr, i10);
    }

    public final void zzD(byte[] bArr, int i10) {
        this.zzb = bArr;
        this.zzd = i10;
        this.zzc = 0;
    }

    public final void zzE(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzb.length) {
            z10 = true;
        }
        zzdy.zzd(z10);
        this.zzd = i10;
    }

    public final void zzF(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzd) {
            z10 = true;
        }
        zzdy.zzd(z10);
        this.zzc = i10;
    }

    public final void zzG(int i10) {
        zzF(this.zzc + i10);
    }

    public final byte[] zzH() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzd - this.zzc;
    }

    public final int zzb() {
        return this.zzb.length;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final int zze() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        this.zzc = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i13 + 1;
        this.zzc = i15;
        int i16 = bArr[i13] & 255;
        this.zzc = i15 + 1;
        return (bArr[i15] & 255) | (i12 << 24) | (i14 << 16) | (i16 << 8);
    }

    public final int zzf() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        this.zzc = i13;
        int i14 = bArr[i11] & 255;
        this.zzc = i13 + 1;
        return (bArr[i13] & 255) | ((i12 << 24) >> 8) | (i14 << 8);
    }

    public final int zzg() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        this.zzc = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i13 + 1;
        this.zzc = i15;
        int i16 = bArr[i13] & 255;
        this.zzc = i15 + 1;
        return ((bArr[i15] & 255) << 24) | i12 | (i14 << 8) | (i16 << 16);
    }

    public final int zzh() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new IllegalStateException(android.support.v4.media.a.a("Top bit not zero: ", iZzg));
    }

    public final int zzi() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        int i12 = bArr[i10] & 255;
        this.zzc = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final int zzj() {
        return (zzk() << 21) | (zzk() << 14) | (zzk() << 7) | zzk();
    }

    public final int zzk() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int zzl() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        this.zzc = i13;
        int i14 = bArr[i11] & 255;
        this.zzc = i13 + 2;
        return i14 | (i12 << 8);
    }

    public final int zzm() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        this.zzc = i13;
        int i14 = bArr[i11] & 255;
        this.zzc = i13 + 1;
        return (bArr[i13] & 255) | (i12 << 16) | (i14 << 8);
    }

    public final int zzn() {
        int iZze = zze();
        if (iZze >= 0) {
            return iZze;
        }
        throw new IllegalStateException(android.support.v4.media.a.a("Top bit not zero: ", iZze));
    }

    public final int zzo() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        int i12 = bArr[i10] & 255;
        this.zzc = i11 + 1;
        return (bArr[i11] & 255) | (i12 << 8);
    }

    public final long zzp() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzc = i12;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzc = i13;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        this.zzc = i14;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        this.zzc = i15;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        this.zzc = i16;
        long j15 = bArr[i15];
        int i17 = i16 + 1;
        this.zzc = i17;
        long j16 = bArr[i16];
        this.zzc = i17 + 1;
        return ((bArr[i17] & 255) << 56) | ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40);
    }

    public final long zzq() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzc = i12;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzc = i13;
        long j12 = bArr[i12];
        this.zzc = i13 + 1;
        return ((((long) bArr[i13]) & 255) << 24) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final long zzr() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzc = i12;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzc = i13;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        this.zzc = i14;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        this.zzc = i15;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        this.zzc = i16;
        long j15 = bArr[i15];
        int i17 = i16 + 1;
        this.zzc = i17;
        long j16 = bArr[i16];
        this.zzc = i17 + 1;
        return (((long) bArr[i17]) & 255) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | ((j16 & 255) << 8);
    }

    public final long zzs() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzc = i12;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzc = i13;
        long j12 = bArr[i12];
        this.zzc = i13 + 1;
        return (((long) bArr[i13]) & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long zzt() {
        long jZzr = zzr();
        if (jZzr >= 0) {
            return jZzr;
        }
        throw new IllegalStateException(androidx.viewpager2.adapter.a.a("Top bit not zero: ", jZzr));
    }

    public final long zzu() {
        int i10;
        int i11;
        long j10 = this.zzb[this.zzc];
        int i12 = 7;
        while (true) {
            i10 = 0;
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) == 0) {
                if (i12 >= 6) {
                    if (i12 != 7) {
                        break;
                    }
                    i10 = 1;
                    break;
                }
                j10 &= (long) (i13 - 1);
                i10 = 7 - i12;
                break;
            }
            i12--;
        }
        if (i10 == 0) {
            throw new NumberFormatException(androidx.viewpager2.adapter.a.a("Invalid UTF-8 sequence first byte: ", j10));
        }
        for (i11 = 1; i11 < i10; i11++) {
            byte b10 = this.zzb[this.zzc + i11];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(androidx.viewpager2.adapter.a.a("Invalid UTF-8 sequence continuation byte: ", j10));
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.zzc += i10;
        return j10;
    }

    public final String zzv(char c10) {
        int i10 = this.zzd;
        int i11 = this.zzc;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.zzd && this.zzb[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.zzb;
        int i12 = this.zzc;
        String strZzw = zzfj.zzw(bArr, i12, i11 - i12);
        this.zzc = i11;
        if (i11 < this.zzd) {
            this.zzc = i11 + 1;
        }
        return strZzw;
    }

    public final String zzw(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.zzc;
        int i12 = (i11 + i10) - 1;
        String strZzw = zzfj.zzw(this.zzb, i11, (i12 >= this.zzd || this.zzb[i12] != 0) ? i10 : i10 - 1);
        this.zzc += i10;
        return strZzw;
    }

    public final String zzx(int i10, Charset charset) {
        byte[] bArr = this.zzb;
        int i11 = this.zzc;
        String str = new String(bArr, i11, i10, charset);
        this.zzc = i11 + i10;
        return str;
    }

    public final short zzy() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        int i12 = bArr[i10] & 255;
        this.zzc = i11 + 1;
        return (short) ((bArr[i11] & 255) | (i12 << 8));
    }

    public final void zzz(int i10) {
        byte[] bArr = this.zzb;
        if (i10 > bArr.length) {
            this.zzb = Arrays.copyOf(bArr, i10);
        }
    }
}
