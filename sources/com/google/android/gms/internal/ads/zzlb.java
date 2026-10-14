package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzlb {
    private final zzoc zza;
    private final zzla zze;
    private final zzls zzh;
    private final zzei zzi;
    private boolean zzj;
    private zzhg zzk;
    private zzvi zzl = new zzvi(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlb(zzla zzlaVar, zzls zzlsVar, zzei zzeiVar, zzoc zzocVar) {
        this.zza = zzocVar;
        this.zze = zzlaVar;
        this.zzh = zzlsVar;
        this.zzi = zzeiVar;
    }

    private final void zzp(int i10, int i11) {
        while (i10 < this.zzb.size()) {
            ((zzkz) this.zzb.get(i10)).zzd += i11;
            i10++;
        }
    }

    private final void zzq(zzkz zzkzVar) {
        zzky zzkyVar = (zzky) this.zzf.get(zzkzVar);
        if (zzkyVar != null) {
            zzkyVar.zza.zzi(zzkyVar.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzkz zzkzVar = (zzkz) it.next();
            if (zzkzVar.zzc.isEmpty()) {
                zzq(zzkzVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzkz zzkzVar) {
        if (zzkzVar.zze && zzkzVar.zzc.isEmpty()) {
            zzky zzkyVar = (zzky) this.zzf.remove(zzkzVar);
            Objects.requireNonNull(zzkyVar);
            zzkyVar.zza.zzp(zzkyVar.zzb);
            zzkyVar.zza.zzs(zzkyVar.zzc);
            zzkyVar.zza.zzr(zzkyVar.zzc);
            this.zzg.remove(zzkzVar);
        }
    }

    private final void zzt(zzkz zzkzVar) {
        zztj zztjVar = zzkzVar.zza;
        zztp zztpVar = new zztp() { // from class: com.google.android.gms.internal.ads.zzkr
            @Override // com.google.android.gms.internal.ads.zztp
            public final void zza(zztq zztqVar, zzcw zzcwVar) {
                this.zza.zze(zztqVar, zzcwVar);
            }
        };
        zzkx zzkxVar = new zzkx(this, zzkzVar);
        this.zzf.put(zzkzVar, new zzky(zztjVar, zztpVar, zzkxVar));
        zztjVar.zzh(new Handler(zzfj.zzu(), null), zzkxVar);
        zztjVar.zzg(new Handler(zzfj.zzu(), null), zzkxVar);
        zztjVar.zzm(zztpVar, this.zzk, this.zza);
    }

    private final void zzu(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            zzkz zzkzVar = (zzkz) this.zzb.remove(i11);
            this.zzd.remove(zzkzVar.zzb);
            zzp(i11, -zzkzVar.zza.zzB().zzc());
            zzkzVar.zze = true;
            if (this.zzj) {
                zzs(zzkzVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcw zzb() {
        if (this.zzb.isEmpty()) {
            return zzcw.zza;
        }
        int iZzc = 0;
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzkz zzkzVar = (zzkz) this.zzb.get(i10);
            zzkzVar.zzd = iZzc;
            iZzc += zzkzVar.zza.zzB().zzc();
        }
        return new zzlg(this.zzb, this.zzl);
    }

    public final /* synthetic */ void zze(zztq zztqVar, zzcw zzcwVar) {
        this.zze.zzh();
    }

    public final void zzf(zzhg zzhgVar) {
        zzdy.zzf(!this.zzj);
        this.zzk = zzhgVar;
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzkz zzkzVar = (zzkz) this.zzb.get(i10);
            zzt(zzkzVar);
            this.zzg.add(zzkzVar);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzky zzkyVar : this.zzf.values()) {
            try {
                zzkyVar.zza.zzp(zzkyVar.zzb);
            } catch (RuntimeException e10) {
                zzer.zzd("MediaSourceList", "Failed to release child source.", e10);
            }
            zzkyVar.zza.zzs(zzkyVar.zzc);
            zzkyVar.zza.zzr(zzkyVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzh(zztm zztmVar) {
        zzkz zzkzVar = (zzkz) this.zzc.remove(zztmVar);
        Objects.requireNonNull(zzkzVar);
        zzkzVar.zza.zzF(zztmVar);
        zzkzVar.zzc.remove(((zztg) zztmVar).zza);
        if (!this.zzc.isEmpty()) {
            zzr();
        }
        zzs(zzkzVar);
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzcw zzj(int i10, List list, zzvi zzviVar) {
        if (!list.isEmpty()) {
            this.zzl = zzviVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                zzkz zzkzVar = (zzkz) list.get(i11 - i10);
                if (i11 > 0) {
                    zzkz zzkzVar2 = (zzkz) this.zzb.get(i11 - 1);
                    zzkzVar.zzc(zzkzVar2.zza.zzB().zzc() + zzkzVar2.zzd);
                } else {
                    zzkzVar.zzc(0);
                }
                zzp(i11, zzkzVar.zza.zzB().zzc());
                this.zzb.add(i11, zzkzVar);
                this.zzd.put(zzkzVar.zzb, zzkzVar);
                if (this.zzj) {
                    zzt(zzkzVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzkzVar);
                    } else {
                        zzq(zzkzVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcw zzk(int i10, int i11, int i12, zzvi zzviVar) {
        zzdy.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcw zzl(int i10, int i11, zzvi zzviVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= zza()) {
            z10 = true;
        }
        zzdy.zzd(z10);
        this.zzl = zzviVar;
        zzu(i10, i11);
        return zzb();
    }

    public final zzcw zzm(List list, zzvi zzviVar) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zzviVar);
    }

    public final zzcw zzn(zzvi zzviVar) {
        int iZza = zza();
        if (zzviVar.zzc() != iZza) {
            zzviVar = zzviVar.zzf().zzg(0, iZza);
        }
        this.zzl = zzviVar;
        return zzb();
    }

    public final zztm zzo(zzto zztoVar, zzxp zzxpVar, long j10) {
        Object obj = zztoVar.zza;
        int i10 = zzlg.zzc;
        Object obj2 = ((Pair) obj).first;
        zzto zztoVarZzc = zztoVar.zzc(((Pair) obj).second);
        zzkz zzkzVar = (zzkz) this.zzd.get(obj2);
        Objects.requireNonNull(zzkzVar);
        this.zzg.add(zzkzVar);
        zzky zzkyVar = (zzky) this.zzf.get(zzkzVar);
        if (zzkyVar != null) {
            zzkyVar.zza.zzk(zzkyVar.zzb);
        }
        zzkzVar.zzc.add(zztoVarZzc);
        zztg zztgVarZzG = zzkzVar.zza.zzH(zztoVarZzc, zzxpVar, j10);
        this.zzc.put(zztgVarZzG, zzkzVar);
        zzr();
        return zztgVarZzG;
    }
}
