package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
final class zzal extends zzax {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzaw zzd;

    public zzal(zzaw zzawVar, Context context, zzq zzqVar, String str) {
        this.zzd = zzawVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, AppLovinEventTypes.USER_EXECUTED_SEARCH);
        return new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzf(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.zzd.zza.zza(this.zza, this.zzb, this.zzc, null, 3);
    }
}
