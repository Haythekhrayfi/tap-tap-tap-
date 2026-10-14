package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdgv extends zzcrd {
    public static final zzfsc zzc = zzfsc.zzq("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzauc zzA;
    private zzfwv zzB;
    private final Executor zzd;
    private final zzdha zze;
    private final zzdhi zzf;
    private final zzdia zzg;
    private final zzdhf zzh;
    private final zzdhl zzi;
    private final zzgvy zzj;
    private final zzgvy zzk;
    private final zzgvy zzl;
    private final zzgvy zzm;
    private final zzgvy zzn;
    private zzdiw zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbxe zzs;
    private final zzaqs zzt;
    private final zzbzx zzu;
    private final Context zzv;
    private final zzdgx zzw;
    private final zzejp zzx;
    private final Map zzy;
    private final List zzz;

    public zzdgv(zzcrc zzcrcVar, Executor executor, zzdha zzdhaVar, zzdhi zzdhiVar, zzdia zzdiaVar, zzdhf zzdhfVar, zzdhl zzdhlVar, zzgvy zzgvyVar, zzgvy zzgvyVar2, zzgvy zzgvyVar3, zzgvy zzgvyVar4, zzgvy zzgvyVar5, zzbxe zzbxeVar, zzaqs zzaqsVar, zzbzx zzbzxVar, Context context, zzdgx zzdgxVar, zzejp zzejpVar, zzauc zzaucVar) {
        super(zzcrcVar);
        this.zzd = executor;
        this.zze = zzdhaVar;
        this.zzf = zzdhiVar;
        this.zzg = zzdiaVar;
        this.zzh = zzdhfVar;
        this.zzi = zzdhlVar;
        this.zzj = zzgvyVar;
        this.zzk = zzgvyVar2;
        this.zzl = zzgvyVar3;
        this.zzm = zzgvyVar4;
        this.zzn = zzgvyVar5;
        this.zzs = zzbxeVar;
        this.zzt = zzaqsVar;
        this.zzu = zzbzxVar;
        this.zzv = context;
        this.zzw = zzdgxVar;
        this.zzx = zzejpVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzaucVar;
    }

    public static boolean zzW(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjk)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        long jZzs = com.google.android.gms.ads.internal.util.zzs.zzs(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jZzs >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjl)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzY(Map map) {
        if (map == null) {
            return null;
        }
        zzfsc zzfscVar = zzc;
        int size = zzfscVar.size();
        int i10 = 0;
        while (i10 < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfscVar.get(i10));
            i10++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzZ() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhA)).booleanValue()) {
            return null;
        }
        zzdiw zzdiwVar = this.zzo;
        if (zzdiwVar == null) {
            zzbzr.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzj = zzdiwVar.zzj();
        if (iObjectWrapperZzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzj);
        }
        return zzdia.zza;
    }

    private final void zzaa(String str, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeS)).booleanValue()) {
            zzt("Google", true);
            return;
        }
        zzfwm zzfwmVarZzv = this.zze.zzv();
        if (zzfwmVarZzv == null) {
            return;
        }
        this.zzB = zzfwv.zzf();
        zzfwc.zzq(zzfwmVarZzv, new zzdgu(this, "Google", true), this.zzd);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzZ());
        this.zzq = true;
    }

    private final void zzac(View view, zzfgw zzfgwVar) {
        zzcez zzcezVarZzq = this.zze.zzq();
        if (!this.zzh.zzd() || zzfgwVar == null || zzcezVarZzq == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzh(zzfgwVar, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzy(zzdiw zzdiwVar) {
        Iterator<String> itKeys;
        View view;
        if (this.zzp) {
            return;
        }
        this.zzo = zzdiwVar;
        this.zzg.zze(zzdiwVar);
        this.zzf.zzy(zzdiwVar.zzf(), zzdiwVar.zzm(), zzdiwVar.zzn(), zzdiwVar, zzdiwVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcn)).booleanValue()) {
            this.zzt.zzc().zzo(zzdiwVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbE)).booleanValue()) {
            zzezn zzeznVar = this.zzb;
            if (zzeznVar.zzal && (itKeys = zzeznVar.zzak.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                    this.zzy.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        zzaub zzaubVar = new zzaub(this.zzv, view);
                        this.zzz.add(zzaubVar);
                        zzaubVar.zzc(new zzdgt(this, next));
                    }
                }
            }
        }
        if (zzdiwVar.zzi() != null) {
            zzdiwVar.zzi().zzc(this.zzs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzdiw zzdiwVar) {
        this.zzf.zzz(zzdiwVar.zzf(), zzdiwVar.zzl());
        if (zzdiwVar.zzh() != null) {
            zzdiwVar.zzh().setClickable(false);
            zzdiwVar.zzh().removeAllViews();
        }
        if (zzdiwVar.zzi() != null) {
            zzdiwVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzq(zzdgv zzdgvVar) {
        try {
            zzdha zzdhaVar = zzdgvVar.zze;
            int iZzc = zzdhaVar.zzc();
            if (iZzc == 1) {
                if (zzdgvVar.zzi.zzb() != null) {
                    zzdgvVar.zzaa("Google", true);
                    zzdgvVar.zzi.zzb().zze((zzbfi) zzdgvVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                if (zzdgvVar.zzi.zza() != null) {
                    zzdgvVar.zzaa("Google", true);
                    zzdgvVar.zzi.zza().zze((zzbfg) zzdgvVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                if (zzdgvVar.zzi.zzd(zzdhaVar.zzz()) != null) {
                    if (zzdgvVar.zze.zzr() != null) {
                        zzdgvVar.zzt("Google", true);
                    }
                    zzdgvVar.zzi.zzd(zzdgvVar.zze.zzz()).zze((zzbfl) zzdgvVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                if (zzdgvVar.zzi.zzf() != null) {
                    zzdgvVar.zzaa("Google", true);
                    zzdgvVar.zzi.zzf().zze((zzbgo) zzdgvVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                zzbzr.zzg("Wrong native template id!");
                return;
            }
            zzdhl zzdhlVar = zzdgvVar.zzi;
            if (zzdhlVar.zzg() != null) {
                zzdhlVar.zzg().zzg((zzbku) zzdgvVar.zzm.zzb());
            }
        } catch (RemoteException e10) {
            zzbzr.zzh("RemoteException when notifyAdLoad is called", e10);
        }
    }

    public final synchronized void zzA(View view, Map map, Map map2, boolean z10) {
        if (this.zzq) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbE)).booleanValue() && this.zzb.zzal) {
            Iterator it = this.zzy.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                    return;
                }
            }
        }
        if (!z10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdC)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && zzW(view2)) {
                        zzab(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View viewZzY = zzY(map);
        if (viewZzY == null) {
            zzab(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdD)).booleanValue()) {
            if (zzW(viewZzY)) {
                zzab(view, map, map2);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdE)).booleanValue()) {
            zzab(view, map, map2);
            return;
        }
        Rect rect = new Rect();
        if (viewZzY.getGlobalVisibleRect(rect, null) && viewZzY.getHeight() == rect.height() && viewZzY.getWidth() == rect.width()) {
            zzab(view, map, map2);
        }
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    public final synchronized void zzC(View view, View view2, Map map, Map map2, boolean z10) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z10, zzZ());
        if (this.zzr) {
            zzdha zzdhaVar = this.zze;
            if (zzdhaVar.zzr() != null) {
                zzdhaVar.zzr().zzd("onSdkAdUserInteractionClick", new q.a());
            }
        }
    }

    public final synchronized void zzD(final View view, final int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjS)).booleanValue()) {
            zzdiw zzdiwVar = this.zzo;
            if (zzdiwVar == null) {
                zzbzr.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z10 = zzdiwVar instanceof zzdhu;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzv(view, z10, i10);
                    }
                });
            }
        }
    }

    public final synchronized void zzE(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzF(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzG() {
        zzdiw zzdiwVar = this.zzo;
        if (zzdiwVar == null) {
            zzbzr.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z10 = zzdiwVar instanceof zzdhu;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw(z10);
                }
            });
        }
    }

    public final synchronized void zzH() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzI(final View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeS)).booleanValue()) {
            zzac(view, this.zze.zzt());
            return;
        }
        zzfwv zzfwvVar = this.zzB;
        if (zzfwvVar == null) {
            return;
        }
        zzfwvVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzx(view);
            }
        }, this.zzd);
    }

    public final synchronized void zzJ(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzK(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzL(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzM() {
        this.zzf.zzv();
    }

    public final synchronized void zzN(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzP(zzbgl zzbglVar) {
        this.zzf.zzx(zzbglVar);
    }

    public final synchronized void zzQ(final zzdiw zzdiwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbC)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgr
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzy(zzdiwVar);
                }
            });
        } else {
            zzy(zzdiwVar);
        }
    }

    public final synchronized void zzR(final zzdiw zzdiwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbC)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzz(zzdiwVar);
                }
            });
        } else {
            zzz(zzdiwVar);
        }
    }

    public final boolean zzS() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzU() {
        return this.zzf.zzB();
    }

    public final boolean zzV() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzX(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzC = this.zzf.zzC(bundle);
        this.zzq = zZzC;
        return zZzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcrd
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzu();
            }
        });
        super.zzb();
    }

    public final zzdgx zzc() {
        return this.zzw;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcrd
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgo
            @Override // java.lang.Runnable
            public final void run() {
                zzdgv.zzq(this.zza);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdhi zzdhiVar = this.zzf;
            Objects.requireNonNull(zzdhiVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgp
                @Override // java.lang.Runnable
                public final void run() {
                    zzdhiVar.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzZ());
    }

    public final void zzr(View view) {
        zzfgw zzfgwVarZzt = this.zze.zzt();
        if (!this.zzh.zzd() || zzfgwVarZzt == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzf(zzfgwVarZzt, view);
    }

    public final synchronized void zzs() {
        this.zzf.zzh();
    }

    public final void zzt(String str, boolean z10) {
        String str2;
        zzeca zzecaVar;
        zzecb zzecbVar;
        String str3;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return;
        }
        zzdha zzdhaVar = this.zze;
        zzcez zzcezVarZzq = zzdhaVar.zzq();
        zzcez zzcezVarZzr = zzdhaVar.zzr();
        if (zzcezVarZzq == null && zzcezVarZzr == null) {
            zzbzr.zzj("Omid display and video webview are null. Skipping initialization.");
            return;
        }
        boolean z11 = false;
        boolean z12 = zzcezVarZzq != null;
        boolean z13 = zzcezVarZzr != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeQ)).booleanValue()) {
            this.zzh.zza();
            int iZzb = this.zzh.zza().zzb();
            int i10 = iZzb - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (iZzb != 1) {
                        str3 = iZzb != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    zzbzr.zzj("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return;
                }
                if (zzcezVarZzq == null) {
                    zzbzr.zzj("Omid media type was display but there was no display webview.");
                    return;
                } else {
                    z13 = false;
                    z11 = true;
                }
            } else {
                if (zzcezVarZzr == null) {
                    zzbzr.zzj("Omid media type was video but there was no video webview.");
                    return;
                }
                z13 = true;
            }
        } else {
            z11 = z12;
        }
        if (z11) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzcezVarZzq = zzcezVarZzr;
        }
        String str4 = str2;
        zzcezVarZzq.zzG();
        if (!com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zzv)) {
            zzbzr.zzj("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzbzx zzbzxVar = this.zzu;
        String str5 = zzbzxVar.zzb + "." + zzbzxVar.zzc;
        if (z13) {
            zzecaVar = zzeca.VIDEO;
            zzecbVar = zzecb.DEFINED_BY_JAVASCRIPT;
        } else {
            zzecaVar = zzeca.NATIVE_DISPLAY;
            zzecbVar = this.zze.zzc() == 3 ? zzecb.UNSPECIFIED : zzecb.ONE_PIXEL;
        }
        zzfgw zzfgwVarZzb = com.google.android.gms.ads.internal.zzt.zzA().zzb(str5, zzcezVarZzq.zzG(), "", "javascript", str4, str, zzecbVar, zzecaVar, this.zzb.zzam);
        if (zzfgwVarZzb == null) {
            zzbzr.zzj("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.zze.zzV(zzfgwVarZzb);
        zzcezVarZzq.zzap(zzfgwVarZzb);
        if (z13) {
            com.google.android.gms.ads.internal.zzt.zzA().zzh(zzfgwVarZzb, zzcezVarZzr.zzF());
            this.zzr = true;
        }
        if (z10) {
            com.google.android.gms.ads.internal.zzt.zzA().zzi(zzfgwVarZzb);
            zzcezVarZzq.zzd("onSdkLoaded", new q.a());
        }
    }

    public final /* synthetic */ void zzu() {
        this.zzf.zzi();
        this.zze.zzH();
    }

    public final /* synthetic */ void zzv(View view, boolean z10, int i10) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z10, zzZ(), i10);
    }

    public final /* synthetic */ void zzw(boolean z10) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z10, zzZ(), 0);
    }

    public final /* synthetic */ void zzx(View view) {
        zzac(view, this.zze.zzt());
    }
}
