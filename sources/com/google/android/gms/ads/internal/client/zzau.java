package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzbzv;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class zzau extends zzax {
    public final /* synthetic */ View zza;
    public final /* synthetic */ HashMap zzb;
    public final /* synthetic */ HashMap zzc;
    public final /* synthetic */ zzaw zzd;

    public zzau(zzaw zzawVar, View view, HashMap map, HashMap map2) {
        this.zzd = zzawVar;
        this.zza = view;
        this.zzb = map;
        this.zzc = map2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbbm.zza(this.zza.getContext());
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzjo)).booleanValue()) {
            return this.zzd.zzg.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbfa.zze(((zzbfe) zzbzv.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzbzt() { // from class: com.google.android.gms.ads.internal.client.zzat
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzt
                public final Object zza(Object obj) {
                    return zzbfd.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | zzbzu | NullPointerException e10) {
            this.zzd.zzh = zzbsw.zza(this.zza.getContext());
            this.zzd.zzh.zzf(e10, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
