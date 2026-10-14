package com.yandex.mobile.ads.impl;

import ch.qos.logback.classic.Level;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class eo implements u80 {
    public eo() {
        this(0);
    }

    public eo(int i10) {
    }

    @Override // com.yandex.mobile.ads.impl.u80
    public final int a(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    @Override // com.yandex.mobile.ads.impl.u80
    public final long a(u80.a aVar) {
        boolean z10;
        Throwable cause = aVar.f25569a;
        if (!(cause instanceof qp0) && !(cause instanceof FileNotFoundException) && !(cause instanceof o00) && !(cause instanceof x80.g)) {
            int i10 = mm.f23110b;
            while (cause != null) {
                if ((cause instanceof mm) && ((mm) cause).f23111a == 2008) {
                    z10 = true;
                    if (!z10) {
                        return Math.min((aVar.f25570b - 1) * 1000, Level.TRACE_INT);
                    }
                } else {
                    cause = cause.getCause();
                }
            }
            z10 = false;
            if (!z10) {
                return Math.min((aVar.f25570b - 1) * 1000, Level.TRACE_INT);
            }
        }
        return -9223372036854775807L;
    }
}
