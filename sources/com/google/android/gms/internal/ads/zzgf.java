package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzgf extends IOException {
    public final int zza;

    public zzgf(int i10) {
        this.zza = i10;
    }

    public zzgf(String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzgf(String str, Throwable th, int i10) {
        super(str, th);
        this.zza = i10;
    }

    public zzgf(Throwable th, int i10) {
        super(th);
        this.zza = i10;
    }
}
