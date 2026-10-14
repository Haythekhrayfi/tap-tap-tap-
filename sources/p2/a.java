package p2;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends LinkedHashMap<String, Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34451c;

    public a(int i10) {
        super((int) (i10 * 1.3333334f), 0.75f, true);
        if (i10 < 1) {
            throw new IllegalArgumentException("Cache size cannot be smaller than 1");
        }
        this.f34451c = i10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
        return size() > this.f34451c;
    }
}
