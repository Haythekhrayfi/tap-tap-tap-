package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzaqs;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzo implements Callable {
    public final /* synthetic */ zzs zza;

    public zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzs zzsVar = this.zza;
        return new zzaqs(zzaqr.zzt(zzsVar.zza.zza, zzsVar.zzd, false));
    }
}
