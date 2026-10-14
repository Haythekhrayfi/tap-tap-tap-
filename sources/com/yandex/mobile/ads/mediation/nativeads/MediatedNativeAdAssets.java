package com.yandex.mobile.ads.mediation.nativeads;

/* JADX INFO: loaded from: classes3.dex */
final class MediatedNativeAdAssets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MediatedNativeAdImage f27548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MediatedNativeAdImage f27549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MediatedNativeAdImage f27550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MediatedNativeAdMedia f27551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f27553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f27554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f27555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f27556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f27557n;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f27561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private MediatedNativeAdImage f27562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MediatedNativeAdImage f27563f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private MediatedNativeAdImage f27564g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private MediatedNativeAdMedia f27565h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f27566i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f27567j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f27568k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f27569l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f27570m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f27571n;

        public MediatedNativeAdAssets build() {
            return new MediatedNativeAdAssets(this);
        }

        public Builder setAge(String str) {
            this.f27558a = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f27559b = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f27560c = str;
            return this;
        }

        public Builder setDomain(String str) {
            this.f27561d = str;
            return this;
        }

        public Builder setFavicon(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f27562e = mediatedNativeAdImage;
            return this;
        }

        public Builder setIcon(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f27563f = mediatedNativeAdImage;
            return this;
        }

        public Builder setImage(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f27564g = mediatedNativeAdImage;
            return this;
        }

        public Builder setMedia(MediatedNativeAdMedia mediatedNativeAdMedia) {
            this.f27565h = mediatedNativeAdMedia;
            return this;
        }

        public Builder setPrice(String str) {
            this.f27566i = str;
            return this;
        }

        public Builder setRating(String str) {
            this.f27567j = str;
            return this;
        }

        public Builder setReviewCount(String str) {
            this.f27568k = str;
            return this;
        }

        public Builder setSponsored(String str) {
            this.f27569l = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.f27570m = str;
            return this;
        }

        public Builder setWarning(String str) {
            this.f27571n = str;
            return this;
        }
    }

    private MediatedNativeAdAssets(Builder builder) {
        this.f27544a = builder.f27558a;
        this.f27545b = builder.f27559b;
        this.f27546c = builder.f27560c;
        this.f27547d = builder.f27561d;
        this.f27548e = builder.f27562e;
        this.f27549f = builder.f27563f;
        this.f27550g = builder.f27564g;
        this.f27551h = builder.f27565h;
        this.f27552i = builder.f27566i;
        this.f27553j = builder.f27567j;
        this.f27554k = builder.f27568k;
        this.f27555l = builder.f27569l;
        this.f27556m = builder.f27570m;
        this.f27557n = builder.f27571n;
    }

    public String getAge() {
        return this.f27544a;
    }

    public String getBody() {
        return this.f27545b;
    }

    public String getCallToAction() {
        return this.f27546c;
    }

    public String getDomain() {
        return this.f27547d;
    }

    public MediatedNativeAdImage getFavicon() {
        return this.f27548e;
    }

    public MediatedNativeAdImage getIcon() {
        return this.f27549f;
    }

    public MediatedNativeAdImage getImage() {
        return this.f27550g;
    }

    public MediatedNativeAdMedia getMedia() {
        return this.f27551h;
    }

    public String getPrice() {
        return this.f27552i;
    }

    public String getRating() {
        return this.f27553j;
    }

    public String getReviewCount() {
        return this.f27554k;
    }

    public String getSponsored() {
        return this.f27555l;
    }

    public String getTitle() {
        return this.f27556m;
    }

    public String getWarning() {
        return this.f27557n;
    }
}
