package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzbzv;

/* JADX INFO: loaded from: classes.dex */
final class zzaa extends zzax {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ zzaw zzb;

    public zzaa(zzaw zzawVar, Activity activity) {
        this.zzb = zzawVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzm(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbbm.zza(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzjo)).booleanValue()) {
            return this.zzb.zzf.zza(this.zza);
        }
        try {
            return zzbrs.zzH(((zzbrw) zzbzv.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzbzt() { // from class: com.google.android.gms.ads.internal.client.zzz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzt
                public final Object zza(Object obj) {
                    return zzbrv.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | zzbzu | NullPointerException e10) {
            this.zzb.zzh = zzbsw.zza(this.zza.getApplicationContext());
            this.zzb.zzh.zzf(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
