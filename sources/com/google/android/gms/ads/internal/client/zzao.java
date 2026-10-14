package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzbzv;

/* JADX INFO: loaded from: classes.dex */
final class zzao extends zzax {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbnw zzc;
    public final /* synthetic */ zzaw zzd;

    public zzao(zzaw zzawVar, Context context, String str, zzbnw zzbnwVar) {
        this.zzd = zzawVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbnwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "native_ad");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbbm.zza(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzjo)).booleanValue()) {
            return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            IBinder iBinderZze = ((zzbr) zzbzv.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzbzt() { // from class: com.google.android.gms.ads.internal.client.zzan
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzt
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbr(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(iBinderZze);
        } catch (RemoteException | zzbzu | NullPointerException e10) {
            this.zzd.zzh = zzbsw.zza(this.zza);
            this.zzd.zzh.zzf(e10, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
