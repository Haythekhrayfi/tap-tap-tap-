package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrn extends zzatq implements zzbrp {
    public zzbrn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final zzbrm zze(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10) throws RemoteException {
        zzbrm zzbrkVar;
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbrkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbrkVar = iInterfaceQueryLocalInterface instanceof zzbrm ? (zzbrm) iInterfaceQueryLocalInterface : new zzbrk(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbrkVar;
    }
}
