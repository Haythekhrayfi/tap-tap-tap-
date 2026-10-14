package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class zzgx extends zzgf {
    public final zzgj zzb;
    public final int zzc;

    public zzgx(zzgj zzgjVar, int i10, int i11) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzgjVar;
        this.zzc = 1;
    }

    public zzgx(IOException iOException, zzgj zzgjVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = zzgjVar;
        this.zzc = i11;
    }

    public zzgx(String str, zzgj zzgjVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = zzgjVar;
        this.zzc = i11;
    }

    public zzgx(String str, IOException iOException, zzgj zzgjVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = zzgjVar;
        this.zzc = i11;
    }

    public static zzgx zza(IOException iOException, zzgj zzgjVar, int i10) {
        String message = iOException.getMessage();
        boolean z10 = iOException instanceof SocketTimeoutException;
        int i11 = AdError.INTERNAL_ERROR_CODE;
        if (z10) {
            i11 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && zzfon.zza(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        }
        return i11 == 2007 ? new zzgw(iOException, zzgjVar) : new zzgx(iOException, zzgjVar, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        if (i10 != 2000) {
            return i10;
        }
        if (i11 != 1) {
            return 2000;
        }
        return AdError.INTERNAL_ERROR_CODE;
    }
}
