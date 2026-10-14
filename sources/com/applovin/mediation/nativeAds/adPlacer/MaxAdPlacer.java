package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.nativeAds.a.a;
import com.applovin.impl.mediation.nativeAds.a.b;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdPlacer implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f11547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MaxNativeAdViewBinder f11548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f11549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f11550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Listener f11551e;
    public final y logger;
    public final o sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i10);

        void onAdRemoved(int i10);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f11547a = AppLovinSdkUtils.Size.ZERO;
        o oVarA = appLovinSdk.a();
        this.sdk = oVarA;
        y yVarF = oVarA.F();
        this.logger = yVarF;
        this.f11549c = new a(maxAdPlacerSettings);
        this.f11550d = new b(maxAdPlacerSettings, context, this);
        if (y.a()) {
            yVarF.b("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    private void a() {
        int iA;
        while (this.f11550d.b() && (iA = this.f11549c.a()) != -1) {
            if (y.a()) {
                this.logger.b("MaxAdPlacer", "Placing ad at position: " + iA);
            }
            this.f11549c.a(this.f11550d.d(), iA);
            Listener listener = this.f11551e;
            if (listener != null) {
                listener.onAdLoaded(iA);
            }
        }
    }

    private void a(Collection<Integer> collection, Runnable runnable) {
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            this.f11550d.a(this.f11549c.c(it.next().intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (y.a()) {
            y yVar = this.logger;
            StringBuilder sbA = defpackage.a.a("Removed ");
            sbA.append(collection.size());
            sbA.append(" ads from stream: ");
            sbA.append(collection);
            yVar.b("MaxAdPlacer", sbA.toString());
        }
        if (this.f11551e != null) {
            Iterator<Integer> it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f11551e.onAdRemoved(it2.next().intValue());
            }
        }
    }

    public void clearAds() {
        a(this.f11549c.b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.1
            @Override // java.lang.Runnable
            public void run() {
                y yVar = MaxAdPlacer.this.logger;
                if (y.a()) {
                    MaxAdPlacer.this.logger.b("MaxAdPlacer", "Clearing all cached ads");
                }
                MaxAdPlacer.this.f11549c.c();
                MaxAdPlacer.this.f11550d.e();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i10) {
        final Collection<Integer> collectionD = this.f11549c.d(i10);
        if (!collectionD.isEmpty()) {
            a(collectionD, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.2
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxAdPlacer.this.logger;
                    if (y.a()) {
                        y yVar2 = MaxAdPlacer.this.logger;
                        StringBuilder sbA = defpackage.a.a("Clearing trailing ads after position ");
                        sbA.append(i10);
                        yVar2.b("MaxAdPlacer", sbA.toString());
                    }
                    MaxAdPlacer.this.f11549c.a(collectionD);
                }
            });
        }
        return collectionD;
    }

    public void destroy() {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f11550d.a();
    }

    public long getAdItemId(int i10) {
        if (isFilledPosition(i10)) {
            return -System.identityHashCode(this.f11549c.c(i10));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i10, int i11) {
        if (isFilledPosition(i10)) {
            AppLovinSdkUtils.Size size = this.f11547a;
            boolean z10 = size != AppLovinSdkUtils.Size.ZERO;
            int iMin = Math.min(z10 ? size.getWidth() : 360, i11);
            d dVar = (d) this.f11549c.c(i10);
            if ("small_template_1".equalsIgnoreCase(dVar.J())) {
                return new AppLovinSdkUtils.Size(iMin, z10 ? this.f11547a.getHeight() : 120);
            }
            if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(dVar.J())) {
                return new AppLovinSdkUtils.Size(iMin, (int) (((double) iMin) / (z10 ? ((double) this.f11547a.getWidth()) / ((double) this.f11547a.getHeight()) : 1.2d)));
            }
            if (z10) {
                return this.f11547a;
            }
            if (dVar.I() != null) {
                View mainView = dVar.I().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i10) {
        return this.f11549c.e(i10);
    }

    public int getAdjustedPosition(int i10) {
        return this.f11549c.f(i10);
    }

    public int getOriginalPosition(int i10) {
        return this.f11549c.g(i10);
    }

    public void insertItem(int i10) {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Inserting item at position: " + i10);
        }
        this.f11549c.h(i10);
    }

    public boolean isAdPosition(int i10) {
        return this.f11549c.a(i10);
    }

    public boolean isFilledPosition(int i10) {
        return this.f11549c.b(i10);
    }

    public void loadAds() {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Loading ads");
        }
        this.f11550d.c();
    }

    public void moveItem(int i10, int i11) {
        this.f11549c.b(i10, i11);
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f11551e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f11551e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (y.a()) {
            this.logger.e("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onNativeAdLoaded() {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(final int i10) {
        a(isFilledPosition(i10) ? Collections.singletonList(Integer.valueOf(i10)) : Collections.emptyList(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.3
            @Override // java.lang.Runnable
            public void run() {
                y yVar = MaxAdPlacer.this.logger;
                if (y.a()) {
                    y yVar2 = MaxAdPlacer.this.logger;
                    StringBuilder sbA = defpackage.a.a("Removing item at position: ");
                    sbA.append(i10);
                    yVar2.b("MaxAdPlacer", sbA.toString());
                }
                MaxAdPlacer.this.f11549c.i(i10);
            }
        });
    }

    public void renderAd(int i10, ViewGroup viewGroup) {
        y yVar;
        StringBuilder sb2;
        String str;
        MaxAd maxAdC = this.f11549c.c(i10);
        if (maxAdC == null) {
            if (y.a()) {
                this.logger.b("MaxAdPlacer", "An ad is not available for position: " + i10);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewI = ((d) maxAdC).I();
        if (maxNativeAdViewI == null) {
            if (this.f11548b == null) {
                if (y.a()) {
                    this.logger.e("MaxAdPlacer", "Unable to render ad at position: " + i10 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewI = new MaxNativeAdView(this.f11548b, viewGroup.getContext());
            if (this.f11550d.a(maxNativeAdViewI, maxAdC)) {
                if (y.a()) {
                    yVar = this.logger;
                    sb2 = new StringBuilder();
                    str = "Rendered ad at position: ";
                    sb2.append(str);
                    sb2.append(i10);
                    yVar.b("MaxAdPlacer", sb2.toString());
                }
            } else if (y.a()) {
                this.logger.e("MaxAdPlacer", "Unable to render ad at position: " + i10);
            }
        } else if (y.a()) {
            yVar = this.logger;
            sb2 = new StringBuilder();
            str = "Using pre-rendered ad at position: ";
            sb2.append(str);
            sb2.append(i10);
            yVar.b("MaxAdPlacer", sb2.toString());
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewI.getParent() != null) {
            ((ViewGroup) maxNativeAdViewI.getParent()).removeView(maxNativeAdViewI);
        }
        viewGroup.addView(maxNativeAdViewI, -1, -1);
    }

    public void setAdSize(int i10, int i11) {
        this.f11547a = new AppLovinSdkUtils.Size(i10, i11);
    }

    public void setListener(Listener listener) {
        this.f11551e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f11548b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i10, int i11) {
        this.f11549c.a(i10, i11);
        if (i10 == -1 || i11 == -1) {
            return;
        }
        a();
    }
}
