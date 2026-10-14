package s3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import g3.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public class j implements com.bumptech.glide.load.e<InputStream, c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f35447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.e<ByteBuffer, c> f35448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h3.b f35449c;

    public j(List<ImageHeaderParser> list, com.bumptech.glide.load.e<ByteBuffer, c> eVar, h3.b bVar) {
        this.f35447a = list;
        this.f35448b = eVar;
        this.f35449c = bVar;
    }

    @Override // com.bumptech.glide.load.e
    public u<c> a(InputStream inputStream, int i10, int i11, d3.e eVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i12 = inputStream2.read(bArr);
                if (i12 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f35448b.a(ByteBuffer.wrap(byteArray), i10, i11, eVar);
    }

    @Override // com.bumptech.glide.load.e
    public boolean b(InputStream inputStream, d3.e eVar) throws IOException {
        return !((Boolean) eVar.c(i.f35446b)).booleanValue() && com.bumptech.glide.load.d.b(this.f35447a, inputStream, this.f35449c) == ImageHeaderParser.ImageType.GIF;
    }
}
