package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1697i2 implements Bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Vf f16320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1721j2 f16321b;

    public C1697i2(C1721j2 c1721j2, Vf vf) {
        this.f16321b = c1721j2;
        this.f16320a = vf;
    }

    @Override // com.yandex.metrica.impl.ob.Bk
    public void a(Ak ak) {
        Vf vf = this.f16320a;
        List<C2013uk> listC = ak.c();
        if (U2.b(listC)) {
            return;
        }
        vf.f15238e = new Vf.e[listC.size()];
        for (int i10 = 0; i10 < listC.size(); i10++) {
            C2013uk c2013uk = listC.get(i10);
            Vf.e[] eVarArr = vf.f15238e;
            int i11 = C1572d2.f15904e;
            Vf.e eVar = new Vf.e();
            if (c2013uk.b() != null) {
                eVar.f15307b = c2013uk.b().intValue();
            }
            if (c2013uk.c() != null) {
                eVar.f15308c = c2013uk.c().intValue();
            }
            if (!TextUtils.isEmpty(c2013uk.a())) {
                eVar.f15309d = c2013uk.a();
            }
            eVar.f15310e = c2013uk.d();
            eVarArr[i10] = eVar;
            C1721j2 c1721j2 = this.f16321b;
            c1721j2.f16377x = C1519b.a(vf.f15238e[i10]) + c1721j2.f16377x;
            C1721j2 c1721j3 = this.f16321b;
            c1721j3.f16377x = C1519b.c(10) + c1721j3.f16377x;
        }
    }
}
