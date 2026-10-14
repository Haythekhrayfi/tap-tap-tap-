package com.yandex.mobile.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import com.yandex.mobile.ads.impl.f8;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.x60;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g8 f18279a = new g8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f18280b = new b();

    public final f8 a(c cVar) {
        f8 f8Var = null;
        try {
            IBinder iBinderA = cVar.a();
            if (iBinderA != null) {
                Objects.requireNonNull(this.f18280b);
                IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                a gmsServiceAdvertisingInfoReader = iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new GmsServiceAdvertisingInfoReader(iBinderA);
                String advertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
                Boolean adTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
                Objects.requireNonNull(this.f18279a);
                if (adTrackingLimited != null && advertisingId != null) {
                    f8Var = new f8(advertisingId, adTrackingLimited.booleanValue());
                }
                x60.b("Advertising ID fetched successfully", new Object[0]);
            }
        } catch (InterruptedException e10) {
            x60.a(e10, "Exception during advertising info reading from GMS service", new Object[0]);
        }
        return f8Var;
    }
}
