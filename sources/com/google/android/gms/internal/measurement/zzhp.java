package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhp {
    private static final q.a zza = new q.a();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        q.a aVar = zza;
        Uri uri = (Uri) aVar.getOrDefault("com.google.android.gms.measurement", null);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        aVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
