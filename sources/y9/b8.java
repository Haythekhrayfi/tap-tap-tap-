package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum b8 {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");

    private final String value;
    public static final b Converter = new b(null);
    private static final uc.l<String, b8> FROM_STRING = a.f39335c;

    public static final class a extends vc.l implements uc.l<String, b8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39335c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public b8 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            b8 b8Var = b8.NONE;
            if (fd.j0.d(str2, b8Var.value)) {
                return b8Var;
            }
            b8 b8Var2 = b8.DATA_CHANGE;
            if (fd.j0.d(str2, b8Var2.value)) {
                return b8Var2;
            }
            b8 b8Var3 = b8.STATE_CHANGE;
            if (fd.j0.d(str2, b8Var3.value)) {
                return b8Var3;
            }
            b8 b8Var4 = b8.ANY_CHANGE;
            if (fd.j0.d(str2, b8Var4.value)) {
                return b8Var4;
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

    b8(String str) {
        this.value = str;
    }
}
