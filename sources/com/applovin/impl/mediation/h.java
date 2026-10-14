package com.applovin.impl.mediation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f9993a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(com.applovin.impl.mediation.a.a aVar);
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        Iterator it = new ArrayList(this.f9993a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(aVar);
        }
    }

    public void a(a aVar) {
        this.f9993a.add(aVar);
    }

    public void b(a aVar) {
        this.f9993a.remove(aVar);
    }
}
