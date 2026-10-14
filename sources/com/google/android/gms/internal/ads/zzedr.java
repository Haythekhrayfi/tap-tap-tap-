package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;
import n.j;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedr implements zzecc {
    private final Context zza;
    private final zzdeo zzb;
    private final Executor zzc;
    private final zzezm zzd;

    public zzedr(Context context, Executor executor, zzdeo zzdeoVar, zzezm zzezmVar) {
        this.zza = context;
        this.zzb = zzdeoVar;
        this.zzc = executor;
        this.zzd = zzezmVar;
    }

    private static String zzd(zzezn zzeznVar) {
        try {
            return zzeznVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final zzfwm zza(final zzezz zzezzVar, final zzezn zzeznVar) {
        String strZzd = zzd(zzeznVar);
        final Uri uri = strZzd != null ? Uri.parse(strZzd) : null;
        return zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzedp
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzc(uri, zzezzVar, zzeznVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final boolean zzb(zzezz zzezzVar, zzezn zzeznVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbcn.zzg(context) && !TextUtils.isEmpty(zzd(zzeznVar));
    }

    public final /* synthetic */ zzfwm zzc(Uri uri, zzezz zzezzVar, zzezn zzeznVar, Object obj) throws Exception {
        try {
            j jVarA = new j.a().a();
            jVarA.f33567a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(jVarA.f33567a, null);
            final zzcaj zzcajVar = new zzcaj();
            zzddo zzddoVarZze = this.zzb.zze(new zzcrs(zzezzVar, zzeznVar, null), new zzddr(new zzdew() { // from class: com.google.android.gms.internal.ads.zzedq
                @Override // com.google.android.gms.internal.ads.zzdew
                public final void zza(boolean z10, Context context, zzcvt zzcvtVar) {
                    zzcaj zzcajVar2 = zzcajVar;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzi();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzcajVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcajVar.zzd(new AdOverlayInfoParcel(zzcVar, (com.google.android.gms.ads.internal.client.zza) null, zzddoVarZze.zza(), (com.google.android.gms.ads.internal.overlay.zzz) null, new zzbzx(0, 0, false, false, false), (zzcez) null, (zzdcu) null));
            this.zzd.zza();
            return zzfwc.zzh(zzddoVarZze.zzg());
        } catch (Throwable th) {
            zzbzr.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
