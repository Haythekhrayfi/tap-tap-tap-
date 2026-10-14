package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;
import q.h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdlf extends zzbfk {
    private final Context zza;
    private final zzdha zzb;
    private zzdia zzc;
    private zzdgv zzd;

    public zzdlf(Context context, zzdha zzdhaVar, zzdia zzdiaVar, zzdgv zzdgvVar) {
        this.zza = context;
        this.zzb = zzdhaVar;
        this.zzc = zzdiaVar;
        this.zzd = zzdgvVar;
    }

    private final zzbee zzd(String str) {
        return new zzdle(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final zzbeo zzf() throws RemoteException {
        return this.zzd.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final zzber zzg(String str) {
        return (zzber) this.zzb.zzh().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final String zzi() {
        return this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final String zzj(String str) {
        return (String) this.zzb.zzi().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final List zzk() {
        h hVarZzh = this.zzb.zzh();
        h hVarZzi = this.zzb.zzi();
        String[] strArr = new String[hVarZzh.f34737e + hVarZzi.f34737e];
        int i10 = 0;
        for (int i11 = 0; i11 < hVarZzh.f34737e; i11++) {
            strArr[i10] = (String) hVarZzh.h(i11);
            i10++;
        }
        for (int i12 = 0; i12 < hVarZzi.f34737e; i12++) {
            strArr[i10] = (String) hVarZzi.h(i12);
            i10++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zzl() {
        zzdgv zzdgvVar = this.zzd;
        if (zzdgvVar != null) {
            zzdgvVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zzm() {
        String strZzB = this.zzb.zzB();
        if ("Google".equals(strZzB)) {
            zzbzr.zzj("Illegal argument specified for omid partner name.");
            return;
        }
        if (TextUtils.isEmpty(strZzB)) {
            zzbzr.zzj("Not starting OMID session. OM partner name has not been configured.");
            return;
        }
        zzdgv zzdgvVar = this.zzd;
        if (zzdgvVar != null) {
            zzdgvVar.zzt(strZzB, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zzn(String str) {
        zzdgv zzdgvVar = this.zzd;
        if (zzdgvVar != null) {
            zzdgvVar.zzE(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zzo() {
        zzdgv zzdgvVar = this.zzd;
        if (zzdgvVar != null) {
            zzdgvVar.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdgv zzdgvVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzt() == null || (zzdgvVar = this.zzd) == null) {
            return;
        }
        zzdgvVar.zzI((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final boolean zzq() {
        zzdgv zzdgvVar = this.zzd;
        return (zzdgvVar == null || zzdgvVar.zzV()) && this.zzb.zzq() != null && this.zzb.zzr() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdia zzdiaVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdiaVar = this.zzc) == null || !zzdiaVar.zzf((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzp().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdia zzdiaVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdiaVar = this.zzc) == null || !zzdiaVar.zzg((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzr().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final boolean zzt() {
        zzfgw zzfgwVarZzt = this.zzb.zzt();
        if (zzfgwVarZzt == null) {
            zzbzr.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzi(zzfgwVarZzt);
        if (this.zzb.zzq() == null) {
            return true;
        }
        this.zzb.zzq().zzd("onSdkLoaded", new q.a());
        return true;
    }
}
