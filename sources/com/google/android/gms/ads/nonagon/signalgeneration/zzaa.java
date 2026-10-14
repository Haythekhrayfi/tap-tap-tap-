package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqs;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcgu;
import com.google.android.gms.internal.ads.zzcuo;
import com.google.android.gms.internal.ads.zzdar;
import com.google.android.gms.internal.ads.zzdlx;
import com.google.android.gms.internal.ads.zzdpv;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzfag;
import com.google.android.gms.internal.ads.zzfbe;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfgb;
import com.google.android.gms.internal.ads.zzfgr;
import com.google.android.gms.internal.ads.zzfov;
import com.google.android.gms.internal.ads.zzfpw;
import com.google.android.gms.internal.ads.zzfvi;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfvt;
import com.google.android.gms.internal.ads.zzfwc;
import com.google.android.gms.internal.ads.zzfwm;
import com.google.android.gms.internal.ads.zzfwn;
import j1.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa extends zzbyh {
    public static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzbzx zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzcgu zzf;
    private Context zzg;
    private final zzaqs zzh;
    private final zzfbe zzi;
    private final zzfwn zzk;
    private final ScheduledExecutorService zzl;
    private zzbsr zzm;
    private final zzc zzq;
    private final zzdqf zzr;
    private final zzfgr zzs;
    private zzdpv zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final boolean zzt = ((Boolean) zzba.zzc().zzb(zzbbm.zzgZ)).booleanValue();
    private final boolean zzu = ((Boolean) zzba.zzc().zzb(zzbbm.zzgY)).booleanValue();
    private final boolean zzv = ((Boolean) zzba.zzc().zzb(zzbbm.zzha)).booleanValue();
    private final boolean zzw = ((Boolean) zzba.zzc().zzb(zzbbm.zzhc)).booleanValue();
    private final String zzx = (String) zzba.zzc().zzb(zzbbm.zzhb);
    private final String zzy = (String) zzba.zzc().zzb(zzbbm.zzhd);
    private final String zzC = (String) zzba.zzc().zzb(zzbbm.zzhe);

    public zzaa(zzcgu zzcguVar, Context context, zzaqs zzaqsVar, zzfbe zzfbeVar, zzfwn zzfwnVar, ScheduledExecutorService scheduledExecutorService, zzdqf zzdqfVar, zzfgr zzfgrVar, zzbzx zzbzxVar) {
        List listZzX;
        this.zzf = zzcguVar;
        this.zzg = context;
        this.zzh = zzaqsVar;
        this.zzi = zzfbeVar;
        this.zzk = zzfwnVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzcguVar.zzm();
        this.zzr = zzdqfVar;
        this.zzs = zzfgrVar;
        this.zzA = zzbzxVar;
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzhf)).booleanValue()) {
            this.zzD = zzX((String) zzba.zzc().zzb(zzbbm.zzhg));
            this.zzE = zzX((String) zzba.zzc().zzb(zzbbm.zzhh));
            this.zzF = zzX((String) zzba.zzc().zzb(zzbbm.zzhi));
            listZzX = zzX((String) zzba.zzc().zzb(zzbbm.zzhj));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            listZzX = zzd;
        }
        this.zzG = listZzX;
    }

    public static /* bridge */ /* synthetic */ void zzF(zzaa zzaaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaaVar.zzN((Uri) it.next())) {
                zzaaVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzG(final zzaa zzaaVar, final String str, final String str2, final zzdpv zzdpvVar) {
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzgK)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbm.zzgQ)).booleanValue()) {
                zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzI(str, str2, zzdpvVar);
                    }
                });
            } else {
                zzaaVar.zzq.zzd(str, str2, zzdpvVar);
            }
        }
    }

    public static final /* synthetic */ Uri zzP(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzW(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    private final zzh zzQ(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        byte b10;
        zzfag zzfagVar = new zzfag();
        if ("REWARDED".equals(str2)) {
            zzfagVar.zzo().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfagVar.zzo().zza(3);
        }
        zzg zzgVarZzn = this.zzf.zzn();
        zzcuo zzcuoVar = new zzcuo();
        zzcuoVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfagVar.zzs(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfagVar.zzE(zzlVar);
        if (zzqVar == null) {
            switch (str2) {
                case "NATIVE":
                    b10 = 3;
                    break;
                case "APP_OPEN_AD":
                    b10 = 4;
                    break;
                case "REWARDED":
                    b10 = 1;
                    break;
                case "REWARDED_INTERSTITIAL":
                    b10 = 2;
                    break;
                case "BANNER":
                    b10 = 0;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
            } else if (b10 == 1 || b10 == 2) {
                zzqVar = com.google.android.gms.ads.internal.client.zzq.zzd();
            } else if (b10 != 3) {
                zzqVar = b10 != 4 ? new com.google.android.gms.ads.internal.client.zzq() : com.google.android.gms.ads.internal.client.zzq.zzb();
            } else {
                zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
            }
        }
        zzfagVar.zzr(zzqVar);
        zzfagVar.zzx(true);
        zzcuoVar.zzi(zzfagVar.zzG());
        zzgVarZzn.zza(zzcuoVar.zzj());
        zzac zzacVar = new zzac();
        zzacVar.zza(str2);
        zzgVarZzn.zzb(new zzae(zzacVar, null));
        new zzdar();
        zzh zzhVarZzc = zzgVarZzn.zzc();
        this.zzj = zzhVarZzc.zza();
        return zzhVarZzc;
    }

    private final zzfwm zzR(final String str) {
        final zzdlx[] zzdlxVarArr = new zzdlx[1];
        zzfwm zzfwmVarZzm = zzfwc.zzm(this.zzi.zza(), new zzfvj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzv(zzdlxVarArr, str, (zzdlx) obj);
            }
        }, this.zzk);
        zzfwmVarZzm.zzc(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzH(zzdlxVarArr);
            }
        }, this.zzk);
        return zzfwc.zze(zzfwc.zzl((zzfvt) zzfwc.zzn(zzfvt.zzv(zzfwmVarZzm), ((Integer) zzba.zzc().zzb(zzbbm.zzhp)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfov() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                int i10 = zzaa.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfov() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                int i10 = zzaa.zze;
                zzbzr.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbsi zzbsiVar, boolean z10) {
        zzfwm zzfwmVarZzb;
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzho)).booleanValue()) {
            zzbzr.zzj("The updating URL feature is not enabled.");
            try {
                zzbsiVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                zzbzr.zzh("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (zzN((Uri) it.next())) {
                i10++;
            }
        }
        if (i10 > 1) {
            zzbzr.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzN(uri)) {
                zzfwmVarZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzm(uri, iObjectWrapper);
                    }
                });
                if (zzV()) {
                    zzfwmVarZzb = zzfwc.zzm(zzfwmVarZzb, new zzfvj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                        @Override // com.google.android.gms.internal.ads.zzfvj
                        public final zzfwm zza(Object obj) {
                            zzaa zzaaVar = this.zza;
                            return zzfwc.zzl(zzaaVar.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfov() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                                @Override // com.google.android.gms.internal.ads.zzfov
                                public final Object apply(Object obj2) {
                                    return zzaa.zzP(uri, (String) obj2);
                                }
                            }, zzaaVar.zzk);
                        }
                    }, this.zzk);
                } else {
                    zzbzr.zzi("Asset view map is empty.");
                }
            } else {
                zzbzr.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzfwmVarZzb = zzfwc.zzh(uri);
            }
            arrayList.add(zzfwmVarZzb);
        }
        zzfwc.zzq(zzfwc.zzd(arrayList), new zzy(this, zzbsiVar, z10), this.zzf.zzA());
    }

    private final void zzT(final List list, final IObjectWrapper iObjectWrapper, zzbsi zzbsiVar, boolean z10) {
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzho)).booleanValue()) {
            try {
                zzbsiVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                zzbzr.zzh("", e10);
                return;
            }
        }
        zzfwm zzfwmVarZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzC(list, iObjectWrapper);
            }
        });
        if (zzV()) {
            zzfwmVarZzb = zzfwc.zzm(zzfwmVarZzb, new zzfvj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.zzfvj
                public final zzfwm zza(Object obj) {
                    return this.zza.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            zzbzr.zzi("Asset view map is empty.");
        }
        zzfwc.zzq(zzfwmVarZzb, new zzx(this, zzbsiVar, z10), this.zzf.zzA());
    }

    private static boolean zzU(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzV() {
        Map map;
        zzbsr zzbsrVar = this.zzm;
        return (zzbsrVar == null || (map = zzbsrVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzW(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(string.substring(0, i10));
        d.a(sb2, str, "=", str2, "&");
        sb2.append(string.substring(i10));
        return Uri.parse(sb2.toString());
    }

    private static final List zzX(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfpw.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ zzffy zzr(zzfwm zzfwmVar, zzbym zzbymVar) {
        if (!zzfgb.zza() || !((Boolean) zzbcy.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzffy zzffyVarZzb = ((zzh) zzfwc.zzo(zzfwmVar)).zzb();
            zzffyVarZzb.zzd(new ArrayList(Collections.singletonList(zzbymVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzbymVar.zzd;
            zzffyVarZzb.zzb(zzlVar == null ? "" : zzlVar.zzp);
            return zzffyVarZzb;
        } catch (ExecutionException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uriZzW = (Uri) it.next();
            if (zzO(uriZzW) && !TextUtils.isEmpty(str)) {
                uriZzW = zzW(uriZzW, "nas", str);
            }
            arrayList.add(uriZzW);
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        this.zzh.zzc();
        String strZzh = this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uriZzW = (Uri) it.next();
            if (zzO(uriZzW)) {
                uriZzW = zzW(uriZzW, "ms", strZzh);
            } else {
                zzbzr.zzj("Not a Google URL: ".concat(String.valueOf(uriZzW)));
            }
            arrayList.add(uriZzW);
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ void zzH(zzdlx[] zzdlxVarArr) {
        zzdlx zzdlxVar = zzdlxVarArr[0];
        if (zzdlxVar != null) {
            this.zzi.zzb(zzfwc.zzh(zzdlxVar));
        }
    }

    public final /* synthetic */ void zzI(String str, String str2, zzdpv zzdpvVar) {
        this.zzq.zzd(str, str2, zzdpvVar);
    }

    public final boolean zzN(Uri uri) {
        return zzU(uri, this.zzD, this.zzE);
    }

    public final boolean zzO(Uri uri) {
        return zzU(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zze(IObjectWrapper iObjectWrapper, final zzbym zzbymVar, zzbyf zzbyfVar) {
        zzfwm zzfwmVarZzh;
        zzfwm zzfwmVarZzc;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzffn zzffnVarZza = zzffm.zza(context, 22);
        zzffnVarZza.zzh();
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzjE)).booleanValue()) {
            zzfwn zzfwnVar = zzcae.zza;
            zzfwmVarZzh = zzfwnVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzq(zzbymVar);
                }
            });
            zzfwmVarZzc = zzfwc.zzm(zzfwmVarZzh, new zzfvj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // com.google.android.gms.internal.ads.zzfvj
                public final zzfwm zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, zzfwnVar);
        } else {
            zzh zzhVarZzQ = zzQ(this.zzg, zzbymVar.zza, zzbymVar.zzb, zzbymVar.zzc, zzbymVar.zzd);
            zzfwmVarZzh = zzfwc.zzh(zzhVarZzQ);
            zzfwmVarZzc = zzhVarZzQ.zzc();
        }
        zzfwc.zzq(zzfwmVarZzc, new zzw(this, zzfwmVarZzh, zzbymVar, zzbyfVar, zzffnVarZza, com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), this.zzf.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzf(zzbsr zzbsrVar) {
        this.zzm = zzbsrVar;
        this.zzi.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbsi zzbsiVar) {
        zzS(list, iObjectWrapper, zzbsiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbsi zzbsiVar) {
        zzT(list, iObjectWrapper, zzbsiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zzb(zzbbm.zziT)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbm.zziU)).booleanValue()) {
                if (!((Boolean) zzba.zzc().zzb(zzbbm.zziX)).booleanValue()) {
                    zzfwc.zzq(((Boolean) zzba.zzc().zzb(zzbbm.zzjE)).booleanValue() ? zzfwc.zzk(new zzfvi() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                        @Override // com.google.android.gms.internal.ads.zzfvi
                        public final zzfwm zza() {
                            return this.zza.zzu();
                        }
                    }, zzcae.zza) : zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc(), new zzz(this), this.zzf.zzA());
                }
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zzbzr.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                zzbzr.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr, this.zzs), "gmaSdk");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzho)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbsr zzbsrVar = this.zzm;
            this.zzn = zzbx.zza(motionEvent, zzbsrVar == null ? null : zzbsrVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            motionEventObtain.setLocation(point.x, point.y);
            this.zzh.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbsi zzbsiVar) {
        zzS(list, iObjectWrapper, zzbsiVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbsi zzbsiVar) {
        zzT(list, iObjectWrapper, zzbsiVar, false);
    }

    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzaqt e10) {
            zzbzr.zzk("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzh zzq(zzbym zzbymVar) throws Exception {
        return zzQ(this.zzg, zzbymVar.zza, zzbymVar.zzb, zzbymVar.zzc, zzbymVar.zzd);
    }

    public final /* synthetic */ zzfwm zzu() throws Exception {
        return zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    public final /* synthetic */ zzfwm zzv(zzdlx[] zzdlxVarArr, String str, zzdlx zzdlxVar) throws Exception {
        zzdlxVarArr[0] = zzdlxVar;
        Context context = this.zzg;
        zzbsr zzbsrVar = this.zzm;
        Map map = zzbsrVar.zzb;
        JSONObject jSONObjectZzd = zzbx.zzd(context, map, map, zzbsrVar.zza, null);
        JSONObject jSONObjectZzg = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzf = zzbx.zzf(this.zzm.zza);
        JSONObject jSONObjectZze = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdlxVar.zzd(str, jSONObject);
    }

    public final /* synthetic */ zzfwm zzw(final ArrayList arrayList) throws Exception {
        return zzfwc.zzl(zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfov() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                return this.zza.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
