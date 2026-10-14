package com.yandex.mobile.ads.nativeads.template.appearance;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeTemplateAppearance implements Parcelable {
    public static final Parcelable.Creator<NativeTemplateAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f27893m = Color.parseColor("#7f7f7f");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f27894n = Color.parseColor("#ffd200");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f27895o = Color.parseColor("#ffd200");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f27896p = Color.parseColor("#f4c900");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerAppearance f27897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextAppearance f27898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextAppearance f27899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextAppearance f27900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextAppearance f27901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextAppearance f27902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextAppearance f27903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextAppearance f27904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImageAppearance f27905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageAppearance f27906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ButtonAppearance f27907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RatingAppearance f27908l;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BannerAppearance f27909a = b();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ButtonAppearance f27919k = d();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ImageAppearance f27917i = g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ImageAppearance f27918j = f();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private RatingAppearance f27920l = h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private TextAppearance f27910b = a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextAppearance f27911c = c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TextAppearance f27912d = e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private TextAppearance f27913e = i();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private TextAppearance f27914f = j();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private TextAppearance f27915g = k();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private TextAppearance f27916h = l();

        private static TextAppearance a() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f27893m).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static BannerAppearance b() {
            return new BannerAppearance.Builder().setBackgroundColor(-1).setBorderColor(eh1.a(-16777216, 90.0f)).setBorderWidth(1.0f).setContentPadding(new HorizontalOffset(10.0f, 10.0f)).setImageMargins(new HorizontalOffset(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 10.0f)).build();
        }

        private static TextAppearance c() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ButtonAppearance d() {
            return new ButtonAppearance.Builder().setBorderColor(NativeTemplateAppearance.f27894n).setBorderWidth(1.0f).setNormalColor(-1).setPressedColor(NativeTemplateAppearance.f27895o).setTextAppearance(new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build()).build();
        }

        private static TextAppearance e() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f27893m).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ImageAppearance f() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.FIXED, 16.0f)).build();
        }

        private static ImageAppearance g() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.PREFERRED_RATIO, 0.3f)).build();
        }

        private static RatingAppearance h() {
            return new RatingAppearance.Builder().setBackgroundStarColor(-3355444).setProgressStarColor(NativeTemplateAppearance.f27896p).build();
        }

        private static TextAppearance i() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f27893m).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance j() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f27893m).setTextSize(11.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance k() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(1).build();
        }

        private static TextAppearance l() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f27893m).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        public NativeTemplateAppearance build() {
            return new NativeTemplateAppearance(this, 0);
        }

        public Builder withAgeAppearance(TextAppearance textAppearance) {
            this.f27910b = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f27910b, textAppearance);
            return this;
        }

        public Builder withBannerAppearance(BannerAppearance bannerAppearance) {
            BannerAppearance bannerAppearanceBuild = this.f27909a;
            if (bannerAppearance != null && !bannerAppearanceBuild.equals(bannerAppearance)) {
                int backgroundColor = bannerAppearance.getBackgroundColor();
                int borderColor = bannerAppearance.getBorderColor();
                float borderWidth = bannerAppearance.getBorderWidth();
                HorizontalOffset imageMargins = bannerAppearance.getImageMargins();
                BannerAppearance.Builder builder = new BannerAppearance.Builder();
                if (backgroundColor == 0) {
                    backgroundColor = bannerAppearanceBuild.getBackgroundColor();
                }
                BannerAppearance.Builder backgroundColor2 = builder.setBackgroundColor(backgroundColor);
                if (borderColor == 0) {
                    borderColor = bannerAppearanceBuild.getBorderColor();
                }
                BannerAppearance.Builder borderColor2 = backgroundColor2.setBorderColor(borderColor);
                float right = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                if (borderWidth < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    borderWidth = bannerAppearanceBuild.getBorderWidth();
                }
                BannerAppearance.Builder borderWidth2 = borderColor2.setBorderWidth(borderWidth);
                HorizontalOffset contentPadding = bannerAppearanceBuild.getContentPadding();
                HorizontalOffset contentPadding2 = bannerAppearance.getContentPadding();
                if (contentPadding2 != null && !contentPadding.equals(contentPadding2)) {
                    float left = contentPadding2.getLeft() >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? contentPadding2.getLeft() : 0.0f;
                    if (contentPadding2.getRight() >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        right = contentPadding2.getRight();
                    }
                    contentPadding = new HorizontalOffset(left, right);
                }
                BannerAppearance.Builder contentPadding3 = borderWidth2.setContentPadding(contentPadding);
                if (imageMargins == null) {
                    imageMargins = bannerAppearanceBuild.getImageMargins();
                }
                bannerAppearanceBuild = contentPadding3.setImageMargins(imageMargins).build();
            }
            this.f27909a = bannerAppearanceBuild;
            return this;
        }

        public Builder withBodyAppearance(TextAppearance textAppearance) {
            this.f27911c = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f27911c, textAppearance);
            return this;
        }

        public Builder withCallToActionAppearance(ButtonAppearance buttonAppearance) {
            ButtonAppearance buttonAppearanceBuild = this.f27919k;
            if (buttonAppearance != null && !buttonAppearanceBuild.equals(buttonAppearance)) {
                TextAppearance textAppearanceA = com.yandex.mobile.ads.nativeads.template.appearance.a.a(buttonAppearanceBuild.getTextAppearance(), buttonAppearance.getTextAppearance());
                int borderColor = buttonAppearance.getBorderColor();
                float borderWidth = buttonAppearance.getBorderWidth();
                int normalColor = buttonAppearance.getNormalColor();
                int pressedColor = buttonAppearance.getPressedColor();
                ButtonAppearance.Builder textAppearance = new ButtonAppearance.Builder().setTextAppearance(textAppearanceA);
                if (borderColor == 0) {
                    borderColor = buttonAppearanceBuild.getBorderColor();
                }
                ButtonAppearance.Builder borderColor2 = textAppearance.setBorderColor(borderColor);
                if (borderWidth < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    borderWidth = buttonAppearanceBuild.getBorderWidth();
                }
                ButtonAppearance.Builder borderWidth2 = borderColor2.setBorderWidth(borderWidth);
                if (normalColor == 0) {
                    normalColor = buttonAppearanceBuild.getNormalColor();
                }
                ButtonAppearance.Builder normalColor2 = borderWidth2.setNormalColor(normalColor);
                if (pressedColor == 0) {
                    pressedColor = buttonAppearanceBuild.getPressedColor();
                }
                buttonAppearanceBuild = normalColor2.setPressedColor(pressedColor).build();
            }
            this.f27919k = buttonAppearanceBuild;
            return this;
        }

        public Builder withDomainAppearance(TextAppearance textAppearance) {
            this.f27912d = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f27912d, textAppearance);
            return this;
        }

        public Builder withFaviconAppearance(ImageAppearance imageAppearance) {
            ImageAppearance imageAppearanceBuild = this.f27918j;
            if (imageAppearance != null && !imageAppearanceBuild.equals(imageAppearance)) {
                SizeConstraint widthConstraint = imageAppearance.getWidthConstraint();
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearanceBuild.getWidthConstraint();
                }
                imageAppearanceBuild = builder.setWidthConstraint(widthConstraint).build();
            }
            this.f27918j = imageAppearanceBuild;
            return this;
        }

        public Builder withImageAppearance(ImageAppearance imageAppearance) {
            ImageAppearance imageAppearanceBuild = this.f27917i;
            if (imageAppearance != null && !imageAppearanceBuild.equals(imageAppearance)) {
                SizeConstraint widthConstraint = imageAppearance.getWidthConstraint();
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearanceBuild.getWidthConstraint();
                }
                imageAppearanceBuild = builder.setWidthConstraint(widthConstraint).build();
            }
            this.f27917i = imageAppearanceBuild;
            return this;
        }

        public Builder withRatingAppearance(RatingAppearance ratingAppearance) {
            RatingAppearance ratingAppearanceBuild = this.f27920l;
            if (ratingAppearance != null && !ratingAppearanceBuild.equals(ratingAppearance)) {
                int backgroundStarColor = ratingAppearance.getBackgroundStarColor();
                int progressStarColor = ratingAppearance.getProgressStarColor();
                RatingAppearance.Builder builder = new RatingAppearance.Builder();
                if (backgroundStarColor == 0) {
                    backgroundStarColor = ratingAppearanceBuild.getBackgroundStarColor();
                }
                RatingAppearance.Builder backgroundStarColor2 = builder.setBackgroundStarColor(backgroundStarColor);
                if (progressStarColor == 0) {
                    progressStarColor = ratingAppearanceBuild.getProgressStarColor();
                }
                ratingAppearanceBuild = backgroundStarColor2.setProgressStarColor(progressStarColor).build();
            }
            this.f27920l = ratingAppearanceBuild;
            return this;
        }

        public Builder withReviewCountAppearance(TextAppearance textAppearance) {
            this.f27913e = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f27913e, textAppearance);
            return this;
        }

        public Builder withSponsoredAppearance(TextAppearance textAppearance) {
            this.f27914f = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f27914f, textAppearance);
            return this;
        }

        public Builder withTitleAppearance(TextAppearance textAppearance) {
            this.f27915g = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f27915g, textAppearance);
            return this;
        }

        public Builder withWarningAppearance(TextAppearance textAppearance) {
            this.f27916h = com.yandex.mobile.ads.nativeads.template.appearance.a.a(this.f27916h, textAppearance);
            return this;
        }
    }

    public class a implements Parcelable.Creator<NativeTemplateAppearance> {
        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance createFromParcel(Parcel parcel) {
            return new NativeTemplateAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance[] newArray(int i10) {
            return new NativeTemplateAppearance[i10];
        }
    }

    public NativeTemplateAppearance(Parcel parcel) {
        this.f27897a = (BannerAppearance) parcel.readParcelable(BannerAppearance.class.getClassLoader());
        this.f27898b = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27899c = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27900d = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27901e = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27902f = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27903g = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27904h = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f27905i = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f27906j = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f27907k = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
        this.f27908l = (RatingAppearance) parcel.readParcelable(RatingAppearance.class.getClassLoader());
    }

    private NativeTemplateAppearance(Builder builder) {
        this.f27897a = builder.f27909a;
        this.f27898b = builder.f27910b;
        this.f27899c = builder.f27911c;
        this.f27900d = builder.f27912d;
        this.f27901e = builder.f27913e;
        this.f27902f = builder.f27914f;
        this.f27903g = builder.f27915g;
        this.f27904h = builder.f27916h;
        this.f27906j = builder.f27917i;
        this.f27905i = builder.f27918j;
        this.f27907k = builder.f27919k;
        this.f27908l = builder.f27920l;
    }

    public /* synthetic */ NativeTemplateAppearance(Builder builder, int i10) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeTemplateAppearance.class != obj.getClass()) {
            return false;
        }
        NativeTemplateAppearance nativeTemplateAppearance = (NativeTemplateAppearance) obj;
        BannerAppearance bannerAppearance = this.f27897a;
        if (bannerAppearance == null ? nativeTemplateAppearance.f27897a != null : !bannerAppearance.equals(nativeTemplateAppearance.f27897a)) {
            return false;
        }
        TextAppearance textAppearance = this.f27898b;
        if (textAppearance == null ? nativeTemplateAppearance.f27898b != null : !textAppearance.equals(nativeTemplateAppearance.f27898b)) {
            return false;
        }
        TextAppearance textAppearance2 = this.f27899c;
        if (textAppearance2 == null ? nativeTemplateAppearance.f27899c != null : !textAppearance2.equals(nativeTemplateAppearance.f27899c)) {
            return false;
        }
        TextAppearance textAppearance3 = this.f27900d;
        if (textAppearance3 == null ? nativeTemplateAppearance.f27900d != null : !textAppearance3.equals(nativeTemplateAppearance.f27900d)) {
            return false;
        }
        TextAppearance textAppearance4 = this.f27901e;
        if (textAppearance4 == null ? nativeTemplateAppearance.f27901e != null : !textAppearance4.equals(nativeTemplateAppearance.f27901e)) {
            return false;
        }
        TextAppearance textAppearance5 = this.f27902f;
        if (textAppearance5 == null ? nativeTemplateAppearance.f27902f != null : !textAppearance5.equals(nativeTemplateAppearance.f27902f)) {
            return false;
        }
        TextAppearance textAppearance6 = this.f27903g;
        if (textAppearance6 == null ? nativeTemplateAppearance.f27903g != null : !textAppearance6.equals(nativeTemplateAppearance.f27903g)) {
            return false;
        }
        TextAppearance textAppearance7 = this.f27904h;
        if (textAppearance7 == null ? nativeTemplateAppearance.f27904h != null : !textAppearance7.equals(nativeTemplateAppearance.f27904h)) {
            return false;
        }
        ImageAppearance imageAppearance = this.f27906j;
        if (imageAppearance == null ? nativeTemplateAppearance.f27906j != null : !imageAppearance.equals(nativeTemplateAppearance.f27906j)) {
            return false;
        }
        ImageAppearance imageAppearance2 = this.f27905i;
        if (imageAppearance2 == null ? nativeTemplateAppearance.f27905i != null : !imageAppearance2.equals(nativeTemplateAppearance.f27905i)) {
            return false;
        }
        ButtonAppearance buttonAppearance = this.f27907k;
        if (buttonAppearance == null ? nativeTemplateAppearance.f27907k != null : !buttonAppearance.equals(nativeTemplateAppearance.f27907k)) {
            return false;
        }
        RatingAppearance ratingAppearance = this.f27908l;
        RatingAppearance ratingAppearance2 = nativeTemplateAppearance.f27908l;
        if (ratingAppearance != null) {
            if (ratingAppearance.equals(ratingAppearance2)) {
                return true;
            }
        } else if (ratingAppearance2 == null) {
            return true;
        }
        return false;
    }

    public TextAppearance getAgeAppearance() {
        return this.f27898b;
    }

    public BannerAppearance getBannerAppearance() {
        return this.f27897a;
    }

    public TextAppearance getBodyAppearance() {
        return this.f27899c;
    }

    public ButtonAppearance getCallToActionAppearance() {
        return this.f27907k;
    }

    public TextAppearance getDomainAppearance() {
        return this.f27900d;
    }

    public ImageAppearance getFaviconAppearance() {
        return this.f27905i;
    }

    public ImageAppearance getImageAppearance() {
        return this.f27906j;
    }

    public RatingAppearance getRatingAppearance() {
        return this.f27908l;
    }

    public TextAppearance getReviewCountAppearance() {
        return this.f27901e;
    }

    public TextAppearance getSponsoredAppearance() {
        return this.f27902f;
    }

    public TextAppearance getTitleAppearance() {
        return this.f27903g;
    }

    public TextAppearance getWarningAppearance() {
        return this.f27904h;
    }

    public int hashCode() {
        BannerAppearance bannerAppearance = this.f27897a;
        int iHashCode = (bannerAppearance != null ? bannerAppearance.hashCode() : 0) * 31;
        TextAppearance textAppearance = this.f27898b;
        int iHashCode2 = (iHashCode + (textAppearance != null ? textAppearance.hashCode() : 0)) * 31;
        TextAppearance textAppearance2 = this.f27899c;
        int iHashCode3 = (iHashCode2 + (textAppearance2 != null ? textAppearance2.hashCode() : 0)) * 31;
        TextAppearance textAppearance3 = this.f27900d;
        int iHashCode4 = (iHashCode3 + (textAppearance3 != null ? textAppearance3.hashCode() : 0)) * 31;
        TextAppearance textAppearance4 = this.f27901e;
        int iHashCode5 = (iHashCode4 + (textAppearance4 != null ? textAppearance4.hashCode() : 0)) * 31;
        TextAppearance textAppearance5 = this.f27902f;
        int iHashCode6 = (iHashCode5 + (textAppearance5 != null ? textAppearance5.hashCode() : 0)) * 31;
        TextAppearance textAppearance6 = this.f27903g;
        int iHashCode7 = (iHashCode6 + (textAppearance6 != null ? textAppearance6.hashCode() : 0)) * 31;
        TextAppearance textAppearance7 = this.f27904h;
        int iHashCode8 = (iHashCode7 + (textAppearance7 != null ? textAppearance7.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance = this.f27906j;
        int iHashCode9 = (iHashCode8 + (imageAppearance != null ? imageAppearance.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance2 = this.f27905i;
        int iHashCode10 = (iHashCode9 + (imageAppearance2 != null ? imageAppearance2.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance = this.f27907k;
        int iHashCode11 = (iHashCode10 + (buttonAppearance != null ? buttonAppearance.hashCode() : 0)) * 31;
        RatingAppearance ratingAppearance = this.f27908l;
        return iHashCode11 + (ratingAppearance != null ? ratingAppearance.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f27897a, i10);
        parcel.writeParcelable(this.f27898b, i10);
        parcel.writeParcelable(this.f27899c, i10);
        parcel.writeParcelable(this.f27900d, i10);
        parcel.writeParcelable(this.f27901e, i10);
        parcel.writeParcelable(this.f27902f, i10);
        parcel.writeParcelable(this.f27903g, i10);
        parcel.writeParcelable(this.f27904h, i10);
        parcel.writeParcelable(this.f27905i, i10);
        parcel.writeParcelable(this.f27906j, i10);
        parcel.writeParcelable(this.f27907k, i10);
        parcel.writeParcelable(this.f27908l, i10);
    }
}
