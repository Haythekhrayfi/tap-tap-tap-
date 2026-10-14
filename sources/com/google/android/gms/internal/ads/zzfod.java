package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzfod extends zzfnx {
    public final /* synthetic */ IBinder zza;
    public final /* synthetic */ zzfog zzb;

    public zzfod(zzfog zzfogVar, IBinder iBinder) {
        this.zzb = zzfogVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfnx
    public final void zza() {
        this.zzb.zza.zzn = zzfns.zzb(this.zza);
        zzfoh.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        Iterator it = this.zzb.zza.zze.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzb.zza.zze.clear();
    }
}
