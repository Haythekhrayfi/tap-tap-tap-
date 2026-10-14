package kc;

import fd.j0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l extends k {
    public static final <T> int b(List<? extends T> list) {
        j0.i(list, "<this>");
        return list.size() - 1;
    }

    public static final <T> List<T> c(T... tArr) {
        j0.i(tArr, "elements");
        return tArr.length > 0 ? i.b(tArr) : w.f32009c;
    }

    public static final <T> List<T> d(T t10) {
        return t10 != null ? k.a(t10) : w.f32009c;
    }

    public static final <T> List<T> e(T... tArr) {
        return j.n(tArr);
    }

    public static final <T> List<T> f(T... tArr) {
        j0.i(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new e(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> g(List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : k.a(list.get(0));
        }
        return w.f32009c;
    }

    public static final void h() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void i() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
