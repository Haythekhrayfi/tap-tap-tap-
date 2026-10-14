package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes2.dex */
final class zzbyx extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzbza zza;

    public zzbyx(zzbza zzbzaVar) {
        this.zza = zzbzaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzn.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzn.set(false);
    }
}
