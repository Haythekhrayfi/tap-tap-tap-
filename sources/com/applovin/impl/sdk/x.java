package com.applovin.impl.sdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f11425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f11426b = (LocationManager) o.au().getSystemService("location");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f11427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f11428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f11429e;

    public x(o oVar) {
        this.f11425a = oVar;
    }

    @SuppressLint({"MissingPermission"})
    private Location a(String str, String str2) {
        y yVarF;
        StringBuilder sbA;
        String str3;
        if (!com.applovin.impl.sdk.utils.h.a(str2, o.au())) {
            return null;
        }
        try {
            return this.f11426b.getLastKnownLocation(str);
        } catch (IllegalArgumentException e10) {
            e = e10;
            this.f11425a.F();
            if (y.a()) {
                yVarF = this.f11425a.F();
                sbA = android.support.v4.media.c.a("Failed to retrieve location from ", str);
                str3 = ": device does not support this location provider.";
                sbA.append(str3);
                yVarF.b("LocationManager", sbA.toString(), e);
            }
            return null;
        } catch (NullPointerException e11) {
            e = e11;
            this.f11425a.F();
            if (y.a()) {
                yVarF = this.f11425a.F();
                sbA = android.support.v4.media.c.a("Failed to retrieve location from ", str);
                str3 = ": location provider is not available.";
                sbA.append(str3);
                yVarF.b("LocationManager", sbA.toString(), e);
            }
            return null;
        } catch (SecurityException e12) {
            e = e12;
            this.f11425a.F();
            if (y.a()) {
                yVarF = this.f11425a.F();
                sbA = android.support.v4.media.c.a("Failed to retrieve location from ", str);
                str3 = ": access denied.";
                sbA.append(str3);
                yVarF.b("LocationManager", sbA.toString(), e);
            }
            return null;
        } catch (Throwable th) {
            e = th;
            this.f11425a.F();
            if (y.a()) {
                yVarF = this.f11425a.F();
                sbA = android.support.v4.media.c.a("Failed to retrieve location from ", str);
                str3 = ".";
                sbA.append(str3);
                yVarF.b("LocationManager", sbA.toString(), e);
            }
            return null;
        }
    }

    private boolean f() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f11425a.a(com.applovin.impl.sdk.c.b.eV)).longValue());
        if (this.f11429e != 0 && System.currentTimeMillis() - this.f11429e < millis) {
            return false;
        }
        Location locationA = a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (locationA == null) {
            locationA = a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (locationA == null) {
            return false;
        }
        this.f11427c = locationA.getLatitude();
        this.f11428d = locationA.getLongitude();
        this.f11429e = System.currentTimeMillis();
        return true;
    }

    public boolean a() {
        return com.applovin.impl.sdk.utils.h.a("android.permission.ACCESS_COARSE_LOCATION", o.au());
    }

    public boolean b() {
        if (com.applovin.impl.sdk.utils.h.h()) {
            return this.f11426b.isLocationEnabled();
        }
        return (com.applovin.impl.sdk.utils.h.c() && Settings.Secure.getInt(o.au().getContentResolver(), "location_mode", 0) == 0) ? false : true;
    }

    public boolean c() {
        if (this.f11425a.ay().isLocationCollectionEnabled() && ((Boolean) this.f11425a.a(com.applovin.impl.sdk.c.b.eU)).booleanValue() && a()) {
            return f() || this.f11429e != 0;
        }
        return false;
    }

    public double d() {
        return this.f11427c;
    }

    public double e() {
        return this.f11428d;
    }
}
