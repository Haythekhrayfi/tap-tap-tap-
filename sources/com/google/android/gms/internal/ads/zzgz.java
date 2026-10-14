package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgz extends zzgx {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzgz(int i10, String str, IOException iOException, Map map, zzgj zzgjVar, byte[] bArr) {
        super(android.support.v4.media.a.a("Response code: ", i10), iOException, zzgjVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzd = i10;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
