package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeil extends zzbpv {
    private final String zza;
    private final zzbpt zzb;
    private final zzcaj zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzeil(String str, zzbpt zzbptVar, zzcaj zzcajVar, long j10) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcajVar;
        this.zza = str;
        this.zzb = zzbptVar;
        this.zze = j10;
        try {
            jSONObject.put("adapter_version", zzbptVar.zzf().toString());
            jSONObject.put("sdk_version", zzbptVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcaj zzcajVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("signal_error", "Adapter failed to instantiate");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbw)).booleanValue()) {
                jSONObject.put("signal_error_code", 1);
            }
            zzcajVar.zzd(jSONObject);
        } catch (JSONException unused) {
        }
    }

    private final synchronized void zzh(String str, int i10) {
        if (this.zzf) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbx)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbw)).booleanValue()) {
                this.zzd.put("signal_error_code", i10);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzd(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbw)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzd(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbx)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbw)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzd(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
