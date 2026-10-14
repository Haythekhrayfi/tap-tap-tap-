package com.applovin.mediation.hybridAds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f11492a;

    public static class a extends com.applovin.impl.sdk.utils.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.c f11493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o f11494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f11495c;

        public a(com.applovin.impl.mediation.a.c cVar, o oVar, MaxAdapterListener maxAdapterListener) {
            this.f11493a = cVar;
            this.f11494b = oVar;
            this.f11495c = maxAdapterListener;
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                ((MaxHybridMRecAdActivity) activity).a(this.f11493a.v(), this.f11493a.w(), this.f11494b, this.f11495c);
            }
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.f11493a.F().get()) {
                this.f11494b.E().b(this);
            }
        }
    }

    public static class b extends com.applovin.impl.sdk.utils.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.c f11496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o f11497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f11498c;

        public b(com.applovin.impl.mediation.a.c cVar, o oVar, MaxAdapterListener maxAdapterListener) {
            this.f11496a = cVar;
            this.f11497b = oVar;
            this.f11498c = maxAdapterListener;
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                ((MaxHybridNativeAdActivity) activity).a(this.f11496a.v(), this.f11496a.getNativeAd(), this.f11497b, this.f11498c);
            }
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.f11496a.F().get()) {
                this.f11497b.E().b(this);
            }
        }
    }

    public d(o oVar) {
        this.f11492a = oVar;
    }

    public void a(com.applovin.impl.mediation.a.c cVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        Intent intent;
        w.j();
        if (activity == null) {
            activity = this.f11492a.E().a();
        }
        if (cVar.getNativeAd() != null) {
            this.f11492a.F();
            if (y.a()) {
                this.f11492a.F().b("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f11492a.E().a(new b(cVar, this.f11492a, maxAdapterListener));
            intent = new Intent(activity, (Class<?>) MaxHybridNativeAdActivity.class);
        } else {
            if (cVar.w() == null) {
                if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                    ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
                    return;
                } else {
                    if (!(maxAdapterListener instanceof MaxAppOpenAdapterListener)) {
                        throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
                    }
                    ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
                    return;
                }
            }
            this.f11492a.F();
            if (y.a()) {
                this.f11492a.F().b("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f11492a.E().a(new a(cVar, this.f11492a, maxAdapterListener));
            intent = new Intent(activity, (Class<?>) MaxHybridMRecAdActivity.class);
        }
        activity.startActivity(intent);
    }
}
