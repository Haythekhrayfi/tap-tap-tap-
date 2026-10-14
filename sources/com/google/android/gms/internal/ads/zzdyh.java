package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyh extends zzbtp {
    private final Context zza;
    private final zzfwn zzb;
    private final zzdyz zzc;
    private final zzcmg zzd;
    private final ArrayDeque zze;
    private final zzfgb zzf;
    private final zzbuq zzg;
    private final zzdyw zzh;

    public zzdyh(Context context, zzfwn zzfwnVar, zzbuq zzbuqVar, zzcmg zzcmgVar, zzdyz zzdyzVar, ArrayDeque arrayDeque, zzdyw zzdywVar, zzfgb zzfgbVar) {
        zzbbm.zza(context);
        this.zza = context;
        this.zzb = zzfwnVar;
        this.zzg = zzbuqVar;
        this.zzc = zzdyzVar;
        this.zzd = zzcmgVar;
        this.zze = arrayDeque;
        this.zzh = zzdywVar;
        this.zzf = zzfgbVar;
    }

    private final synchronized zzdye zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdye zzdyeVar = (zzdye) it.next();
            if (zzdyeVar.zzc.equals(str)) {
                it.remove();
                return zzdyeVar;
            }
        }
        return null;
    }

    private static zzfwm zzl(zzfwm zzfwmVar, zzfel zzfelVar, zzbmz zzbmzVar, zzffy zzffyVar, zzffn zzffnVar) {
        zzbmp zzbmpVarZza = zzbmzVar.zza("AFMA_getAdDictionary", zzbmw.zza, new zzbmr() { // from class: com.google.android.gms.internal.ads.zzdxy
            @Override // com.google.android.gms.internal.ads.zzbmr
            public final Object zza(JSONObject jSONObject) {
                return new zzbuh(jSONObject);
            }
        });
        zzffx.zzd(zzfwmVar, zzffnVar);
        zzfdq zzfdqVarZza = zzfelVar.zzb(zzfef.BUILD_URL, zzfwmVar).zzf(zzbmpVarZza).zza();
        zzffx.zzc(zzfdqVarZza, zzffyVar, zzffnVar);
        return zzfdqVarZza;
    }

    private static zzfwm zzm(zzbue zzbueVar, zzfel zzfelVar, final zzerq zzerqVar) {
        zzfvj zzfvjVar = new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzerqVar.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        };
        return zzfelVar.zzb(zzfef.GMS_SIGNALS, zzfwc.zzh(zzbueVar.zza)).zzf(zzfvjVar).zze(new zzfdo() { // from class: com.google.android.gms.internal.ads.zzdxt
            @Override // com.google.android.gms.internal.ads.zzfdo
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzdye zzdyeVar) {
        zzo();
        this.zze.addLast(zzdyeVar);
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) zzbdl.zzc.zze()).intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(zzfwm zzfwmVar, zzbua zzbuaVar) {
        zzfwc.zzq(zzfwc.zzm(zzfwmVar, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdyb
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwc.zzh(zzfbh.zza((InputStream) obj));
            }
        }, zzcae.zza), new zzdyd(this, zzbuaVar), zzcae.zzf);
    }

    public final zzfwm zzb(final zzbue zzbueVar, int i10) {
        if (!((Boolean) zzbdl.zza.zze()).booleanValue()) {
            return zzfwc.zzg(new Exception("Split request is disabled."));
        }
        zzfcb zzfcbVar = zzbueVar.zzi;
        if (zzfcbVar == null) {
            return zzfwc.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfcbVar.zzc == 0 || zzfcbVar.zzd == 0) {
            return zzfwc.zzg(new Exception("Caching is disabled."));
        }
        zzbmz zzbmzVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzx.zza(), this.zzf);
        zzerq zzerqVarZzp = this.zzd.zzp(zzbueVar, i10);
        zzfel zzfelVarZzc = zzerqVarZzp.zzc();
        final zzfwm zzfwmVarZzm = zzm(zzbueVar, zzfelVarZzc, zzerqVarZzp);
        zzffy zzffyVarZzd = zzerqVarZzp.zzd();
        final zzffn zzffnVarZza = zzffm.zza(this.zza, 9);
        final zzfwm zzfwmVarZzl = zzl(zzfwmVarZzm, zzfelVarZzc, zzbmzVarZzb, zzffyVarZzd, zzffnVarZza);
        return zzfelVarZzc.zza(zzfef.GET_URL_AND_CACHE_KEY, zzfwmVarZzm, zzfwmVarZzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzj(zzfwmVarZzl, zzfwmVarZzm, zzbueVar, zzffnVarZza);
            }
        }).zza();
    }

    public final zzfwm zzc(zzbue zzbueVar, int i10) {
        String str;
        zzfdt zzfdtVarZza;
        Callable callable;
        zzbmz zzbmzVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzx.zza(), this.zzf);
        zzerq zzerqVarZzp = this.zzd.zzp(zzbueVar, i10);
        zzbmp zzbmpVarZza = zzbmzVarZzb.zza("google.afma.response.normalize", zzdyg.zza, zzbmw.zzb);
        zzdye zzdyeVarZzk = null;
        if (((Boolean) zzbdl.zza.zze()).booleanValue()) {
            zzdyeVarZzk = zzk(zzbueVar.zzh);
            if (zzdyeVarZzk == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                com.google.android.gms.ads.internal.util.zze.zza(str);
            }
        } else {
            String str2 = zzbueVar.zzj;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                com.google.android.gms.ads.internal.util.zze.zza(str);
            }
        }
        zzffn zzffnVarZza = zzdyeVarZzk == null ? zzffm.zza(this.zza, 9) : zzdyeVarZzk.zze;
        zzffy zzffyVarZzd = zzerqVarZzp.zzd();
        zzffyVarZzd.zzd(zzbueVar.zza.getStringArrayList("ad_types"));
        zzdyy zzdyyVar = new zzdyy(zzbueVar.zzg, zzffyVarZzd, zzffnVarZza);
        zzdyv zzdyvVar = new zzdyv(this.zza, zzbueVar.zzb.zza, this.zzg, i10);
        zzfel zzfelVarZzc = zzerqVarZzp.zzc();
        zzffn zzffnVarZza2 = zzffm.zza(this.zza, 11);
        if (zzdyeVarZzk == null) {
            final zzfwm zzfwmVarZzm = zzm(zzbueVar, zzfelVarZzc, zzerqVarZzp);
            final zzfwm zzfwmVarZzl = zzl(zzfwmVarZzm, zzfelVarZzc, zzbmzVarZzb, zzffyVarZzd, zzffnVarZza);
            zzffn zzffnVarZza3 = zzffm.zza(this.zza, 10);
            final zzfdq zzfdqVarZza = zzfelVarZzc.zza(zzfef.HTTP, zzfwmVarZzl, zzfwmVarZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdyx((JSONObject) zzfwmVarZzm.get(), (zzbuh) zzfwmVarZzl.get());
                }
            }).zze(zzdyyVar).zze(new zzfft(zzffnVarZza3)).zze(zzdyvVar).zza();
            zzffx.zza(zzfdqVarZza, zzffyVarZzd, zzffnVarZza3);
            zzffx.zzd(zzfdqVarZza, zzffnVarZza2);
            zzfdtVarZza = zzfelVarZzc.zza(zzfef.PRE_PROCESS, zzfwmVarZzm, zzfwmVarZzl, zzfdqVarZza);
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzdxw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdyg((zzdyu) zzfdqVarZza.get(), (JSONObject) zzfwmVarZzm.get(), (zzbuh) zzfwmVarZzl.get());
                }
            };
        } else {
            zzdyx zzdyxVar = new zzdyx(zzdyeVarZzk.zzb, zzdyeVarZzk.zza);
            zzffn zzffnVarZza4 = zzffm.zza(this.zza, 10);
            final zzfdq zzfdqVarZza2 = zzfelVarZzc.zzb(zzfef.HTTP, zzfwc.zzh(zzdyxVar)).zze(zzdyyVar).zze(new zzfft(zzffnVarZza4)).zze(zzdyvVar).zza();
            zzffx.zza(zzfdqVarZza2, zzffyVarZzd, zzffnVarZza4);
            final zzfwm zzfwmVarZzh = zzfwc.zzh(zzdyeVarZzk);
            zzffx.zzd(zzfdqVarZza2, zzffnVarZza2);
            zzfdtVarZza = zzfelVarZzc.zza(zzfef.PRE_PROCESS, zzfdqVarZza2, zzfwmVarZzh);
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzdya
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfwm zzfwmVar = zzfdqVarZza2;
                    zzfwm zzfwmVar2 = zzfwmVarZzh;
                    return new zzdyg((zzdyu) zzfwmVar.get(), ((zzdye) zzfwmVar2.get()).zzb, ((zzdye) zzfwmVar2.get()).zza);
                }
            };
        }
        zzfdq zzfdqVarZza3 = zzfdtVarZza.zza(callable).zzf(zzbmpVarZza).zza();
        zzffx.zza(zzfdqVarZza3, zzffyVarZzd, zzffnVarZza2);
        return zzfdqVarZza3;
    }

    public final zzfwm zzd(zzbue zzbueVar, int i10) {
        zzbmz zzbmzVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzx.zza(), this.zzf);
        if (!((Boolean) zzbdq.zza.zze()).booleanValue()) {
            return zzfwc.zzg(new Exception("Signal collection disabled."));
        }
        zzerq zzerqVarZzp = this.zzd.zzp(zzbueVar, i10);
        final zzerb zzerbVarZza = zzerqVarZzp.zza();
        zzbmp zzbmpVarZza = zzbmzVarZzb.zza("google.afma.request.getSignals", zzbmw.zza, zzbmw.zzb);
        zzffn zzffnVarZza = zzffm.zza(this.zza, 22);
        zzfdq zzfdqVarZza = zzerqVarZzp.zzc().zzb(zzfef.GET_SIGNALS, zzfwc.zzh(zzbueVar.zza)).zze(new zzfft(zzffnVarZza)).zzf(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzerbVarZza.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        }).zzb(zzfef.JS_SIGNALS).zzf(zzbmpVarZza).zza();
        zzffy zzffyVarZzd = zzerqVarZzp.zzd();
        zzffyVarZzd.zzd(zzbueVar.zza.getStringArrayList("ad_types"));
        zzffx.zzb(zzfdqVarZza, zzffyVarZzd, zzffnVarZza);
        if (((Boolean) zzbdf.zze.zze()).booleanValue()) {
            zzdyz zzdyzVar = this.zzc;
            Objects.requireNonNull(zzdyzVar);
            zzfdqVarZza.zzc(new zzdxu(zzdyzVar), this.zzb);
        }
        return zzfdqVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zze(zzbue zzbueVar, zzbua zzbuaVar) {
        zzp(zzb(zzbueVar, Binder.getCallingUid()), zzbuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzf(zzbue zzbueVar, zzbua zzbuaVar) {
        zzp(zzd(zzbueVar, Binder.getCallingUid()), zzbuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzg(zzbue zzbueVar, zzbua zzbuaVar) {
        zzfwm zzfwmVarZzc = zzc(zzbueVar, Binder.getCallingUid());
        zzp(zzfwmVarZzc, zzbuaVar);
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            zzdyz zzdyzVar = this.zzc;
            Objects.requireNonNull(zzdyzVar);
            zzfwmVarZzc.zzc(new zzdxu(zzdyzVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzh(String str, zzbua zzbuaVar) {
        zzp(zzi(str), zzbuaVar);
    }

    public final zzfwm zzi(String str) {
        if (((Boolean) zzbdl.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzfwc.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzfwc.zzh(new zzdyc(this));
        }
        return zzfwc.zzg(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zzj(zzfwm zzfwmVar, zzfwm zzfwmVar2, zzbue zzbueVar, zzffn zzffnVar) throws Exception {
        String strZzc = ((zzbuh) zzfwmVar.get()).zzc();
        zzn(new zzdye((zzbuh) zzfwmVar.get(), (JSONObject) zzfwmVar2.get(), zzbueVar.zzh, strZzc, zzffnVar));
        return new ByteArrayInputStream(strZzc.getBytes(zzfot.zzc));
    }
}
