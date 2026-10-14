package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum q2 {
    LIGHT("light"),
    MEDIUM("medium"),
    REGULAR("regular"),
    BOLD("bold");

    public static final b Converter = new b(null);
    private static final uc.l<String, q2> FROM_STRING = a.f42128c;
    private final String value;

    public static final class a extends vc.l implements uc.l<String, q2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42128c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public q2 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            q2 q2Var = q2.LIGHT;
            if (fd.j0.d(str2, q2Var.value)) {
                return q2Var;
            }
            q2 q2Var2 = q2.MEDIUM;
            if (fd.j0.d(str2, q2Var2.value)) {
                return q2Var2;
            }
            q2 q2Var3 = q2.REGULAR;
            if (fd.j0.d(str2, q2Var3.value)) {
                return q2Var3;
            }
            q2 q2Var4 = q2.BOLD;
            if (fd.j0.d(str2, q2Var4.value)) {
                return q2Var4;
            }
            return null;
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    q2(String str) {
        this.value = str;
    }
}
