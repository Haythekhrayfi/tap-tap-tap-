package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.yandex.metrica.DoNotInline;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(28)
@DoNotInline
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f14020a = new G();

    public static final class a<T, R> implements Wm<UsageStatsManager, H.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D f14021a;

        public a(D d10) {
            this.f14021a = d10;
        }

        @Override // com.yandex.metrica.impl.ob.Wm
        public H.a a(UsageStatsManager usageStatsManager) {
            D d10 = this.f14021a;
            int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
            Objects.requireNonNull(d10);
            if (U2.a(28)) {
                if (U2.a(30) && appStandbyBucket == 45) {
                    return H.a.RESTRICTED;
                }
                if (appStandbyBucket == 10) {
                    return H.a.ACTIVE;
                }
                if (appStandbyBucket == 20) {
                    return H.a.WORKING_SET;
                }
                if (appStandbyBucket == 30) {
                    return H.a.FREQUENT;
                }
                if (appStandbyBucket == 40) {
                    return H.a.RARE;
                }
            }
            return null;
        }
    }

    public static final class b<T, R> implements Wm<ActivityManager, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14022a = new b();

        @Override // com.yandex.metrica.impl.ob.Wm
        public Boolean a(ActivityManager activityManager) {
            return Boolean.valueOf(activityManager.isBackgroundRestricted());
        }
    }

    private G() {
    }

    public static final H a(Context context, D d10) {
        return new H((H.a) U2.a(new a(d10), context, "usagestats", "getting app standby bucket", "usageStatsManager"), (Boolean) U2.a(b.f14022a, context, "activity", "getting is background restricted", "activityManager"));
    }
}
