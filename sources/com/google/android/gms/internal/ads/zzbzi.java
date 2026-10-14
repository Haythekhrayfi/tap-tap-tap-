package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbzi extends Thread {
    public final /* synthetic */ String zza;

    public zzbzi(zzbzk zzbzkVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzbzw(null).zza(this.zza);
    }
}
