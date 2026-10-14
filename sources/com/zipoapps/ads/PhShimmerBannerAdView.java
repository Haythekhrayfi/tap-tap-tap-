package com.zipoapps.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.ads.config.PHAdSize;
import fa.o;
import fa.u;
import fa.w;
import fa.y;
import fd.j0;
import java.util.WeakHashMap;
import ma.h;
import ma.v;
import mc.d;
import p0.e0;
import p0.m0;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class PhShimmerBannerAdView extends y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PHAdSize.SizeType f28020h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28021a;

        static {
            int[] iArr = new int[PHAdSize.SizeType.values().length];
            try {
                iArr[PHAdSize.SizeType.ADAPTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PHAdSize.SizeType.ADAPTIVE_ANCHORED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28021a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhShimmerBannerAdView(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhShimmerBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhShimmerBannerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        PHAdSize.SizeType sizeType = PHAdSize.SizeType.ADAPTIVE_ANCHORED;
        this.f28020h = sizeType;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f33517a);
        setBannerSize(PHAdSize.SizeType.values()[typedArrayObtainStyledAttributes.getInt(2, sizeType.ordinal())]);
        setAdUnitId(typedArrayObtainStyledAttributes.getString(h.f33410y.a().f33421j.f28028e == oa.b.a.ADMOB ? 0 : 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ PhShimmerBannerAdView(Context context, AttributeSet attributeSet, int i10, int i11, g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // fa.y
    public Object a(o oVar, d<? super View> dVar) {
        int i10 = a.f28021a[this.f28020h.ordinal()];
        if (i10 == 1) {
            return h.f33410y.a().f33421j.i(PHAdSize.SizeType.ADAPTIVE, (8 & 2) != 0 ? null : PHAdSize.Companion.adaptiveBanner(xc.b.c(getWidth() / getResources().getDisplayMetrics().density), getLayoutParams().height == -2 ? 0 : xc.b.c(getHeight() / getResources().getDisplayMetrics().density)), new fa.v(oVar), (8 & 8) != 0 ? false : false, (8 & 16) != 0 ? null : this.f28019g, dVar);
        }
        if (i10 != 2) {
            return h.f33410y.a().f33421j.i(this.f28020h, (8 & 2) != 0 ? null : new PHAdSize(this.f28020h, 0, 0, 6, null), new w(oVar), (8 & 8) != 0 ? false : false, (8 & 16) != 0 ? null : this.f28019g, dVar);
        }
        return h.f33410y.a().f33421j.i(PHAdSize.SizeType.ADAPTIVE_ANCHORED, (8 & 2) != 0 ? null : PHAdSize.Companion.adaptiveAnchoredBanner(xc.b.c(getWidth() / getResources().getDisplayMetrics().density)), new u(oVar), (8 & 8) != 0 ? false : false, (8 & 16) != 0 ? null : this.f28019g, dVar);
    }

    public final String getAdUnitId() {
        return this.f28019g;
    }

    @Override // fa.y
    public int getAdWidth() {
        return -2;
    }

    public final PHAdSize.SizeType getBannerSize() {
        return this.f28020h;
    }

    @Override // fa.y
    public int getMinHeight() {
        PHAdSize pHAdSize = new PHAdSize(this.f28020h, xc.b.c(getWidth() / getResources().getDisplayMetrics().density), 0, 4, null);
        Context context = getContext();
        j0.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return (int) TypedValue.applyDimension(1, pHAdSize.asAdSize(context).getHeight(), getResources().getDisplayMetrics());
    }

    public final void setAdUnitId(String str) {
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (!e0.g.b(this)) {
            this.f28019g = str;
        } else {
            xe.a.f37601c.b("Banner property is set after banner view is attached to window!", new Object[0]);
        }
    }

    public final void setBannerSize(PHAdSize.SizeType sizeType) {
        j0.i(sizeType, "value");
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (!e0.g.b(this)) {
            this.f28020h = sizeType;
        } else {
            xe.a.f37601c.b("Banner property is set after banner view is attached to window!", new Object[0]);
        }
    }
}
