package com.yandex.metrica.impl.ob;

import com.applovin.sdk.AppLovinMediationProvider;

/* JADX INFO: loaded from: classes.dex */
public class Wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uc f15381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1708id f15382b;

    public enum a {
        UNKNOWN(AppLovinMediationProvider.UNKNOWN),
        FOREGROUND("fg"),
        BACKGROUND("bg"),
        VISIBLE("visible");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15388a;

        a(String str) {
            this.f15388a = str;
        }

        public static a a(E.a aVar) {
            a aVar2 = UNKNOWN;
            if (aVar == null) {
                return aVar2;
            }
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2 ? aVar2 : VISIBLE;
            }
            return BACKGROUND;
        }

        public static a a(String str) {
            a aVar = UNKNOWN;
            a[] aVarArrValues = values();
            for (int i10 = 0; i10 < 4; i10++) {
                a aVar2 = aVarArrValues[i10];
                if (aVar2.f15388a.equals(str)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        public String a() {
            return this.f15388a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f15388a;
        }
    }

    public Wc(Uc uc2, C1708id c1708id) {
        this.f15381a = uc2;
        this.f15382b = c1708id;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("LocationCollectionConfig{arguments=");
        sbA.append(this.f15381a);
        sbA.append(", preconditions=");
        sbA.append(this.f15382b);
        sbA.append('}');
        return sbA.toString();
    }
}
