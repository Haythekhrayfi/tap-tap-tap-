package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnf extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
