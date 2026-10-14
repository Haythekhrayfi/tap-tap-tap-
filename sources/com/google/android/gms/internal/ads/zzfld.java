package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfld {
    public final zzflg zza;
    public final boolean zzb;

    private zzfld(zzflg zzflgVar) {
        this.zza = zzflgVar;
        this.zzb = zzflgVar != null;
    }

    public static zzfld zzb(Context context, String str, String str2) {
        zzflg zzfleVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzfleVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfleVar = iInterfaceQueryLocalInterface instanceof zzflg ? (zzflg) iInterfaceQueryLocalInterface : new zzfle(iBinderInstantiate);
                    }
                    zzfleVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfld(zzfleVar);
                } catch (Exception e10) {
                    throw new zzfkf(e10);
                }
            } catch (Exception e11) {
                throw new zzfkf(e11);
            }
        } catch (RemoteException | zzfkf | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfld(new zzflh());
        }
    }

    public static zzfld zzc() {
        zzflh zzflhVar = new zzflh();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfld(zzflhVar);
    }

    public final zzflc zza(byte[] bArr) {
        return new zzflc(this, bArr, null);
    }
}
