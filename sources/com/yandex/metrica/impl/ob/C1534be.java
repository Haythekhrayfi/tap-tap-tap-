package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1534be implements InterfaceC1584de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1584de f15831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1584de f15832b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.be$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC1584de f15833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC1584de f15834b;

        public a(InterfaceC1584de interfaceC1584de, InterfaceC1584de interfaceC1584de2) {
            this.f15833a = interfaceC1584de;
            this.f15834b = interfaceC1584de2;
        }

        public a a(Qi qi) {
            this.f15834b = new C1808me(qi.E());
            return this;
        }

        public a a(boolean z10) {
            this.f15833a = new C1609ee(z10);
            return this;
        }

        public C1534be a() {
            return new C1534be(this.f15833a, this.f15834b);
        }
    }

    public C1534be(InterfaceC1584de interfaceC1584de, InterfaceC1584de interfaceC1584de2) {
        this.f15831a = interfaceC1584de;
        this.f15832b = interfaceC1584de2;
    }

    public static a b() {
        return new a(new C1609ee(false), new C1808me(null));
    }

    public a a() {
        return new a(this.f15831a, this.f15832b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1584de
    public boolean a(String str) {
        return this.f15832b.a(str) && this.f15831a.a(str);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AskForPermissionsStrategy{mLocationFlagStrategy=");
        sbA.append(this.f15831a);
        sbA.append(", mStartupStateStrategy=");
        sbA.append(this.f15832b);
        sbA.append('}');
        return sbA.toString();
    }
}
