package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgc extends zzfy {
    private zzgj zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgc() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        int i13 = zzfj.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i10, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws IOException {
        zzi(zzgjVar);
        this.zza = zzgjVar;
        Uri uriNormalizeScheme = zzgjVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzdy.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i10 = zzfj.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw zzcd.zzb("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw zzcd.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
            }
        } else {
            this.zzb = URLDecoder.decode(str, zzfot.zza.name()).getBytes(zzfot.zzc);
        }
        long j10 = zzgjVar.zzf;
        int length = this.zzb.length;
        if (j10 > length) {
            this.zzb = null;
            throw new zzgf(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i11 = (int) j10;
        this.zzc = i11;
        int i12 = length - i11;
        this.zzd = i12;
        long j11 = zzgjVar.zzg;
        if (j11 != -1) {
            this.zzd = (int) Math.min(i12, j11);
        }
        zzj(zzgjVar);
        long j12 = zzgjVar.zzg;
        return j12 != -1 ? j12 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        zzgj zzgjVar = this.zza;
        if (zzgjVar != null) {
            return zzgjVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
