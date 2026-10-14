package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzbzv;

/* JADX INFO: loaded from: classes.dex */
final class zzai extends zzax {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbnw zzb;
    public final /* synthetic */ OnH5AdsEventListener zzc;

    public zzai(zzaw zzawVar, Context context, zzbnw zzbnwVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbnwVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* synthetic */ Object zza() {
        return new zzbjq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzk(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION, new zzbjd(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbjm) zzbzv.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzbzt() { // from class: com.google.android.gms.ads.internal.client.zzah
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzt
                public final Object zza(Object obj) {
                    return zzbjl.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION, new zzbjd(this.zzc));
        } catch (RemoteException | zzbzu | NullPointerException unused) {
            return null;
        }
    }
}
