package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Collections;
import java.util.List;
import q.h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdha {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbej zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcez zzi;
    private zzcez zzj;
    private zzcez zzk;
    private zzfgw zzl;
    private View zzm;
    private zzfwm zzn;
    private View zzo;
    private IObjectWrapper zzp;
    private double zzq;
    private zzber zzr;
    private zzber zzs;
    private String zzt;
    private float zzw;
    private String zzx;
    private final h zzu = new h();
    private final h zzv = new h();
    private List zzf = Collections.emptyList();

    public static zzdha zzae(zzboh zzbohVar) {
        try {
            zzdgz zzdgzVarZzai = zzai(zzbohVar.zzg(), null);
            zzbej zzbejVarZzh = zzbohVar.zzh();
            View view = (View) zzak(zzbohVar.zzj());
            String strZzo = zzbohVar.zzo();
            List listZzr = zzbohVar.zzr();
            String strZzm = zzbohVar.zzm();
            Bundle bundleZzf = zzbohVar.zzf();
            String strZzn = zzbohVar.zzn();
            View view2 = (View) zzak(zzbohVar.zzk());
            IObjectWrapper iObjectWrapperZzl = zzbohVar.zzl();
            String strZzq = zzbohVar.zzq();
            String strZzp = zzbohVar.zzp();
            double dZze = zzbohVar.zze();
            zzber zzberVarZzi = zzbohVar.zzi();
            zzdha zzdhaVar = new zzdha();
            zzdhaVar.zza = 2;
            zzdhaVar.zzb = zzdgzVarZzai;
            zzdhaVar.zzc = zzbejVarZzh;
            zzdhaVar.zzd = view;
            zzdhaVar.zzX("headline", strZzo);
            zzdhaVar.zze = listZzr;
            zzdhaVar.zzX("body", strZzm);
            zzdhaVar.zzh = bundleZzf;
            zzdhaVar.zzX("call_to_action", strZzn);
            zzdhaVar.zzm = view2;
            zzdhaVar.zzp = iObjectWrapperZzl;
            zzdhaVar.zzX("store", strZzq);
            zzdhaVar.zzX("price", strZzp);
            zzdhaVar.zzq = dZze;
            zzdhaVar.zzr = zzberVarZzi;
            return zzdhaVar;
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to get native ad from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdha zzaf(zzboi zzboiVar) {
        try {
            zzdgz zzdgzVarZzai = zzai(zzboiVar.zzf(), null);
            zzbej zzbejVarZzg = zzboiVar.zzg();
            View view = (View) zzak(zzboiVar.zzi());
            String strZzo = zzboiVar.zzo();
            List listZzp = zzboiVar.zzp();
            String strZzm = zzboiVar.zzm();
            Bundle bundleZze = zzboiVar.zze();
            String strZzn = zzboiVar.zzn();
            View view2 = (View) zzak(zzboiVar.zzj());
            IObjectWrapper iObjectWrapperZzk = zzboiVar.zzk();
            String strZzl = zzboiVar.zzl();
            zzber zzberVarZzh = zzboiVar.zzh();
            zzdha zzdhaVar = new zzdha();
            zzdhaVar.zza = 1;
            zzdhaVar.zzb = zzdgzVarZzai;
            zzdhaVar.zzc = zzbejVarZzg;
            zzdhaVar.zzd = view;
            zzdhaVar.zzX("headline", strZzo);
            zzdhaVar.zze = listZzp;
            zzdhaVar.zzX("body", strZzm);
            zzdhaVar.zzh = bundleZze;
            zzdhaVar.zzX("call_to_action", strZzn);
            zzdhaVar.zzm = view2;
            zzdhaVar.zzp = iObjectWrapperZzk;
            zzdhaVar.zzX("advertiser", strZzl);
            zzdhaVar.zzs = zzberVarZzh;
            return zzdhaVar;
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    public static zzdha zzag(zzboh zzbohVar) {
        try {
            return zzaj(zzai(zzbohVar.zzg(), null), zzbohVar.zzh(), (View) zzak(zzbohVar.zzj()), zzbohVar.zzo(), zzbohVar.zzr(), zzbohVar.zzm(), zzbohVar.zzf(), zzbohVar.zzn(), (View) zzak(zzbohVar.zzk()), zzbohVar.zzl(), zzbohVar.zzq(), zzbohVar.zzp(), zzbohVar.zze(), zzbohVar.zzi(), null, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdha zzah(zzboi zzboiVar) {
        try {
            return zzaj(zzai(zzboiVar.zzf(), null), zzboiVar.zzg(), (View) zzak(zzboiVar.zzi()), zzboiVar.zzo(), zzboiVar.zzp(), zzboiVar.zzm(), zzboiVar.zze(), zzboiVar.zzn(), (View) zzak(zzboiVar.zzj()), zzboiVar.zzk(), null, null, -1.0d, zzboiVar.zzh(), zzboiVar.zzl(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    private static zzdgz zzai(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbol zzbolVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdgz(zzdqVar, zzbolVar);
    }

    private static zzdha zzaj(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbej zzbejVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d10, zzber zzberVar, String str6, float f10) {
        zzdha zzdhaVar = new zzdha();
        zzdhaVar.zza = 6;
        zzdhaVar.zzb = zzdqVar;
        zzdhaVar.zzc = zzbejVar;
        zzdhaVar.zzd = view;
        zzdhaVar.zzX("headline", str);
        zzdhaVar.zze = list;
        zzdhaVar.zzX("body", str2);
        zzdhaVar.zzh = bundle;
        zzdhaVar.zzX("call_to_action", str3);
        zzdhaVar.zzm = view2;
        zzdhaVar.zzp = iObjectWrapper;
        zzdhaVar.zzX("store", str4);
        zzdhaVar.zzX("price", str5);
        zzdhaVar.zzq = d10;
        zzdhaVar.zzr = zzberVar;
        zzdhaVar.zzX("advertiser", str6);
        zzdhaVar.zzQ(f10);
        return zzdhaVar;
    }

    private static Object zzak(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdha zzs(zzbol zzbolVar) {
        try {
            return zzaj(zzai(zzbolVar.zzj(), zzbolVar), zzbolVar.zzk(), (View) zzak(zzbolVar.zzm()), zzbolVar.zzs(), zzbolVar.zzv(), zzbolVar.zzq(), zzbolVar.zzi(), zzbolVar.zzr(), (View) zzak(zzbolVar.zzn()), zzbolVar.zzo(), zzbolVar.zzu(), zzbolVar.zzt(), zzbolVar.zze(), zzbolVar.zzl(), zzbolVar.zzp(), zzbolVar.zzf());
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public final synchronized String zzA() {
        return zzE("headline");
    }

    public final synchronized String zzB() {
        return this.zzx;
    }

    public final synchronized String zzC() {
        return zzE("price");
    }

    public final synchronized String zzD() {
        return zzE("store");
    }

    public final synchronized String zzE(String str) {
        return (String) this.zzv.getOrDefault(str, null);
    }

    public final synchronized List zzF() {
        return this.zze;
    }

    public final synchronized List zzG() {
        return this.zzf;
    }

    public final synchronized void zzH() {
        zzcez zzcezVar = this.zzi;
        if (zzcezVar != null) {
            zzcezVar.destroy();
            this.zzi = null;
        }
        zzcez zzcezVar2 = this.zzj;
        if (zzcezVar2 != null) {
            zzcezVar2.destroy();
            this.zzj = null;
        }
        zzcez zzcezVar3 = this.zzk;
        if (zzcezVar3 != null) {
            zzcezVar3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzu.clear();
        this.zzv.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
    }

    public final synchronized void zzI(zzbej zzbejVar) {
        this.zzc = zzbejVar;
    }

    public final synchronized void zzJ(String str) {
        this.zzt = str;
    }

    public final synchronized void zzK(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzL(zzber zzberVar) {
        this.zzr = zzberVar;
    }

    public final synchronized void zzM(String str, zzbed zzbedVar) {
        try {
            if (zzbedVar == null) {
                this.zzu.remove(str);
            } else {
                this.zzu.put(str, zzbedVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzN(zzcez zzcezVar) {
        this.zzj = zzcezVar;
    }

    public final synchronized void zzO(List list) {
        this.zze = list;
    }

    public final synchronized void zzP(zzber zzberVar) {
        this.zzs = zzberVar;
    }

    public final synchronized void zzQ(float f10) {
        this.zzw = f10;
    }

    public final synchronized void zzR(List list) {
        this.zzf = list;
    }

    public final synchronized void zzS(zzcez zzcezVar) {
        this.zzk = zzcezVar;
    }

    public final synchronized void zzT(zzfwm zzfwmVar) {
        this.zzn = zzfwmVar;
    }

    public final synchronized void zzU(String str) {
        this.zzx = str;
    }

    public final synchronized void zzV(zzfgw zzfgwVar) {
        this.zzl = zzfgwVar;
    }

    public final synchronized void zzW(double d10) {
        this.zzq = d10;
    }

    public final synchronized void zzX(String str, String str2) {
        try {
            if (str2 == null) {
                this.zzv.remove(str);
            } else {
                this.zzv.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzY(int i10) {
        this.zza = i10;
    }

    public final synchronized void zzZ(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized double zza() {
        return this.zzq;
    }

    public final synchronized void zzaa(View view) {
        this.zzm = view;
    }

    public final synchronized void zzab(zzcez zzcezVar) {
        this.zzi = zzcezVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized boolean zzad() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzw;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzo;
    }

    public final synchronized h zzh() {
        return this.zzu;
    }

    public final synchronized h zzi() {
        return this.zzv;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbej zzl() {
        return this.zzc;
    }

    public final zzber zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbeq.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzber zzn() {
        return this.zzr;
    }

    public final synchronized zzber zzo() {
        return this.zzs;
    }

    public final synchronized zzcez zzp() {
        return this.zzj;
    }

    public final synchronized zzcez zzq() {
        return this.zzk;
    }

    public final synchronized zzcez zzr() {
        return this.zzi;
    }

    public final synchronized zzfgw zzt() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.zzp;
    }

    public final synchronized zzfwm zzv() {
        return this.zzn;
    }

    public final synchronized String zzw() {
        return zzE("advertiser");
    }

    public final synchronized String zzx() {
        return zzE("body");
    }

    public final synchronized String zzy() {
        return zzE("call_to_action");
    }

    public final synchronized String zzz() {
        return this.zzt;
    }
}
