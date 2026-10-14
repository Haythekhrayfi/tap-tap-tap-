package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzgor extends zzgoo {
    private final OutputStream zzg;

    public zzgor(OutputStream outputStream, int i10) {
        super(i10);
        this.zzg = outputStream;
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzI() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzJ(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzK(int i10, boolean z10) throws IOException {
        zzH(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzL(int i10, zzgoe zzgoeVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(zzgoeVar.zzd());
        zzgoeVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgot, com.google.android.gms.internal.ads.zzgnt
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzp(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzh(int i10, int i11) throws IOException {
        zzH(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzi(int i10) throws IOException {
        zzH(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzj(int i10, long j10) throws IOException {
        zzH(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzk(long j10) throws IOException {
        zzH(8);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzl(int i10, int i11) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzn(int i10, zzgqw zzgqwVar, zzgrp zzgrpVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(((zzgnn) zzgqwVar).zzat(zzgrpVar));
        zzgrpVar.zzm(zzgqwVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzo(int i10, String str) throws IOException {
        zzs((i10 << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
        } else {
            System.arraycopy(bArr, i10, this.zza, i13, i14);
            int i15 = i10 + i14;
            this.zzc = this.zzb;
            this.zzd += i14;
            zzG();
            i11 -= i14;
            if (i11 <= this.zzb) {
                System.arraycopy(bArr, i15, this.zza, 0, i11);
                this.zzc = i11;
            } else {
                this.zzg.write(bArr, i15, i11);
            }
        }
        this.zzd += i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzq(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzr(int i10, int i11) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzs(int i10) throws IOException {
        zzH(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzt(int i10, long j10) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgot
    public final void zzu(long j10) throws IOException {
        zzH(10);
        zzg(j10);
    }

    public final void zzv(String str) throws IOException {
        int iZze;
        try {
            int length = str.length() * 3;
            int iZzA = zzgot.zzA(length);
            int i10 = iZzA + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iZzd = zzgsv.zzd(str, bArr, 0, length);
                zzs(iZzd);
                zzp(bArr, 0, iZzd);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzG();
            }
            int iZzA2 = zzgot.zzA(str.length());
            int i12 = this.zzc;
            try {
                if (iZzA2 == iZzA) {
                    int i13 = i12 + iZzA2;
                    this.zzc = i13;
                    int iZzd2 = zzgsv.zzd(str, this.zza, i13, this.zzb - i13);
                    this.zzc = i12;
                    iZze = (iZzd2 - i12) - iZzA2;
                    zzf(iZze);
                    this.zzc = iZzd2;
                } else {
                    iZze = zzgsv.zze(str);
                    zzf(iZze);
                    this.zzc = zzgsv.zzd(str, this.zza, this.zzc, iZze);
                }
                this.zzd += iZze;
            } catch (zzgsu e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzgoq(e11);
            }
        } catch (zzgsu e12) {
            zzE(str, e12);
        }
    }
}
