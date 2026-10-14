package com.applovin.impl.mediation.debugger;

import com.applovin.impl.sdk.e.d;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.applovin.impl.mediation.debugger.c.a.InterfaceC0130a, com.applovin.impl.mediation.debugger.c.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0127a f9415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.b.a f9416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f9417d;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.a$a, reason: collision with other inner class name */
    public interface InterfaceC0127a {
        void a(b bVar, String str);

        void a(com.applovin.impl.mediation.debugger.b.b.a aVar, String str);
    }

    public enum b {
        DEVELOPER_URI_NOT_FOUND,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public a(o oVar, InterfaceC0127a interfaceC0127a) {
        this.f9414a = oVar;
        this.f9415b = interfaceC0127a;
    }

    public void a() {
        com.applovin.impl.mediation.debugger.b.b.a aVar = this.f9416c;
        if (aVar != null) {
            this.f9415b.a(aVar, this.f9417d);
        } else {
            this.f9414a.G().a((d) new com.applovin.impl.mediation.debugger.c.b(this.f9414a, this));
        }
    }

    @Override // com.applovin.impl.mediation.debugger.c.b.a
    public void a(b bVar) {
        this.f9415b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.mediation.debugger.c.a.InterfaceC0130a
    public void a(b bVar, String str) {
        this.f9415b.a(bVar, str);
    }

    @Override // com.applovin.impl.mediation.debugger.c.b.a
    public void a(String str) {
        this.f9414a.G().a((d) new com.applovin.impl.mediation.debugger.c.a(this.f9414a, str, this));
    }

    @Override // com.applovin.impl.mediation.debugger.c.a.InterfaceC0130a
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            com.applovin.impl.mediation.debugger.b.b.b bVar = new com.applovin.impl.mediation.debugger.b.b.b(strArrSplit[i11], i10);
            if (bVar.h()) {
                String strB = bVar.b();
                List arrayList2 = map.containsKey(strB) ? (List) map.get(strB) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(bVar);
                    map.put(strB, arrayList2);
                }
            } else {
                arrayList.add(bVar);
            }
            i11++;
            i10 = i12;
        }
        this.f9416c = new com.applovin.impl.mediation.debugger.b.b.a(map, arrayList);
        this.f9417d = str2;
        this.f9414a.F();
        if (y.a()) {
            y yVarF = this.f9414a.F();
            StringBuilder sbA = defpackage.a.a("app-ads.txt fetched: ");
            sbA.append(this.f9416c);
            yVarF.b("AppAdsTxtService", sbA.toString());
        }
        this.f9415b.a(this.f9416c, str2);
    }
}
