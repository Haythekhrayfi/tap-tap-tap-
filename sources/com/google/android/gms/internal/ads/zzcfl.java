package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzcfl {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcez, java.lang.Object] */
    public static final zzcez zza(final Context context, final zzcgo zzcgoVar, final String str, final boolean z10, final boolean z11, final zzaqs zzaqsVar, final zzbco zzbcoVar, final zzbzx zzbzxVar, zzbce zzbceVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzawz zzawzVar, final zzezn zzeznVar, final zzezq zzezqVar, final zzebl zzeblVar) throws zzcfk {
        zzbbm.zza(context);
        try {
            final zzbce zzbceVar2 = null;
            zzfpx zzfpxVar = new zzfpx(context, zzcgoVar, str, z10, z11, zzaqsVar, zzbcoVar, zzbzxVar, zzbceVar2, zzlVar, zzaVar, zzawzVar, zzeznVar, zzezqVar, zzeblVar) { // from class: com.google.android.gms.internal.ads.zzcfh
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcgo zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzaqs zzf;
                public final /* synthetic */ zzbco zzg;
                public final /* synthetic */ zzbzx zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzawz zzk;
                public final /* synthetic */ zzezn zzl;
                public final /* synthetic */ zzezq zzm;
                public final /* synthetic */ zzebl zzn;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzawzVar;
                    this.zzl = zzeznVar;
                    this.zzm = zzezqVar;
                    this.zzn = zzeblVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfpx
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcgo zzcgoVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z12 = this.zzd;
                    boolean z13 = this.zze;
                    zzaqs zzaqsVar2 = this.zzf;
                    zzbco zzbcoVar2 = this.zzg;
                    zzbzx zzbzxVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzawz zzawzVar2 = this.zzk;
                    zzezn zzeznVar2 = this.zzl;
                    zzezq zzezqVar2 = this.zzm;
                    zzebl zzeblVar2 = this.zzn;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcfs.zza;
                        zzcfo zzcfoVar = new zzcfo(new zzcfs(new zzcgn(context2), zzcgoVar2, str2, z12, z13, zzaqsVar2, zzbcoVar2, zzbzxVar2, null, zzlVar2, zzaVar2, zzawzVar2, zzeznVar2, zzezqVar2));
                        zzcfoVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzcfoVar, zzawzVar2, z13, zzeblVar2));
                        zzcfoVar.setWebChromeClient(new zzcey(zzcfoVar));
                        return zzcfoVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zzfpxVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcfk("Webview initialization failed.", th);
        }
    }
}
