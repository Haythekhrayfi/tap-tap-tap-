package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbux;
import com.google.android.gms.internal.ads.zzbvn;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcgu;
import com.google.android.gms.internal.ads.zzdhu;
import com.google.android.gms.internal.ads.zzdhw;
import com.google.android.gms.internal.ads.zzdri;
import com.google.android.gms.internal.ads.zzeip;
import com.google.android.gms.internal.ads.zzeun;
import com.google.android.gms.internal.ads.zzewb;
import com.google.android.gms.internal.ads.zzexs;
import com.google.android.gms.internal.ads.zzezg;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzcd {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbnw zzbnwVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzeip(zzcgu.zza(context, zzbnwVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbnw zzbnwVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeun zzeunVarZzr = zzcgu.zza(context, zzbnwVar, i10).zzr();
        zzeunVarZzr.zza(str);
        zzeunVarZzr.zzb(context);
        return i10 >= ((Integer) zzba.zzc().zzb(zzbbm.zzeX)).intValue() ? zzeunVarZzr.zzc().zza() : new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbnw zzbnwVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewb zzewbVarZzs = zzcgu.zza(context, zzbnwVar, i10).zzs();
        zzewbVarZzs.zzc(context);
        zzewbVarZzs.zza(zzqVar);
        zzewbVarZzs.zzb(str);
        return zzewbVarZzs.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbnw zzbnwVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexs zzexsVarZzt = zzcgu.zza(context, zzbnwVar, i10).zzt();
        zzexsVarZzt.zzc(context);
        zzexsVarZzt.zza(zzqVar);
        zzexsVarZzt.zzb(str);
        return zzexsVarZzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i10) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new zzbzx(ModuleDescriptor.MODULE_VERSION, i10, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i10) {
        return zzcgu.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i10).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10) {
        return zzcgu.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnwVar, i10).zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbev zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdhw((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfb zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdhu((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbjj zzk(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10, zzbjg zzbjgVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdri zzdriVarZzi = zzcgu.zza(context, zzbnwVar, i10).zzi();
        zzdriVarZzi.zzb(context);
        zzdriVarZzi.zza(zzbjgVar);
        return zzdriVarZzi.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrm zzl(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10) {
        return zzcgu.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnwVar, i10).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrt zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i10 = adOverlayInfoParcelZza.zzk;
        if (i10 == 1) {
            return new com.google.android.gms.ads.internal.overlay.zzs(activity);
        }
        if (i10 == 2) {
            return new zzae(activity);
        }
        if (i10 == 3) {
            return new zzaf(activity);
        }
        if (i10 != 4) {
            return i10 != 5 ? new com.google.android.gms.ads.internal.overlay.zzt(activity) : new zzac(activity);
        }
        return new zzy(activity, adOverlayInfoParcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbux zzn(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezg zzezgVarZzu = zzcgu.zza(context, zzbnwVar, i10).zzu();
        zzezgVarZzu.zzb(context);
        return zzezgVarZzu.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvn zzo(IObjectWrapper iObjectWrapper, String str, zzbnw zzbnwVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezg zzezgVarZzu = zzcgu.zza(context, zzbnwVar, i10).zzu();
        zzezgVarZzu.zzb(context);
        zzezgVarZzu.zza(str);
        return zzezgVarZzu.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyi zzp(IObjectWrapper iObjectWrapper, zzbnw zzbnwVar, int i10) {
        return zzcgu.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnwVar, i10).zzo();
    }
}
