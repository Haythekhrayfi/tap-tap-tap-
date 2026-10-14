package com.zipoapps.blytics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public abstract ka.a a(String str, String str2);

    public ka.a b(ka.a aVar) {
        return a(aVar.f31957a, aVar.f31958b);
    }

    public ka.a c(ka.a aVar) {
        ka.a aVarB = b(aVar);
        if (aVarB == null) {
            aVarB = new ka.a(aVar.f31957a, aVar.f31958b, aVar.f31959c);
        }
        aVarB.f31961e = System.currentTimeMillis();
        aVarB.f31960d++;
        e(aVarB);
        aVar.b(aVarB.f31960d);
        return aVar;
    }

    public ka.a d(ka.a aVar) {
        ka.a aVarB = b(aVar);
        if (aVarB == null) {
            aVarB = new ka.a(aVar.f31957a, aVar.f31958b, aVar.f31959c);
        }
        aVarB.b(0);
        e(aVarB);
        aVar.b(aVarB.f31960d);
        return aVar;
    }

    public abstract void e(ka.a aVar);
}
