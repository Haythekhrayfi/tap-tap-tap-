package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static y f725d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f728c = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f730b;
    }

    public y(Context context, LocationManager locationManager) {
        this.f726a = context;
        this.f727b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f727b.isProviderEnabled(str)) {
                return this.f727b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }
}
