package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum p2 {
    TEXT("text"),
    DISPLAY("display");

    private final String value;
    public static final b Converter = new b(null);
    private static final uc.l<String, p2> FROM_STRING = a.f41909c;

    public static final class a extends vc.l implements uc.l<String, p2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41909c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public p2 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            p2 p2Var = p2.TEXT;
            if (fd.j0.d(str2, p2Var.value)) {
                return p2Var;
            }
            p2 p2Var2 = p2.DISPLAY;
            if (fd.j0.d(str2, p2Var2.value)) {
                return p2Var2;
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

    p2(String str) {
        this.value = str;
    }
}
