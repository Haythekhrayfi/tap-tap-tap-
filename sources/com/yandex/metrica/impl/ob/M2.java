package com.yandex.metrica.impl.ob;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class M2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f14467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f14468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<String> f14469c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<String> f14470d = new HashSet<>();

    public interface a {
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I9 f14471a;

        public b(I9 i10) {
            this.f14471a = i10;
        }

        public Boolean a() {
            return this.f14471a.e();
        }

        public void a(boolean z10) {
            this.f14471a.b(z10).c();
        }
    }

    public M2(a aVar) {
        this.f14467a = aVar;
        this.f14468b = ((b) aVar).a();
    }

    private boolean b() {
        Boolean bool = this.f14468b;
        if (bool == null) {
            return !this.f14469c.isEmpty() || this.f14470d.isEmpty();
        }
        return bool.booleanValue();
    }

    public synchronized void a(Boolean bool) {
        if (U2.a(bool) || this.f14468b == null) {
            Boolean boolValueOf = Boolean.valueOf(Boolean.FALSE.equals(bool));
            this.f14468b = boolValueOf;
            ((b) this.f14467a).a(boolValueOf.booleanValue());
        }
    }

    public synchronized void a(String str, Boolean bool) {
        HashSet<String> hashSet;
        if (U2.a(bool) || (!this.f14470d.contains(str) && !this.f14469c.contains(str))) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue()) {
                this.f14470d.add(str);
                hashSet = this.f14469c;
            } else {
                this.f14469c.add(str);
                hashSet = this.f14470d;
            }
            hashSet.remove(str);
        }
    }

    public synchronized boolean a() {
        Boolean bool;
        bool = this.f14468b;
        return bool == null ? this.f14470d.isEmpty() : bool.booleanValue();
    }

    public synchronized boolean c() {
        boolean zBooleanValue;
        Boolean bool = this.f14468b;
        if (bool == null) {
            zBooleanValue = this.f14470d.isEmpty() && this.f14469c.isEmpty();
        } else {
            zBooleanValue = bool.booleanValue();
        }
        return zBooleanValue;
    }

    public synchronized boolean d() {
        return b();
    }

    public synchronized boolean e() {
        return b();
    }
}
