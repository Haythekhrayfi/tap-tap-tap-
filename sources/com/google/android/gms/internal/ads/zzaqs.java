package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqs {
    private static final String[] zza = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zzb = "ad.doubleclick.net";
    private final String[] zzc = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzaqo zzd;

    @Deprecated
    public zzaqs(zzaqo zzaqoVar) {
        this.zzd = zzaqoVar;
    }

    private final Uri zzg(Uri uri, String str) throws zzaqt {
        String str2;
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.zzb)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzaqt("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i10 = iIndexOf + 1;
                        str2 = string.substring(0, i10) + "dc_ms=" + str + ";" + string.substring(i10);
                    } else {
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        str2 = string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length());
                    }
                    return Uri.parse(str2);
                }
            } catch (UnsupportedOperationException unused) {
                throw new zzaqt("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzaqt("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i11 = iIndexOf3 + 1;
        return Uri.parse(string2.substring(0, i11) + "ms=" + str + "&" + string2.substring(i11));
    }

    @Deprecated
    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzaqt {
        try {
            return zzg(uri, this.zzd.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzaqt("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zzb(Uri uri, Context context) throws zzaqt {
        return zzg(uri, this.zzd.zzg(context));
    }

    @Deprecated
    public final zzaqo zzc() {
        return this.zzd;
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent) {
        this.zzd.zzk(motionEvent);
    }

    public final boolean zze(Uri uri) {
        if (zzf(uri)) {
            String[] strArr = zza;
            for (int i10 = 0; i10 < 3; i10++) {
                if (uri.getPath().endsWith(strArr[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzf(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.zzc;
            for (int i10 = 0; i10 < 3; i10++) {
                if (host.endsWith(strArr[i10])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
