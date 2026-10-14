package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekx implements zzeqx {
    private final String zza;

    public zzekx(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
