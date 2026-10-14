package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnv {
    private final zzfbb zza;
    private final zzdns zzb;

    public zzdnv(zzfbb zzfbbVar, zzdns zzdnsVar) {
        this.zza = zzfbbVar;
        this.zzb = zzdnsVar;
    }

    public final zzbnw zza() throws RemoteException {
        zzbnw zzbnwVarZzb = this.zza.zzb();
        if (zzbnwVarZzb != null) {
            return zzbnwVarZzb;
        }
        zzbzr.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbpt zzb(String str) throws RemoteException {
        zzbpt zzbptVarZzc = zza().zzc(str);
        this.zzb.zze(str, zzbptVarZzc);
        return zzbptVarZzc;
    }

    public final zzfbd zzc(String str, JSONObject jSONObject) throws zzfan {
        zzbnz zzbnzVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbnzVarZzb = new zzbow(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbnzVarZzb = new zzbow(new zzbql());
            } else {
                zzbnw zzbnwVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzbnwVarZza.zze(string)) {
                            zzbnzVarZzb = zzbnwVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbnzVarZzb = zzbnwVarZza.zzd(string) ? zzbnwVarZza.zzb(string) : zzbnwVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e10) {
                        zzbzr.zzh("Invalid custom event.", e10);
                        zzbnzVarZzb = zzbnwVarZza.zzb(str);
                    }
                } else {
                    zzbnzVarZzb = zzbnwVarZza.zzb(str);
                }
            }
            zzfbd zzfbdVar = new zzfbd(zzbnzVarZzb);
            this.zzb.zzd(str, zzfbdVar);
            return zzfbdVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziP)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzfan(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
