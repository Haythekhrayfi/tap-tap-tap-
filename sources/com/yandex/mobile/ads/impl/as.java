package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public enum as {
    f19046b("NO_ERROR"),
    f19047c("PROTOCOL_ERROR"),
    f19048d("INTERNAL_ERROR"),
    f19049e("FLOW_CONTROL_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("SETTINGS_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("STREAM_CLOSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("FRAME_SIZE_ERROR"),
    f19050f("REFUSED_STREAM"),
    f19051g("CANCEL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF91("COMPRESSION_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF100("CONNECT_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF109("ENHANCE_YOUR_CALM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF118("INADEQUATE_SECURITY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF127("HTTP_1_1_REQUIRED");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19053a;

    public static final class a {
        public static as a(int i10) {
            for (as asVar : as.values()) {
                if (asVar.a() == i10) {
                    return asVar;
                }
            }
            return null;
        }
    }

    as(String str) {
        this.f19053a = i;
    }

    public final int a() {
        return this.f19053a;
    }
}
