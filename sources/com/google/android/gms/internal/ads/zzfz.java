package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfz extends zzfy {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzfz(byte[] bArr) {
        super(false);
        zzdy.zzd(bArr.length > 0);
        this.zza = bArr;
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
        System.arraycopy(this.zza, this.zzc, bArr, i10, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws IOException {
        this.zzb = zzgjVar.zza;
        zzi(zzgjVar);
        long j10 = zzgjVar.zzf;
        int length = this.zza.length;
        if (j10 > length) {
            throw new zzgf(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i10 = (int) j10;
        this.zzc = i10;
        int i11 = length - i10;
        this.zzd = i11;
        long j11 = zzgjVar.zzg;
        if (j11 != -1) {
            this.zzd = (int) Math.min(i11, j11);
        }
        this.zze = true;
        zzj(zzgjVar);
        long j12 = zzgjVar.zzg;
        return j12 != -1 ? j12 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zzb = null;
    }
}
