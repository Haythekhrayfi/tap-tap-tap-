package com.zipoapps.ads.config;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import bd.e;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdSize;
import defpackage.a;
import fd.j0;
import h0.f;
import vc.g;
import xc.b;

/* JADX INFO: loaded from: classes3.dex */
public final class PHAdSize {
    public static final PHAdSize BANNER;
    public static final Companion Companion = new Companion(null);
    public static final PHAdSize FLUID;
    public static final PHAdSize FULL_BANNER;
    public static final PHAdSize LARGE_BANNER;
    public static final PHAdSize LEADERBOARD;
    public static final PHAdSize MEDIUM_RECTANGLE;
    public static final PHAdSize WIDE_SKYSCRAPER;
    private final int height;
    private final SizeType sizeType;
    private final int width;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ PHAdSize adaptiveBanner$default(Companion companion, int i10, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return companion.adaptiveBanner(i10, i11);
        }

        public static PHAdSize adaptiveBanner$default(Companion companion, Activity activity, int i10, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                j0.i(activity, "activity");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                i10 = b.c(displayMetrics.widthPixels / displayMetrics.density);
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return companion.adaptiveBanner(activity, i10, i11);
        }

        public static /* synthetic */ PHAdSize adaptiveBanner$default(Companion companion, Activity activity, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return companion.adaptiveBanner(activity, i10);
        }

        public final PHAdSize adaptiveAnchoredBanner(int i10) {
            return new PHAdSize(SizeType.ADAPTIVE_ANCHORED, i10, 0, 4, null);
        }

        public final PHAdSize adaptiveAnchoredBanner(Activity activity) {
            j0.i(activity, "activity");
            SizeType sizeType = SizeType.ADAPTIVE_ANCHORED;
            j0.i(activity, "activity");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return new PHAdSize(sizeType, b.c(displayMetrics.widthPixels / displayMetrics.density), 0, 4, null);
        }

        public final PHAdSize adaptiveBanner(int i10, int i11) {
            return new PHAdSize(SizeType.ADAPTIVE, i10, i11);
        }

        public final PHAdSize adaptiveBanner(Activity activity) {
            j0.i(activity, "activity");
            return adaptiveBanner$default(this, activity, 0, 2, (Object) null);
        }

        public final PHAdSize adaptiveBanner(Activity activity, int i10) {
            j0.i(activity, "activity");
            SizeType sizeType = SizeType.ADAPTIVE;
            j0.i(activity, "activity");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return new PHAdSize(sizeType, b.c(displayMetrics.widthPixels / displayMetrics.density), i10);
        }

