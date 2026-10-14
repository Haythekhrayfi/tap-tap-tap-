package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcez;
import com.google.android.gms.internal.ads.zzfmz;
import com.google.android.gms.internal.ads.zzfna;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzfnl;
import com.google.android.gms.internal.ads.zzfnn;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfnp;
import com.google.android.gms.internal.ads.zzfnq;
import com.google.android.gms.internal.ads.zzfok;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzw {
    private zzfno zzf;
    private zzcez zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzfnb zzd = null;
    private String zzb = null;

    private final zzfnq zzl() {
        zzfnp zzfnpVarZzc = zzfnq.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzjQ)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfnpVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfnpVarZzc.zza(this.zzb);
        }
        return zzfnpVarZzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(zzcez zzcezVar, Context context) {
        this.zzc = zzcezVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zze("on_play_store_bind", map);
    }

    public final void zzb() {
        zzfnb zzfnbVar;
        if (!this.zze || (zzfnbVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfnbVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        zzfnb zzfnbVar;
        if (!this.zze || (zzfnbVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfmz zzfmzVarZzc = zzfna.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzjQ)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfmzVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfmzVarZzc.zza(this.zzb);
        }
        zzfnbVar.zzb(zzfmzVarZzc.zzc(), this.zzf);
    }

    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    public final void zze(final String str, final Map map) {
        zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(str, map);
            }
        });
    }

    public final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zze("onError", map);
        }
    }

    public final void zzg() {
        zzfnb zzfnbVar;
        if (!this.zze || (zzfnbVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfnbVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        }
    }

    public final /* synthetic */ void zzh(String str, Map map) {
        zzcez zzcezVar = this.zzc;
        if (zzcezVar != null) {
            zzcezVar.zzd(str, map);
        }
    }

    public final void zzi(zzfnn zzfnnVar) {
        if (!TextUtils.isEmpty(zzfnnVar.zzb())) {
            if (!((Boolean) zzba.zzc().zzb(zzbbm.zzjQ)).booleanValue()) {
                this.zza = zzfnnVar.zzb();
            }
        }
        switch (zzfnnVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                break;
            case 8153:
                zzd("onLMDOverlayClicked");
                break;
            case 8155:
                zzd("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzfnnVar.zza()));
                zze("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void zzj(zzcez zzcezVar, zzfnl zzfnlVar) {
        if (zzcezVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcezVar;
        if (!this.zze && !zzk(zzcezVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzjQ)).booleanValue()) {
            this.zzb = zzfnlVar.zzg();
        }
        zzm();
        zzfnb zzfnbVar = this.zzd;
        if (zzfnbVar != null) {
            zzfnbVar.zzd(zzfnlVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfok.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfnc.zza(context);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
