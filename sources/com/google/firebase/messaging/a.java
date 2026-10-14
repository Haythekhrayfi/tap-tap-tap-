package com.google.firebase.messaging;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements q5.e<e6.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12613a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q5.d f12614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q5.d f12615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q5.d f12616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q5.d f12617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q5.d f12618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q5.d f12619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q5.d f12620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q5.d f12621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q5.d f12622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q5.d f12623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q5.d f12624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q5.d f12625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q5.d f12626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q5.d f12627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q5.d f12628p;

    static {
        t5.a aVar = new t5.a();
        aVar.f35679a = 1;
        t5.d dVarA = aVar.a();
        HashMap map = new HashMap();
        map.put(dVarA.annotationType(), dVarA);
        f12614b = new q5.d("projectNumber", com.google.android.datatransport.runtime.a.a(map), null);
        t5.a aVar2 = new t5.a();
        aVar2.f35679a = 2;
        t5.d dVarA2 = aVar2.a();
        HashMap map2 = new HashMap();
        map2.put(dVarA2.annotationType(), dVarA2);
        f12615c = new q5.d("messageId", com.google.android.datatransport.runtime.a.a(map2), null);
        t5.a aVar3 = new t5.a();
        aVar3.f35679a = 3;
        t5.d dVarA3 = aVar3.a();
        HashMap map3 = new HashMap();
        map3.put(dVarA3.annotationType(), dVarA3);
        f12616d = new q5.d("instanceId", com.google.android.datatransport.runtime.a.a(map3), null);
        t5.a aVar4 = new t5.a();
        aVar4.f35679a = 4;
        t5.d dVarA4 = aVar4.a();
        HashMap map4 = new HashMap();
        map4.put(dVarA4.annotationType(), dVarA4);
        f12617e = new q5.d("messageType", com.google.android.datatransport.runtime.a.a(map4), null);
        t5.a aVar5 = new t5.a();
        aVar5.f35679a = 5;
        t5.d dVarA5 = aVar5.a();
        HashMap map5 = new HashMap();
        map5.put(dVarA5.annotationType(), dVarA5);
        f12618f = new q5.d("sdkPlatform", com.google.android.datatransport.runtime.a.a(map5), null);
        t5.a aVar6 = new t5.a();
        aVar6.f35679a = 6;
        t5.d dVarA6 = aVar6.a();
        HashMap map6 = new HashMap();
        map6.put(dVarA6.annotationType(), dVarA6);
        f12619g = new q5.d("packageName", com.google.android.datatransport.runtime.a.a(map6), null);
        t5.a aVar7 = new t5.a();
        aVar7.f35679a = 7;
        t5.d dVarA7 = aVar7.a();
        HashMap map7 = new HashMap();
        map7.put(dVarA7.annotationType(), dVarA7);
        f12620h = new q5.d("collapseKey", com.google.android.datatransport.runtime.a.a(map7), null);
        t5.a aVar8 = new t5.a();
        aVar8.f35679a = 8;
        t5.d dVarA8 = aVar8.a();
        HashMap map8 = new HashMap();
        map8.put(dVarA8.annotationType(), dVarA8);
        f12621i = new q5.d("priority", com.google.android.datatransport.runtime.a.a(map8), null);
        t5.a aVar9 = new t5.a();
        aVar9.f35679a = 9;
        t5.d dVarA9 = aVar9.a();
        HashMap map9 = new HashMap();
        map9.put(dVarA9.annotationType(), dVarA9);
        f12622j = new q5.d("ttl", com.google.android.datatransport.runtime.a.a(map9), null);
        t5.a aVar10 = new t5.a();
        aVar10.f35679a = 10;
        t5.d dVarA10 = aVar10.a();
        HashMap map10 = new HashMap();
        map10.put(dVarA10.annotationType(), dVarA10);
        f12623k = new q5.d("topic", com.google.android.datatransport.runtime.a.a(map10), null);
        t5.a aVar11 = new t5.a();
        aVar11.f35679a = 11;
        t5.d dVarA11 = aVar11.a();
        HashMap map11 = new HashMap();
        map11.put(dVarA11.annotationType(), dVarA11);
        f12624l = new q5.d("bulkId", com.google.android.datatransport.runtime.a.a(map11), null);
        t5.a aVar12 = new t5.a();
        aVar12.f35679a = 12;
        t5.d dVarA12 = aVar12.a();
        HashMap map12 = new HashMap();
        map12.put(dVarA12.annotationType(), dVarA12);
        f12625m = new q5.d("event", com.google.android.datatransport.runtime.a.a(map12), null);
        t5.a aVar13 = new t5.a();
        aVar13.f35679a = 13;
        t5.d dVarA13 = aVar13.a();
        HashMap map13 = new HashMap();
        map13.put(dVarA13.annotationType(), dVarA13);
        f12626n = new q5.d("analyticsLabel", com.google.android.datatransport.runtime.a.a(map13), null);
        t5.a aVar14 = new t5.a();
        aVar14.f35679a = 14;
        t5.d dVarA14 = aVar14.a();
        HashMap map14 = new HashMap();
        map14.put(dVarA14.annotationType(), dVarA14);
        f12627o = new q5.d("campaignId", com.google.android.datatransport.runtime.a.a(map14), null);
        t5.a aVar15 = new t5.a();
        aVar15.f35679a = 15;
        t5.d dVarA15 = aVar15.a();
        HashMap map15 = new HashMap();
        map15.put(dVarA15.annotationType(), dVarA15);
        f12628p = new q5.d("composerLabel", com.google.android.datatransport.runtime.a.a(map15), null);
    }

    @Override // q5.b
    public void encode(Object obj, q5.f fVar) throws IOException {
        e6.a aVar = (e6.a) obj;
        q5.f fVar2 = fVar;
        fVar2.c(f12614b, aVar.f29028a);
        fVar2.a(f12615c, aVar.f29029b);
        fVar2.a(f12616d, aVar.f29030c);
        fVar2.a(f12617e, aVar.f29031d);
        fVar2.a(f12618f, aVar.f29032e);
        fVar2.a(f12619g, aVar.f29033f);
        fVar2.a(f12620h, aVar.f29034g);
        fVar2.b(f12621i, aVar.f29035h);
        fVar2.b(f12622j, aVar.f29036i);
        fVar2.a(f12623k, aVar.f29037j);
        fVar2.c(f12624l, aVar.f29038k);
        fVar2.a(f12625m, aVar.f29039l);
        fVar2.a(f12626n, aVar.f29040m);
        fVar2.c(f12627o, aVar.f29041n);
        fVar2.a(f12628p, aVar.f29042o);
    }
}
