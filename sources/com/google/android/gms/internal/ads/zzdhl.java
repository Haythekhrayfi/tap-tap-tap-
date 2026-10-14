package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import q.h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhl {
    public static final zzdhl zza = new zzdhl(new zzdhj());
    private final zzbfs zzb;
    private final zzbfp zzc;
    private final zzbgf zzd;
    private final zzbgc zze;
    private final zzbla zzf;
    private final h zzg;
    private final h zzh;

    private zzdhl(zzdhj zzdhjVar) {
        this.zzb = zzdhjVar.zza;
        this.zzc = zzdhjVar.zzb;
        this.zzd = zzdhjVar.zzc;
        this.zzg = new h(zzdhjVar.zzf);
        this.zzh = new h(zzdhjVar.zzg);
        this.zze = zzdhjVar.zzd;
        this.zzf = zzdhjVar.zze;
    }

    public final zzbfp zza() {
        return this.zzc;
    }

    public final zzbfs zzb() {
        return this.zzb;
    }

    public final zzbfv zzc(String str) {
        return (zzbfv) this.zzh.getOrDefault(str, null);
    }

    public final zzbfy zzd(String str) {
        return (zzbfy) this.zzg.getOrDefault(str, null);
    }

    public final zzbgc zze() {
        return this.zze;
    }

    public final zzbgf zzf() {
        return this.zzd;
    }

    public final zzbla zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.f34737e);
        int i10 = 0;
        while (true) {
            h hVar = this.zzg;
            if (i10 >= hVar.f34737e) {
                return arrayList;
            }
            arrayList.add((String) hVar.h(i10));
            i10++;
        }
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
