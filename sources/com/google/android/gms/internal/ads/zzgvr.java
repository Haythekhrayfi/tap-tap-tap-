package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgvr extends zzgvw {
    public final String zza;

    public zzgvr(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgvw
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}
