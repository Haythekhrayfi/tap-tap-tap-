package l8;

import android.graphics.Bitmap;
import android.graphics.NinePatch;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends p7.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g9.c f32779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p.a.c f32780b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i8.k kVar, g9.c cVar, p.a.c cVar2) {
        super(kVar);
        this.f32779a = cVar;
        this.f32780b = cVar2;
    }

    @Override // z7.c
    public void b(z7.b bVar) {
        NinePatch ninePatch;
        g9.c cVar = this.f32779a;
        p.a.c cVar2 = this.f32780b;
        cVar.f30066a = cVar2.f32716b.bottom;
        cVar.invalidateSelf();
        cVar.f30067b = cVar2.f32716b.left;
        cVar.invalidateSelf();
        cVar.f30068c = cVar2.f32716b.right;
        cVar.invalidateSelf();
        cVar.f30069d = cVar2.f32716b.top;
        cVar.invalidateSelf();
        Bitmap bitmap = bVar.f45158a;
        if (bitmap == null) {
            ninePatch = null;
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = cVar.f30066a;
            int i11 = cVar.f30067b;
            int i12 = cVar.f30068c;
            int i13 = cVar.f30069d;
            int i14 = height - i10;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
            byteBufferOrder.put((byte) 1);
            byteBufferOrder.put((byte) 2);
            byteBufferOrder.put((byte) 2);
            byteBufferOrder.put((byte) 9);
            int i15 = 0;
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            i8.v0.a(byteBufferOrder, 0, 0, 0, 0);
            i8.v0.a(byteBufferOrder, i11, width - i12, i13, i14);
            while (i15 < 9) {
                i15++;
                byteBufferOrder.putInt(1);
            }
            byte[] bArrArray = byteBufferOrder.array();
            fd.j0.h(bArrArray, "allocate(allocationSize)…   }\n            .array()");
            ninePatch = new NinePatch(bitmap, bArrArray);
        }
        cVar.f30070e = ninePatch;
        cVar.invalidateSelf();
    }
}
