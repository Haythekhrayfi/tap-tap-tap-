package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f29591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f29592b;

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        o0 o0Var;
        boolean zO = z.O("kotlinx.coroutines.main.delay", false);
        f29591a = zO;
        if (zO) {
            c0 c0Var = s0.f29619a;
            s1 s1Var = kd.q.f32064a;
            if ((s1Var.e0() instanceof kd.r) || !(s1Var instanceof o0)) {
                o0Var = k0.f29587j;
            } else {
                o0Var = (o0) s1Var;
            }
        } else {
            o0Var = k0.f29587j;
        }
        f29592b = o0Var;
    }
}
