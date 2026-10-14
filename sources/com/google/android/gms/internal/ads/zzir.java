package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzir {
    public final Context zza;
    public zzdz zzb;
    public zzfpx zzc;
    public zzfpx zzd;
    public zzfpx zze;
    public zzfpx zzf;
    public zzfpx zzg;
    public zzfov zzh;
    public Looper zzi;
    public zzk zzj;
    public int zzk;
    public boolean zzl;
    public zzlm zzm;
    public long zzn;
    public long zzo;
    public boolean zzp;
    public boolean zzq;
    public zzic zzr;

    public zzir(final Context context, zzcei zzceiVar) {
        zzil zzilVar = new zzil(zzceiVar);
        zzim zzimVar = new zzim(context);
        zzfpx zzfpxVar = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzin
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return new zzwy(context);
            }
        };
        zzio zzioVar = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzio
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return new zzid();
            }
        };
        zzip zzipVar = new zzip(context);
        zziq zziqVar = new zzfov() { // from class: com.google.android.gms.internal.ads.zziq
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                return new zznt((zzdz) obj);
            }
        };
        Objects.requireNonNull(context);
        this.zza = context;
        this.zzc = zzilVar;
        this.zzd = zzimVar;
        this.zze = zzfpxVar;
        this.zzf = zzioVar;
        this.zzg = zzipVar;
        this.zzh = zziqVar;
        this.zzi = zzfj.zzu();
        this.zzj = zzk.zza;
        this.zzk = 1;
        this.zzl = true;
        this.zzm = zzlm.zze;
        this.zzr = new zzic(0.97f, 1.03f, 1000L, 1.0E-7f, zzfj.zzo(20L), zzfj.zzo(500L), 0.999f, null);
        this.zzb = zzdz.zza;
        this.zzn = 500L;
        this.zzo = 2000L;
        this.zzp = true;
    }

    public static /* synthetic */ zztn zza(Context context) {
        return new zztb(context, new zzaar());
    }
}
