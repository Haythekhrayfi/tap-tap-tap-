package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.g20;
import com.yandex.mobile.ads.impl.j20;
import com.yandex.mobile.ads.impl.x60;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeAdAssets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeAdMedia f27647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f27650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f27651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private NativeAdImage f27652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeAdImage f27653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private NativeAdImage f27654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f27655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Float f27656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f27657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f27658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f27659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f27660n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f27661o;

    public final void a(j20 j20Var, g20 g20Var) {
        NativeAdImage nativeAdImage;
        if (j20Var != null) {
            nativeAdImage = new NativeAdImage();
            nativeAdImage.a(j20Var.a());
            nativeAdImage.b(j20Var.e());
            nativeAdImage.a(j20Var.b());
            nativeAdImage.a(g20Var.a(j20Var));
        } else {
            nativeAdImage = null;
        }
        this.f27652f = nativeAdImage;
    }

    public final void a(NativeAdMedia nativeAdMedia) {
        this.f27647a = nativeAdMedia;
    }

    public final void a(String str) {
        this.f27648b = str;
    }

    public final void a(boolean z10) {
        this.f27661o = z10;
    }

    public final void b(j20 j20Var, g20 g20Var) {
        NativeAdImage nativeAdImage;
        if (j20Var != null) {
            nativeAdImage = new NativeAdImage();
            nativeAdImage.a(j20Var.a());
            nativeAdImage.b(j20Var.e());
            nativeAdImage.a(j20Var.b());
            nativeAdImage.a(g20Var.a(j20Var));
        } else {
            nativeAdImage = null;
        }
        this.f27653g = nativeAdImage;
    }

    public final void b(String str) {
        this.f27649c = str;
    }

    public final void c(j20 j20Var, g20 g20Var) {
        NativeAdImage nativeAdImage;
        if (j20Var != null) {
            nativeAdImage = new NativeAdImage();
            nativeAdImage.a(j20Var.a());
            nativeAdImage.b(j20Var.e());
            nativeAdImage.a(j20Var.b());
            nativeAdImage.a(g20Var.a(j20Var));
        } else {
            nativeAdImage = null;
        }
        this.f27654h = nativeAdImage;
    }

    public final void c(String str) {
        this.f27650d = str;
    }

    public final void d(String str) {
        this.f27651e = str;
    }

    public final void e(String str) {
        this.f27655i = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NativeAdAssets nativeAdAssets = (NativeAdAssets) obj;
        NativeAdMedia nativeAdMedia = this.f27647a;
        if (nativeAdMedia == null ? nativeAdAssets.f27647a != null : !nativeAdMedia.equals(nativeAdAssets.f27647a)) {
            return false;
        }
        String str = this.f27648b;
        if (str == null ? nativeAdAssets.f27648b != null : !str.equals(nativeAdAssets.f27648b)) {
            return false;
        }
        String str2 = this.f27649c;
        if (str2 == null ? nativeAdAssets.f27649c != null : !str2.equals(nativeAdAssets.f27649c)) {
            return false;
        }
        String str3 = this.f27650d;
        if (str3 == null ? nativeAdAssets.f27650d != null : !str3.equals(nativeAdAssets.f27650d)) {
            return false;
        }
        String str4 = this.f27651e;
        if (str4 == null ? nativeAdAssets.f27651e != null : !str4.equals(nativeAdAssets.f27651e)) {
            return false;
        }
        NativeAdImage nativeAdImage = this.f27652f;
        if (nativeAdImage == null ? nativeAdAssets.f27652f != null : !nativeAdImage.equals(nativeAdAssets.f27652f)) {
            return false;
        }
        NativeAdImage nativeAdImage2 = this.f27653g;
        if (nativeAdImage2 == null ? nativeAdAssets.f27653g != null : !nativeAdImage2.equals(nativeAdAssets.f27653g)) {
            return false;
        }
        NativeAdImage nativeAdImage3 = this.f27654h;
        if (nativeAdImage3 == null ? nativeAdAssets.f27654h != null : !nativeAdImage3.equals(nativeAdAssets.f27654h)) {
            return false;
        }
        String str5 = this.f27655i;
        if (str5 == null ? nativeAdAssets.f27655i != null : !str5.equals(nativeAdAssets.f27655i)) {
            return false;
        }
        Float f10 = this.f27656j;
        if (f10 == null ? nativeAdAssets.f27656j != null : !f10.equals(nativeAdAssets.f27656j)) {
            return false;
        }
        String str6 = this.f27657k;
        if (str6 == null ? nativeAdAssets.f27657k != null : !str6.equals(nativeAdAssets.f27657k)) {
            return false;
        }
        String str7 = this.f27658l;
        if (str7 == null ? nativeAdAssets.f27658l != null : !str7.equals(nativeAdAssets.f27658l)) {
            return false;
        }
        String str8 = this.f27659m;
        if (str8 == null ? nativeAdAssets.f27659m != null : !str8.equals(nativeAdAssets.f27659m)) {
            return false;
        }
        String str9 = this.f27660n;
        String str10 = nativeAdAssets.f27660n;
        if (str9 != null) {
            return str9.equals(str10);
        }
        return str10 == null;
    }

    public final void f(String str) {
        if (str != null) {
            try {
                this.f27656j = Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException e10) {
                x60.a(e10, String.format("Could not parse rating value. Rating value is %s", str), new Object[0]);
            }
        }
    }

    public final void g(String str) {
        this.f27657k = str;
    }

    public String getAge() {
        return this.f27648b;
    }

    public String getBody() {
        return this.f27649c;
    }

    public String getCallToAction() {
        return this.f27650d;
    }

    public String getDomain() {
        return this.f27651e;
    }

    public NativeAdImage getFavicon() {
        return this.f27652f;
    }

    public NativeAdImage getIcon() {
        return this.f27653g;
    }

    public NativeAdImage getImage() {
        return this.f27654h;
    }

    public NativeAdMedia getMedia() {
        return this.f27647a;
    }

    public String getPrice() {
        return this.f27655i;
    }

    public Float getRating() {
        return this.f27656j;
    }

    public String getReviewCount() {
        return this.f27657k;
    }

    public String getSponsored() {
        return this.f27658l;
    }

    public String getTitle() {
        return this.f27659m;
    }

    public String getWarning() {
        return this.f27660n;
    }

    public final void h(String str) {
        this.f27658l = str;
    }

    public int hashCode() {
        NativeAdMedia nativeAdMedia = this.f27647a;
        int iHashCode = (nativeAdMedia != null ? nativeAdMedia.hashCode() : 0) * 31;
        String str = this.f27648b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27649c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27650d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f27651e;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage = this.f27652f;
        int iHashCode6 = (iHashCode5 + (nativeAdImage != null ? nativeAdImage.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage2 = this.f27653g;
        int iHashCode7 = (iHashCode6 + (nativeAdImage2 != null ? nativeAdImage2.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage3 = this.f27654h;
        int iHashCode8 = (iHashCode7 + (nativeAdImage3 != null ? nativeAdImage3.hashCode() : 0)) * 31;
        String str5 = this.f27655i;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Float f10 = this.f27656j;
        int iHashCode10 = (iHashCode9 + (f10 != null ? f10.hashCode() : 0)) * 31;
        String str6 = this.f27657k;
        int iHashCode11 = (iHashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f27658l;
        int iHashCode12 = (iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f27659m;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f27660n;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void i(String str) {
        this.f27659m = str;
    }

    public boolean isFeedbackAvailable() {
        return this.f27661o;
    }

    public final void j(String str) {
        this.f27660n = str;
    }
}
