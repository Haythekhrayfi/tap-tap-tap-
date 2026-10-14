package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfly extends zzflm {
    private zzfpx<Integer> zza;
    private zzfpx<Integer> zzb;
    private zzflx zzc;
    private HttpURLConnection zzd;

    public zzfly() {
        this(new zzfpx() { // from class: com.google.android.gms.internal.ads.zzflv
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return zzfly.zzf();
            }
        }, new zzfpx() { // from class: com.google.android.gms.internal.ads.zzflw
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return zzfly.zzg();
            }
        }, null);
    }

    public zzfly(zzfpx<Integer> zzfpxVar, zzfpx<Integer> zzfpxVar2, zzflx zzflxVar) {
        this.zza = zzfpxVar;
        this.zzb = zzfpxVar2;
        this.zzc = zzflxVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfln.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfln.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzflx zzflxVar = this.zzc;
        Objects.requireNonNull(zzflxVar);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzflxVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzflx zzflxVar, final int i10, final int i11) throws IOException {
        this.zza = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzflo
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzb = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzflp
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.zzc = zzflxVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i10, final int i11) throws IOException {
        this.zza = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzflq
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzb = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzflr
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.zzc = new zzflx() { // from class: com.google.android.gms.internal.ads.zzfls
            @Override // com.google.android.gms.internal.ads.zzflx
            public final URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i10) throws IOException {
        this.zza = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzflt
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzc = new zzflx() { // from class: com.google.android.gms.internal.ads.zzflu
            @Override // com.google.android.gms.internal.ads.zzflx
            public final URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzm();
    }
}
