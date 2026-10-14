package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfis extends zzfio {
    public zzfis(zzfih zzfihVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfihVar, hashSet, jSONObject, j10);
    }

    private final void zzc(String str) {
        zzfhl zzfhlVarZza = zzfhl.zza();
        if (zzfhlVarZza != null) {
            for (zzfha zzfhaVar : zzfhlVarZza.zzc()) {
                if (((zzfio) this).zza.contains(zzfhaVar.zzh())) {
                    zzfhaVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfip, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfip
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
