package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcfr implements Runnable {
    public final /* synthetic */ zzcfs zza;

    public zzcfr(zzcfs zzcfsVar) {
        this.zza = zzcfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
