package com.applovin.impl.c;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.aa;
import com.applovin.impl.sdk.y;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<k> f8905a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<k> f8906b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f8907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f8908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8910f;

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.o oVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        com.applovin.impl.sdk.utils.l.a(imageView, uri.toString(), oVar);
        return imageView;
    }

    public static g a(aa aaVar, com.applovin.impl.sdk.o oVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        aa aaVarB = aaVar.b("StaticResource");
        if (aaVarB == null || !URLUtil.isValidUrl(aaVarB.c())) {
            oVar.F();
            if (!y.a()) {
                return null;
            }
            oVar.F().e("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        g gVar = new g();
        gVar.f8907c = Uri.parse(aaVarB.c());
        aa aaVarC = aaVar.c("IconClickThrough");
        if (aaVarC != null && URLUtil.isValidUrl(aaVarC.c())) {
            gVar.f8908d = Uri.parse(aaVarC.c());
        }
        String str = aaVar.b().get("width");
        int i10 = 0;
        int i11 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = aaVar.b().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i10 = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.fn)).intValue();
        if (i11 > 0 && i10 > 0) {
            double d10 = i11 / i10;
            int iMin = Math.min(Math.max(i11, i10), iIntValue);
            if (i11 >= i10) {
                gVar.f8909e = iMin;
                gVar.f8910f = (int) (((double) iMin) / d10);
            } else {
                gVar.f8910f = iMin;
                iIntValue = (int) (((double) iMin) * d10);
            }
            return gVar;
        }
        gVar.f8910f = iIntValue;
        gVar.f8909e = iIntValue;
        return gVar;
    }

    public Uri a() {
        return this.f8907c;
    }

    public Uri b() {
        return this.f8908d;
    }

    public int c() {
        return this.f8909e;
    }

    public int d() {
        return this.f8910f;
    }

    public Set<k> e() {
        return this.f8905a;
    }

    public Set<k> f() {
        return this.f8906b;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VastIndustryIcon{imageUri='");
        sbA.append(a());
        sbA.append("', clickUri='");
        sbA.append(b());
        sbA.append("', width=");
        sbA.append(c());
        sbA.append(", height=");
        sbA.append(d());
        sbA.append("}");
        return sbA.toString();
    }
}
