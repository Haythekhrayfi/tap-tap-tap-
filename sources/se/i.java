package se;

import fd.z;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList<i> f35538a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap<String, i> f35539b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        if (h.f35536a.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<h> atomicReference = h.f35537b;
        atomicReference.compareAndSet(null, new h.b());
        atomicReference.get().a();
    }

    public static f a(String str, boolean z10) {
        z.B(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f35539b;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar != null) {
            return iVar.b(str, z10);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new g("No time-zone data files registered");
        }
        throw new g(i.f.a("Unknown time-zone ID: ", str));
    }

    public static void d(i iVar) {
        z.B(iVar, "provider");
        for (String str : iVar.c()) {
            z.B(str, "zoneId");
            if (f35539b.putIfAbsent(str, iVar) != null) {
                throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
            }
        }
        f35538a.add(iVar);
    }

    public abstract f b(String str, boolean z10);

    public abstract Set<String> c();
}
