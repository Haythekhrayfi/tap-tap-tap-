package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w;
import ch.qos.logback.classic.net.SyslogAppender;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class zzer {
    private static final Object zza = new Object();
    private static final zzeq zzb = zzeq.zza;

    @Pure
    public static String zza(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (zza) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "    ");
                        break;
                    }
                    if (cause instanceof UnknownHostException) {
                        strReplace = "UnknownHostException (no network)";
                        break;
                    }
                    cause = cause.getCause();
                }
            }
        } else {
            strReplace = null;
        }
        return !TextUtils.isEmpty(strReplace) ? w.a(str, "\n  ", strReplace.replace("\n", "\n  "), "\n") : str;
    }

    @Pure
    public static void zzb(String str, String str2) {
        synchronized (zza) {
            Log.d(str, zza(str2, null));
        }
    }

    @Pure
    public static void zzc(String str, String str2) {
        synchronized (zza) {
            Log.e(str, zza(str2, null));
        }
    }

    @Pure
    public static void zzd(String str, String str2, Throwable th) {
        synchronized (zza) {
            Log.e(str, zza(str2, th));
        }
    }

    @Pure
    public static void zze(String str, String str2) {
        synchronized (zza) {
            Log.i(str, zza(str2, null));
        }
    }

    @Pure
    public static void zzf(String str, String str2) {
        synchronized (zza) {
            Log.w(str, zza(str2, null));
        }
    }

    @Pure
    public static void zzg(String str, String str2, Throwable th) {
        synchronized (zza) {
            Log.w(str, zza(str2, th));
        }
    }
}
