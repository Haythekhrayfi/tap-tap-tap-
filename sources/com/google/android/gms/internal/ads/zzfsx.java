package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsx {
    @CheckForNull
    public static Object zza(Map map, @CheckForNull Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean zzb(Map map, @CheckForNull Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
