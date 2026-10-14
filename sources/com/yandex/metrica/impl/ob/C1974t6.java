package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1974t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC2129z6 f17423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f17424b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t6$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private EnumC2129z6 f17425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f17426b;

        private b(EnumC2129z6 enumC2129z6) {
            this.f17425a = enumC2129z6;
        }

        public b a(int i10) {
            this.f17426b = Integer.valueOf(i10);
            return this;
        }

        public C1974t6 a() {
            return new C1974t6(this);
        }
    }

    private C1974t6(b bVar) {
        this.f17423a = bVar.f17425a;
        this.f17424b = bVar.f17426b;
    }

    public static final b a(EnumC2129z6 enumC2129z6) {
        return new b(enumC2129z6);
    }

    public Integer a() {
        return this.f17424b;
    }

    public EnumC2129z6 b() {
        return this.f17423a;
    }
}
