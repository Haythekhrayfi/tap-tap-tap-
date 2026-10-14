package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum c8 {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");

    private final String value;
    public static final b Converter = new b(null);
    private static final uc.l<String, c8> FROM_STRING = a.f39548c;

    public static final class a extends vc.l implements uc.l<String, c8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39548c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public c8 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            c8 c8Var = c8.DATA_CHANGE;
            if (fd.j0.d(str2, c8Var.value)) {
                return c8Var;
            }
            c8 c8Var2 = c8.STATE_CHANGE;
            if (fd.j0.d(str2, c8Var2.value)) {
                return c8Var2;
            }
            c8 c8Var3 = c8.VISIBILITY_CHANGE;
            if (fd.j0.d(str2, c8Var3.value)) {
                return c8Var3;
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

    c8(String str) {
        this.value = str;
    }
}
