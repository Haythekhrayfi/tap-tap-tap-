package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyv implements zzfdo {
    public final Context zza;
    public final String zzb;
    public final zzbuq zzc;

    public zzdyv(Context context, String str, zzbuq zzbuqVar, int i10) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbuqVar;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[Catch: all -> 0x0227, TryCatch #4 {all -> 0x0227, blocks: (B:12:0x0094, B:86:0x0206, B:88:0x0218, B:90:0x0226, B:13:0x009a, B:15:0x00a2, B:16:0x00a7, B:18:0x00ab, B:21:0x00bd, B:25:0x00c5, B:26:0x00c8, B:27:0x00c9, B:28:0x00e1, B:30:0x00e7, B:32:0x00ff, B:33:0x0109, B:34:0x0113, B:36:0x0118, B:42:0x0138, B:44:0x0146, B:47:0x0159, B:48:0x015f, B:49:0x0160, B:56:0x0174, B:57:0x0177, B:61:0x017e, B:63:0x018a, B:67:0x01af, B:68:0x01bb, B:69:0x01bc, B:70:0x01c8, B:71:0x01c9, B:72:0x01ef), top: B:100:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0226 A[Catch: all -> 0x0227, TRY_LEAVE, TryCatch #4 {all -> 0x0227, blocks: (B:12:0x0094, B:86:0x0206, B:88:0x0218, B:90:0x0226, B:13:0x009a, B:15:0x00a2, B:16:0x00a7, B:18:0x00ab, B:21:0x00bd, B:25:0x00c5, B:26:0x00c8, B:27:0x00c9, B:28:0x00e1, B:30:0x00e7, B:32:0x00ff, B:33:0x0109, B:34:0x0113, B:36:0x0118, B:42:0x0138, B:44:0x0146, B:47:0x0159, B:48:0x015f, B:49:0x0160, B:56:0x0174, B:57:0x0177, B:61:0x017e, B:63:0x018a, B:67:0x01af, B:68:0x01bb, B:69:0x01bc, B:70:0x01c8, B:71:0x01c9, B:72:0x01ef), top: B:100:0x0094 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.android.gms.internal.ads.zzbzq] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.net.HttpURLConnection] */
    @Override // com.google.android.gms.internal.ads.zzfdo
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzdyu zza(zzdyt zzdytVar) throws zzdtx {
        ?? r10;
        ?? r11;
        zzdyu zzdyuVar;
        ?? r12;
        InputStreamReader inputStreamReader;
        zzdyv zzdyvVar = this;
        String str = zzdytVar.zza;
        int i10 = zzdytVar.zzb;
        Map map = zzdytVar.zzc;
        byte[] bArr = zzdytVar.zzd;
        String str2 = zzdytVar.zze;
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        boolean z10 = true;
        z10 = true;
        try {
            zzdyu zzdyuVar2 = new zzdyu();
            zzbzr.zzi("SDK version: " + zzdyvVar.zzb);
            zzbzr.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i11 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    com.google.android.gms.ads.internal.util.zzs zzsVarZzp = com.google.android.gms.ads.internal.zzt.zzp();
                    Context context = zzdyvVar.zza;
                    String str3 = zzdyvVar.zzb;
                    ?? r20 = httpURLConnection;
                    zzdyu zzdyuVar3 = zzdyuVar2;
                    r10 = z10 ? 1 : 0;
                    try {
                        zzsVarZzp.zzf(context, str3, false, httpURLConnection, false, i10);
                        r20 = r20;
                        for (Map.Entry entry : map.entrySet()) {
                            r11 = r20;
                            try {
                                try {
                                    r11.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    r20 = r11;
                                } catch (zzdtx e10) {
                                    e = e10;
                                    zzdyuVar = zzdyuVar3;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhR)).booleanValue()) {
                                        throw e;
                                    }
                                    zzdyuVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime;
                                    r12 = r11;
                                    r12.disconnect();
                                    return zzdyuVar;
                                }
                            } catch (Throwable th) {
                                th = th;
                                r11.disconnect();
                                throw th;
                            }
                        }
                        r11 = r20;
                        if (!TextUtils.isEmpty(str2)) {
                            r11.setRequestProperty("Content-Type", str2);
                        }
                        int length = bArr.length;
                        BufferedOutputStream bufferedOutputStream = null;
                        if (length > 0) {
                            r11.setDoOutput(r10);
                            r11.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(r11.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    IOUtils.closeQuietly(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    IOUtils.closeQuietly(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        ?? zzbzqVar = new zzbzq(null);
                        zzbzqVar.zzc(r11, bArr);
                        int responseCode = r11.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : r11.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                            }
                        }
                        zzbzqVar.zze(r11, responseCode);
                        zzdyuVar = zzdyuVar3;
                        try {
                            zzdyuVar.zza = responseCode;
                            zzdyuVar.zzb = map2;
                            zzdyuVar.zzc = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    inputStreamReader = new InputStreamReader(r11.getInputStream());
                                    try {
                                        com.google.android.gms.ads.internal.zzt.zzp();
                                        String strZzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(inputStreamReader);
                                        IOUtils.closeQuietly(inputStreamReader);
                                        zzbzqVar.zzg(strZzJ);
                                        zzdyuVar.zzc = strZzJ;
                                        if (TextUtils.isEmpty(strZzJ)) {
                                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfj)).booleanValue()) {
                                                throw new zzdtx(3);
                                            }
                                        }
                                        zzdyuVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime;
                                        r12 = r11;
                                        break;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        IOUtils.closeQuietly(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStreamReader = null;
                                }
                            } else {
                                if (responseCode < 300 || responseCode >= 400) {
                                    zzbzr.zzj("Received error HTTP response code: " + responseCode);
                                    throw new zzdtx(r10 == true ? 1 : 0, "Received error HTTP response code: " + responseCode);
                                }
                                String headerField = r11.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    zzbzr.zzj("No location header to follow redirect.");
                                    throw new zzdtx(r10 == true ? 1 : 0, "No location header to follow redirect");
                                }
                                URL url2 = new URL(headerField);
                                int i12 = i11 + 1;
                                if (i12 > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeL)).intValue()) {
                                    zzbzr.zzj("Too many redirects.");
                                    throw new zzdtx(r10 == true ? 1 : 0, "Too many redirects");
                                }
                                try {
                                    r11.disconnect();
                                    z10 = r10 == true ? 1 : 0;
                                    i11 = i12;
                                    zzdyuVar2 = zzdyuVar;
                                    url = url2;
                                    zzdyvVar = this;
                                } catch (IOException e11) {
                                    e = e11;
                                    String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                    zzbzr.zzj(strConcat);
                                    throw new zzdtx(r10, strConcat, e);
                                }
                            }
                        } catch (zzdtx e12) {
                            e = e12;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhR)).booleanValue()) {
                                throw e;
                            }
                            zzdyuVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime;
                            r12 = r11;
                        }
                    } catch (zzdtx e13) {
                        e = e13;
                        r11 = r20;
                    } catch (Throwable th6) {
                        th = th6;
                        r11 = r20;
                    }
                } catch (zzdtx e14) {
                    e = e14;
                    r11 = httpURLConnection;
                    zzdyuVar = zzdyuVar2;
                    boolean z11 = z10 ? 1 : 0;
                } catch (Throwable th7) {
                    th = th7;
                    r11 = httpURLConnection;
                    boolean z12 = z10 ? 1 : 0;
                }
            }
            r12.disconnect();
            return zzdyuVar;
        } catch (IOException e15) {
            e = e15;
            r10 = z10;
        }
    }
}
