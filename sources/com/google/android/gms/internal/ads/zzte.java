package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzte implements zzge {
    private final zzge zza;
    private final int zzb;
    private final zztd zzc;
    private final byte[] zzd;
    private int zze;

    public zzte(zzge zzgeVar, int i10, zztd zztdVar) {
        zzdy.zzd(i10 > 0);
        this.zza = zzgeVar;
        this.zzb = i10;
        this.zzc = zztdVar;
        this.zzd = new byte[1];
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zze;
        if (i12 == 0) {
            int i13 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i14 = (this.zzd[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr2 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int iZza = this.zza.zza(bArr2, i13, i15);
                        if (iZza != -1) {
                            i13 += iZza;
                            i15 -= iZza;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr2[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.zzc.zza(new zzfa(bArr2, i14));
                    }
                }
                i12 = this.zzb;
                this.zze = i12;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i10, Math.min(i12, i11));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzf(zzhg zzhgVar) {
        Objects.requireNonNull(zzhgVar);
        this.zza.zzf(zzhgVar);
    }
}
