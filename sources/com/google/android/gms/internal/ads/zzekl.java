package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekl implements zzeqx {
    private final boolean zza;

    public zzekl(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? "0" : "1");
    }
}
