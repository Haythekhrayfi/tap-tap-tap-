package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaqs;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcgu;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzchm;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzfbe;
import com.google.android.gms.internal.ads.zzfgr;
import com.google.android.gms.internal.ads.zzfwn;
import com.google.android.gms.internal.ads.zzgwe;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgwr;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzab implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;
    private final zzgwr zzi;

    public zzab(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6, zzgwr zzgwrVar7, zzgwr zzgwrVar8, zzgwr zzgwrVar9) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
        this.zze = zzgwrVar5;
        this.zzf = zzgwrVar6;
        this.zzg = zzgwrVar7;
        this.zzh = zzgwrVar8;
        this.zzi = zzgwrVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgu zzcguVar = (zzcgu) this.zza.zzb();
        Context contextZza = ((zzcha) this.zzb).zza();
        zzaqs zzaqsVar = (zzaqs) this.zzc.zzb();
        zzfbe zzfbeVar = (zzfbe) this.zzd.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzaa(zzcguVar, contextZza, zzaqsVar, zzfbeVar, zzfwnVar, (ScheduledExecutorService) this.zzf.zzb(), (zzdqf) this.zzg.zzb(), (zzfgr) this.zzh.zzb(), ((zzchm) this.zzi).zza());
    }
}
