package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import n1.c;

/* JADX INFO: loaded from: classes2.dex */
class zzax extends zzaw {
    public final byte[] zza;

    public zzax(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzba) || zzd() != ((zzba) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzax)) {
            return obj.equals(this);
        }
        zzax zzaxVar = (zzax) obj;
        int iZzk = zzk();
        int iZzk2 = zzaxVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzaxVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzaxVar.zzd()) {
            throw new IllegalArgumentException(c.a("Ran off end of other: 0, ", iZzd, ", ", zzaxVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzaxVar.zza;
        zzaxVar.zzc();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iZzd) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final int zze(int i10, int i11, int i12) {
        return zzcg.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final zzba zzf(int i10, int i11) {
        int iZzj = zzba.zzj(0, i11, zzd());
        return iZzj == 0 ? zzba.zzb : new zzau(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final void zzh(zzaq zzaqVar) throws IOException {
        ((zzbf) zzaqVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final boolean zzi() {
        return zzev.zze(this.zza, 0, zzd());
    }
}
