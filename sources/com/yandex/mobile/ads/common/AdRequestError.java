package com.yandex.mobile.ads.common;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class AdRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18269b;

    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;
    }

    public AdRequestError(int i10, String str) {
        this.f18269b = i10;
        this.f18268a = str == null ? "Unknown reason" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequestError.class != obj.getClass()) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f18269b != adRequestError.f18269b) {
            return false;
        }
        return this.f18268a.equals(adRequestError.f18268a);
    }

    public int getCode() {
        return this.f18269b;
    }

    public String getDescription() {
        return this.f18268a;
    }

    public int hashCode() {
        return (this.f18268a.hashCode() * 31) + this.f18269b;
    }

    public String toString() {
        return String.format(Locale.US, "AdRequestError (code: %d, description: %s)", Integer.valueOf(this.f18269b), this.f18268a);
    }
}
