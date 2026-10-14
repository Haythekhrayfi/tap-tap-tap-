package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import q.h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcp {

    @GuardedBy("CachingReader.class")
    private static volatile zzdh zza;

    private zzcp() {
    }

    public static zzdh zza(Context context) {
        zzdh zzdhVar;
        zzdh zzdhVarZzd;
        zzdh zzdhVarZzc;
        synchronized (zzcp.class) {
            zzdhVar = zza;
            if (zzdhVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    if (zzcc.zzb() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                            zzdhVarZzd = file.exists() ? zzdh.zzd(file) : zzdh.zzc();
                        } catch (RuntimeException e10) {
                            Log.e("HermeticFileOverrides", "no data dir", e10);
                        }
                        if (zzdhVarZzd.zzb()) {
                            File file2 = (File) zzdhVarZzd.zza();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                try {
                                    h hVar = new h();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", "Invalid: " + line);
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            if (!(hVar.e(str3) >= 0)) {
                                                hVar.put(str3, new h());
                                            }
                                            ((h) hVar.getOrDefault(str3, null)).put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + context.getPackageName());
                                    zzci zzciVar = new zzci(hVar);
                                    bufferedReader.close();
                                    zzdhVarZzc = zzdh.zzd(zzciVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        try {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        } catch (Exception unused) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e11) {
                                throw new RuntimeException(e11);
                            }
                        } else {
                            zzdhVarZzc = zzdh.zzc();
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    zzdhVarZzc = zzdh.zzc();
                }
                zzdhVar = zzdhVarZzc;
                zza = zzdhVar;
            }
        }
        return zzdhVar;
    }
}
