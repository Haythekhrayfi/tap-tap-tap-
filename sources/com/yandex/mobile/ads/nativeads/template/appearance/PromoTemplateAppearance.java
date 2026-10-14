package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class PromoTemplateAppearance implements Parcelable {
    public static final Parcelable.Creator<PromoTemplateAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerAppearance f27921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextAppearance f27922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextAppearance f27923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextAppearance f27924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImageAppearance f27925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageAppearance f27926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ButtonAppearance f27927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ButtonAppearance f27928h;

    public class a implements Parcelable.Creator<PromoTemplateAppearance> {
        @Override // android.os.Parcelable.Creator
        public final PromoTemplateAppearance createFromParcel(Parcel parcel) {
            return new PromoTemplateAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoTemplateAppearance[] newArray(int i10) {
            return new PromoTemplateAppearance[i10];
        }
    }

    public PromoTemplateAppearance(Parcel parcel) {
        this.f27921a = (BannerAppearance) parcel.readParcelable(BannerAppearance.class.getClassLoader());
        this.f27922b = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27923c = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27924d = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27925e = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f27926f = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f27927g = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
        this.f27928h = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PromoTemplateAppearance.class != obj.getClass()) {
            return false;
        }
        PromoTemplateAppearance promoTemplateAppearance = (PromoTemplateAppearance) obj;
        BannerAppearance bannerAppearance = this.f27921a;
        if (bannerAppearance == null ? promoTemplateAppearance.f27921a != null : !bannerAppearance.equals(promoTemplateAppearance.f27921a)) {
            return false;
        }
        TextAppearance textAppearance = this.f27922b;
        if (textAppearance == null ? promoTemplateAppearance.f27922b != null : !textAppearance.equals(promoTemplateAppearance.f27922b)) {
            return false;
        }
        TextAppearance textAppearance2 = this.f27923c;
        if (textAppearance2 == null ? promoTemplateAppearance.f27923c != null : !textAppearance2.equals(promoTemplateAppearance.f27923c)) {
            return false;
        }
        TextAppearance textAppearance3 = this.f27924d;
        if (textAppearance3 == null ? promoTemplateAppearance.f27924d != null : !textAppearance3.equals(promoTemplateAppearance.f27924d)) {
            return false;
        }
        ImageAppearance imageAppearance = this.f27925e;
        if (imageAppearance == null ? promoTemplateAppearance.f27925e != null : !imageAppearance.equals(promoTemplateAppearance.f27925e)) {
            return false;
        }
        ImageAppearance imageAppearance2 = this.f27926f;
        if (imageAppearance2 == null ? promoTemplateAppearance.f27926f != null : !imageAppearance2.equals(promoTemplateAppearance.f27926f)) {
            return false;
        }
        ButtonAppearance buttonAppearance = this.f27927g;
        if (buttonAppearance == null ? promoTemplateAppearance.f27927g != null : !buttonAppearance.equals(promoTemplateAppearance.f27927g)) {
            return false;
        }
        ButtonAppearance buttonAppearance2 = this.f27928h;
        ButtonAppearance buttonAppearance3 = promoTemplateAppearance.f27928h;
        if (buttonAppearance2 != null) {
            return buttonAppearance2.equals(buttonAppearance3);
        }
        return buttonAppearance3 == null;
    }

    public final int hashCode() {
        BannerAppearance bannerAppearance = this.f27921a;
        int iHashCode = (bannerAppearance != null ? bannerAppearance.hashCode() : 0) * 31;
        TextAppearance textAppearance = this.f27922b;
        int iHashCode2 = (iHashCode + (textAppearance != null ? textAppearance.hashCode() : 0)) * 31;
        TextAppearance textAppearance2 = this.f27923c;
        int iHashCode3 = (iHashCode2 + (textAppearance2 != null ? textAppearance2.hashCode() : 0)) * 31;
        TextAppearance textAppearance3 = this.f27924d;
        int iHashCode4 = (iHashCode3 + (textAppearance3 != null ? textAppearance3.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance = this.f27925e;
        int iHashCode5 = (iHashCode4 + (imageAppearance != null ? imageAppearance.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance2 = this.f27926f;
        int iHashCode6 = (iHashCode5 + (imageAppearance2 != null ? imageAppearance2.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance = this.f27927g;
        int iHashCode7 = (iHashCode6 + (buttonAppearance != null ? buttonAppearance.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance2 = this.f27928h;
        return iHashCode7 + (buttonAppearance2 != null ? buttonAppearance2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f27921a, i10);
        parcel.writeParcelable(this.f27922b, i10);
        parcel.writeParcelable(this.f27923c, i10);
        parcel.writeParcelable(this.f27924d, i10);
        parcel.writeParcelable(this.f27925e, i10);
        parcel.writeParcelable(this.f27926f, i10);
        parcel.writeParcelable(this.f27927g, i10);
        parcel.writeParcelable(this.f27928h, i10);
    }
}
