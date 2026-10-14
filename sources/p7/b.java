package p7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uc.l<Bitmap, jc.w> f34471e;

    public static final class a extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bitmap f34473d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap) {
            super(0);
            this.f34473d = bitmap;
        }

        @Override // uc.a
        public jc.w invoke() {
            b.this.f34471e.invoke(this.f34473d);
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, boolean z10, uc.l<? super Bitmap, jc.w> lVar) {
        fd.j0.i(str, "base64string");
        fd.j0.i(lVar, "onDecoded");
        this.f34469c = str;
        this.f34470d = z10;
        this.f34471e = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strSubstring = this.f34469c;
        int i10 = 1;
        if (ed.q.u(strSubstring, "data:", false, 2)) {
            strSubstring = strSubstring.substring(ed.u.D(strSubstring, CoreConstants.COMMA_CHAR, 0, false, 6) + 1);
            fd.j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        this.f34469c = strSubstring;
        try {
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                if (this.f34470d) {
                    this.f34471e.invoke(bitmapDecodeByteArray);
                    return;
                }
                k9.k kVar = k9.k.f31954a;
                k9.k.f31955b.post(new b9.c(new a(bitmapDecodeByteArray), i10));
            } catch (IllegalArgumentException unused) {
                e9.c cVar = e9.c.f29122a;
            }
        } catch (IllegalArgumentException unused2) {
            e9.c cVar2 = e9.c.f29122a;
        }
    }
}
