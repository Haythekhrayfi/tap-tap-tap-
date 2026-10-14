package kd;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f32073b;

    static {
        Object objF;
        Object objF2;
        try {
            jc.i.a aVar = jc.i.f31813c;
            objF = Class.forName("oc.a").getCanonicalName();
        } catch (Throwable th) {
            jc.i.a aVar2 = jc.i.f31813c;
            objF = h9.d.f(th);
        }
        if (jc.i.a(objF) != null) {
            objF = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f32072a = (String) objF;
        try {
            jc.i.a aVar3 = jc.i.f31813c;
            objF2 = y.class.getCanonicalName();
        } catch (Throwable th2) {
            jc.i.a aVar4 = jc.i.f31813c;
            objF2 = h9.d.f(th2);
        }
        if (jc.i.a(objF2) != null) {
            objF2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f32073b = (String) objF2;
    }
}
