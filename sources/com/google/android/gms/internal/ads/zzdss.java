package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdss {
    private final zzdsc zza;
    private final zzdns zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdss(zzdsc zzdscVar, zzdns zzdnsVar) {
        this.zza = zzdscVar;
        this.zzb = zzdnsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        zzdnr zzdnrVarZza;
        zzdnr zzdnrVarZza2;
        zzbqh zzbqhVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbkf zzbkfVar = (zzbkf) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziO)).booleanValue() || (zzdnrVarZza2 = this.zzb.zza(zzbkfVar.zza)) == null || (zzbqhVar = zzdnrVarZza2.zzc) == null) ? "" : zzbqhVar.toString();
                boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziP)).booleanValue() && (zzdnrVarZza = this.zzb.zza(zzbkfVar.zza)) != null && zzdnrVarZza.zzd;
                List list2 = this.zzd;
                String str = zzbkfVar.zza;
                list2.add(new zzdsr(str, string, this.zzb.zzc(str), zzbkfVar.zzb ? 1 : 0, zzbkfVar.zzd, zzbkfVar.zzc, z10));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (!this.zza.zzt()) {
                    zzc();
                    return jSONArray;
                }
                zzd(this.zza.zzg());
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdsr) it.next()).zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdsq(this));
    }
}
