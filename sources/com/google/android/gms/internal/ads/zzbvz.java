package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvz {
    public static final zzbvn zza(Context context, String str, zzbnw zzbnwVar) {
        try {
            IBinder iBinderZze = ((zzbvr) zzbzv.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzbzt() { // from class: com.google.android.gms.internal.ads.zzbvy
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzt
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbvr ? (zzbvr) iInterfaceQueryLocalInterface : new zzbvr(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbnwVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzbvn ? (zzbvn) iInterfaceQueryLocalInterface : new zzbvl(iBinderZze);
        } catch (RemoteException | zzbzu e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
