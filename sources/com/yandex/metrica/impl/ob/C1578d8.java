package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.io.File;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1578d8 implements N7<Z7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1622f2 f15916a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d8$a */
    public class a implements Vm<String, C1744k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z7 f15917a;

        public a(C1578d8 c1578d8, Z7 z10) {
            this.f15917a = z10;
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public C1744k0 a(String str) {
            return J0.a(str, AbstractC2145zm.b(this.f15917a.f15637b.a())).c(this.f15917a.f15638c.f16998a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d8$b */
    public class b implements Vm<String, C1744k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z7 f15918a;

        public b(C1578d8 c1578d8, Z7 z10) {
            this.f15918a = z10;
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public C1744k0 a(String str) {
            return J0.b(str, AbstractC2145zm.b(this.f15918a.f15637b.a())).c(this.f15918a.f15638c.f16998a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d8$c */
    public static class c implements Um<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15919a;

        public c(String str) {
            this.f15919a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(File file) {
            CrashpadServiceHelper.a(this.f15919a);
        }
    }

    public C1578d8(C1622f2 c1622f2) {
        this.f15916a = c1622f2;
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(Z7 z10) {
        this.f15916a.a(z10, new a(this, z10));
    }

    @Override // com.yandex.metrica.impl.ob.N7
    public void a(Z7 z10) {
        Z7 z11 = z10;
        this.f15916a.a(z11, new b(this, z11));
    }

    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method */
    public void b2(Z7 z10) {
        this.f15916a.a(z10, new b(this, z10));
    }

    @Override // com.yandex.metrica.impl.ob.N7
    public void b(Z7 z10) {
        Z7 z11 = z10;
        this.f15916a.a(z11, new a(this, z11));
    }
}
