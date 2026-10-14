package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgoi extends zzgom {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    public /* synthetic */ zzgoi(Iterable iterable, int i10, boolean z10, zzgoh zzgohVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i10;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i10 != 0) {
            zzN();
            return;
        }
        this.zzg = zzgpw.zze;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzJ() {
        return (int) ((((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn);
    }

    private final void zzK() throws zzgpy {
        if (!this.zzf.hasNext()) {
            throw zzgpy.zzj();
        }
        zzN();
    }

    private final void zzL(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 > zzJ()) {
            if (i11 > 0) {
                throw zzgpy.zzj();
            }
            return;
        }
        int i12 = i11;
        while (i12 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzK();
            }
            int iMin = Math.min(i12, (int) (this.zzo - this.zzm));
            long j10 = iMin;
            zzgsq.zzo(this.zzm, bArr, i11 - i12, j10);
            i12 -= iMin;
            this.zzm += j10;
        }
    }

    private final void zzM() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzi = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzi = i12;
        this.zzh = i10 - i12;
    }

    private final void zzN() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long jPosition = byteBuffer.position();
        this.zzm = jPosition;
        this.zzn = jPosition;
        this.zzo = this.zzg.limit();
        long jZze = zzgsq.zze(this.zzg);
        this.zzm += jZze;
        this.zzn += jZze;
        this.zzo += jZze;
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final void zzA(int i10) {
        this.zzj = i10;
        zzM();
    }

    public final void zzB(int i10) throws IOException {
        if (i10 >= 0) {
            if (i10 <= (((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn) {
                while (i10 > 0) {
                    if (this.zzo - this.zzm == 0) {
                        zzK();
                    }
                    int iMin = Math.min(i10, (int) (this.zzo - this.zzm));
                    i10 -= iMin;
                    this.zzm += (long) iMin;
                }
                return;
            }
        }
        if (i10 >= 0) {
            throw zzgpy.zzj();
        }
        throw zzgpy.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final boolean zzC() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final boolean zzE(int i10) throws IOException {
        int iZzm;
        int i11 = i10 & 7;
        if (i11 == 0) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (zza() >= 0) {
                    return true;
                }
            }
            throw zzgpy.zze();
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
        if (this.zzo - this.zzm == 0) {
            zzK();
        }
        long j10 = this.zzm;
        this.zzm = 1 + j10;
        return zzgsq.zza(j10);
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
        return (int) ((((long) this.zzl) + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final int zze(int i10) throws zzgpy {
        if (i10 < 0) {
            throw zzgpy.zzf();
        }
        int iZzd = i10 + zzd();
        int i11 = this.zzj;
        if (iZzd > i11) {
            throw zzgpy.zzj();
        }
        this.zzj = iZzd;
        zzM();
        return i11;
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
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 < 4) {
            int iZza = zza() & 255;
            int iZza2 = (zza() & 255) << 8;
            return iZza | iZza2 | ((zza() & 255) << 16) | ((zza() & 255) << 24);
        }
        this.zzm = 4 + j11;
        int iZza3 = zzgsq.zza(j11) & 255;
        int iZza4 = (zzgsq.zza(1 + j11) & 255) << 8;
        return iZza3 | iZza4 | ((zzgsq.zza(2 + j11) & 255) << 16) | ((zzgsq.zza(j11 + 3) & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (com.google.android.gms.internal.ads.zzgsq.zza(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzj() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzgsq.zza(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgsq.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgsq.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgsq.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgsq.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgsq.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgsq.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgsq.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgsq.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgsq.zza(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzs()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgoi.zzj():int");
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
            this.zzk = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzk = iZzj;
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
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 < 8) {
            long jZza = ((long) zza()) & 255;
            long jZza2 = (((long) zza()) & 255) << 8;
            long jZza3 = (((long) zza()) & 255) << 16;
            long jZza4 = (((long) zza()) & 255) << 24;
            long jZza5 = (((long) zza()) & 255) << 32;
            long jZza6 = (((long) zza()) & 255) << 40;
            return jZza | jZza2 | jZza3 | jZza4 | jZza5 | jZza6 | ((((long) zza()) & 255) << 48) | ((((long) zza()) & 255) << 56);
        }
        this.zzm = 8 + j11;
        long jZza7 = ((long) zzgsq.zza(j11)) & 255;
        long jZza8 = (((long) zzgsq.zza(1 + j11)) & 255) << 8;
        long jZza9 = (((long) zzgsq.zza(j11 + 2)) & 255) << 16;
        long jZza10 = (((long) zzgsq.zza(3 + j11)) & 255) << 24;
        long jZza11 = (((long) zzgsq.zza(j11 + 4)) & 255) << 32;
        long jZza12 = (((long) zzgsq.zza(j11 + 5)) & 255) << 40;
        return jZza11 | jZza7 | jZza8 | jZza9 | jZza10 | jZza12 | ((((long) zzgsq.zza(j11 + 6)) & 255) << 48) | ((((long) zzgsq.zza(j11 + 7)) & 255) << 56);
    }

    public final long zzr() throws IOException {
        long jZza;
        long j10;
        long j11;
        int i10;
        long j12 = this.zzm;
        if (this.zzo != j12) {
            long j13 = j12 + 1;
            byte bZza = zzgsq.zza(j12);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j14 = j13 + 1;
                int iZza = bZza ^ (zzgsq.zza(j13) << 7);
                if (iZza >= 0) {
                    long j15 = j14 + 1;
                    int iZza2 = iZza ^ (zzgsq.zza(j14) << 14);
                    if (iZza2 < 0) {
                        j14 = j15 + 1;
                        int iZza3 = iZza2 ^ (zzgsq.zza(j15) << 21);
                        if (iZza3 < 0) {
                            i10 = iZza3 ^ (-2080896);
                        } else {
                            j15 = j14 + 1;
                            long jZza2 = ((long) iZza3) ^ (((long) zzgsq.zza(j14)) << 28);
                            if (jZza2 >= 0) {
                                j11 = 266354560;
                            } else {
                                long j16 = j15 + 1;
                                long jZza3 = jZza2 ^ (((long) zzgsq.zza(j15)) << 35);
                                if (jZza3 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = j16 + 1;
                                    jZza2 = jZza3 ^ (((long) zzgsq.zza(j16)) << 42);
                                    if (jZza2 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = j15 + 1;
                                        jZza3 = jZza2 ^ (((long) zzgsq.zza(j15)) << 49);
                                        if (jZza3 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j15 = j16 + 1;
                                            jZza = (jZza3 ^ (((long) zzgsq.zza(j16)) << 56)) ^ 71499008037633920L;
                                            if (jZza < 0) {
                                                long j17 = 1 + j15;
                                                if (zzgsq.zza(j15) >= 0) {
                                                    j14 = j17;
                                                }
                                            }
                                        }
                                    }
                                }
                                jZza = jZza3 ^ j10;
                                j14 = j16;
                            }
                            jZza = jZza2 ^ j11;
                        }
                        this.zzm = j14;
                        return jZza;
                    }
                    jZza = iZza2 ^ 16256;
                    j14 = j15;
                    this.zzm = j14;
                    return jZza;
                }
                i10 = iZza ^ (-128);
                jZza = i10;
                this.zzm = j14;
                return jZza;
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
        if (iZzj > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = iZzj;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[iZzj];
                zzgsq.zzo(j11, bArr, 0L, j12);
                this.zzm += j12;
                return new zzgoa(bArr);
            }
        }
        if (iZzj > 0 && iZzj <= zzJ()) {
            byte[] bArr2 = new byte[iZzj];
            zzL(bArr2, 0, iZzj);
            return new zzgoa(bArr2);
        }
        if (iZzj == 0) {
            return zzgoe.zzb;
        }
        if (iZzj < 0) {
            throw zzgpy.zzf();
        }
        throw zzgpy.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = iZzj;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[iZzj];
                zzgsq.zzo(j11, bArr, 0L, j12);
                String str = new String(bArr, zzgpw.zzb);
                this.zzm += j12;
                return str;
            }
        }
        if (iZzj > 0 && iZzj <= zzJ()) {
            byte[] bArr2 = new byte[iZzj];
            zzL(bArr2, 0, iZzj);
            return new String(bArr2, zzgpw.zzb);
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzgpy.zzf();
        }
        throw zzgpy.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = iZzj;
            if (j12 <= j10 - j11) {
                String strZzg = zzgsv.zzg(this.zzg, (int) (j11 - this.zzn), iZzj);
                this.zzm += j12;
                return strZzg;
            }
        }
        if (iZzj >= 0 && iZzj <= zzJ()) {
            byte[] bArr = new byte[iZzj];
            zzL(bArr, 0, iZzj);
            return zzgsv.zzh(bArr, 0, iZzj);
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzgpy.zzf();
        }
        throw zzgpy.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final void zzz(int i10) throws zzgpy {
        if (this.zzk != i10) {
            throw zzgpy.zzb();
        }
    }
}
