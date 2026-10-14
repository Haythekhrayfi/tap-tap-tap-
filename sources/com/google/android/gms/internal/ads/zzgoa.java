package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.o;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzgoa extends zzgnz {
    public final byte[] zza;

    public zzgoa(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgoe) || zzd() != ((zzgoe) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgoa)) {
            return obj.equals(this);
        }
        zzgoa zzgoaVar = (zzgoa) obj;
        int iZzr = zzr();
        int iZzr2 = zzgoaVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgoaVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final boolean zzg(zzgoe zzgoeVar, int i10, int i11) {
        if (i11 > zzgoeVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i11 + zzd());
        }
        int i12 = i10 + i11;
        if (i12 > zzgoeVar.zzd()) {
            int iZzd = zzgoeVar.zzd();
            StringBuilder sbA = o.a("Ran off end of other: ", i10, ", ", i11, ", ");
            sbA.append(iZzd);
            throw new IllegalArgumentException(sbA.toString());
        }
        if (!(zzgoeVar instanceof zzgoa)) {
            return zzgoeVar.zzk(i10, i12).equals(zzk(0, i11));
        }
        zzgoa zzgoaVar = (zzgoa) zzgoeVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgoaVar.zza;
        int iZzc = zzc() + i11;
        int iZzc2 = zzc();
        int iZzc3 = zzgoaVar.zzc() + i10;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final int zzi(int i10, int i11, int i12) {
        return zzgpw.zzb(i10, this.zza, zzc() + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final int zzj(int i10, int i11, int i12) {
        int iZzc = zzc() + i11;
        return zzgsv.zzf(i10, this.zza, iZzc, i12 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final zzgoe zzk(int i10, int i11) {
        int iZzq = zzgoe.zzq(i10, i11, zzd());
        return iZzq == 0 ? zzgoe.zzb : new zzgnx(this.zza, zzc() + i10, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final zzgom zzl() {
        return zzgom.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final void zzo(zzgnt zzgntVar) throws IOException {
        zzgntVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final boolean zzp() {
        int iZzc = zzc();
        return zzgsv.zzj(this.zza, iZzc, zzd() + iZzc);
    }
}
