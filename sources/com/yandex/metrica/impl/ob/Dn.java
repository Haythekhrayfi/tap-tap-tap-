package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Dn extends Cn<byte[]> {
    public Dn(int i10, String str, Im im) {
        super(i10, str, im);
    }

    @Override // com.yandex.metrica.impl.ob.Pn
    public Object a(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= super.b()) {
            return bArr;
        }
        byte[] bArr2 = new byte[super.b()];
        System.arraycopy(bArr, 0, bArr2, 0, super.b());
        if (this.f13781c.c()) {
            this.f13781c.c("\"%s\" %s exceeded limit of %d bytes", super.a(), bArr, Integer.valueOf(super.b()));
        }
        return bArr2;
    }
}
