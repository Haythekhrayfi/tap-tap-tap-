package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
final class zzfhz implements Runnable {
    public final /* synthetic */ zzfia zza;
    private final WebView zzb;

    public zzfhz(zzfia zzfiaVar) {
        this.zza = zzfiaVar;
        this.zzb = zzfiaVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
