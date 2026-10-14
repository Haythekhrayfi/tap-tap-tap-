package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbbv {
    public static final void zza(zzbbu zzbbuVar, zzbbs zzbbsVar) {
        if (zzbbsVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbbsVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbbuVar.zzd(zzbbsVar.zza(), zzbbsVar.zzb(), zzbbsVar.zzc(), zzbbsVar.zzd());
    }
}
