package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import v.e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkd {
    public static boolean zza(int i10) {
        int i11 = i10 - 1;
        return i11 == 2 || i11 == 4 || i11 == 5 || i11 == 6;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0120  */
    /* JADX WARN: Code duplicated, block: B:75:0x0123  */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x0129  */
    /* JADX WARN: Code duplicated, block: B:78:0x012c  */
    public static final int zzb(Context context, zzfjb zzfjbVar) {
        String str;
        int i10;
        String str2;
        String strZzc;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzfug(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                str = "No .so";
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                zzd(bArr, null, context, zzfjbVar);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s10 = ByteBuffer.wrap(bArr2).getShort();
                                if (s10 == 3) {
                                    fileInputStream.close();
                                    i10 = 5;
                                } else if (s10 == 40) {
                                    fileInputStream.close();
                                    i10 = 3;
                                } else if (s10 == 62) {
                                    fileInputStream.close();
                                    i10 = 7;
                                } else if (s10 != 183) {
                                    zzd(bArr, null, context, zzfjbVar);
                                } else {
                                    fileInputStream.close();
                                    i10 = 6;
                                }
                            }
                        }
                        fileInputStream.close();
                        i10 = 1;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    zzd(null, e10.toString(), context, zzfjbVar);
                }
            }
            if (i10 == 1000) {
                strZzc = zzc(context, zzfjbVar);
                if (TextUtils.isEmpty(strZzc)) {
                    strZzc = "Empty dev arch";
                } else if (!strZzc.equalsIgnoreCase("i686") || strZzc.equalsIgnoreCase("x86")) {
                    i10 = 5;
                } else if (strZzc.equalsIgnoreCase("x86_64")) {
                    i10 = 7;
                } else if (strZzc.equalsIgnoreCase("arm64-v8a")) {
                    i10 = 6;
                } else if (strZzc.equalsIgnoreCase("armeabi-v7a") || strZzc.equalsIgnoreCase("armv71")) {
                    i10 = 3;
                }
                zzd(null, strZzc, context, zzfjbVar);
                i10 = 1;
            }
            if (i10 != 1) {
                str2 = "UNSUPPORTED";
            } else if (i10 != 3) {
                str2 = "ARM7";
            } else if (i10 != 5) {
                str2 = "X86";
            } else if (i10 != 6) {
                str2 = "ARM64";
            } else if (i10 != 7) {
                str2 = "null";
            } else {
                str2 = "X86_64";
            }
            zzfjbVar.zzb(5018, str2);
            return i10;
        }
        str = "No lib/";
        zzfjbVar.zzb(5017, str);
        i10 = 1000;
        if (i10 == 1000) {
            strZzc = zzc(context, zzfjbVar);
            if (TextUtils.isEmpty(strZzc)) {
                strZzc = "Empty dev arch";
            } else if (strZzc.equalsIgnoreCase("i686")) {
                i10 = 5;
            } else {
                i10 = 5;
            }
            zzd(null, strZzc, context, zzfjbVar);
            i10 = 1;
        }
        if (i10 != 1) {
            str2 = "UNSUPPORTED";
        } else if (i10 != 3) {
            str2 = "ARM7";
        } else if (i10 != 5) {
            str2 = "X86";
        } else if (i10 != 6) {
            str2 = "ARM64";
        } else if (i10 != 7) {
            str2 = "null";
        } else {
            str2 = "X86_64";
        }
        zzfjbVar.zzb(5018, str2);
        return i10;
    }

    private static final String zzc(Context context, zzfjb zzfjbVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzfpv.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            zzfjbVar.zzc(2024, 0L, e10);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfjb zzfjbVar) {
        StringBuilder sbA = defpackage.a.a("os.arch:");
        sbA.append(zzfpv.OS_ARCH.zza());
        sbA.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sbA.append("supported_abis:");
                sbA.append(Arrays.toString(strArr));
                sbA.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sbA.append("CPU_ABI:");
        sbA.append(Build.CPU_ABI);
        sbA.append(";CPU_ABI2:");
        sbA.append(Build.CPU_ABI2);
        sbA.append(";");
        if (bArr != null) {
            sbA.append("ELF:");
            sbA.append(Arrays.toString(bArr));
            sbA.append(";");
        }
        if (str != null) {
            e.a(sbA, "dbg:", str, ";");
        }
        zzfjbVar.zzb(4007, sbA.toString());
    }
}
