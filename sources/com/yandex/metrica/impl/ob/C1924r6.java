package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1924r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC2129z6 f17214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f17215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f17216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f17217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f17218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f17219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Long f17220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f17221h;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.r6$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f17222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EnumC2129z6 f17223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f17224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f17225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f17226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f17227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Boolean f17228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Long f17229h;

        private b(C1974t6 c1974t6) {
            this.f17223b = c1974t6.b();
            this.f17226e = c1974t6.a();
        }

        public b a(Boolean bool) {
            this.f17228g = bool;
            return this;
        }

        public b a(Long l10) {
            this.f17225d = l10;
            return this;
        }

        public b b(Long l10) {
            this.f17227f = l10;
            return this;
        }

        public b c(Long l10) {
            this.f17224c = l10;
            return this;
        }

        public b d(Long l10) {
            this.f17229h = l10;
            return this;
        }
    }

    private C1924r6(b bVar) {
        this.f17214a = bVar.f17223b;
        this.f17217d = bVar.f17226e;
        this.f17215b = bVar.f17224c;
        this.f17216c = bVar.f17225d;
        this.f17218e = bVar.f17227f;
        this.f17219f = bVar.f17228g;
        this.f17220g = bVar.f17229h;
        this.f17221h = bVar.f17222a;
    }

    public int a(int i10) {
        Integer num = this.f17217d;
        return num == null ? i10 : num.intValue();
    }

    public long a(long j10) {
        Long l10 = this.f17216c;
        return l10 == null ? j10 : l10.longValue();
    }

    public EnumC2129z6 a() {
        return this.f17214a;
    }

    public boolean a(boolean z10) {
        Boolean bool = this.f17219f;
        return bool == null ? z10 : bool.booleanValue();
    }

    public long b(long j10) {
        Long l10 = this.f17218e;
        return l10 == null ? j10 : l10.longValue();
    }

    public long c(long j10) {
        Long l10 = this.f17215b;
        return l10 == null ? j10 : l10.longValue();
    }

    public long d(long j10) {
        Long l10 = this.f17221h;
        return l10 == null ? j10 : l10.longValue();
    }

    public long e(long j10) {
        Long l10 = this.f17220g;
        return l10 == null ? j10 : l10.longValue();
    }
}
