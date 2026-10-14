package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzys {
    private static Constructor zza;
    private static Method zzb;
    private static Method zzc;

    public static zzae zza(float f10) throws Exception {
        if (zza == null || zzb == null || zzc == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            zza = cls.getConstructor(new Class[0]);
            zzb = cls.getMethod("setRotationDegrees", Float.TYPE);
            zzc = cls.getMethod("build", new Class[0]);
        }
        Object objNewInstance = zza.newInstance(new Object[0]);
        zzb.invoke(objNewInstance, Float.valueOf(f10));
        Object objInvoke = zzc.invoke(objNewInstance, new Object[0]);
        Objects.requireNonNull(objInvoke);
        return (zzae) objInvoke;
    }
}
