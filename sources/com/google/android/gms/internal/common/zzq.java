package com.google.android.gms.internal.common;

import java.util.Objects;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes2.dex */
@NullMarked
public final class zzq {
    public static final CharSequence zza(@CheckForNull Object obj, String str) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
