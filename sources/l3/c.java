package l3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c implements d3.a<ByteBuffer> {
    @Override // d3.a
    public boolean b(ByteBuffer byteBuffer, File file, d3.e eVar) throws Throwable {
        try {
            b4.a.b(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }
}
