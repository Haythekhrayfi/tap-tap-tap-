package x8;

/* JADX INFO: loaded from: classes2.dex */
public enum e {
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean"),
    STRING("String"),
    DATETIME("DateTime"),
    COLOR("Color");

    public static final a Companion = new a(null);
    private final String typeName;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    e(String str) {
        this.typeName = str;
    }

    public final String getTypeName$div_evaluable() {
        return this.typeName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeName;
    }
}
