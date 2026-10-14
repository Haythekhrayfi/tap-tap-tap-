package com.yandex.mobile.ads.core.identifiers.ad.huawei;

import com.yandex.mobile.ads.impl.f8;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.x60;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g8 f18287a = new g8();

    public final f8 a(b bVar) {
        try {
            OpenDeviceIdentifierService openDeviceIdentifierServiceA = bVar.a();
            if (openDeviceIdentifierServiceA == null) {
                return null;
            }
            String oaid = openDeviceIdentifierServiceA.getOaid();
            Boolean boolValueOf = Boolean.valueOf(openDeviceIdentifierServiceA.isOaidTrackLimited());
            Objects.requireNonNull(this.f18287a);
            if (boolValueOf == null || oaid == null) {
                return null;
            }
            return new f8(oaid, boolValueOf.booleanValue());
        } catch (Exception e10) {
            x60.a(e10, "Exception during advertising info reading from Huawei ads service", new Object[0]);
            return null;
        }
    }
}
