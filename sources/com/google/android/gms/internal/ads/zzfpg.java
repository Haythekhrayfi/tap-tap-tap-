package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfpg {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzfpg.class.getName());
    private static final zzfpf zzc = new zzfpf(null);

    private zzfpg() {
    }

    public static boolean zza(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
