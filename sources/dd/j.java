package dd;

import fd.j0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class j extends i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f28948a;

        public a(Iterator it) {
            this.f28948a = it;
        }

        @Override // dd.g
        public Iterator<T> iterator() {
            return this.f28948a;
        }
    }

    public static final <T> g<T> a(Iterator<? extends T> it) {
        j0.i(it, "<this>");
        a aVar = new a(it);
        j0.i(aVar, "<this>");
        return aVar instanceof dd.a ? aVar : new dd.a(aVar);
    }
}
