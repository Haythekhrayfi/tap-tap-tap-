package com.yandex.mobile.ads.impl;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class fs0 {
    public static <T> T a(@CheckForNull T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return d51.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return d51.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(u60.a("negative size: ", i11));
    }

    public static void a(int i10, int i11) {
        String strA;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strA = d51.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(u60.a("negative size: ", i11));
                }
                strA = d51.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void a(int i10, int i11, int i12) {
        String strA;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strA = a(i10, i12, "start index");
            } else {
                strA = (i11 < 0 || i11 > i12) ? a(i11, i12, "end index") : d51.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void a(@CheckForNull String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, "index"));
        }
    }
}
