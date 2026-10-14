package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> void checkBuilderRequirement(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T checkNotNull(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T checkNotNull(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static <T> T checkNotNull(T t10, String str, Object obj) {
        if (t10 != null) {
            return t10;
        }
        if (!str.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            throw new NullPointerException(str.replace("%s", obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
        }
        throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
    }
}
