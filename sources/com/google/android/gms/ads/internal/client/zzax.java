package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzr;

/* JADX INFO: loaded from: classes.dex */
abstract class zzax {
    private static final zzce zza;

    static {
        zzce zzccVar = null;
        try {
            Object objNewInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzccVar = iInterfaceQueryLocalInterface instanceof zzce ? (zzce) iInterfaceQueryLocalInterface : new zzcc(iBinder);
                }
            } else {
                zzbzr.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            zzbzr.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzccVar;
    }

    private final Object zze() {
        zzce zzceVar = zza;
        if (zzceVar == null) {
            zzbzr.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzb(zzceVar);
        } catch (RemoteException e10) {
            zzbzr.zzk("Cannot invoke local loader using ClientApi class.", e10);
            return null;
        }
    }

    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e10) {
            zzbzr.zzk("Cannot invoke remote loader.", e10);
            return null;
        }
    }

    public abstract Object zza();

    public abstract Object zzb(zzce zzceVar) throws RemoteException;

    public abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z10) {
        boolean z11;
        Object objZze;
        if (!z10) {
            zzay.zzb();
            if (!zzbzk.zzs(context, 12451000)) {
                zzbzr.zze("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = !(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
        zzbbm.zza(context);
        if (((Boolean) zzbda.zza.zze()).booleanValue()) {
            z11 = false;
        } else if (((Boolean) zzbda.zzb.zze()).booleanValue()) {
            z11 = true;
            z12 = true;
        } else {
            z12 = z10 | z13;
            z11 = false;
        }
        if (z12) {
            objZze = zze();
            if (objZze == null && !z11) {
                objZze = zzf();
            }
        } else {
            Object objZzf = zzf();
            if (objZzf == null) {
                if (zzay.zze().nextInt(((Long) zzbdn.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
                }
            }
            objZze = objZzf == null ? zze() : objZzf;
        }
        return objZze == null ? zza() : objZze;
    }
}
