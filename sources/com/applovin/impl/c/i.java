package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.URLUtil;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f8913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f8914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8915c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private i() {
    }

    public static i a(aa aaVar, i iVar, com.applovin.impl.sdk.o oVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (iVar == null) {
            try {
                iVar = new i();
            } catch (Throwable th) {
                oVar.F();
                if (y.a()) {
                    oVar.F().b("VastNonVideoResource", "Error occurred while initializing", th);
                }
                oVar.ag().a("VastNonVideoResource", th);
                return null;
            }
        }
        if (iVar.f8914b == null && !StringUtils.isValidString(iVar.f8915c)) {
            String strA = a(aaVar, "StaticResource");
            if (URLUtil.isValidUrl(strA)) {
                iVar.f8914b = Uri.parse(strA);
                iVar.f8913a = a.STATIC;
                return iVar;
            }
            String strA2 = a(aaVar, "IFrameResource");
            if (StringUtils.isValidString(strA2)) {
                iVar.f8913a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    iVar.f8914b = Uri.parse(strA2);
                } else {
                    iVar.f8915c = strA2;
                }
                return iVar;
            }
            String strA3 = a(aaVar, "HTMLResource");
            if (StringUtils.isValidString(strA3)) {
                iVar.f8913a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    iVar.f8914b = Uri.parse(strA3);
                } else {
                    iVar.f8915c = strA3;
                }
            }
        }
        return iVar;
    }

    private static String a(aa aaVar, String str) {
        aa aaVarB = aaVar.b(str);
        if (aaVarB != null) {
            return aaVarB.c();
        }
        return null;
    }

    public a a() {
        return this.f8913a;
    }

    public void a(Uri uri) {
        this.f8914b = uri;
    }

    public void a(String str) {
        this.f8915c = str;
    }

    public Uri b() {
        return this.f8914b;
    }

    public String c() {
        return this.f8915c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f8913a != iVar.f8913a) {
            return false;
        }
        Uri uri = this.f8914b;
        if (uri == null ? iVar.f8914b != null : !uri.equals(iVar.f8914b)) {
            return false;
        }
        String str = this.f8915c;
        String str2 = iVar.f8915c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        a aVar = this.f8913a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f8914b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f8915c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastNonVideoResource{type=");
        sbA.append(this.f8913a);
        sbA.append(", resourceUri=");
        sbA.append(this.f8914b);
        sbA.append(", resourceContents='");
        sbA.append(this.f8915c);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
