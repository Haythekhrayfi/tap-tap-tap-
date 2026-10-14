package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Set;
import java.util.concurrent.Callable;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeod implements zzeqy {
    private final zzfwn zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzeod(zzfwn zzfwnVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzfwnVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzeoe zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfG)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzeoe(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfH)).booleanValue() && this.zzd.contains(PluginErrorDetails.Platform.NATIVE)) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new zzeoe(boolValueOf);
            }
        }
        return new zzeoe(null);
    }
}
