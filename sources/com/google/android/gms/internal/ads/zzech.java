package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzech {
    private final String zzc;
    private zzezq zzd = null;
    private zzezn zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzech(String str) {
        this.zzc = str;
    }

    private final synchronized void zzi(zzezn zzeznVar, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdj)).booleanValue() ? zzeznVar.zzaq : zzeznVar.zzx;
        if (this.zzb.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = zzeznVar.zzw.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, zzeznVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgB)).booleanValue()) {
            str = zzeznVar.zzG;
            str2 = zzeznVar.zzH;
            str3 = zzeznVar.zzI;
            str4 = zzeznVar.zzJ;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzeznVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i10, zzuVar);
        } catch (IndexOutOfBoundsException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(str5, zzuVar);
    }

    private final void zzj(zzezn zzeznVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z10) {
        String str = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdj)).booleanValue() ? zzeznVar.zzaq : zzeznVar.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zze == null) {
                this.zze = zzeznVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str);
            zzuVar.zzb = j10;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgC)).booleanValue() && z10) {
                this.zzf = zzuVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzcuz zzb() {
        return new zzcuz(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzezn zzeznVar) {
        zzi(zzeznVar, this.zza.size());
    }

    public final void zze(zzezn zzeznVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzj(zzeznVar, j10, zzeVar, false);
    }

    public final void zzf(zzezn zzeznVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzj(zzeznVar, j10, null, true);
    }

    public final synchronized void zzg(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int iIndexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str));
            try {
                this.zza.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e10) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzi((zzezn) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzh(zzezq zzezqVar) {
        this.zzd = zzezqVar;
    }
}
