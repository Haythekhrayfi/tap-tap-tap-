package com.google.android.gms.internal.ads;

import androidx.fragment.app.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyb extends IOException {
    public zzyb(Throwable th) {
        super(w.a("Unexpected ", th.getClass().getSimpleName(), ": ", th.getMessage()), th);
    }
}
