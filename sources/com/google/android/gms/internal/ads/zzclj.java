package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzclj extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final zzbzx zzb;
    private final zzdnv zzc;
    private final zzece zzd;
    private final zzeii zze;
    private final zzdsc zzf;
    private final zzbxw zzg;
    private final zzdoa zzh;
    private final zzdsx zzi;
    private final zzbdy zzj;
    private final zzfgb zzk;
    private final zzfbb zzl;
    private final zzbbn zzm;
    private boolean zzn = false;

    public zzclj(Context context, zzbzx zzbzxVar, zzdnv zzdnvVar, zzece zzeceVar, zzeii zzeiiVar, zzdsc zzdscVar, zzbxw zzbxwVar, zzdoa zzdoaVar, zzdsx zzdsxVar, zzbdy zzbdyVar, zzfgb zzfgbVar, zzfbb zzfbbVar, zzbbn zzbbnVar) {
        this.zza = context;
        this.zzb = zzbzxVar;
        this.zzc = zzdnvVar;
        this.zzd = zzeceVar;
        this.zze = zzeiiVar;
        this.zzf = zzdscVar;
        this.zzg = zzbxwVar;
        this.zzh = zzdoaVar;
        this.zzi = zzdsxVar;
        this.zzj = zzbdyVar;
        this.zzk = zzfgbVar;
        this.zzl = zzfbbVar;
        this.zzm = zzbbnVar;
    }

    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
            if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, com.google.android.gms.ads.internal.zzt.zzo().zzh().zzl(), this.zzb.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzB(false);
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzA("");
        }
    }

    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZze = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzbzr.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (zzbnq zzbnqVar : ((zzbnr) it.next()).zza) {
                    String str = zzbnqVar.zzk;
                    for (String str2 : zzbnqVar.zzc) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzecf zzecfVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzecfVarZza != null) {
                        zzfbd zzfbdVar = (zzfbd) zzecfVarZza.zzb;
                        if (!zzfbdVar.zzC() && zzfbdVar.zzB()) {
                            zzfbdVar.zzj(this.zza, (zzedz) zzecfVarZza.zzc, (List) entry.getValue());
                            zzbzr.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfan e10) {
                    zzbzr.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e10);
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfbl.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z10) throws RemoteException {
        try {
            zzfmi.zzi(this.zza).zzn(z10);
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzn) {
            zzbzr.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbbm.zza(this.zza);
        this.zzm.zza();
        com.google.android.gms.ads.internal.zzt.zzo().zzs(this.zza, this.zzb);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zza);
        this.zzn = true;
        this.zzf.zzr();
        this.zze.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdI)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue()) {
            zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjx)).booleanValue()) {
            zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcle
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcy)).booleanValue()) {
            zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
        String strZzn;
        Runnable runnable;
        zzbbm.zza(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            strZzn = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
        } else {
            strZzn = "";
        }
        boolean z10 = true;
        String str2 = true == TextUtils.isEmpty(strZzn) ? str : strZzn;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdH)).booleanValue();
        zzbbe zzbbeVar = zzbbm.zzaN;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzclh
                @Override // java.lang.Runnable
                public final void run() {
                    final zzclj zzcljVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcli
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcljVar.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z10 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z10) {
            com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str2, runnable3, this.zzk);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) throws RemoteException {
        this.zzi.zzh(zzdaVar, zzdsw.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzbzr.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzbzr.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.zzb.zza);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbnw zzbnwVar) throws RemoteException {
        this.zzl.zzf(zzbnwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z10) {
        com.google.android.gms.ads.internal.zzt.zzr().zzc(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f10) {
        com.google.android.gms.ads.internal.zzt.zzr().zzd(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbbm.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdH)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str, null, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbkm zzbkmVar) throws RemoteException {
        this.zzf.zzs(zzbkmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziS)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        this.zzg.zzq(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzt.zzr().zze();
    }

    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbtb());
    }
}
