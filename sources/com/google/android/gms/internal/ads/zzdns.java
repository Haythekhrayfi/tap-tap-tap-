package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdns {
    private final Map zza = new HashMap();

    @Nullable
    public final synchronized zzdnr zza(String str) {
        return (zzdnr) this.zza.get(str);
    }

    @Nullable
    public final zzdnr zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdnr zzdnrVarZza = zza((String) it.next());
            if (zzdnrVarZza != null) {
                return zzdnrVarZza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbqh zzbqhVar;
        zzdnr zzdnrVarZza = zza(str);
        return (zzdnrVarZza == null || (zzbqhVar = zzdnrVarZza.zzb) == null) ? "" : zzbqhVar.toString();
    }

    public final synchronized void zzd(String str, @Nullable zzfbd zzfbdVar) {
        zzbqh zzbqhVarZze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbqh zzbqhVarZzf = null;
        if (zzfbdVar == null) {
            zzbqhVarZze = null;
        } else {
            try {
                zzbqhVarZze = zzfbdVar.zze();
            } catch (zzfan unused) {
                zzbqhVarZze = null;
            }
        }
        if (zzfbdVar != null) {
            try {
                zzbqhVarZzf = zzfbdVar.zzf();
            } catch (zzfan unused2) {
            }
        }
        boolean z10 = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziP)).booleanValue()) {
            z10 = true;
        } else if (zzfbdVar != null) {
            try {
                zzfbdVar.zzC();
                z10 = true;
            } catch (zzfan unused3) {
            }
        }
        this.zza.put(str, new zzdnr(str, zzbqhVarZze, zzbqhVarZzf, z10));
    }

    public final synchronized void zze(String str, zzbpt zzbptVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdnr(str, zzbptVar.zzf(), zzbptVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
