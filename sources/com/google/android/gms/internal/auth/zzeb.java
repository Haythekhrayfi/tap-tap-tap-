package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.Objects;
import n1.c;

/* JADX INFO: loaded from: classes2.dex */
class zzeb extends zzea {
    public final byte[] zza;

    public zzeb(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzee) || zzd() != ((zzee) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzeb)) {
            return obj.equals(this);
        }
        zzeb zzebVar = (zzeb) obj;
        int iZzj = zzj();
        int iZzj2 = zzebVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzebVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzebVar.zzd()) {
            throw new IllegalArgumentException(c.a("Ran off end of other: 0, ", iZzd, ", ", zzebVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzebVar.zza;
        zzebVar.zzc();
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

    @Override // com.google.android.gms.internal.auth.zzee
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final int zze(int i10, int i11, int i12) {
        return zzez.zzd(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final zzee zzf(int i10, int i11) {
        int iZzi = zzee.zzi(0, i11, zzd());
        return iZzi == 0 ? zzee.zzb : new zzdy(this.zza, 0, iZzi);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean zzh() {
        return zzhm.zzd(this.zza, 0, zzd());
    }
}
