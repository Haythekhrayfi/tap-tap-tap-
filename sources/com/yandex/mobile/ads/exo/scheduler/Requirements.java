package com.yandex.mobile.ads.exo.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.yandex.mobile.ads.impl.da1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18728a;

    public class a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i10) {
            return new Requirements[i10];
        }
    }

    public Requirements(int i10) {
        this.f18728a = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    public final int a(Context context) {
        int i10;
        boolean zIsDeviceIdleMode;
        int intExtra;
        boolean z10;
        if (e()) {
            Object systemService = context.getSystemService("connectivity");
            Objects.requireNonNull(systemService);
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                i10 = this.f18728a & 3;
            } else {
                if (da1.f19803a >= 24) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        try {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                                z10 = true;
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (((this.f18728a & 2) != 0) && connectivityManager.isActiveNetworkMetered()) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = this.f18728a & 3;
                }
            }
        } else {
            i10 = 0;
        }
        if (c()) {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (!(intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5))) {
                i10 |= 8;
            }
        }
        if (d()) {
            Object systemService2 = context.getSystemService("power");
            Objects.requireNonNull(systemService2);
            PowerManager powerManager = (PowerManager) systemService2;
            int i11 = da1.f19803a;
            if (i11 >= 23) {
                zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
            } else {
                zIsDeviceIdleMode = i11 < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
            }
            if (!zIsDeviceIdleMode) {
                i10 |= 4;
            }
        }
        if (f()) {
            return !(context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i10 | 16 : i10;
        }
        return i10;
    }

    public final boolean c() {
        return (this.f18728a & 8) != 0;
    }

    public final boolean d() {
        return (this.f18728a & 4) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return (this.f18728a & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f18728a == ((Requirements) obj).f18728a;
    }

    public final boolean f() {
        return (this.f18728a & 16) != 0;
    }

    public final int hashCode() {
        return this.f18728a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18728a);
    }
}
