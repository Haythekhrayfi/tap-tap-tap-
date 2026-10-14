package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgvt extends zzgvw {
    public final Logger zza;

    public zzgvt(String str) {
        this.zza = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgvw
    public final void zza(String str) {
        this.zza.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
