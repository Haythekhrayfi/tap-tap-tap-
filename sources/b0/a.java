package b0;

import java.util.ArrayList;
import java.util.HashSet;
import o0.e;
import o0.f;
import q.h;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<ArrayList<T>> f3225a = new f(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<T, ArrayList<T>> f3226b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f3227c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<T> f3228d = new HashSet<>();

    public void a(T t10) {
        if (this.f3226b.e(t10) >= 0) {
            return;
        }
        this.f3226b.put(t10, null);
    }

    public final void b(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (hashSet.contains(t10)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t10);
        ArrayList<T> orDefault = this.f3226b.getOrDefault(t10, null);
        if (orDefault != null) {
            int size = orDefault.size();
            for (int i10 = 0; i10 < size; i10++) {
                b(orDefault.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t10);
        arrayList.add(t10);
    }
}
