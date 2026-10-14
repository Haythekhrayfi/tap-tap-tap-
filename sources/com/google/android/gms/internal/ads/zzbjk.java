package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjk extends zzatq implements zzbjm {
    public zzbjk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final zzbjj zze(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10, zzbjg zzbjgVar) throws RemoteException {
        zzbjj zzbjhVar;
        Parcel parcelZza = zza();
        zzats.zzf(parcelZza, iObjectWrapper);
        zzats.zzf(parcelZza, zzbnwVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzats.zzf(parcelZza, zzbjgVar);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbjhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbjhVar = iInterfaceQueryLocalInterface instanceof zzbjj ? (zzbjj) iInterfaceQueryLocalInterface : new zzbjh(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbjhVar;
    }
}
