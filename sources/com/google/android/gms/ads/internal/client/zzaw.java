package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbvn;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbzr;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbgq zzd;
    private final zzbvz zze;
    private final zzbrq zzf;
    private final zzbgr zzg;
    private zzbsy zzh;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbgq zzbgqVar, zzbvz zzbvzVar, zzbrq zzbrqVar, zzbgr zzbgrVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzeqVar;
        this.zzd = zzbgqVar;
        this.zze = zzbvzVar;
        this.zzf = zzbrqVar;
        this.zzg = zzbgrVar;
    }

    public static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbnw zzbnwVar) {
        return (zzbq) new zzao(this, context, str, zzbnwVar).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, zzbnw zzbnwVar) {
        return (zzbu) new zzak(this, context, zzqVar, str, zzbnwVar).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, zzbnw zzbnwVar) {
        return (zzbu) new zzam(this, context, zzqVar, str, zzbnwVar).zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbnw zzbnwVar) {
        return (zzdj) new zzac(this, context, zzbnwVar).zzd(context, false);
    }

    public final zzbev zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbev) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbfb zzi(View view, HashMap map, HashMap map2) {
        return (zzbfb) new zzau(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final zzbjj zzl(Context context, zzbnw zzbnwVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbjj) new zzai(this, context, zzbnwVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbrm zzm(Context context, zzbnw zzbnwVar) {
        return (zzbrm) new zzag(this, context, zzbnwVar).zzd(context, false);
    }

    public final zzbrt zzo(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzbzr.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbrt) zzaaVar.zzd(activity, booleanExtra);
    }

    public final zzbvn zzq(Context context, String str, zzbnw zzbnwVar) {
        return (zzbvn) new zzav(this, context, str, zzbnwVar).zzd(context, false);
    }

    public final zzbyi zzr(Context context, zzbnw zzbnwVar) {
        return (zzbyi) new zzae(this, context, zzbnwVar).zzd(context, false);
    }
}
