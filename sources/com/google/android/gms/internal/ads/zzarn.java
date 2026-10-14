package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzarn implements zzfla {
    private final zzfjd zza;
    private final zzfju zzb;
    private final zzasa zzc;
    private final zzarm zzd;
    private final zzaqw zze;
    private final zzasc zzf;
    private final zzaru zzg;
    private final zzarl zzh;

    public zzarn(zzfjd zzfjdVar, zzfju zzfjuVar, zzasa zzasaVar, zzarm zzarmVar, zzaqw zzaqwVar, zzasc zzascVar, zzaru zzaruVar, zzarl zzarlVar) {
        this.zza = zzfjdVar;
        this.zzb = zzfjuVar;
        this.zzc = zzasaVar;
        this.zzd = zzarmVar;
        this.zze = zzaqwVar;
        this.zzf = zzascVar;
        this.zzg = zzaruVar;
        this.zzh = zzarlVar;
    }

    private final Map zze() {
        HashMap map = new HashMap();
        zzaon zzaonVarZzb = this.zzb.zzb();
        map.put("v", this.zza.zzb());
        map.put("gms", Boolean.valueOf(this.zza.zzc()));
        map.put("int", zzaonVarZzb.zzh());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzaru zzaruVar = this.zzg;
        if (zzaruVar != null) {
            map.put("tcq", Long.valueOf(zzaruVar.zzc()));
            map.put("tpq", Long.valueOf(this.zzg.zzg()));
            map.put("tcv", Long.valueOf(this.zzg.zzd()));
            map.put("tpv", Long.valueOf(this.zzg.zzh()));
            map.put("tchv", Long.valueOf(this.zzg.zzb()));
            map.put("tphv", Long.valueOf(this.zzg.zzf()));
            map.put("tcc", Long.valueOf(this.zzg.zza()));
            map.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfla
    public final Map zza() {
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(this.zzc.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfla
    public final Map zzb() {
        Map mapZze = zze();
        zzaon zzaonVarZza = this.zzb.zza();
        mapZze.put("gai", Boolean.valueOf(this.zza.zzd()));
        mapZze.put("did", zzaonVarZza.zzg());
        mapZze.put("dst", Integer.valueOf(zzaonVarZza.zzal() - 1));
        mapZze.put("doo", Boolean.valueOf(zzaonVarZza.zzai()));
        zzaqw zzaqwVar = this.zze;
        if (zzaqwVar != null) {
            mapZze.put("nt", Long.valueOf(zzaqwVar.zza()));
        }
        zzasc zzascVar = this.zzf;
        if (zzascVar != null) {
            mapZze.put("vs", Long.valueOf(zzascVar.zzc()));
            mapZze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfla
    public final Map zzc() {
        Map mapZze = zze();
        zzarl zzarlVar = this.zzh;
        if (zzarlVar != null) {
            mapZze.put("vst", zzarlVar.zza());
        }
        return mapZze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
