package ch.qos.logback.core.spi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentTracker<C> implements ComponentTracker<C> {
    private static final boolean ACCESS_ORDERED = true;
    public static final long LINGERING_TIMEOUT = 10000;
    public static final long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS = 1000;
    public int maxComponents = Integer.MAX_VALUE;
    public long timeout = ComponentTracker.DEFAULT_TIMEOUT;
    public LinkedHashMap<String, d<C>> liveMap = new LinkedHashMap<>(32, 0.75f, true);
    public LinkedHashMap<String, d<C>> lingerersMap = new LinkedHashMap<>(16, 0.75f, true);
    public long lastCheck = 0;
    private e<C> byExcedent = new a();
    private e<C> byTimeout = new b();
    private e<C> byLingering = new c();

    public class a implements e<Object> {
        public a() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.e
        public boolean a(d<Object> dVar, long j10) {
            return AbstractComponentTracker.this.liveMap.size() > AbstractComponentTracker.this.maxComponents;
        }
    }

    public class b implements e<Object> {
        public b() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.e
        public boolean a(d<Object> dVar, long j10) {
            return AbstractComponentTracker.this.isEntryStale(dVar, j10);
        }
    }

    public class c implements e<Object> {
        public c() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.e
        public boolean a(d<Object> dVar, long j10) {
            return AbstractComponentTracker.this.isEntryDoneLingering(dVar, j10);
        }
    }

    public static class d<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C f3735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f3736c;

        public d(String str, C c10, long j10) {
            this.f3734a = str;
            this.f3735b = c10;
            this.f3736c = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            String str = this.f3734a;
            if (str == null) {
                if (dVar.f3734a != null) {
                    return false;
                }
            } else if (!str.equals(dVar.f3734a)) {
                return false;
            }
            C c10 = this.f3735b;
            C c11 = dVar.f3735b;
            if (c10 == null) {
                if (c11 != null) {
                    return false;
                }
            } else if (!c10.equals(c11)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f3734a.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("(");
            sbA.append(this.f3734a);
            sbA.append(", ");
            return o0.c.a(sbA, this.f3735b, ")");
        }
    }

    public interface e<C> {
        boolean a(d<C> dVar, long j10);
    }

    private void genericStaleComponentRemover(LinkedHashMap<String, d<C>> linkedHashMap, long j10, e<C> eVar) {
        Iterator<Map.Entry<String, d<C>>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            d<C> value = it.next().getValue();
            if (!eVar.a(value, j10)) {
                return;
            }
            it.remove();
            processPriorToRemoval(value.f3735b);
        }
    }

    private d<C> getFromEitherMap(String str) {
        d<C> dVar = this.liveMap.get(str);
        return dVar != null ? dVar : this.lingerersMap.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryDoneLingering(d<C> dVar, long j10) {
        return dVar.f3736c + LINGERING_TIMEOUT < j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryStale(d<C> dVar, long j10) {
        return isComponentStale(dVar.f3735b) || dVar.f3736c + this.timeout < j10;
    }

    private boolean isTooSoonForRemovalIteration(long j10) {
        if (this.lastCheck + 1000 > j10) {
            return true;
        }
        this.lastCheck = j10;
        return false;
    }

    private void removeExcedentComponents() {
        genericStaleComponentRemover(this.liveMap, 0L, this.byExcedent);
    }

    private void removeStaleComponentsFromLingerersMap(long j10) {
        genericStaleComponentRemover(this.lingerersMap, j10, this.byLingering);
    }

    private void removeStaleComponentsFromMainMap(long j10) {
        genericStaleComponentRemover(this.liveMap, j10, this.byTimeout);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Collection<C> allComponents() {
        ArrayList arrayList = new ArrayList();
        Iterator<d<C>> it = this.liveMap.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f3735b);
        }
        Iterator<d<C>> it2 = this.lingerersMap.values().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().f3735b);
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Set<String> allKeys() {
        HashSet hashSet = new HashSet(this.liveMap.keySet());
        hashSet.addAll(this.lingerersMap.keySet());
        return hashSet;
    }

    public abstract C buildComponent(String str);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public void endOfLife(String str) {
        d<C> dVarRemove = this.liveMap.remove(str);
        if (dVarRemove == null) {
            return;
        }
        this.lingerersMap.put(str, dVarRemove);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C find(String str) {
        d<C> fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            return null;
        }
        return fromEitherMap.f3735b;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public int getComponentCount() {
        return this.lingerersMap.size() + this.liveMap.size();
    }

    public int getMaxComponents() {
        return this.maxComponents;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C getOrCreate(String str, long j10) {
        d<C> fromEitherMap;
        fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            d<C> dVar = new d<>(str, buildComponent(str), j10);
            this.liveMap.put(str, dVar);
            fromEitherMap = dVar;
        } else {
            fromEitherMap.f3736c = j10;
        }
        return fromEitherMap.f3735b;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public abstract boolean isComponentStale(C c10);

    public abstract void processPriorToRemoval(C c10);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized void removeStaleComponents(long j10) {
        if (isTooSoonForRemovalIteration(j10)) {
            return;
        }
        removeExcedentComponents();
        removeStaleComponentsFromMainMap(j10);
        removeStaleComponentsFromLingerersMap(j10);
    }

    public void setMaxComponents(int i10) {
        this.maxComponents = i10;
    }

    public void setTimeout(long j10) {
        this.timeout = j10;
    }
}
