package y4;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzij;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import z4.f;

/* JADX INFO: loaded from: classes2.dex */
public class b implements y4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile y4.a f38078c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final AppMeasurementSdk f38079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final Map f38080b;

    public class a implements y4.a.InterfaceC0466a {
        public a(b bVar, String str) {
        }
    }

    public b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f38079a = appMeasurementSdk;
        this.f38080b = new ConcurrentHashMap();
    }

    @Override // y4.a
    @KeepForSdk
    public Map<String, Object> a(boolean z10) {
        return this.f38079a.getUserProperties(null, null, z10);
    }

    @Override // y4.a
    @KeepForSdk
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (z4.b.c(str) && z4.b.b(str2, bundle) && z4.b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f38079a.logEvent(str, str2, bundle);
        }
    }

    @Override // y4.a
    @KeepForSdk
    public int c(String str) {
        return this.f38079a.getMaxUserProperties(str);
    }

    @Override // y4.a
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f38079a.clearConditionalUserProperty(str, null, null);
    }

    @Override // y4.a
    @KeepForSdk
    public List<y4.a.c> d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f38079a.getConditionalUserProperties(str, str2)) {
            Set set = z4.b.f45018a;
            Preconditions.checkNotNull(bundle);
            y4.a.c cVar = new y4.a.c();
            cVar.f38063a = (String) Preconditions.checkNotNull((String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null));
            cVar.f38064b = (String) Preconditions.checkNotNull((String) zzgu.zza(bundle, "name", String.class, null));
            cVar.f38065c = zzgu.zza(bundle, "value", Object.class, null);
            cVar.f38066d = (String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            cVar.f38067e = ((Long) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            cVar.f38068f = (String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            cVar.f38069g = (Bundle) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            cVar.f38070h = (String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            cVar.f38071i = (Bundle) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            cVar.f38072j = ((Long) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            cVar.f38073k = (String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            cVar.f38074l = (Bundle) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            cVar.f38076n = ((Boolean) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f38075m = ((Long) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            cVar.f38077o = ((Long) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // y4.a
    @KeepForSdk
    public void e(y4.a.c cVar) {
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        Set set = z4.b.f45018a;
        boolean z10 = false;
        if (cVar != null && (str = cVar.f38063a) != null && !str.isEmpty() && (((obj = cVar.f38065c) == null || zzij.zza(obj) != null) && z4.b.c(str) && z4.b.d(str, cVar.f38064b) && (((str2 = cVar.f38073k) == null || (z4.b.b(str2, cVar.f38074l) && z4.b.a(str, cVar.f38073k, cVar.f38074l))) && (((str3 = cVar.f38070h) == null || (z4.b.b(str3, cVar.f38071i) && z4.b.a(str, cVar.f38070h, cVar.f38071i))) && ((str4 = cVar.f38068f) == null || (z4.b.b(str4, cVar.f38069g) && z4.b.a(str, cVar.f38068f, cVar.f38069g))))))) {
            z10 = true;
        }
        if (z10) {
            AppMeasurementSdk appMeasurementSdk = this.f38079a;
            Bundle bundle = new Bundle();
            String str5 = cVar.f38063a;
            if (str5 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str5);
            }
            String str6 = cVar.f38064b;
            if (str6 != null) {
                bundle.putString("name", str6);
            }
            Object obj2 = cVar.f38065c;
            if (obj2 != null) {
                zzgu.zzb(bundle, obj2);
            }
            String str7 = cVar.f38066d;
            if (str7 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cVar.f38067e);
            String str8 = cVar.f38068f;
            if (str8 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
            }
            Bundle bundle2 = cVar.f38069g;
            if (bundle2 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
            }
            String str9 = cVar.f38070h;
            if (str9 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
            }
            Bundle bundle3 = cVar.f38071i;
            if (bundle3 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cVar.f38072j);
            String str10 = cVar.f38073k;
            if (str10 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
            }
            Bundle bundle4 = cVar.f38074l;
            if (bundle4 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cVar.f38075m);
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, cVar.f38076n);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cVar.f38077o);
            appMeasurementSdk.setConditionalUserProperty(bundle);
        }
    }

    @Override // y4.a
    @KeepForSdk
    public y4.a.InterfaceC0466a f(String str, y4.a.b bVar) {
        Object fVar;
        Preconditions.checkNotNull(bVar);
        if (!z4.b.c(str)) {
            return null;
        }
        if ((str.isEmpty() || !this.f38080b.containsKey(str) || this.f38080b.get(str) == null) ? false : true) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f38079a;
        if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
            fVar = new z4.d(appMeasurementSdk, bVar);
        } else {
            fVar = (AppMeasurement.CRASH_ORIGIN.equals(str) || "clx".equals(str)) ? new f(appMeasurementSdk, bVar) : null;
        }
        if (fVar == null) {
            return null;
        }
        this.f38080b.put(str, fVar);
        return new a(this, str);
    }

    @Override // y4.a
    @KeepForSdk
    public void g(String str, String str2, Object obj) {
        if (z4.b.c(str) && z4.b.d(str, str2)) {
            this.f38079a.setUserProperty(str, str2, obj);
        }
    }
}
