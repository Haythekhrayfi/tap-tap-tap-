package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyx extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzyv zzd;
    private boolean zze;

    public /* synthetic */ zzyx(zzyv zzyvVar, SurfaceTexture surfaceTexture, boolean z10, zzyw zzywVar) {
        super(surfaceTexture);
        this.zzd = zzyvVar;
        this.zza = z10;
    }

    public static zzyx zza(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzdy.zzf(z11);
        return new zzyv().zza(z10 ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        String strEglQueryString;
        if (!zzc) {
            int i10 = zzfj.zza;
            int i11 = 2;
            if (i10 >= 24 && ((i10 >= 26 || !("samsung".equals(zzfj.zzc) || "XT1650".equals(zzfj.zzd))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                    i11 = 1;
                }
            } else {
                i11 = 0;
            }
            zzb = i11;
            zzc = true;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
