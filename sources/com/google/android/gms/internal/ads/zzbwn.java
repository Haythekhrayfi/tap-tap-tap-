package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbwn implements zzbws {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    public boolean zza;
    private final zzgtl zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbwp zzi;
    private final zzbwo zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbwn(Context context, zzbzx zzbzxVar, zzbwp zzbwpVar, String str, zzbwo zzbwoVar) {
        Preconditions.checkNotNull(zzbwpVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbwoVar;
        this.zzi = zzbwpVar;
        Iterator it = zzbwpVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgtl zzgtlVarZza = zzgva.zza();
        zzgtlVarZza.zzn(9);
        zzgtlVarZza.zzj(str);
        zzgtlVarZza.zzh(str);
        zzgtm zzgtmVarZza = zzgtn.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzgtmVarZza.zza(str2);
        }
        zzgtlVarZza.zzg((zzgtn) zzgtmVarZza.zzal());
        zzguu zzguuVarZza = zzguv.zza();
        zzguuVarZza.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzbzxVar.zza;
        if (str3 != null) {
            zzguuVarZza.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzguuVarZza.zzb(apkVersion);
        }
        zzgtlVarZza.zzf((zzguv) zzguuVarZza.zzal());
        this.zzd = zzgtlVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final zzbwp zza() {
        return this.zzi;
    }

    public final /* synthetic */ zzfwm zzb(Map map) throws Exception {
        zzgus zzgusVar;
        zzfwm zzfwmVarZzl;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.zzj) {
                                try {
                                    zzgusVar = (zzgus) this.zze.get(str);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (zzgusVar == null) {
                                zzbwr.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i10 = 0; i10 < length; i10++) {
                                    zzgusVar.zza(jSONArrayOptJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) zzbdm.zzb.zze()).booleanValue()) {
                    zzbzr.zzf("Failed to get SafeBrowsing metadata", e10);
                }
                return zzfwc.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z10 = this.zza;
        if (!(z10 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z10 || !this.zzi.zzd))) {
            return zzfwc.zzh(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzgut) ((zzgus) it.next()).zzal());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbwr.zzb()) {
                StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzgut zzgutVar : this.zzd.zzm()) {
                    sb2.append("    [");
                    sb2.append(zzgutVar.zza());
                    sb2.append("] ");
                    sb2.append(zzgutVar.zze());
                }
                zzbwr.zza(sb2.toString());
            }
            zzfwm zzfwmVarZzb = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgva) this.zzd.zzal()).zzax());
            if (zzbwr.zzb()) {
                zzfwmVarZzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbwr.zza("Pinged SB successfully.");
                    }
                }, zzcae.zza);
            }
            zzfwmVarZzl = zzfwc.zzl(zzfwmVarZzb, new zzfov() { // from class: com.google.android.gms.internal.ads.zzbwj
                @Override // com.google.android.gms.internal.ads.zzfov
                public final Object apply(Object obj) {
                    int i11 = zzbwn.zzb;
                    return null;
                }
            }, zzcae.zzf);
        }
        return zzfwmVarZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzd(String str, Map map, int i10) {
        synchronized (this.zzj) {
            if (i10 == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i10 == 3) {
                    ((zzgus) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzgus zzgusVarZzc = zzgut.zzc();
            int iZza = zzgur.zza(i10);
            if (iZza != 0) {
                zzgusVarZzc.zze(iZza);
            }
            zzgusVarZzc.zzb(this.zze.size());
            zzgusVarZzc.zzd(str);
            zzgty zzgtyVarZza = zzgub.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgtw zzgtwVarZza = zzgtx.zza();
                        zzgtwVarZza.zza(zzgoe.zzw(str2));
                        zzgtwVarZza.zzb(zzgoe.zzw(str3));
                        zzgtyVarZza.zza((zzgtx) zzgtwVarZza.zzal());
                    }
                }
            }
            zzgusVarZzc.zzc((zzgub) zzgtyVarZza.zzal());
            this.zze.put(str, zzgusVarZzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfwm zzfwmVarZzh = zzfwc.zzh(Collections.emptyMap());
            zzfvj zzfvjVar = new zzfvj() { // from class: com.google.android.gms.internal.ads.zzbwk
                @Override // com.google.android.gms.internal.ads.zzfvj
                public final zzfwm zza(Object obj) {
                    return this.zza.zzb((Map) obj);
                }
            };
            zzfwn zzfwnVar = zzcae.zzf;
            zzfwm zzfwmVarZzm = zzfwc.zzm(zzfwmVarZzh, zzfvjVar, zzfwnVar);
            zzfwm zzfwmVarZzn = zzfwc.zzn(zzfwmVarZzm, 10L, TimeUnit.SECONDS, zzcae.zzd);
            zzfwc.zzq(zzfwmVarZzm, new zzbwm(this, zzfwmVarZzn), zzfwnVar);
            zzc.add(zzfwmVarZzn);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgob zzgobVarZzt = zzgoe.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgobVarZzt);
        synchronized (this.zzj) {
            zzgtl zzgtlVar = this.zzd;
            zzgul zzgulVarZza = zzgun.zza();
            zzgulVarZza.zza(zzgobVarZzt.zzb());
            zzgulVarZza.zzb("image/png");
            zzgulVarZza.zzc(2);
            zzgtlVar.zzi((zzgun) zzgulVarZza.zzal());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzg(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzp();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e10) {
                        e = e10;
                        zzbzr.zzh("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            zzbzr.zzj("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e12) {
                        zzbzr.zzh("Fail to capture the webview", e12);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzbwr.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzcae.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzh(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzd();
                } else {
                    this.zzd.zze(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
