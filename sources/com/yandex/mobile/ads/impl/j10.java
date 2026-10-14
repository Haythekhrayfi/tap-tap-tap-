package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21894a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f21896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f21897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f21898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f21899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f21900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21901g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f21902h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Long f21903i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Long f21904j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f21905k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f21906l;

        public final a a(String str) {
            this.f21902h = str;
            return this;
        }

        public final j10 a() {
            return new j10(this);
        }

        public final a b(String str) {
            this.f21904j = ke1.a(str);
            return this;
        }

        public final a c(String str) {
            Integer numValueOf;
            try {
                numValueOf = Integer.valueOf(str);
            } catch (NumberFormatException e10) {
                x60.a(e10, e10.toString(), new Object[0]);
                numValueOf = null;
            }
            this.f21899e = numValueOf;
            return this;
        }

        public final a d(String str) {
            int i10;
            if ("left".equals(str)) {
                i10 = 1;
            } else {
                i10 = "right".equals(str) ? 2 : 3;
            }
            this.f21900f = i10;
            if (i10 == 3) {
                Integer numValueOf = null;
                try {
                    numValueOf = Integer.valueOf(str);
                } catch (NumberFormatException e10) {
                    x60.a(e10, e10.toString(), new Object[0]);
                }
                this.f21905k = numValueOf;
            }
            return this;
        }

        public final a e(String str) {
            this.f21903i = ke1.a(str);
            return this;
        }

        public final a f(String str) {
            this.f21897c = str;
            return this;
        }

        public final a g(String str) {
            for (b bVar : Arrays.asList(b.values())) {
                if (bVar.f21908a.equals(str)) {
                    this.f21896b = bVar;
                    return this;
                }
            }
            bVar = null;
            this.f21896b = bVar;
            return this;
        }

        public final void h(String str) {
            this.f21895a = str;
        }

        public final a i(String str) {
            int i10;
            if ("top".equals(str)) {
                i10 = 1;
            } else {
                i10 = "bottom".equals(str) ? 2 : 3;
            }
            this.f21901g = i10;
            if (i10 == 3) {
                Integer numValueOf = null;
                try {
                    numValueOf = Integer.valueOf(str);
                } catch (NumberFormatException e10) {
                    x60.a(e10, e10.toString(), new Object[0]);
                }
                this.f21906l = numValueOf;
            }
            return this;
        }

        public final a j(String str) {
            Integer numValueOf;
            try {
                numValueOf = Integer.valueOf(str);
            } catch (NumberFormatException e10) {
                x60.a(e10, e10.toString(), new Object[0]);
                numValueOf = null;
            }
            this.f21898d = numValueOf;
            return this;
        }
    }

    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        EF7("StaticResource"),
        /* JADX INFO: Fake field, exist only in values array */
        EF17("IFrameResource"),
        /* JADX INFO: Fake field, exist only in values array */
        EF27("HTMLResource");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21908a;

        b(String str) {
            this.f21908a = str;
        }
    }

    public j10(a aVar) {
        aVar.f21895a;
        aVar.f21896b;
        this.f21894a = aVar.f21897c;
        aVar.f21898d;
        aVar.f21899e;
        aVar.f21900f;
        aVar.f21901g;
        aVar.f21902h;
        aVar.f21903i;
        aVar.f21904j;
        aVar.f21905k;
        aVar.f21906l;
    }

    public final String a() {
        return this.f21894a;
    }
}
