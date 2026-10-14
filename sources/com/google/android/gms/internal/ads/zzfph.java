package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfph {
    public static int zza(int i10, int i11, String str) {
        String strZzb;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZzb = zzfpw.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("negative size: ", i11));
            }
            strZzb = zzfpw.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzj(i10, i11, "index"));
        }
        return i10;
    }

    public static Object zzc(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(@CheckForNull Object obj, String str, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfpw.zzb(str, obj2));
    }

    public static void zze(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(int i10, int i11, int i12) {
        String strZzj;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strZzj = zzj(i10, i12, "start index");
            } else {
                strZzj = (i11 < 0 || i11 > i12) ? zzj(i11, i12, "end index") : zzfpw.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strZzj);
        }
    }

    public static void zzh(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzfpw.zzb("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzfpw.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("negative size: ", i11));
    }
}
