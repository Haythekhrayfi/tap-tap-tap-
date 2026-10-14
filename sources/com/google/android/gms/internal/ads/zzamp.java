package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class zzamp implements zzamf {
    public final /* synthetic */ Context zza;
    private File zzb = null;

    public zzamp(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
