package com.google.android.gms.internal.ads;

import androidx.activity.j;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
final class zzfop extends zzfoo {
    private final char zza;

    public zzfop(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        int i10 = this.zza;
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return j.a("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final boolean zzb(char c10) {
        return c10 == this.zza;
    }
}
