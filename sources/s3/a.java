package s3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.recyclerview.widget.o;
import com.bumptech.glide.load.ImageHeaderParser;
import g3.u;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.bumptech.glide.load.e<ByteBuffer, c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0410a f35403f = new C0410a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f35404g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ImageHeaderParser> f35406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f35407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0410a f35408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s3.b f35409e;

    /* JADX INFO: renamed from: s3.a$a, reason: collision with other inner class name */
    public static class C0410a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<c3.d> f35410a;

        public b() {
            char[] cArr = b4.j.f3307a;
            this.f35410a = new ArrayDeque(0);
        }

        public synchronized void a(c3.d dVar) {
            dVar.f3569b = null;
            dVar.f3570c = null;
            this.f35410a.offer(dVar);
        }
    }

    public a(Context context) {
        this(context, a3.c.b(context).f16f.e(), a3.c.b(context).f13c, a3.c.b(context).f17g);
    }

    public static int d(c3.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.f3563g / i11, cVar.f3562f / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbA = o.a("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i10, "x");
            sbA.append(i11);
            sbA.append("], actual dimens: [");
            sbA.append(cVar.f3562f);
            sbA.append("x");
            sbA.append(cVar.f3563g);
            sbA.append("]");
            Log.v("BufferGifDecoder", sbA.toString());
        }
        return iMax;
    }

    @Override // com.bumptech.glide.load.e
    public u<c> a(ByteBuffer byteBuffer, int i10, int i11, d3.e eVar) throws IOException {
        c3.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f35407c;
        synchronized (bVar) {
            c3.d dVarPoll = bVar.f35410a.poll();
            if (dVarPoll == null) {
                dVarPoll = new c3.d();
            }
            dVar = dVarPoll;
            dVar.f3569b = null;
            Arrays.fill(dVar.f3568a, (byte) 0);
            dVar.f3570c = new c3.c();
            dVar.f3571d = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.f3569b = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            dVar.f3569b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer2, i10, i11, dVar, eVar);
        } finally {
            this.f35407c.a(dVar);
        }
    }

    @Override // com.bumptech.glide.load.e
    public boolean b(ByteBuffer byteBuffer, d3.e eVar) throws IOException {
        ImageHeaderParser.ImageType imageTypeA;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) eVar.c(i.f35446b)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.f35406b;
        if (byteBuffer2 == null) {
            imageTypeA = ImageHeaderParser.ImageType.UNKNOWN;
            break;
        }
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                imageTypeA = ImageHeaderParser.ImageType.UNKNOWN;
                break;
            }
            imageTypeA = list.get(i10).a(byteBuffer2);
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                break;
            }
            i10++;
        }
        return imageTypeA == ImageHeaderParser.ImageType.GIF;
    }

    public final e c(ByteBuffer byteBuffer, int i10, int i11, c3.d dVar, d3.e eVar) {
        int i12 = b4.f.f3299b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            c3.c cVarB = dVar.b();
            if (cVarB.f3559c > 0 && cVarB.f3558b == 0) {
                Bitmap.Config config = eVar.c(i.f35445a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(cVarB, i10, i11);
                C0410a c0410a = this.f35408d;
                s3.b bVar = this.f35409e;
                Objects.requireNonNull(c0410a);
                c3.e eVar2 = new c3.e(bVar, cVarB, byteBuffer, iD);
                eVar2.i(config);
                eVar2.f3582k = (eVar2.f3582k + 1) % eVar2.f3583l.f3559c;
                Bitmap bitmapA = eVar2.a();
                if (bitmapA == null) {
                    return null;
                }
                return new e(new c(this.f35405a, eVar2, (n3.b) n3.b.f33615b, i10, i11, bitmapA));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sbA = defpackage.a.a("Decoded GIF from stream in ");
                sbA.append(b4.f.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sbA.toString());
            }
        }
    }

    public a(Context context, List<ImageHeaderParser> list, h3.d dVar, h3.b bVar) {
        b bVar2 = f35404g;
        C0410a c0410a = f35403f;
        this.f35405a = context.getApplicationContext();
        this.f35406b = list;
        this.f35408d = c0410a;
        this.f35409e = new s3.b(dVar, bVar);
        this.f35407c = bVar2;
    }
}
