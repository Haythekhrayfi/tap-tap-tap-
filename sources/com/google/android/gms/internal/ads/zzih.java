package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.activity.k;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class zzih extends zzcf {
    public static final zzn zzd = new zzn() { // from class: com.google.android.gms.internal.ads.zzig
    };
    private static final String zzl = Integer.toString(1001, 36);
    private static final String zzm = Integer.toString(1002, 36);
    private static final String zzn = Integer.toString(1003, 36);
    private static final String zzo = Integer.toString(1004, 36);
    private static final String zzp = Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
    private static final String zzq = Integer.toString(1006, 36);
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzam zzh;
    public final int zzi;
    public final zzbw zzj;
    public final boolean zzk;

    private zzih(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzih(int i10, Throwable th, String str, int i11, String str2, int i12, zzam zzamVar, int i13, boolean z10) {
        String strA;
        String str3;
        if (i10 == 0) {
            strA = "Source error";
        } else if (i10 != 1) {
            strA = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(zzamVar);
            int i14 = zzfj.zza;
            if (i13 == 0) {
                str3 = "NO";
            } else if (i13 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i12);
            sb2.append(", format=");
            sb2.append(strValueOf);
            strA = k.a(sb2, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strA : strA.concat(": null"), th, i11, i10, str2, i12, zzamVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private zzih(String str, Throwable th, int i10, int i11, String str2, int i12, zzam zzamVar, int i13, zzbw zzbwVar, long j10, boolean z10) {
        boolean z11;
        super(str, th, i10, j10);
        int i14 = i11;
        if (!z10) {
            z11 = true;
        } else if (i14 == 1) {
            i14 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        zzdy.zzd(z11);
        zzdy.zzd(th != null);
        this.zze = i14;
        this.zzf = str2;
        this.zzg = i12;
        this.zzh = zzamVar;
        this.zzi = i13;
        this.zzj = zzbwVar;
        this.zzk = z10;
    }

    public static zzih zzb(Throwable th, String str, int i10, zzam zzamVar, int i11, boolean z10, int i12) {
        return new zzih(1, th, null, i12, str, i10, zzamVar, zzamVar == null ? 4 : i11, z10);
    }

    public static zzih zzc(IOException iOException, int i10) {
        return new zzih(0, iOException, i10);
    }

    public static zzih zzd(RuntimeException runtimeException, int i10) {
        return new zzih(2, runtimeException, i10);
    }

    public final zzih zza(zzbw zzbwVar) {
        String message = getMessage();
        int i10 = zzfj.zza;
        return new zzih(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbwVar, this.zzc, this.zzk);
    }
}
