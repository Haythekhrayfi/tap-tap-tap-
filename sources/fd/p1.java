package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd.z f29608a = new kd.z("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.z f29609b = new kd.z("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kd.z f29610c = new kd.z("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kd.z f29611d = new kd.z("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kd.z f29612e = new kd.z("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w0 f29613f = new w0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w0 f29614g = new w0(true);

    public static final Object a(Object obj) {
        e1 e1Var;
        f1 f1Var = obj instanceof f1 ? (f1) obj : null;
        return (f1Var == null || (e1Var = f1Var.f29566a) == null) ? obj : e1Var;
    }
}
