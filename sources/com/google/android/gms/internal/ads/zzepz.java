package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepz implements zzeqy {
    public final String zza;
    private final zzfwn zzb;
    private final ScheduledExecutorService zzc;
    private final zzeii zzd;
    private final Context zze;
    private final zzfai zzf;
    private final zzeie zzg;
    private final zzdnv zzh;
    private final zzdse zzi;

    public zzepz(zzfwn zzfwnVar, ScheduledExecutorService scheduledExecutorService, String str, zzeii zzeiiVar, Context context, zzfai zzfaiVar, zzeie zzeieVar, zzdnv zzdnvVar, zzdse zzdseVar) {
        this.zzb = zzfwnVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzeiiVar;
        this.zze = context;
        this.zzf = zzfaiVar;
        this.zzg = zzeieVar;
        this.zzh = zzdnvVar;
        this.zzi = zzdseVar;
    }

    public static /* synthetic */ zzfwm zzc(zzepz zzepzVar) {
        Map mapZza = zzepzVar.zzd.zza(zzepzVar.zza, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjv)).booleanValue() ? zzepzVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzepzVar.zzf.zzf);
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbz)).booleanValue() ? zzepzVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfsf) mapZza).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzepzVar.zzf.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(zzepzVar.zzf(str, list, bundle, true, true));
        }
        Iterator it2 = ((zzfsf) zzepzVar.zzd.zzb()).entrySet().iterator();
        while (it2.hasNext()) {
            zzeim zzeimVar = (zzeim) ((Map.Entry) it2.next()).getValue();
            String str2 = zzeimVar.zza;
            Bundle bundle3 = zzepzVar.zzf.zzd.zzm;
            arrayList.add(zzepzVar.zzf(str2, Collections.singletonList(zzeimVar.zzd), bundle3 != null ? bundle3.getBundle(str2) : null, zzeimVar.zzb, zzeimVar.zzc));
        }
        return zzfwc.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzepw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfwm> list2 = arrayList;
                Bundle bundle4 = bundleZzg;
                JSONArray jSONArray = new JSONArray();
                for (zzfwm zzfwmVar : list2) {
                    if (((JSONObject) zzfwmVar.get()) != null) {
                        jSONArray.put(zzfwmVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzeqa(jSONArray.toString(), bundle4);
            }
        }, zzepzVar.zzb);
    }

    private final zzfvt zzf(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzfvt zzfvtVarZzv = zzfvt.zzv(zzfwc.zzk(new zzfvi() { // from class: com.google.android.gms.internal.ads.zzepx
            @Override // com.google.android.gms.internal.ads.zzfvi
            public final zzfwm zza() {
                return this.zza.zzd(str, list, bundle, z10, z11);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbv)).booleanValue()) {
            zzfvtVarZzv = (zzfvt) zzfwc.zzn(zzfvtVarZzv, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbo)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfvt) zzfwc.zze(zzfvtVarZzv, Throwable.class, new zzfov() { // from class: com.google.android.gms.internal.ads.zzepy
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                zzbzr.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzg(zzbpt zzbptVar, Bundle bundle, List list, zzeil zzeilVar) throws RemoteException {
        zzbptVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzeilVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return zzfwc.zzk(new zzfvi() { // from class: com.google.android.gms.internal.ads.zzept
            @Override // com.google.android.gms.internal.ads.zzfvi
            public final zzfwm zza() {
                return zzepz.zzc(this.zza);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfwm zzd(String str, final List list, final Bundle bundle, boolean z10, boolean z11) throws Exception {
        zzbpt zzbptVarZzb;
        final zzcaj zzcajVar = new zzcaj();
        if (z11) {
            this.zzg.zzb(str);
            zzbptVarZzb = this.zzg.zza(str);
        } else {
            try {
                zzbptVarZzb = this.zzh.zzb(str);
            } catch (RemoteException e10) {
                zzbzr.zzh("Couldn't create RTB adapter : ", e10);
                zzbptVarZzb = null;
            }
        }
        if (zzbptVarZzb == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbq)).booleanValue()) {
                throw null;
            }
            zzeil.zzb(str, zzcajVar);
        } else {
            final zzeil zzeilVar = new zzeil(str, zzbptVarZzb, zzcajVar, com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbv)).booleanValue()) {
                this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeilVar.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbo)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z10) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbA)).booleanValue()) {
                    final zzbpt zzbptVar = zzbptVarZzb;
                    this.zzb.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze(zzbptVar, bundle, list, zzeilVar, zzcajVar);
                        }
                    });
                } else {
                    zzg(zzbptVarZzb, bundle, list, zzeilVar);
                }
            } else {
                zzeilVar.zzd();
            }
        }
        return zzcajVar;
    }

    public final /* synthetic */ void zze(zzbpt zzbptVar, Bundle bundle, List list, zzeil zzeilVar, zzcaj zzcajVar) {
        try {
            zzg(zzbptVar, bundle, list, zzeilVar);
        } catch (RemoteException e10) {
            zzcajVar.zze(e10);
        }
    }
}
