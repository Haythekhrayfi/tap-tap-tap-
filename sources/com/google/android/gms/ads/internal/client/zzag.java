package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzbzv;

/* JADX INFO: loaded from: classes.dex */
final class zzag extends zzax {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbnw zzb;

    public zzag(zzaw zzawVar, Context context, zzbnw zzbnwVar) {
        this.zza = context;
        this.zzb = zzbnwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzl(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbrp) zzbzv.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new zzbzt() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzt
                public final Object zza(Object obj) {
                    return zzbro.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzbzu | NullPointerException unused) {
            return null;
        }
    }
}
