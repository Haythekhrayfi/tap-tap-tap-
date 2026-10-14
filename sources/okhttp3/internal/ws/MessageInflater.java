package okhttp3.internal.ws;

import androidx.recyclerview.widget.RecyclerView;
import fd.j0;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;
import qd.a0;
import qd.c;
import qd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageInflater implements Closeable {
    private final c deflatedBytes;
    private final Inflater inflater;
    private final m inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z10) {
        this.noContextTakeover = z10;
        c cVar = new c();
        this.deflatedBytes = cVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new m((a0) cVar, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(c cVar) throws IOException {
        j0.i(cVar, "buffer");
        if (!(this.deflatedBytes.f34879d == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.v(cVar);
        this.deflatedBytes.Y(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.f34879d;
        do {
            this.inflaterSource.a(cVar, RecyclerView.FOREVER_NS);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}
