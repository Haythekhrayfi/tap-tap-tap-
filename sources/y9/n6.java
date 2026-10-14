package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum n6 {
    DP("dp"),
    SP("sp"),
    PX("px");

    private final String value;
    public static final b Converter = new b(null);
    private static final uc.l<String, n6> FROM_STRING = a.f41693c;

    public static final class a extends vc.l implements uc.l<String, n6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41693c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public n6 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            n6 n6Var = n6.DP;
            if (fd.j0.d(str2, n6Var.value)) {
                return n6Var;
            }
            n6 n6Var2 = n6.SP;
            if (fd.j0.d(str2, n6Var2.value)) {
                return n6Var2;
            }
            n6 n6Var3 = n6.PX;
            if (fd.j0.d(str2, n6Var3.value)) {
                return n6Var3;
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

    n6(String str) {
        this.value = str;
    }
}
