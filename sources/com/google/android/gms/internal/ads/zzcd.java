package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzcd extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzcd(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.zza = z10;
        this.zzb = i10;
    }

    public static zzcd zza(String str, Throwable th) {
        return new zzcd(str, th, true, 1);
    }

    public static zzcd zzb(String str, Throwable th) {
        return new zzcd(str, th, true, 0);
    }

    public static zzcd zzc(String str) {
        return new zzcd(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
