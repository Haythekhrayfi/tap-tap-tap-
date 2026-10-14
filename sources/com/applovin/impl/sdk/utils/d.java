package com.applovin.impl.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f11187a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f11188b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collection<CountDownLatch> f11189c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f11190d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f11191e = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11193b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EnumC0144a f11194c = EnumC0144a.NOT_SET;

        /* JADX INFO: renamed from: com.applovin.impl.sdk.utils.d$a$a, reason: collision with other inner class name */
        public enum EnumC0144a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f11199d;

            EnumC0144a(String str) {
                this.f11199d = str;
            }

            public String a() {
                return this.f11199d;
            }
        }

        public void a(EnumC0144a enumC0144a) {
            this.f11194c = enumC0144a;
        }

        public void a(String str) {
            this.f11193b = str;
        }

        public void a(boolean z10) {
            this.f11192a = z10;
        }

        public boolean a() {
            return this.f11192a;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f11193b;
        }

        public EnumC0144a c() {
            return this.f11194c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || a() != aVar.a()) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            EnumC0144a enumC0144aC = c();
            EnumC0144a enumC0144aC2 = aVar.c();
            return enumC0144aC != null ? enumC0144aC.equals(enumC0144aC2) : enumC0144aC2 == null;
        }

        public int hashCode() {
            int i10 = a() ? 79 : 97;
            String strB = b();
            int iHashCode = ((i10 + 59) * 59) + (strB == null ? 43 : strB.hashCode());
            EnumC0144a enumC0144aC = c();
            return (iHashCode * 59) + (enumC0144aC != null ? enumC0144aC.hashCode() : 43);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=");
            sbA.append(a());
            sbA.append(", advertisingId=");
            sbA.append(b());
            sbA.append(", dntCode=");
            sbA.append(c());
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static a a(Context context) {
        return b(context);
    }

    public static boolean a() {
        return w.b("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    private static a b(Context context) {
        a aVar;
        HashSet hashSet;
        w.i();
        Object obj = f11188b;
        synchronized (obj) {
            if (f11190d) {
                return f11191e;
            }
            Collection<CountDownLatch> collection = f11189c;
            boolean zIsEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (zIsEmpty) {
                a aVarC = c(context);
                synchronized (obj) {
                    f11190d = true;
                    f11191e = aVarC;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                    com.applovin.impl.sdk.y.j("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e10) {
                com.applovin.impl.sdk.y.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e10);
            }
            synchronized (f11188b) {
                aVar = f11191e;
            }
            return aVar;
        }
    }

    private static a c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new a() : aVarCollectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        String str;
        if (f11187a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z10);
                aVar.a(z10 ? a.EnumC0144a.ON : a.EnumC0144a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e10) {
                e = e10;
                str = "Unable to determine if Fire OS limited ad tracking is turned on";
                com.applovin.impl.sdk.y.c("DataCollector", str, e);
                f11187a = false;
                return null;
            } catch (Throwable th) {
                e = th;
                str = "Unable to collect Fire OS IDFA";
                com.applovin.impl.sdk.y.c("DataCollector", str, e);
                f11187a = false;
                return null;
            }
        }
        f11187a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        w.i();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.y.j("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(zIsLimitAdTrackingEnabled);
            aVar.a(zIsLimitAdTrackingEnabled ? a.EnumC0144a.ON : a.EnumC0144a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.y.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }
}
