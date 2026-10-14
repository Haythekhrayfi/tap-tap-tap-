package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmq extends zzfnk {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final zzfnk zza(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final zzfnk zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final zzfnk zzc(int i10) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final zzfnk zzd(int i10) {
        this.zzc = i10;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final zzfnk zze(float f10) {
        this.zzd = f10;
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final zzfnk zzf(boolean z10) {
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final zzfnk zzg(IBinder iBinder) {
        Objects.requireNonNull(iBinder, "Null windowToken");
        this.zza = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final zzfnk zzh(int i10) {
        this.zze = i10;
        this.zzg = (byte) (this.zzg | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final zzfnl zzi() {
        IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new zzfms(iBinder, false, this.zzb, this.zzc, this.zzd, 0, null, this.zze, this.zzf, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb2.append(" stableSessionToken");
        }
        if ((this.zzg & 2) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.zzg & 4) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 8) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.zzg & 16) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
