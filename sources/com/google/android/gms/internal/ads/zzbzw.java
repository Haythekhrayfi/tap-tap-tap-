package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbzw implements zzbzj {
    private final String zza;

    public zzbzw() {
        this.zza = null;
    }

    public zzbzw(String str) {
        this.zza = str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    @Override // com.google.android.gms.internal.ads.zzbzj
    public final boolean zza(String str) {
        boolean z10 = false;
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                zzbzr.zze("Pinging URL: " + str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    String str2 = this.zza;
                    httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("User-Agent", str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    zzbzq zzbzqVar = new zzbzq(null);
                    zzbzqVar.zzc(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzbzqVar.zze(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        zzbzr.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                    } else {
                        z10 = true;
                    }
                    httpURLConnection.disconnect();
                    if (ClientLibraryUtils.isPackageSide()) {
                        TrafficStats.clearThreadStatsTag();
                        return z10;
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                zzbzr.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (IndexOutOfBoundsException e11) {
                zzbzr.zzj("Error while parsing ping URL: " + str + ". " + e11.getMessage());
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (RuntimeException e12) {
                e = e12;
                zzbzr.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            }
            return z10;
        } catch (Throwable th2) {
            if (ClientLibraryUtils.isPackageSide()) {
                TrafficStats.clearThreadStatsTag();
            }
            throw th2;
        }
    }
}
