package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzfvy;

/* JADX INFO: loaded from: classes.dex */
final class zzz implements zzfvy {
    public final /* synthetic */ zzaa zza;

    public zzz(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = this.zza;
        zzf.zzc(zzaaVar.zzr, zzaaVar.zzj, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzbzr.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* synthetic */ void zzb(Object obj) {
        zzbzr.zze("Initialized webview successfully for SDKCore.");
    }
}
