package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r DEFAULT;
    public static final r STRING;

    public static enum a extends r {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.r
        public i serialize(Long l10) {
            return new n(l10);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        r rVar = new r("STRING", 1) { // from class: com.google.gson.r.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.r
            public i serialize(Long l10) {
                return new n(String.valueOf(l10));
            }
        };
        STRING = rVar;
        $VALUES = new r[]{aVar, rVar};
    }

    private r(String str, int i10) {
        super(str, i10);
    }

    public /* synthetic */ r(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public abstract i serialize(Long l10);
}
