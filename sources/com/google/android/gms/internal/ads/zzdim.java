package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.applovin.impl.mediation.b.a.c;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdim {
    private final zzdni zza;
    private final zzdlx zzb;
    private final zzcoh zzc;
    private final zzdhi zzd;

    public zzdim(zzdni zzdniVar, zzdlx zzdlxVar, zzcoh zzcohVar, zzdhi zzdhiVar) {
        this.zza = zzdniVar;
        this.zzb = zzdlxVar;
        this.zzc = zzcohVar;
        this.zzd = zzdhiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzcfk {
        zzcez zzcezVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        ((View) zzcezVarZza).setVisibility(8);
        zzcezVarZza.zzad("/sendMessageToSdk", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdig
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcez) obj, map);
            }
        });
        zzcezVarZza.zzad("/adMuted", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdih
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcez) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zzcezVarZza), "/loadHtml", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdii
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, final Map map) {
                final zzdim zzdimVar = this.zza;
                zzcez zzcezVar = (zzcez) obj;
                zzcezVar.zzN().zzA(new zzcgk() { // from class: com.google.android.gms.internal.ads.zzdil
                    @Override // com.google.android.gms.internal.ads.zzcgk
                    public final void zza(boolean z10) {
                        zzdimVar.zzd(map, z10);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcezVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcezVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zzcezVarZza), "/showOverlay", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdij
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcez) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zzcezVarZza), "/hideOverlay", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdik
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzcez) obj, map);
            }
        });
        return (View) zzcezVarZza;
    }

    public final /* synthetic */ void zzb(zzcez zzcezVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcez zzcezVar, Map map) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map map, boolean z10) {
        HashMap mapA = c.a("messageType", "htmlLoaded");
        mapA.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", mapA);
    }

    public final /* synthetic */ void zze(zzcez zzcezVar, Map map) {
        zzbzr.zzi("Showing native ads overlay.");
        zzcezVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcez zzcezVar, Map map) {
        zzbzr.zzi("Hiding native ads overlay.");
        zzcezVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
