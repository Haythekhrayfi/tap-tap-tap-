package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzdiz implements zzdhi {
    private final zzbol zza;
    private final zzcvy zzb;
    private final zzcve zzc;
    private final zzdcs zzd;
    private final Context zze;
    private final zzezn zzf;
    private final zzbzx zzg;
    private final zzfai zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzboh zzl;
    private final zzboi zzm;

    public zzdiz(zzboh zzbohVar, zzboi zzboiVar, zzbol zzbolVar, zzcvy zzcvyVar, zzcve zzcveVar, zzdcs zzdcsVar, Context context, zzezn zzeznVar, zzbzx zzbzxVar, zzfai zzfaiVar) {
        this.zzl = zzbohVar;
        this.zzm = zzboiVar;
        this.zza = zzbolVar;
        this.zzb = zzcvyVar;
        this.zzc = zzcveVar;
        this.zzd = zzdcsVar;
        this.zze = context;
        this.zzf = zzeznVar;
        this.zzg = zzbzxVar;
        this.zzh = zzfaiVar;
    }

    private final void zzb(View view) {
        try {
            zzbol zzbolVar = this.zza;
            if (zzbolVar != null && !zzbolVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjs)).booleanValue()) {
                    this.zzd.zzr();
                    return;
                }
                return;
            }
            zzboh zzbohVar = this.zzl;
            if (zzbohVar != null && !zzbohVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjs)).booleanValue()) {
                    this.zzd.zzr();
                    return;
                }
                return;
            }
            zzboi zzboiVar = this.zzm;
            if (zzboiVar == null || zzboiVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjs)).booleanValue()) {
                this.zzd.zzr();
            }
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to call handleClick", e10);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    map2.put((String) entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        zzbzr.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzk(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        String str;
        if (!this.zzj) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else {
            if (this.zzf.zzM) {
                zzb(view2);
                return;
            }
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        zzbzr.zzj(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbol zzbolVar = this.zza;
                if (zzbolVar != null && !zzbolVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzboh zzbohVar = this.zzl;
                if (zzbohVar != null && !zzbohVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzboi zzboiVar = this.zzm;
                if (zzboiVar == null || zzboiVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        zzbzr.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzx(zzbgl zzbglVar) {
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: JSONException -> 0x0045, RemoteException -> 0x0122, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0122, blocks: (B:2:0x0000, B:4:0x001c, B:8:0x0026, B:11:0x002f, B:13:0x0036, B:14:0x0045, B:16:0x004b, B:18:0x0057, B:21:0x0062, B:24:0x0069, B:26:0x007f, B:28:0x0087, B:43:0x00a6, B:33:0x0091, B:37:0x009a, B:46:0x00ad, B:47:0x00b1, B:48:0x00c6, B:50:0x00cc, B:54:0x00de, B:56:0x00ec, B:58:0x00f8, B:60:0x00fc, B:62:0x010d, B:64:0x0111), top: B:72:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        IObjectWrapper iObjectWrapperZzn;
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z10 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbt)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbu)).booleanValue() && next.equals("3010")) {
                                zzbol zzbolVar = this.zza;
                                Object objUnwrap = null;
                                if (zzbolVar != null) {
                                    try {
                                        iObjectWrapperZzn = zzbolVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzboh zzbohVar = this.zzl;
                                    if (zzbohVar != null) {
                                        iObjectWrapperZzn = zzbohVar.zzk();
                                    } else {
                                        zzboi zzboiVar = this.zzm;
                                        iObjectWrapperZzn = zzboiVar != null ? zzboiVar.zzj() : null;
                                    }
                                }
                                if (iObjectWrapperZzn != null) {
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzn);
                                }
                                if (objUnwrap != null) {
                                    cls = objUnwrap.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbu.zzc(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzt.zzp();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbu.zzc(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzt.zzp();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z10 = false;
                        break;
                    }
                }
            }
            this.zzk = z10;
            HashMap mapZzc = zzc(map);
            HashMap mapZzc2 = zzc(map2);
            zzbol zzbolVar2 = this.zza;
            if (zzbolVar2 != null) {
                zzbolVar2.zzy(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                return;
            }
            zzboh zzbohVar2 = this.zzl;
            if (zzbohVar2 != null) {
                zzbohVar2.zzv(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                this.zzl.zzu(iObjectWrapperWrap);
                return;
            }
            zzboi zzboiVar2 = this.zzm;
            if (zzboiVar2 != null) {
                zzboiVar2.zzt(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                this.zzm.zzs(iObjectWrapperWrap);
            }
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to call trackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbol zzbolVar = this.zza;
            if (zzbolVar != null) {
                zzbolVar.zzz(iObjectWrapperWrap);
                return;
            }
            zzboh zzbohVar = this.zzl;
            if (zzbohVar != null) {
                zzbohVar.zzw(iObjectWrapperWrap);
                return;
            }
            zzboi zzboiVar = this.zzm;
            if (zzboiVar != null) {
                zzboiVar.zzu(iObjectWrapperWrap);
            }
        } catch (RemoteException e10) {
            zzbzr.zzk("Failed to call untrackView", e10);
        }
    }
}
