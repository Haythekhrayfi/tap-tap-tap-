package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2089xg {
    private int a(Integer num, String str) {
        if (num.intValue() < 100) {
            AbstractC2145zm.b(str).c("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to %d, but was: %d. Default value (%d) will be used", 100, num, 100);
            return 100;
        }
        if (num.intValue() <= 10000) {
            return num.intValue();
        }
        AbstractC2145zm.b(str).c("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to %d, but was: %d. Default value (%d) will be used", 10000, num, 10000);
        return 10000;
    }

    public com.yandex.metrica.f a(com.yandex.metrica.f fVar) {
        if (!U2.a(fVar.maxReportsInDatabaseCount)) {
            return fVar;
        }
        com.yandex.metrica.f.a aVar = new com.yandex.metrica.f.a(fVar.apiKey);
        if (U2.a(fVar.sessionTimeout)) {
            aVar.f13562a.withSessionTimeout(fVar.sessionTimeout.intValue());
        }
        if (U2.a(fVar.logs) && fVar.logs.booleanValue()) {
            aVar.f13562a.withLogs();
        }
        if (U2.a(fVar.statisticsSending)) {
            aVar.f13562a.withStatisticsSending(fVar.statisticsSending.booleanValue());
        }
        if (U2.a(fVar.maxReportsInDatabaseCount)) {
            aVar.f13562a.withMaxReportsInDatabaseCount(fVar.maxReportsInDatabaseCount.intValue());
        }
        if (U2.a(fVar.f13559a)) {
            aVar.f13564c = Integer.valueOf(fVar.f13559a.intValue());
        }
        if (U2.a(fVar.f13560b)) {
            aVar.f13563b = Integer.valueOf(fVar.f13560b.intValue());
        }
        if (U2.a((Object) fVar.f13561c)) {
            for (Map.Entry<String, String> entry : fVar.f13561c.entrySet()) {
                aVar.f13565d.put(entry.getKey(), entry.getValue());
            }
        }
        if (U2.a((Object) fVar.userProfileID)) {
            aVar.f13562a.withUserProfileID(fVar.userProfileID);
        }
        aVar.f13562a.withMaxReportsInDatabaseCount(a(fVar.maxReportsInDatabaseCount, fVar.apiKey));
        return new com.yandex.metrica.f(aVar);
    }

    public com.yandex.metrica.j a(com.yandex.metrica.j jVar) {
        if (!U2.a(jVar.maxReportsInDatabaseCount)) {
            return jVar;
        }
        com.yandex.metrica.j.b bVarA = com.yandex.metrica.j.a(jVar);
        bVarA.f18080c = new ArrayList();
        if (U2.a((Object) jVar.f18066a)) {
            bVarA.f18079b = jVar.f18066a;
        }
        if (U2.a((Object) jVar.f18067b) && U2.a(jVar.f18074i)) {
            Map<String, String> map = jVar.f18067b;
            bVarA.f18087j = jVar.f18074i;
            bVarA.f18082e = map;
        }
        if (U2.a(jVar.f18070e)) {
            bVarA.a(jVar.f18070e.intValue());
        }
        if (U2.a(jVar.f18071f)) {
            bVarA.f18084g = Integer.valueOf(jVar.f18071f.intValue());
        }
        if (U2.a(jVar.f18072g)) {
            bVarA.f18085h = Integer.valueOf(jVar.f18072g.intValue());
        }
        if (U2.a((Object) jVar.f18068c)) {
            bVarA.f18083f = jVar.f18068c;
        }
        if (U2.a((Object) jVar.f18073h)) {
            for (Map.Entry<String, String> entry : jVar.f18073h.entrySet()) {
                bVarA.f18086i.put(entry.getKey(), entry.getValue());
            }
        }
        if (U2.a(jVar.f18075j)) {
            bVarA.f18088k = Boolean.valueOf(jVar.f18075j.booleanValue());
        }
        if (U2.a((Object) jVar.f18069d)) {
            bVarA.f18080c = jVar.f18069d;
        }
        if (U2.a(jVar.f18076k)) {
            bVarA.f18089l = Boolean.valueOf(jVar.f18076k.booleanValue());
        }
        bVarA.f18078a.withMaxReportsInDatabaseCount(a(jVar.maxReportsInDatabaseCount, jVar.apiKey));
        return bVarA.b();
    }
}
