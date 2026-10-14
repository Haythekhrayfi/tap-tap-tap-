package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqv extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzaqw zza;

    public zzaqv(zzaqw zzaqwVar) {
        this.zza = zzaqwVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzaqw.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzaqw.class) {
            this.zza.zza = null;
        }
    }
}
