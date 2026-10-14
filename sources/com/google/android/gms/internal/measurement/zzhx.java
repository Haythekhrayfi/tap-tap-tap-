package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhx {
    public final String zza;
    public final Uri zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;

    @Nullable
    public final zzie zzi;

    public zzhx(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzhx(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable zzie zzieVar) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z10;
        this.zzf = false;
        this.zzg = z12;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzhx zza() {
        return new zzhx(null, this.zzb, this.zzc, this.zzd, this.zze, false, true, false, null);
    }

    public final zzhx zzb() {
        if (this.zzc.isEmpty()) {
            return new zzhx(null, this.zzb, this.zzc, this.zzd, true, false, this.zzg, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzia zzc(String str, double d10) {
        return new zzhv(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzia zzd(String str, long j10) {
        return new zzht(this, str, Long.valueOf(j10), true);
    }

    public final zzia zze(String str, String str2) {
        return new zzhw(this, str, str2, true);
    }

    public final zzia zzf(String str, boolean z10) {
        return new zzhu(this, str, Boolean.valueOf(z10), true);
    }
}
