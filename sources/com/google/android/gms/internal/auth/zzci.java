package com.google.android.gms.internal.auth;

import android.net.Uri;
import javax.annotation.Nullable;
import q.h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzci {
    private final h zza;

    public zzci(h hVar) {
        this.zza = hVar;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        h hVar = (h) this.zza.get(uri.toString());
        if (hVar == null) {
            return null;
        }
        return (String) hVar.get("".concat(String.valueOf(str3)));
    }
}
