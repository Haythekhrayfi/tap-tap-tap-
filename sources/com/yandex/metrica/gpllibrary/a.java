package com.yandex.metrica.gpllibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.yandex.metrica.gpllibrary.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FusedLocationProviderClient f13571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationListener f13572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationCallback f13573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Looper f13574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f13575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13576f;

    /* JADX INFO: renamed from: com.yandex.metrica.gpllibrary.a$a, reason: collision with other inner class name */
    public static class C0173a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f13577a;

        public C0173a(Context context) {
            this.f13577a = context;
        }

        public FusedLocationProviderClient a() throws Throwable {
            return new FusedLocationProviderClient(this.f13577a);
        }
    }

    public enum b {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public a(Context context, LocationListener locationListener, Looper looper, Executor executor, long j10) throws Throwable {
        this.f13571a = new C0173a(context).a();
        this.f13572b = locationListener;
        this.f13574d = looper;
        this.f13575e = executor;
        this.f13576f = j10;
        this.f13573c = new GplLocationCallback(locationListener);
    }

    @Override // com.yandex.metrica.gpllibrary.b
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(b bVar) throws Throwable {
        int i10;
        Log.d("[GplLibraryWrapper]", "startLocationUpdates");
        FusedLocationProviderClient fusedLocationProviderClient = this.f13571a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f13576f);
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 1) {
            i10 = 104;
        } else if (iOrdinal != 2) {
            i10 = iOrdinal != 3 ? 105 : 100;
        } else {
            i10 = 102;
        }
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i10), this.f13573c, this.f13574d);
    }

    @Override // com.yandex.metrica.gpllibrary.b
    public void stopLocationUpdates() throws Throwable {
        Log.d("[GplLibraryWrapper]", "stopLocationUpdates");
        this.f13571a.removeLocationUpdates(this.f13573c);
    }

    @Override // com.yandex.metrica.gpllibrary.b
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        Log.d("[GplLibraryWrapper]", "updateLastKnownLocation");
        this.f13571a.getLastLocation().addOnSuccessListener(this.f13575e, new GplOnSuccessListener(this.f13572b));
    }
}
