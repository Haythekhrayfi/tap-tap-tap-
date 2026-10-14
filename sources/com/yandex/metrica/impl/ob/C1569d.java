package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1569d extends IOException {
    public C1569d(String str) {
        super(str);
    }

    public static C1569d a() {
        return new C1569d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1569d b() {
        return new C1569d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
