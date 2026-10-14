package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgh;

/* JADX INFO: loaded from: classes.dex */
public final class zzfj extends zzbgh {
    private final ShouldDelayBannerRenderingListener zza;

    public zzfj(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.zza = shouldDelayBannerRenderingListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final boolean zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        return this.zza.shouldDelayBannerRendering((Runnable) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
