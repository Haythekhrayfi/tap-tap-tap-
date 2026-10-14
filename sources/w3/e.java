package w3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f37098a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f37099b = new HashMap();

    public static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f37100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f37101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.e<T, R> f37102c;

        public a(Class<T> cls, Class<R> cls2, com.bumptech.glide.load.e<T, R> eVar) {
            this.f37100a = cls;
            this.f37101b = cls2;
            this.f37102c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f37100a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f37101b);
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> arrayList;
        if (!this.f37098a.contains(str)) {
            this.f37098a.add(str);
        }
        arrayList = this.f37099b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f37099b.put(str, arrayList);
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f37098a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f37099b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f37101b)) {
                        arrayList.add(aVar.f37101b);
                    }
                }
            }
        }
        return arrayList;
    }
}
