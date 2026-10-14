package kd;

import fd.b2;
import fd.j0;
import java.util.Objects;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f32018a = new z("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<Object, mc.f.a, Object> f32019b = a.f32022c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uc.p<b2<?>, mc.f.a, b2<?>> f32020c = b.f32023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.p<e0, mc.f.a, e0> f32021d = c.f32024c;

    public static final class a extends vc.l implements uc.p<Object, mc.f.a, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f32022c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public Object invoke(Object obj, mc.f.a aVar) {
            mc.f.a aVar2 = aVar;
            if (!(aVar2 instanceof b2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? aVar2 : Integer.valueOf(iIntValue + 1);
        }
    }

    public static final class b extends vc.l implements uc.p<b2<?>, mc.f.a, b2<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f32023c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public b2<?> invoke(b2<?> b2Var, mc.f.a aVar) {
            b2<?> b2Var2 = b2Var;
            mc.f.a aVar2 = aVar;
            if (b2Var2 != null) {
                return b2Var2;
            }
            if (aVar2 instanceof b2) {
                return (b2) aVar2;
            }
            return null;
        }
    }

    public static final class c extends vc.l implements uc.p<e0, mc.f.a, e0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f32024c = new c();

        public c() {
            super(2);
        }

        @Override // uc.p
        public e0 invoke(e0 e0Var, mc.f.a aVar) {
            e0 e0Var2 = e0Var;
            mc.f.a aVar2 = aVar;
            if (aVar2 instanceof b2) {
                ThreadContextElement<Object> threadContextElement = (b2) aVar2;
                Object objB0 = threadContextElement.b0(e0Var2.f32029a);
                Object[] objArr = e0Var2.f32030b;
                int i10 = e0Var2.f32032d;
                objArr[i10] = objB0;
                ThreadContextElement<Object>[] threadContextElementArr = e0Var2.f32031c;
                e0Var2.f32032d = i10 + 1;
                threadContextElementArr[i10] = threadContextElement;
            }
            return e0Var2;
        }
    }

    public static final void a(mc.f fVar, Object obj) {
        if (obj == f32018a) {
            return;
        }
        if (!(obj instanceof e0)) {
            Object objY = fVar.Y(null, f32020c);
            Objects.requireNonNull(objY, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((b2) objY).P(fVar, obj);
            return;
        }
        e0 e0Var = (e0) obj;
        int length = e0Var.f32031c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            b2 b2Var = e0Var.f32031c[length];
            j0.f(b2Var);
            b2Var.P(fVar, e0Var.f32030b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    public static final Object b(mc.f fVar) {
        Object objY = fVar.Y(0, f32019b);
        j0.f(objY);
        return objY;
    }

    public static final Object c(mc.f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        if (obj == 0) {
            return f32018a;
        }
        return obj instanceof Integer ? fVar.Y(new e0(fVar, ((Number) obj).intValue()), f32021d) : ((b2) obj).b0(fVar);
    }
}
