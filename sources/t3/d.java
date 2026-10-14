package t3;

import g3.u;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class d implements e<s3.c, byte[]> {
    @Override // t3.e
    public u<byte[]> a(u<s3.c> uVar, d3.e eVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = uVar.get().f35413c.f35423a.f35425a.e().asReadOnlyBuffer();
        int i10 = b4.a.f3283a;
        b4.a.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new b4.a.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar != null && bVar.f3286a == 0 && bVar.f3287b == bVar.f3288c.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.position(0);
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new p3.b(bArrArray);
    }
}
