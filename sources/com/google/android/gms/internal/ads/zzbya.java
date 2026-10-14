package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
final class zzbya implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ zzbyb zza;
    private final String zzb;

    public zzbya(zzbyb zzbybVar, String str) {
        this.zza = zzbybVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzbxz zzbxzVar : this.zza.zzb) {
                zzbxzVar.zza.zzb(zzbxzVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
