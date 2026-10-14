package com.google.android.gms.internal.measurement;

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
public final class zzhn {

    @GuardedBy("CachingReader.class")
    private static volatile zzif zza;

    private zzhn() {
    }

    public static zzif zza(Context context) {
        zzif zzifVar;
        zzif zzifVarZzd;
        zzif zzifVarZzc;
        synchronized (zzhn.class) {
            zzifVar = zza;
            if (zzifVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    if (zzha.zzb() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                            zzifVarZzd = file.exists() ? zzif.zzd(file) : zzif.zzc();
                        } catch (RuntimeException e10) {
                            Log.e("HermeticFileOverrides", "no data dir", e10);
                        }
                        if (zzifVarZzd.zzb()) {
                            File file2 = (File) zzifVarZzd.zza();
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
                                    zzhg zzhgVar = new zzhg(hVar);
                                    bufferedReader.close();
                                    zzifVarZzc = zzif.zzd(zzhgVar);
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
                            zzifVarZzc = zzif.zzc();
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    zzifVarZzc = zzif.zzc();
                }
                zzifVar = zzifVarZzc;
                zza = zzifVar;
            }
        }
        return zzifVar;
    }
}
