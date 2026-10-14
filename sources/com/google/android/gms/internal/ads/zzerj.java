package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzerj implements zzeqy {
    private final zzfwn zza;
    private final Context zzb;

    public zzerj(zzfwn zzfwnVar, Context context) {
        this.zza = zzfwnVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzerh zzc() throws Exception {
        boolean zIsActiveNetworkMetered;
        int i10;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzp();
        int i11 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzw(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = iOrdinal;
            } else {
                i10 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i10 = -2;
        }
        return new zzerh(networkOperator, i10, com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zzb), phoneType, zIsActiveNetworkMetered, i11);
    }
}
