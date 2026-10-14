package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public final class pa {
    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @Pure
    public static void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    public static void a(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T b(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    @Pure
    public static void b(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    @Pure
    public static void b(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }
}
