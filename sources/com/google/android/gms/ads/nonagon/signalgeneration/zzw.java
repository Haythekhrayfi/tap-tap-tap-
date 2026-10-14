package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzdpv;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfvy;
import com.google.android.gms.internal.ads.zzfwm;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzw implements zzfvy {
    public final /* synthetic */ zzfwm zza;
    public final /* synthetic */ zzbym zzb;
    public final /* synthetic */ zzbyf zzc;
    public final /* synthetic */ zzffn zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzaa zzf;

    public zzw(zzaa zzaaVar, zzfwm zzfwmVar, zzbym zzbymVar, zzbyf zzbyfVar, zzffn zzffnVar, long j10) {
        this.zzf = zzaaVar;
        this.zza = zzfwmVar;
        this.zzb = zzbymVar;
        this.zzc = zzbyfVar;
        this.zzd = zzffnVar;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.zzf;
        zzf.zzc(zzaaVar.zzr, zzaaVar.zzj, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jCurrentTimeMillis)));
        zzffy zzffyVarZzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbcy.zze.zze()).booleanValue() && zzffyVarZzr != null) {
            zzffn zzffnVar = this.zzd;
            zzffnVar.zzg(th);
            zzffnVar.zzf(false);
            zzffyVarZzr.zza(zzffnVar);
            zzffyVarZzr.zzg();
        }
        try {
            this.zzc.zzb("Internal error. " + message);
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffn zzffnVar;
        zzam zzamVar = (zzam) obj;
        zzffy zzffyVarZzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzho)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
            try {
                if (zzamVar == null) {
                    this.zzc.zzc(null, null, null);
                    zzaa zzaaVar = this.zzf;
                    zzf.zzc(zzaaVar.zzr, zzaaVar.zzj, "sgs", new Pair("rid", "-1"));
                    this.zzd.zzf(true);
                    if (!((Boolean) zzbcy.zze.zze()).booleanValue() || zzffyVarZzr == null) {
                        return;
                    }
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(zzamVar.zzb);
                        String strOptString = jSONObject.optString("request_id", "");
                        if (TextUtils.isEmpty(strOptString)) {
                            zzbzr.zzj("The request ID is empty in request JSON.");
                            this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                            zzaa zzaaVar2 = this.zzf;
                            zzf.zzc(zzaaVar2.zzr, zzaaVar2.zzj, "sgf", new Pair("sgf_reason", "rid_missing"));
                            zzffn zzffnVar2 = this.zzd;
                            zzffnVar2.zzc("Request ID empty");
                            zzffnVar2.zzf(false);
                            if (!((Boolean) zzbcy.zze.zze()).booleanValue() || zzffyVarZzr == null) {
                                return;
                            }
                        } else {
                            zzaa zzaaVar3 = this.zzf;
                            zzaa.zzG(zzaaVar3, strOptString, zzamVar.zzb, zzaaVar3.zzj);
                            Bundle bundle = zzamVar.zzc;
                            zzaa zzaaVar4 = this.zzf;
                            if (zzaaVar4.zzw && bundle != null && bundle.getInt(zzaaVar4.zzy, -1) == -1) {
                                zzaa zzaaVar5 = this.zzf;
                                bundle.putInt(zzaaVar5.zzy, zzaaVar5.zzz.get());
                            }
                            zzaa zzaaVar6 = this.zzf;
                            if (zzaaVar6.zzv && bundle != null && TextUtils.isEmpty(bundle.getString(zzaaVar6.zzx))) {
                                if (TextUtils.isEmpty(this.zzf.zzB)) {
                                    zzaa zzaaVar7 = this.zzf;
                                    com.google.android.gms.ads.internal.util.zzs zzsVarZzp = com.google.android.gms.ads.internal.zzt.zzp();
                                    zzaa zzaaVar8 = this.zzf;
                                    zzaaVar7.zzB = zzsVarZzp.zzc(zzaaVar8.zzg, zzaaVar8.zzA.zza);
                                }
                                zzaa zzaaVar9 = this.zzf;
                                bundle.putString(zzaaVar9.zzx, zzaaVar9.zzB);
                            }
                            this.zzc.zzc(zzamVar.zza, zzamVar.zzb, bundle);
                            zzaa zzaaVar10 = this.zzf;
                            zzdqf zzdqfVar = zzaaVar10.zzr;
                            zzdpv zzdpvVar = zzaaVar10.zzj;
                            Pair[] pairArr = new Pair[2];
                            pairArr[0] = new Pair("tqgt", String.valueOf(jCurrentTimeMillis));
                            String str = "na";
                            if (((Boolean) zzba.zzc().zzb(zzbbm.zziZ)).booleanValue()) {
                                try {
                                    str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                } catch (JSONException e10) {
                                    zzbzr.zzh("Error retrieving JSONObject from the requestJson, ", e10);
                                }
                            }
                            pairArr[1] = new Pair("tpc", str);
                            zzf.zzc(zzdqfVar, zzdpvVar, "sgs", pairArr);
                            this.zzd.zzf(true);
                            if (!((Boolean) zzbcy.zze.zze()).booleanValue() || zzffyVarZzr == null) {
                                return;
                            }
                        }
                    } catch (JSONException e11) {
                        zzbzr.zzj("Failed to create JSON object from the request string.");
                        this.zzc.zzb("Internal error for request JSON: " + e11.toString());
                        zzaa zzaaVar11 = this.zzf;
                        zzf.zzc(zzaaVar11.zzr, zzaaVar11.zzj, "sgf", new Pair("sgf_reason", "request_invalid"));
                        zzffn zzffnVar3 = this.zzd;
                        zzffnVar3.zzg(e11);
                        zzffnVar3.zzf(false);
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                        if (!((Boolean) zzbcy.zze.zze()).booleanValue() || zzffyVarZzr == null) {
                            return;
                        }
                    }
                }
            } catch (RemoteException e12) {
                zzffn zzffnVar4 = this.zzd;
                zzffnVar4.zzg(e12);
                zzffnVar4.zzf(false);
                zzbzr.zzh("", e12);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbcy.zze.zze()).booleanValue() || zzffyVarZzr == null) {
                    return;
                }
            } finally {
                if (((Boolean) zzbcy.zze.zze()).booleanValue() && zzffyVarZzr != null) {
                    zzffyVarZzr.zza(this.zzd);
                    zzffyVarZzr.zzg();
                }
            }
            zzffnVar = this.zzd;
        } else {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e13) {
                zzbzr.zzg("QueryInfo generation has been disabled.".concat(e13.toString()));
            }
            if (!((Boolean) zzbcy.zze.zze()).booleanValue() || zzffyVarZzr == null) {
                return;
            }
            zzffnVar = this.zzd;
            zzffnVar.zzc("QueryInfo generation has been disabled.");
            zzffnVar.zzf(false);
        }
        zzffyVarZzr.zza(zzffnVar);
    }
}
