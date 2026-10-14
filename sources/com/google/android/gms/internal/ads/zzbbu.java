package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbbu {
    public String zzd;
    public Context zze;
    public String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    public final BlockingQueue zza = new ArrayBlockingQueue(100);
    public final LinkedHashMap zzb = new LinkedHashMap();
    public final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbbu zzbbuVar) throws Throwable {
        while (true) {
            try {
                zzbce zzbceVar = (zzbce) zzbbuVar.zza.take();
                zzbcd zzbcdVarZza = zzbceVar.zza();
                if (!TextUtils.isEmpty(zzbcdVarZza.zzb())) {
                    zzbbuVar.zzg(zzbbuVar.zzb(zzbbuVar.zzb, zzbceVar.zzb()), zzbcdVarZza);
                }
            } catch (InterruptedException e10) {
                zzbzr.zzk("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbcd zzbcdVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zzbcdVar != null) {
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(zzbcdVar.zzb())) {
                sb2.append("&it=");
                sb2.append(zzbcdVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbcdVar.zza())) {
                sb2.append("&blat=");
                sb2.append(zzbcdVar.zza());
            }
            string = sb2.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzH(this.zze, this.zzf, string);
            return;
        }
        File file = this.zzi;
        if (file == null) {
            zzbzr.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e10) {
                        zzbzr.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                    }
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    zzbzr.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            zzbzr.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            zzbzr.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                        }
                    }
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final zzbca zza(String str) {
        zzbca zzbcaVar = (zzbca) this.zzc.get(str);
        return zzbcaVar != null ? zzbcaVar : zzbca.zza;
    }

    public final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbda.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbt
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzbbu.zzc(this.zza);
            }
        });
        Map map2 = this.zzc;
        zzbca zzbcaVar = zzbca.zzb;
        map2.put("action", zzbcaVar);
        this.zzc.put("ad_format", zzbcaVar);
        this.zzc.put("e", zzbca.zzc);
    }

    public final void zze(String str) throws Throwable {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbce zzbceVar) {
        return this.zza.offer(zzbceVar);
    }
}
