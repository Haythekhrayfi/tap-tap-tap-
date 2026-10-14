package kc;

import fd.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class t extends s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements dd.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f32006a;

        public a(Iterable iterable) {
            this.f32006a = iterable;
        }

        @Override // dd.g
        public Iterator<T> iterator() {
            return this.f32006a.iterator();
        }
    }

    public static final <T> List<T> A(Collection<? extends T> collection, T t10) {
        j0.i(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static final <T> List<T> B(Iterable<? extends T> iterable) {
        j0.i(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return H(iterable);
        }
        List<T> listI = I(iterable);
        Collections.reverse(listI);
        return listI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> C(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return H(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        j0.i(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return i.b(array);
    }

    public static final <T> List<T> D(Iterable<? extends T> iterable, int i10) {
        j0.i(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return w.f32009c;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return H(iterable);
            }
            if (i10 == 1) {
                return k.a(q(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return l.g(arrayList);
    }

    public static final <T, C extends Collection<? super T>> C E(Iterable<? extends T> iterable, C c10) {
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    public static final <T> HashSet<T> F(Iterable<? extends T> iterable) {
        HashSet<T> hashSet = new HashSet<>(e0.a(m.j(iterable, 12)));
        E(iterable, hashSet);
        return hashSet;
    }

    public static final int[] G(Collection<Integer> collection) {
        j0.i(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static final <T> List<T> H(Iterable<? extends T> iterable) {
        j0.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return l.g(I(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w.f32009c;
        }
        if (size != 1) {
            return J(collection);
        }
        return k.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> I(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return J((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        E(iterable, arrayList);
        return arrayList;
    }

    public static final <T> List<T> J(Collection<? extends T> collection) {
        j0.i(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> K(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        E(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> Set<T> L(Iterable<? extends T> iterable) {
        j0.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            E(iterable, linkedHashSet);
            return h0.b(linkedHashSet);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return y.f32011c;
        }
        if (size == 1) {
            return g0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(e0.a(collection.size()));
        E(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static final <T, R> List<jc.h<T, R>> M(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(m.j(iterable, 10), m.j(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new jc.h(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T> dd.g<T> n(Iterable<? extends T> iterable) {
        j0.i(iterable, "<this>");
        return new a(iterable);
    }

    public static final <T> List<T> o(List<? extends T> list, int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int size = list.size() - i10;
        return D(list, size >= 0 ? size : 0);
    }

    public static final <T> List<T> p(Iterable<? extends T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> T q(Iterable<? extends T> iterable) {
        j0.i(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) r((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T r(List<? extends T> list) {
        j0.i(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> T s(List<? extends T> list) {
        j0.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> T t(List<? extends T> list, int i10) {
        j0.i(list, "<this>");
        if (i10 < 0 || i10 > l.b(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static final <T, A extends Appendable> A u(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, uc.l<? super T, ? extends CharSequence> lVar) throws IOException {
        j0.i(iterable, "<this>");
        j0.i(a10, "buffer");
        j0.i(charSequence, "separator");
        j0.i(charSequence2, "prefix");
        j0.i(charSequence3, "postfix");
        j0.i(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            ed.i.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static /* synthetic */ Appendable v(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, uc.l lVar, int i11) throws IOException {
        u(iterable, appendable, (i11 & 2) != 0 ? ", " : charSequence, (i11 & 4) != 0 ? "" : null, (i11 & 8) != 0 ? "" : null, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : null, null);
        return appendable;
    }

    public static String w(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, uc.l lVar, int i11) throws IOException {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = charSequence;
        CharSequence charSequence6 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence7 = (i11 & 4) != 0 ? "" : charSequence3;
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        CharSequence charSequence8 = (i11 & 16) != 0 ? "..." : null;
        uc.l lVar2 = (i11 & 32) != 0 ? null : lVar;
        j0.i(iterable, "<this>");
        j0.i(charSequence5, "separator");
        j0.i(charSequence6, "prefix");
        j0.i(charSequence7, "postfix");
        j0.i(charSequence8, "truncated");
        StringBuilder sb2 = new StringBuilder();
        u(iterable, sb2, charSequence5, charSequence6, charSequence7, i12, charSequence8, lVar2);
        String string = sb2.toString();
        j0.h(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static final <T> T x(List<? extends T> list) {
        j0.i(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(l.b(list));
    }

    public static final <T> T y(List<? extends T> list) {
        j0.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> List<T> z(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        j0.i(collection, "<this>");
        j0.i(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            q.l(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }
}