        public final PHAdSize adaptiveBanner(Activity activity, int i10, int i11) {
            j0.i(activity, "activity");
            return new PHAdSize(SizeType.ADAPTIVE, i10, i11);
        }
    }

    public enum SizeType {
        BANNER,
        FULL_BANNER,
        LARGE_BANNER,
        LEADERBOARD,
        MEDIUM_RECTANGLE,
        WIDE_SKYSCRAPER,
        FLUID,
        ADAPTIVE,
        ADAPTIVE_ANCHORED
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SizeType.values().length];
            try {
                iArr[SizeType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SizeType.FULL_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SizeType.LARGE_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SizeType.LEADERBOARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SizeType.MEDIUM_RECTANGLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SizeType.WIDE_SKYSCRAPER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SizeType.FLUID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SizeType.ADAPTIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SizeType.ADAPTIVE_ANCHORED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i10 = 0;
        BANNER = new PHAdSize(SizeType.BANNER, i10, 0, 6, null);
        int i11 = 0;
        FULL_BANNER = new PHAdSize(SizeType.FULL_BANNER, i11, 0, 6, null);
        int i12 = 0;
        int i13 = 6;
        g gVar = null;
        LARGE_BANNER = new PHAdSize(SizeType.LARGE_BANNER, i12, i10, i13, gVar);
        int i14 = 0;
        int i15 = 6;
        g gVar2 = null;
        LEADERBOARD = new PHAdSize(SizeType.LEADERBOARD, i14, i11, i15, gVar2);
        MEDIUM_RECTANGLE = new PHAdSize(SizeType.MEDIUM_RECTANGLE, i12, i10, i13, gVar);
        WIDE_SKYSCRAPER = new PHAdSize(SizeType.WIDE_SKYSCRAPER, i14, i11, i15, gVar2);
        FLUID = new PHAdSize(SizeType.FLUID, i12, i10, i13, gVar);
    }

    public PHAdSize(SizeType sizeType, int i10, int i11) {
        j0.i(sizeType, "sizeType");
        this.sizeType = sizeType;
        this.width = i10;
        this.height = i11;
    }

    public /* synthetic */ PHAdSize(SizeType sizeType, int i10, int i11, int i12, g gVar) {
        this(sizeType, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11);
    }

    public static final PHAdSize adaptiveAnchoredBanner(int i10) {
        return Companion.adaptiveAnchoredBanner(i10);
    }

    public static final PHAdSize adaptiveAnchoredBanner(Activity activity) {
        return Companion.adaptiveAnchoredBanner(activity);
    }

    public static final PHAdSize adaptiveBanner(int i10, int i11) {
        return Companion.adaptiveBanner(i10, i11);
    }

    public static final PHAdSize adaptiveBanner(Activity activity) {
        return Companion.adaptiveBanner(activity);
    }

    public static final PHAdSize adaptiveBanner(Activity activity, int i10) {
        return Companion.adaptiveBanner(activity, i10);
    }

    public static final PHAdSize adaptiveBanner(Activity activity, int i10, int i11) {
        return Companion.adaptiveBanner(activity, i10, i11);
    }

    private final AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        float f10;
        float f11;
        float f12;
        if (i10 <= 655) {
            if (i10 > 632) {
                f10 = 81.0f;
            } else if (i10 > 526) {
                f11 = i10 / 468.0f;
                f12 = 60.0f;
            } else {
                f10 = i10 > 432 ? 68.0f : i10 / 6.5f;
            }
            int iC = b.c(f10);
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            context.getResources().getConfiguration();
            return new AdSize(i10, e.e(iC, 50, b.c(displayMetrics.heightPixels / displayMetrics.density)));
        }
        f11 = i10 / 728.0f;
        f12 = 90.0f;
        f10 = f11 * f12;
        int iC2 = b.c(f10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        context.getResources().getConfiguration();
        return new AdSize(i10, e.e(iC2, 50, b.c(displayMetrics2.heightPixels / displayMetrics2.density)));
    }

    public final AdSize asAdSize(Context context) {
        AdSize inlineAdaptiveBannerAdSize;
        String str;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        switch (WhenMappings.$EnumSwitchMapping$0[this.sizeType.ordinal()]) {
            case 1:
                inlineAdaptiveBannerAdSize = AdSize.BANNER;
                str = "BANNER";
                break;
            case 2:
                inlineAdaptiveBannerAdSize = AdSize.FULL_BANNER;
                str = "FULL_BANNER";
                break;
            case 3:
                inlineAdaptiveBannerAdSize = AdSize.LARGE_BANNER;
                str = "LARGE_BANNER";
                break;
            case 4:
                inlineAdaptiveBannerAdSize = AdSize.LEADERBOARD;
                str = "LEADERBOARD";
                break;
            case 5:
                inlineAdaptiveBannerAdSize = AdSize.MEDIUM_RECTANGLE;
                str = "MEDIUM_RECTANGLE";
                break;
            case 6:
                inlineAdaptiveBannerAdSize = AdSize.WIDE_SKYSCRAPER;
                str = "WIDE_SKYSCRAPER";
                break;
            case 7:
                inlineAdaptiveBannerAdSize = AdSize.FLUID;
                str = "FLUID";
                break;
            case 8:
                int i10 = this.height;
                inlineAdaptiveBannerAdSize = i10 > 0 ? AdSize.getInlineAdaptiveBannerAdSize(this.width, i10) : AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, this.width);
                str = "{\n                if (he…          }\n            }";
                break;
            case 9:
                inlineAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, this.width);
                str = "{\n                AdSize…ext, width)\n            }";
                break;
            default:
                throw new jc.g();
        }
        j0.h(inlineAdaptiveBannerAdSize, str);
        return inlineAdaptiveBannerAdSize;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PHAdSize) {
            PHAdSize pHAdSize = (PHAdSize) obj;
            if (pHAdSize.sizeType == this.sizeType && pHAdSize.width == this.width && pHAdSize.height == this.height) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.height;
    }

    public final SizeType getSizeType() {
        return this.sizeType;
    }

    public final int getWidth() {
        return this.width;
    }

    public String toString() {
        StringBuilder sbA = a.a("SizeType:[");
        sbA.append(this.sizeType.name());
        sbA.append("] Dimensions: [");
        sbA.append(this.width);
        sbA.append('x');
        return f.a(sbA, this.height, ']');
    }
}
