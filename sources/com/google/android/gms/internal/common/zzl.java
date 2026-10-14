package com.google.android.gms.internal.common;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;

/* JADX INFO: loaded from: classes2.dex */
final class zzl extends zzk {
    private final char zza;

    public zzl(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        StringBuilder sbA = a.a("CharMatcher.is('");
        int i10 = this.zza;
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        sbA.append(String.copyValueOf(cArr));
        sbA.append("')");
        return sbA.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
