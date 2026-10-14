package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.URLUtil;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f8945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f8946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f8947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f8951g;

    public enum a {
        Progressive,
        Streaming
    }

    private o() {
    }

    private static long a(aa aaVar) {
        Map<String, String> mapB = aaVar.b();
        long j10 = StringUtils.parseLong(mapB.get("bitrate"), 0L);
        if (j10 != 0) {
            return j10;
        }
        return (StringUtils.parseLong(mapB.get("maxBitrate"), 0L) + StringUtils.parseLong(mapB.get("minBitrate"), 0L)) / 2;
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public static o a(aa aaVar, com.applovin.impl.sdk.o oVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strC = aaVar.c();
            if (!URLUtil.isValidUrl(strC)) {
                oVar.F();
                if (!y.a()) {
                    return null;
                }
                oVar.F().e("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strC);
            o oVar2 = new o();
            oVar2.f8945a = uri;
            oVar2.f8946b = uri;
            oVar2.f8951g = a(aaVar);
            oVar2.f8947c = a(aaVar.b().get("delivery"));
            oVar2.f8950f = StringUtils.parseInt(aaVar.b().get("height"));
            oVar2.f8949e = StringUtils.parseInt(aaVar.b().get("width"));
            oVar2.f8948d = aaVar.b().get("type").toLowerCase(Locale.ENGLISH);
            return oVar2;
        } catch (Throwable th) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("VastVideoFile", "Error occurred while initializing", th);
            }
            oVar.ag().a("VastVideoFile", th);
            return null;
        }
    }

    public Uri a() {
        return this.f8945a;
    }

    public void a(Uri uri) {
        this.f8946b = uri;
    }

    public Uri b() {
        return this.f8946b;
    }

    public String c() {
        return this.f8948d;
    }

    public long d() {
        return this.f8951g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f8949e != oVar.f8949e || this.f8950f != oVar.f8950f || this.f8951g != oVar.f8951g) {
            return false;
        }
        Uri uri = this.f8945a;
        if (uri == null ? oVar.f8945a != null : !uri.equals(oVar.f8945a)) {
            return false;
        }
        Uri uri2 = this.f8946b;
        if (uri2 == null ? oVar.f8946b != null : !uri2.equals(oVar.f8946b)) {
            return false;
        }
        if (this.f8947c != oVar.f8947c) {
            return false;
        }
        String str = this.f8948d;
        String str2 = oVar.f8948d;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f8945a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f8946b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f8947c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f8948d;
        return Long.valueOf(this.f8951g).hashCode() + ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f8949e) * 31) + this.f8950f) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastVideoFile{sourceVideoUri=");
        sbA.append(this.f8945a);
        sbA.append(", videoUri=");
        sbA.append(this.f8946b);
        sbA.append(", deliveryType=");
        sbA.append(this.f8947c);
        sbA.append(", fileType='");
        l1.c.a(sbA, this.f8948d, CoreConstants.SINGLE_QUOTE_CHAR, ", width=");
        sbA.append(this.f8949e);
        sbA.append(", height=");
        sbA.append(this.f8950f);
        sbA.append(", bitrate=");
        return o2.a.a(sbA, this.f8951g, '}');
    }
}
