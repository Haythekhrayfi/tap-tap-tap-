package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.io.File;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f10786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinNativeAdImpl f10787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0142a f10788c;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0142a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, o oVar, InterfaceC0142a interfaceC0142a) {
        super("TaskCacheNativeAd", oVar);
        this.f10786a = new com.applovin.impl.sdk.d.e();
        this.f10787b = appLovinNativeAdImpl;
        this.f10788c = interfaceC0142a;
    }

    private Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (y.a()) {
            this.f10536h.b(this.f10535g, "Attempting to cache resource: " + uri);
        }
        String strA = this.f10534f.S().a(f(), uri.toString(), this.f10787b.getCachePrefix(), Collections.emptyList(), false, false, this.f10786a);
        if (StringUtils.isValidString(strA)) {
            File fileA = this.f10534f.S().a(strA, f());
            if (fileA != null) {
                Uri uriFromFile = Uri.fromFile(fileA);
                if (uriFromFile != null) {
                    return uriFromFile;
                }
                if (y.a()) {
                    this.f10536h.e(this.f10535g, "Unable to extract Uri from image file");
                }
            } else if (y.a()) {
                this.f10536h.e(this.f10535g, "Unable to retrieve File from cached image filename = " + strA);
            }
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (y.a()) {
            y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Begin caching ad #");
            sbA.append(this.f10787b.getAdIdNumber());
            sbA.append("...");
            yVar.b(str, sbA.toString());
        }
        Uri uriA = a(this.f10787b.getIconUri());
        if (uriA != null) {
            this.f10787b.setIconUri(uriA);
        }
        Uri uriA2 = a(this.f10787b.getMainImageUri());
        if (uriA2 != null) {
            this.f10787b.setMainImageUri(uriA2);
        }
        Uri uriA3 = a(this.f10787b.getPrivacyIconUri());
        if (uriA3 != null) {
            this.f10787b.setPrivacyIconUri(uriA3);
        }
        if (y.a()) {
            y yVar2 = this.f10536h;
            String str2 = this.f10535g;
            StringBuilder sbA2 = defpackage.a.a("Finished caching ad #");
            sbA2.append(this.f10787b.getAdIdNumber());
            yVar2.b(str2, sbA2.toString());
        }
        this.f10788c.a(this.f10787b);
    }
}
