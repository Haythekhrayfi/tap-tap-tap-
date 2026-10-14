package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeo extends zzgs {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzem zzd;
    private final zzem zze;
    private final zzem zzf;
    private final zzem zzg;
    private final zzem zzh;
    private final zzem zzi;
    private final zzem zzj;
    private final zzem zzk;
    private final zzem zzl;

    public zzeo(zzfy zzfyVar) {
        super(zzfyVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzem(this, 6, false, false);
        this.zze = new zzem(this, 6, true, false);
        this.zzf = new zzem(this, 6, false, true);
        this.zzg = new zzem(this, 5, false, false);
        this.zzh = new zzem(this, 5, true, false);
        this.zzi = new zzem(this, 5, false, true);
        this.zzj = new zzem(this, 4, false, false);
        this.zzk = new zzem(this, 3, false, false);
        this.zzl = new zzem(this, 2, false, false);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzen(str);
    }

    public static String zzo(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strZzp = zzp(z10, obj);
        String strZzp2 = zzp(z10, obj2);
        String strZzp3 = zzp(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZzp)) {
            sb2.append(str2);
            sb2.append(strZzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZzp2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strZzp2);
        }
        if (!TextUtils.isEmpty(strZzp3)) {
            sb2.append(str3);
            sb2.append(strZzp3);
        }
        return sb2.toString();
    }

    @VisibleForTesting
    public static String zzp(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            String str = obj.toString().charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof zzen) {
                return ((zzen) obj).zza;
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String strZzy = zzy(zzfy.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzy(className).equals(strZzy)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
        }
        return sb2.toString();
    }

    private static String zzy(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public final zzem zzc() {
        return this.zzk;
    }

    public final zzem zzd() {
        return this.zzd;
    }

    public final zzem zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzgs
    public final boolean zzf() {
        return false;
    }

    public final zzem zzh() {
        return this.zze;
    }

    public final zzem zzi() {
        return this.zzj;
    }

    public final zzem zzj() {
        return this.zzl;
    }

    public final zzem zzk() {
        return this.zzg;
    }

    public final zzem zzl() {
        return this.zzi;
    }

    public final zzem zzm() {
        return this.zzh;
    }

    @VisibleForTesting
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String zzq() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                this.zzc = this.zzs.zzy() != null ? this.zzs.zzy() : this.zzs.zzf().zzn();
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final void zzt(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(zzq(), i10)) {
            Log.println(i10, zzq(), zzo(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzfv zzfvVarZzo = this.zzs.zzo();
        if (zzfvVarZzo == null) {
            Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzfvVarZzo.zzx()) {
                Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            zzfvVarZzo.zzp(new zzel(this, i10, str, obj, obj2, obj3));
        }
    }
}
