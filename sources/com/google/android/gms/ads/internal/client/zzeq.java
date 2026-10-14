package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbzr;

/* JADX INFO: loaded from: classes.dex */
public final class zzeq extends RemoteCreator {
    public zzeq() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcp(iBinder);
    }

    public final zzco zza(Context context) {
        try {
            IBinder iBinderZze = ((zzcp) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(iBinderZze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            zzbzr.zzk("Could not get remote MobileAdsSettingManager.", e10);
            return null;
        }
    }
}
