package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbze implements zzaut {
    public final zzbzb zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();
    public final HashSet zzb = new HashSet();
    public final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzbzc zzf = new zzbzc();

    public zzbze(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzbzb(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final void zza(boolean z10) {
        zzbzb zzbzbVar;
        int iZzc;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (!z10) {
            this.zze.zzt(jCurrentTimeMillis);
            this.zze.zzJ(this.zza.zzd);
            return;
        }
        if (jCurrentTimeMillis - this.zze.zzd() > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaQ)).longValue()) {
            zzbzbVar = this.zza;
            iZzc = -1;
        } else {
            zzbzbVar = this.zza;
            iZzc = this.zze.zzc();
        }
        zzbzbVar.zzd = iZzc;
        this.zzg = true;
    }

    public final zzbyt zzb(Clock clock, String str) {
        return new zzbyt(clock, this, this.zzf.zza(), str);
    }

    public final String zzc() {
        return this.zzf.zzb();
    }

    public final void zzd(zzbyt zzbytVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzbytVar);
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzl zzlVar, long j10) {
        synchronized (this.zzd) {
            this.zza.zzf(zzlVar, j10);
        }
    }

    public final void zzj(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzk() {
        return this.zzg;
    }

    public final Bundle zzl(Context context, zzfbo zzfboVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zza(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzbyt) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfboVar.zzc(hashSet);
        return bundle;
    }
}
