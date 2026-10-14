package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzct extends zzcr {
    private final MuteThisAdListener zza;

    public zzct(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        this.zza.onAdMuted();
    }
}
