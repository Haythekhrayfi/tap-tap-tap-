package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class cr {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InstreamAdBreakPosition.Type f19617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f19618c;

        public a(String str, InstreamAdBreakPosition.Type type, long j10) {
            fd.j0.i(str, "adBreakType");
            fd.j0.i(type, "adBreakPositionType");
            this.f19616a = str;
            this.f19617b = type;
            this.f19618c = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fd.j0.d(this.f19616a, aVar.f19616a) && this.f19617b == aVar.f19617b && this.f19618c == aVar.f19618c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f19618c) + ((this.f19617b.hashCode() + (this.f19616a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = v60.a("AdBreakSignature(adBreakType=");
            sbA.append(this.f19616a);
            sbA.append(", adBreakPositionType=");
            sbA.append(this.f19617b);
            sbA.append(", adBreakPositionValue=");
            return o2.a.a(sbA, this.f19618c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static ArrayList a(ArrayList arrayList) {
        fd.j0.i(arrayList, "adBreaks");
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            w50 w50Var = (w50) obj;
            String type = w50Var.getType();
            fd.j0.h(type, "it.type");
            InstreamAdBreakPosition.Type positionType = w50Var.getAdBreakPosition().getPositionType();
            fd.j0.h(positionType, "it.adBreakPosition.positionType");
            if (hashSet.add(new a(type, positionType, w50Var.getAdBreakPosition().getValue()))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
