package o3;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class w<T> implements com.bumptech.glide.load.e<T, Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d3.d<Long> f33945d = new d3.d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d3.d<Integer> f33946e = new d3.d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f33947f = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f33948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3.d f33949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f33950c;

    public class a implements d3.d.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f33951a = ByteBuffer.allocate(8);

        @Override // d3.d.b
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            Long l11 = l10;
            messageDigest.update(bArr);
            synchronized (this.f33951a) {
                this.f33951a.position(0);
                messageDigest.update(this.f33951a.putLong(l11.longValue()).array());
            }
        }
    }

    public class b implements d3.d.b<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f33952a = ByteBuffer.allocate(4);

        @Override // d3.d.b
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f33952a) {
                this.f33952a.position(0);
                messageDigest.update(this.f33952a.putInt(num2.intValue()).array());
            }
        }
    }

    public static final class c implements e<AssetFileDescriptor> {
        public c(a aVar) {
        }

        @Override // o3.w.e
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    public static class d {
    }

    public interface e<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    public static final class f implements e<ParcelFileDescriptor> {
        @Override // o3.w.e
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public w(h3.d dVar, e<T> eVar) {
        d dVar2 = f33947f;
        this.f33949b = dVar;
        this.f33948a = eVar;
        this.f33950c = dVar2;
    }

    public static Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, j jVar) {
        Bitmap scaledFrameAtTime;
        if (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || jVar == j.f33907d) {
            scaledFrameAtTime = null;
        } else {
            try {
                int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i15 == 90 || i15 == 270) {
                    i14 = i13;
                    i13 = i14;
                }
                float fB = jVar.b(i13, i14, i11, i12);
                scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fB), Math.round(fB * i14));
            } catch (Throwable th) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
                }
                scaledFrameAtTime = null;
            }
        }
        return scaledFrameAtTime == null ? mediaMetadataRetriever.getFrameAtTime(j10, i10) : scaledFrameAtTime;
    }

    @Override // com.bumptech.glide.load.e
    public g3.u<Bitmap> a(T t10, int i10, int i11, d3.e eVar) throws IOException {
        long jLongValue = ((Long) eVar.c(f33945d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) eVar.c(f33946e);
        if (num == null) {
            num = 2;
        }
        j jVar = (j) eVar.c(j.f33909f);
        if (jVar == null) {
            jVar = j.f33908e;
        }
        j jVar2 = jVar;
        Objects.requireNonNull(this.f33950c);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f33948a.a(mediaMetadataRetriever, t10);
                Bitmap bitmapC = c(mediaMetadataRetriever, jLongValue, num.intValue(), i10, i11, jVar2);
                mediaMetadataRetriever.release();
                return o3.d.c(bitmapC, this.f33949b);
            } catch (RuntimeException e10) {
                throw new IOException(e10);
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.e
    public boolean b(T t10, d3.e eVar) {
        return true;
    }
}
