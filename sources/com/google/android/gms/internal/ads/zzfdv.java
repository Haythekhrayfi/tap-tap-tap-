package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdv {
    public static final zzfec zza(Callable callable, Object obj, zzfed zzfedVar) {
        return zzb(callable, zzfedVar.zzb, obj, zzfedVar);
    }

    public static final zzfec zzb(Callable callable, zzfwn zzfwnVar, Object obj, zzfed zzfedVar) {
        return new zzfec(zzfedVar, obj, zzfed.zza, Collections.emptyList(), zzfwnVar.zzb(callable));
    }

    public static final zzfec zzc(zzfwm zzfwmVar, Object obj, zzfed zzfedVar) {
        return new zzfec(zzfedVar, obj, zzfed.zza, Collections.emptyList(), zzfwmVar);
    }

    public static final zzfec zzd(final zzfdp zzfdpVar, zzfwn zzfwnVar, Object obj, zzfed zzfedVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdu
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzfdpVar.zza();
                return null;
            }
        }, zzfwnVar, obj, zzfedVar);
    }
}
