package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbb {
    private static zzfbb zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    @VisibleForTesting
    public zzfbb(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    @VisibleForTesting
    public static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            zzbzr.zzh("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    public static zzfbb zzd(Context context) {
        synchronized (zzfbb.class) {
            zzfbb zzfbbVar = zza;
            if (zzfbbVar != null) {
                return zzfbbVar;
            }
            Context applicationContext = context.getApplicationContext();
            long jLongValue = ((Long) zzbdh.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVarZza = null;
            if (jLongValue > 0 && jLongValue <= 232400000) {
                zzclVarZza = zza(applicationContext);
            }
            zzfbb zzfbbVar2 = new zzfbb(applicationContext, zzclVarZza);
            zza = zzfbbVar2;
            return zzfbbVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbnw zzb() {
        return (zzbnw) this.zzd.get();
    }

    public final zzbzx zzc(int i10, boolean z10, int i11) {
        com.google.android.gms.ads.internal.client.zzen zzenVarZzg;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zZzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        zzbzx zzbzxVar = new zzbzx(ModuleDescriptor.MODULE_VERSION, i11, true, zZzA);
        return (((Boolean) zzbdh.zzc.zze()).booleanValue() && (zzenVarZzg = zzg()) != null) ? new zzbzx(ModuleDescriptor.MODULE_VERSION, zzenVarZzg.zza(), true, zZzA) : zzbzxVar;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzenVarZzg = zzg();
        if (zzenVarZzg != null) {
            return zzenVarZzg.zzb();
        }
        return null;
    }

    public final void zzf(zzbnw zzbnwVar) {
        zzbnw adapterCreator;
        if (!((Boolean) zzbdh.zza.zze()).booleanValue()) {
            zzfba.zza(this.zzd, null, zzbnwVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzclVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbnwVar = adapterCreator;
        }
        zzfba.zza(atomicReference, null, zzbnwVar);
    }
}
