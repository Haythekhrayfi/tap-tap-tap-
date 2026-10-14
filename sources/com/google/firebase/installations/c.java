package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
public class c extends u4.e {

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public c(a aVar) {
    }

    public c(String str, a aVar) {
        super(str);
    }

    public c(String str, a aVar, Throwable th) {
        super(str, th);
    }
}
