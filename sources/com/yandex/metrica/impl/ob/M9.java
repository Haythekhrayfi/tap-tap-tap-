package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class M9 extends L9<C1586dg> {
    @Override // com.yandex.metrica.impl.ob.W9
    public Object a() {
        return new C1586dg();
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public Object a(byte[] bArr) {
        C1586dg c1586dg = (C1586dg) AbstractC1594e.a(new C1586dg(), bArr);
        fd.j0.h(c1586dg, "ClidsInfoProto.ClidsInfo.parseFrom(data)");
        return c1586dg;
    }
}
